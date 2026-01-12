package s;

import C.b;
import C.e;
import W.g;
import bH.D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class SComponentJuliet implements e {
  Locale a = null;

  String b = "staticText";

  Map c = new HashMap<>();

  Map d = new HashMap<>();

  public Map a(String paramString, Locale paramLocale) {
    if (paramLocale.getLanguage().equals("en")) return null;
    File file1 = r.j.c(paramLocale);
    g g = new g();
    Map map = null;
    try {
      map = g.a(file1);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new b("Content File not found. \n" + file1.getAbsolutePath());
    } catch (IOException iOException) {
      throw new b("Error loading content file. \n" + file1.getAbsolutePath());
    }
    File file2 = r.j.d(paramLocale);
    if (file2.exists()) {
      try {
        Map map1 = g.a(file2);
        this.c.put(paramLocale, map1);
        a(map, map1);
        map.putAll(map1);
      } catch (FileNotFoundException fileNotFoundException) {
        D.b("Content File not found. \n" + file2.getAbsolutePath());
      } catch (IOException iOException) {
        D.a("Error loading content file. \n" + file2.getAbsolutePath());
        iOException.printStackTrace();
      }
    } else {
      this.c.remove(paramLocale);
    }
    this.d.put(paramLocale, map);
    return map;
  }

  public void a(String paramString1, Locale paramLocale, String paramString2, String paramString3) {
    if (paramLocale.getLanguage().equals("en")) {
      D.c("C'mon, why are you updating english?");
      return;
    }
    Map<String, String> map = b(paramLocale);
    map.put(paramString2, paramString3);
    map = c(paramLocale);
    map.put(paramString2, paramString3);
  }

  public void a(Locale paramLocale) {
    File file = r.j.d(paramLocale);
    Map map = b(paramLocale);
    g g = new g();
    try {
      g.b(map, file);
    } catch (IOException iOException) {
      String str = g.b("Unable to save translation updates to local disk.");
      D.a(str, iOException, null);
    }
  }

  private Map b(Locale paramLocale) {
    Map<Object, Object> map = (Map) this.c.get(paramLocale);
    if (map == null) {
      map = new HashMap<>();
      this.c.put(paramLocale, map);
    }
    return map;
  }

  private Map c(Locale paramLocale) {
    Map<Object, Object> map = (Map) this.d.get(paramLocale);
    if (map == null) {
      map = new HashMap<>();
      this.d.put(paramLocale, map);
    }
    return map;
  }

  private void a(Map paramMap1, Map paramMap2) {
    Set set = paramMap2.keySet();
    String[] arrayOfString = (String[]) set.toArray((Object[]) new String[set.size()]);
    for (byte b = 0; b < arrayOfString.length; b++) {
      String str1 = arrayOfString[b];
      String str2 = (String) paramMap1.get(str1);
      String str3 = (String) paramMap2.get(str1);
      if (str2 != null && str3 != null && str2.equals(str3)) {
        paramMap2.remove(str1);
        continue;
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/s/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
