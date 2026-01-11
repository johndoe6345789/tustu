package U;

import G.R;
import G.q;
import S.a;
import S.e;
import S.j;
import bH.I;
import bH.X;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
  public static String a = a.a;
  
  public static String b = a.b;
  
  public static String c = " && AppEvent.dataLoggingActive == 0 && isTrueFor(!logPlaybackActive(), 2)";
  
  public static String d = " && AppEvent.dataLoggingActive != 0 && AppEvent.dataLogTime > 1";
  
  public static String e = "AppEvent.dataLoggingActive == 0";
  
  public static String f = "AppEvent.dataLoggingActive != 0";
  
  public static String a(j paramj, int paramInt) {
    String str1;
    if (paramInt > 0) {
      str1 = "AppEvent.dataLogTime > " + paramInt;
      c = " && AppEvent.dataLoggingActive == 0 && AppEvent.dataLogTime == 0";
    } else {
      str1 = "";
    } 
    String str2 = X.b(paramj.d(), d, "");
    if (str2.trim().isEmpty())
      str2 = str1; 
    return str2;
  }
  
  public static double a(R paramR) {
    byte b1;
    j j = S.b.a().a(paramR.c(), b);
    String str = a(j, -1);
    String[] arrayOfString = str.split(" ");
    if (arrayOfString.length == 3 && (arrayOfString[1].equals("<") || arrayOfString[1].equals("=") || arrayOfString[1].equals(">")) && I.a(arrayOfString[2])) {
      String str1 = arrayOfString[0].trim();
      if (str1.equals("AppEvent.dataLogTime")) {
        b1 = (int)Double.parseDouble(arrayOfString[2]);
      } else {
        b1 = -1;
      } 
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public static void a(R paramR, int paramInt) {
    j j = S.b.a().a(paramR.c(), b);
    String str = "AppEvent.dataLogTime > " + paramInt;
    j.e(str + d);
    j.f(f);
    try {
      e.a().a(paramR.c(), (a)j);
    } catch (q q) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/U/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */