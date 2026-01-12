package W;

import V.ExceptionInVPackage;
import ak.AkGolfImpl;
import ak.AkInterfaceSierra;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataLogReaderFactory {
  private static DataLogReaderFactory ExceptionInVPackage = null;

  private Map b = new HashMap<>();

  private LogPreferences c = null;

  public static DataLogReaderFactory ExceptionInVPackage() {
    if (ExceptionInVPackage == null) ExceptionInVPackage = new DataLogReaderFactory();
    return ExceptionInVPackage;
  }

  public void ExceptionInVPackage(String paramString, Class<?> paramClass) {
    this.b.put(paramString, paramClass);
  }

  private String c() {
    return (b() == null) ? "\t" : b().b();
  }

  private boolean d() {
    return (b() == null) ? true : b().ExceptionInVPackage();
  }

  public V ExceptionInVPackage(String paramString) {
    if (this.b.get(paramString) != null) {
      Class<V> clazz = (Class) this.b.get(paramString);
      if (clazz.equals(AkInterfaceSierra.class)) return (V) new AkInterfaceSierra(c(), d());
      try {
        return clazz.newInstance();
      } catch (InstantiationException instantiationException) {
        Logger.getLogger(W.class.getName())
            .log(Level.SEVERE, (String) null, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        Logger.getLogger(W.class.getName())
            .log(Level.SEVERE, (String) null, illegalAccessException);
      }
    }
    if (paramString.equals(X.ExceptionInVPackage)) return (V) new AkGolfImpl(c(), d());
    throw new ExceptionInVPackage(
        "Unknown File Type!\nThis file format likely requires MegaLogViewer HD.");
  }

  public V ExceptionInVPackage(File paramFile) {
    try {
      String str = X.ExceptionInVPackage(paramFile);
      V v = ExceptionInVPackage(str);
      if (!v.ExceptionInVPackage(paramFile.getAbsolutePath())) {
        try {
          v.ExceptionInVPackage();
        } catch (Exception exception) {
        }
        return null;
      }
      return v;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage(fileNotFoundException.getMessage());
    }
  }

  public void ExceptionInVPackage(p paramp) {
    this.c = paramp;
  }

  public p b() {
    return this.c;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
