package C;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocalizationManager {
  public static String a = "MS3 Verified B&G";
  
  public static String b = "Comm time out: Code 17743";
  
  public static String c = "General Exception Code 453432";
  
  public static String d = "Warning!!\n\n Communication Established!\n\nHowever, there is a confguration error with your firmware.\nCheck to make sure your MS3 firmware is correctly loaded.\n\nGoing offline.\n";
  
  private static LocalizationManager i = null;
  
  Map e = new HashMap<>();
  
  Map f = new HashMap<>();
  
  Locale g = Locale.US;
  
  Locale h = this.g;
  
  private TranslationMapLoader j = null;
  
  public static LocalizationManager a(TranslationMapLoader parame) {
    LocalizationManager a1 = a();
    a1.b(parame);
    return a1;
  }

  public static LocalizationManager a() {
    if (i == null)
      i = new LocalizationManager();
    return i;
  }
  
  public void a(Locale paramLocale) {
    this.h = paramLocale;
    this.e.clear();
  }
  
  public String a(String paramString1, String paramString2) {
    if (this.h.getLanguage().equals(this.g.getLanguage()))
      return paramString2; 
    Map map = a(paramString1);
    String str1 = paramString2;
    if (map == null)
      return paramString2; 
    String str2 = (String)map.get(paramString2);
    if (str2 != null && str2.length() > 0)
      str1 = str2; 
    return str1;
  }
  
  private Map a(String paramString) {
    Map map = (Map)this.e.get(paramString);
    if (map == null && !this.h.getLanguage().equals(this.g.getLanguage())) {
      map = this.j.a(paramString, this.h);
      this.e.put(paramString, map);
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (String str1 : map.keySet()) {
        String str2 = (String)map.get(str1);
        hashMap.put(str2, str1);
      } 
      this.f.put(paramString, hashMap);
    } 
    return map;
  }
  
  private Map b(String paramString) {
    Map map = (Map)this.f.get(paramString);
    return (map == null) ? null : map;
  }
  
  public String b(String paramString1, String paramString2) {
    if (this.h.equals(this.g))
      return paramString2; 
    Map map = b(paramString1);
    if (map == null)
      return paramString2; 
    String str = (String)map.get(paramString2);
    return (str == null || str.equals("")) ? paramString2 : str;
  }
  
  public void b(TranslationMapLoader parame) {
    this.j = parame;
  }
  
  public Locale b() {
    return this.h;
  }
  
  public Locale c() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/C/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */