package h;

import g.IOJFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExtensionInHPackage extends Properties {
  public static String a = "FieldMaps/MegaSquirt.properties";

  private String m = a;

  private static g n = null;

  public static String b = "O2Volts";

  public static String c = "coolantTemp";

  public static String d = "RPM";

  public static String e = "egoCorrection";

  public static String f = "TP";

  public static String g = "pulseWidth";

  public static String h = "AFR";

  public static String i = "Lambda";

  public static String j = "MAP";

  public static String IOJFileChooser = "yAxisField";

  public static String l = "warmup";

  public static g a() {
    if (n == null) {
      n = new g();
      n.b();
    }
    return n;
  }

  public String a(String paramString) {
    if (paramString == null) return "";
    if (paramString.indexOf("Field.") != -1)
      paramString = IOJFileChooser.a(paramString, "Field.", "");
    String str1 = "";
    if (paramString.indexOf("+") != -1) {
      str1 = str1 + paramString.substring(paramString.indexOf("+"));
      paramString = IOJFileChooser.a(paramString, str1, "");
    }
    if (paramString.indexOf("-") != -1) {
      str1 = str1 + paramString.substring(paramString.indexOf("-"));
      paramString = IOJFileChooser.a(paramString, str1, "");
    }
    if (paramString.indexOf("|") != -1) {
      str1 = str1 + paramString.substring(paramString.indexOf("|"));
      paramString = IOJFileChooser.a(paramString, str1, "");
    }
    String str2 = getProperty(paramString);
    return (str2 == null || str2.equals("")) ? (paramString + str1) : (str2 + str1);
  }

  public void a(String paramString1, String paramString2) {
    setProperty(paramString1, paramString2);
  }

  public void b() {
    clear();
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(this.m);
      load(fileInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      File file1 = new File(this.m);
      RuntimeException runtimeException =
          new RuntimeException(file1.getAbsolutePath() + " does not exist", fileNotFoundException);
      runtimeException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (Exception exception) {
        }
    }
    File file = new File(".", "FieldMaps/Normalized.properties");
    if (b.a().a("fieldNameNormalizationEditable") && i.a("fieldNameNormaization", true))
      try {
        fileInputStream = new FileInputStream(file);
        load(fileInputStream);
      } catch (FileNotFoundException fileNotFoundException) {
        RuntimeException runtimeException =
            new RuntimeException(file.getAbsolutePath() + " does not exist", fileNotFoundException);
        runtimeException.printStackTrace();
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } finally {
        if (fileInputStream != null)
          try {
            fileInputStream.close();
          } catch (Exception exception) {
          }
      }
  }

  public static void b(String paramString) {
    (a()).m = paramString;
    a().b();
  }

  public String c(String paramString) {
    int i = -1;
    while (paramString.indexOf("[", i + 1) != -1) {
      i = paramString.indexOf("[", i + 1);
      int j = paramString.indexOf("]", i + 1);
      int IOJFileChooser = j;
      String str1 = paramString.substring(i + 1, IOJFileChooser);
      String str2 = paramString.substring(0, i);
      String str3 = paramString.substring(IOJFileChooser + 1);
      if (str1.contains("Field.")) str1 = a(str1);
      paramString = str2 + "[" + str1 + "]" + str3;
    }
    return paramString;
  }

  public String d(String paramString) {
    String str = e(paramString);
    return (str == null) ? paramString : ("Field." + str);
  }

  public String e(String paramString) {
    if (containsValue(paramString))
      for (String str1 : keySet()) {
        String str2 = getProperty(str1);
        if (str2 != null && str2.equals(paramString)) return str1;
      }
    return null;
  }

  public String f(String paramString) {
    int i = -1;
    while (paramString.indexOf("[", i + 1) != -1) {
      i = paramString.indexOf("[", i + 1);
      int j = paramString.indexOf("]", i + 1);
      int IOJFileChooser = j;
      String str1 = paramString.substring(i + 1, IOJFileChooser);
      String str2 = paramString.substring(0, i);
      String str3 = paramString.substring(IOJFileChooser + 1);
      str1 = a(str1);
      String str4 = e(str1);
      if (str4 != null && str4.length() > 0) str1 = "Field." + str4;
      paramString = str2 + "[" + str1 + "]" + str3;
    }
    return paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
