package s;

import C.ExceptionInVPackage;
import C.b;
import R.ExceptionExtension;
import R.RInterfaceMike;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import bH.D;
import bH.ab;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;
import r.ThreadedFile;

public class SComponentGolf {
  static ThreadedFile ExceptionInVPackage = null;

  static ExceptionInVPackage b = null;

  static Map c = new HashMap<>();

  static String d = "userAliases.txt";

  static ab e = null;

  public static void ExceptionInVPackage() {
    ExceptionInVPackage = new ThreadedFile();
    ExceptionInVPackage.ExceptionInVPackage(ExceptionInVPackage);
  }

  public static void ExceptionInVPackage(String paramString) {
    Locale[] arrayOfLocale = Locale.getAvailableLocales();
    for (byte b = 0; b < arrayOfLocale.length; b++) {
      if (arrayOfLocale[b].getLanguage().equals(paramString)) {
        ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(arrayOfLocale[b]);
        return;
      }
    }
    throw new ExceptionInVPackage("Language not found for language code '" + paramString + "'");
  }

  public static String b(String paramString) {
    if (paramString == null || paramString.trim().length() == 0) return paramString;
    try {
      String str1 = paramString;
      String str2 = (String) c.get(paramString);
      if (str2 != null) return str2;
      str1 = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage("configFileText", str1);
      if (str1 == null || str1.equals(""))
        D.d("Translation unavailable for \"" + paramString + "\"");
      return str1;
    } catch (b b) {
      D.ExceptionInVPackage(b.getMessage(), (Exception) b, null);
      return paramString;
    }
  }

  public static String ExceptionInVPackage(String paramString1, String paramString2) {
    String str = b(paramString1);
    if (paramString1 == null || (paramString1.equals(str) && paramString2 != null))
      str = paramString2;
    return str;
  }

  public static String c(String paramString) {
    return (ExceptionInVPackage.A() != null)
        ? ExceptionInVPackage.ExceptionInVPackage().b("configFileText", paramString)
        : paramString;
  }

  public static ArrayList b() {
    ArrayList<e> arrayList = new ArrayList();
    File file = ThreadedFile.ExceptionInVPackage();
    arrayList.add(f("en"));
    if (!file.exists()) return arrayList;
    h h = new h();
    String[] arrayOfString = file.list(h);
    for (byte b = 0; b < arrayOfString.length; b++) arrayList.add(f(arrayOfString[b]));
    return arrayList;
  }

  private static e f(String paramString) {
    if (paramString.equals("en")) return new e(paramString, "English");
    if (paramString.equals("he")) return new e("iw", "Hebrew");
    Locale[] arrayOfLocale = Locale.getAvailableLocales();
    for (byte b = 0; b < arrayOfLocale.length; b++) {
      if (arrayOfLocale[b].getLanguage().equals(paramString))
        return new e(paramString, arrayOfLocale[b].getDisplayLanguage());
    }
    return new e(paramString, "Unknown - " + paramString);
  }

  public static Locale c() {
    return ExceptionInVPackage.ExceptionInVPackage().b();
  }

  public static void b(String paramString1, String paramString2) {
    Locale locale1 = ExceptionInVPackage.ExceptionInVPackage().b();
    Locale locale2 = ExceptionInVPackage.ExceptionInVPackage().c();
    ExceptionInVPackage.ExceptionInVPackage("configFileText", locale1, paramString1, paramString2);
    ExceptionInVPackage.ExceptionInVPackage(locale1);
    RInterfaceMike RInterfaceMike = new RInterfaceMike();
    try {
      boolean bool =
          RInterfaceMike.ExceptionInVPackage(
              "lt401vette",
              "pass",
              "TunerStudioMS",
              ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aN, ""),
              ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.cF, ""),
              locale2.getLanguage(),
              locale1.getLanguage(),
              paramString1,
              paramString2);
      D.c("Translation submittion finished: " + bool);
    } catch (ExceptionExtension ExceptionExtension) {
      Logger.getLogger(g.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionExtension);
    }
  }

  public static void ExceptionInVPackage(ExceptionInVPackage parama) {
    c.clear();
    File file = new File(parama.w(), d);
    if (file.exists()) {
      W.g g1 = new W.g();
      c = g1.ExceptionInVPackage(c, file);
    }
  }

  public static void b(ExceptionInVPackage parama) {
    if (!c.isEmpty()) {
      File file = new File(parama.w(), d);
      W.g g1 = new W.g();
      g1.b(c, file);
    }
  }

  public static void c(String paramString1, String paramString2) {
    c.put(paramString1, paramString2);
  }

  public static void d(String paramString) {
    c.remove(paramString);
  }

  public static boolean e(String paramString) {
    return c.containsKey(paramString);
  }

  public static ab d() {
    if (e == null) e = new i();
    return e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/s/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
