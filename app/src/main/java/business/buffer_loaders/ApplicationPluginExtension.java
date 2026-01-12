package business.buffer_loaders;

import G.T;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.plugin.ApplicationPlugin;
import com.efiAnalytics.plugin.ecu.ControllerAccess;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;
import r.ThreadedFile;

public class ApplicationPluginExtension {
  static HashMap ExceptionInVPackage = new HashMap<>();

  private static l e = null;

  Map b = new HashMap<>();

  Map c = new HashMap<>();

  Map d = new HashMap<>();

  public static l ExceptionInVPackage() {
    if (e == null) e = new l();
    return e;
  }

  public static void b() {
    try {
      c c = new c();
      ExceptionInVPackage ExceptionInVPackage = new ExceptionInVPackage();
      T.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage);
      ControllerAccess.initialize(ExceptionInVPackage, c);
      ControllerAccess.getInstance().setConfigurationNameProvider(new m());
      ControllerAccess.getInstance().setMathExpressionEvaluator(new n());
      ControllerAccess.getInstance().setUiComponentServerProvider(r.ExceptionInVPackage());
      ControllerAccess.getInstance().setBurnExecutor(new f());
      ControllerAccess.getInstance().setOnlineExecutor(new p());
    } catch (Exception exception) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, exception);
      throw new ExceptionInVPackage(
          "Failed to initialize Plugin Server, error:\n" + exception.getMessage());
    }
  }

  public ApplicationPlugin ExceptionInVPackage(String paramString) {
    ApplicationPlugin applicationPlugin;
    Class<ApplicationPlugin> clazz = (Class) this.b.get(paramString);
    try {
      applicationPlugin = clazz.newInstance();
      applicationPlugin.initialize(ControllerAccess.getInstance());
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, instantiationException);
      throw new ExceptionInVPackage("Unable to create Plugin: " + paramString);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, illegalAccessException);
      throw new ExceptionInVPackage("Unable to create Plugin: " + paramString);
    } catch (Exception exception) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, exception);
      throw new ExceptionInVPackage("Plugin Not Found: " + paramString);
    }
    return applicationPlugin;
  }

  public Collection c() {
    return this.c.values();
  }

  public ApplicationPlugin b(String paramString) {
    return (ApplicationPlugin) this.c.get(paramString);
  }

  public void d() {
    File file = ThreadedFile.b();
    File[] arrayOfFile = file.listFiles(new o(this));
    for (byte b = 0; b < arrayOfFile.length; b++) {
      try {
        c(arrayOfFile[b]);
      } catch (Exception exception) {
        D.ExceptionInVPackage(
            "Failed to initialize plugin in file:\n" + arrayOfFile[b].getAbsolutePath(),
            exception,
            null);
      }
    }
  }

  private void c(File paramFile) {
    JarInputStream jarInputStream = null;
    D.c("Loading Plugin from " + paramFile.getName());
    try {
      Class<?> clazz;
      BufferedInputStream bufferedInputStream =
          new BufferedInputStream(new FileInputStream(paramFile));
      jarInputStream = new JarInputStream(bufferedInputStream);
      Manifest manifest = jarInputStream.getManifest();
      String str = manifest.getMainAttributes().getValue("ApplicationPlugin");
      if (str == null || str.length() == 0)
        str = manifest.getMainAttributes().getValue("Main-Class");
      if (str == null || str.length() == 0)
        throw new ExceptionInVPackage(
            "ApplicationPlugin not defined in Manifest for jar:\n" + paramFile.getAbsolutePath());
      URLClassLoader uRLClassLoader =
          URLClassLoader.newInstance(
              new URL[] {paramFile.toURI().toURL()}, getClass().getClassLoader());
      try {
        clazz = Class.forName(str, true, uRLClassLoader);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new ExceptionInVPackage(
            "ApplicationPlugin class '"
                + str
                + "' not found in jar file:\n"
                + paramFile.getAbsolutePath());
      }
      Class<? extends ApplicationPlugin> clazz1 = clazz.asSubclass(ApplicationPlugin.class);
      try {
        ApplicationPlugin applicationPlugin = clazz1.newInstance();
        if (applicationPlugin.getRequiredPluginSpec() > 1.0D)
          throw new ExceptionInVPackage(
              "Plugin requires Specification: "
                  + applicationPlugin.getRequiredPluginSpec()
                  + "\nCurrently using: "
                  + 1.0D);
        this.b.put(applicationPlugin.getIdName(), clazz1);
        this.c.put(applicationPlugin.getIdName(), applicationPlugin);
        this.d.put(applicationPlugin.getIdName(), paramFile);
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(l.class.getName())
            .log(Level.SEVERE, (String) null, instantiationException);
        throw new ExceptionInVPackage(
            "Failed to instantiate '" + str + "' in jar file:\n" + paramFile.getAbsolutePath());
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(l.class.getName())
            .log(Level.SEVERE, (String) null, illegalAccessException);
        throw new ExceptionInVPackage(
            "Failed to instantiate '" + str + "' in jar file:\n" + paramFile.getAbsolutePath());
      }
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Plugin file not found: " + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Error reading Plugin file: " + paramFile.getAbsolutePath());
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error loading Plugin file: " + paramFile.getAbsolutePath());
    } catch (AbstractMethodError abstractMethodError) {
      abstractMethodError.printStackTrace();
      throw new ExceptionInVPackage(
          "Error calling core Plugin API method: \n"
              + abstractMethodError.getMessage()
              + "\nOn Plugin in file:\n"
              + paramFile.getName());
    } catch (Error error) {
      error.printStackTrace();
      throw new ExceptionInVPackage(
          "This jar file does not meet minimum Plugin API Specifications: \n"
              + paramFile.getAbsolutePath());
    } finally {
      try {
        if (jarInputStream != null) jarInputStream.close();
      } catch (IOException iOException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, iOException);
      }
    }
  }

  public ApplicationPlugin ExceptionInVPackage(File paramFile) {
    JarInputStream jarInputStream = null;
    D.c("Loading Plugin from " + paramFile.getName());
    try {
      Class<?> clazz;
      BufferedInputStream bufferedInputStream =
          new BufferedInputStream(new FileInputStream(paramFile));
      jarInputStream = new JarInputStream(bufferedInputStream);
      Manifest manifest = jarInputStream.getManifest();
      String str = manifest.getMainAttributes().getValue("ApplicationPlugin");
      if (str == null || str.length() == 0)
        str = manifest.getMainAttributes().getValue("Main-Class");
      if (str == null || str.length() == 0)
        throw new ExceptionInVPackage(
            "File does not appear to be ExceptionInVPackage valid "
                + ExceptionInVPackage.b
                + " Plugin\n ApplicationPlugin not defined in Manifest of jar file:\n"
                + paramFile.getAbsolutePath());
      URLClassLoader uRLClassLoader =
          URLClassLoader.newInstance(
              new URL[] {paramFile.toURI().toURL()}, getClass().getClassLoader());
      try {
        clazz = Class.forName(str, true, uRLClassLoader);
      } catch (ClassNotFoundException classNotFoundException) {
        throw new ExceptionInVPackage(
            "ApplicationPlugin class '"
                + str
                + "' not found in jar file:\n"
                + paramFile.getAbsolutePath());
      }
      Class<? extends ApplicationPlugin> clazz1 = clazz.asSubclass(ApplicationPlugin.class);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("Plugin file not found: " + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Error reading Plugin file: " + paramFile.getAbsolutePath());
    } finally {
      try {
        jarInputStream.close();
      } catch (IOException iOException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, iOException);
      }
    }
  }

  public boolean c(String paramString) {
    return (this.b.get(paramString) != null);
  }

  public void d(String paramString) {
    File file = (File) this.d.get(paramString);
    if (file == null || !file.exists())
      throw new ExceptionInVPackage(
          "Plugin " + paramString + " not installed or file name changed.");
    this.b.remove(paramString);
    this.c.remove(paramString);
    c(file);
  }

  public File e(String paramString) {
    return (File) this.d.get(paramString);
  }

  public boolean b(File paramFile) {
    return this.d.containsValue(paramFile);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
