package r;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import s.g;

public class i {
  private static i C = null;
  
  List a = new ArrayList();
  
  public static String b = "(Beta)";
  
  public static String c = " Lite!";
  
  public static String d = " Trial";
  
  public static String e = "QJ";
  
  public static String f = "MS";
  
  public static String g = "MS Ultra";
  
  public static String h = "MS Dev";
  
  public static String i = "MS Dev(Beta)";
  
  public static String j = "RE";
  
  public static String k = "RE Ultra";
  
  public static String l = "RE Dev";
  
  public static String m = "EFI";
  
  public static String n = "Tuner";
  
  public static String o = "MS(Beta)";
  
  public static String p = "MS Ultra(Beta)";
  
  public static String q = "Super";
  
  public static String r = "Pro";
  
  public static String s = "Pro Ultra";
  
  public static String t = "Pro Dev";
  
  public static String u = "Pro Single";
  
  private static byte[] D = new byte[] { 68, 101, 118 };
  
  public static String v = "BigComm";
  
  public static String w = a.at;
  
  public static String x = "TunerStudio";
  
  public static String y = "ShadowTuner.com";
  
  public static String z = a.av;
  
  public static String A = a.aw;
  
  public static String B = a.ar;
  
  public static i a() {
    if (C == null)
      C = new i(); 
    return C;
  }
  
  public boolean a(String paramString) {
    return this.a.contains(paramString);
  }
  
  public boolean a(String paramString1, String paramString2) {
    return paramString2.contains(new String(D));
  }
  
  public String b() {
    String str = a.a().c(a.cF, "");
    return (str != null && !str.isEmpty()) ? ("https://www.efianalytics.com/register/upgradeSoftware.jsp?regKey=" + str) : "";
  }
  
  public String c() {
    if (a("87gdjkjd98fes")) {
      String str = a.a().c(a.cF, "");
      Calendar calendar = Calendar.getInstance();
      calendar.set(2016, 7, 3);
      return (calendar.getTime().getTime() > System.currentTimeMillis()) ? ("Try new: <a href=https://www.efianalytics.com/register/upgradeSoftware.jsp?regKey=" + str + "\">" + g.b("TunerStudio MS Ultra") + "</a><br>" + g.b("For a limited time, free trial for registered users!")) : ("<br>Upgrade to:<br><a href=https://www.efianalytics.com/register/upgradeSoftware.jsp?regKey=" + str + "\">" + g.b("TunerStudio MS Ultra") + "</a> " + g.b("Now!") + "<br>" + g.b("Featuring Tuning and Dyno Views!"));
    } 
    return "";
  }
  
  public void a(List paramList) {
    this.a = paramList;
  }
  
  public List d() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */