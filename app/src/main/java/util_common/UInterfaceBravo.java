package U;

import G.R;
import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import S.SInterfaceJuliet;
import bH.I;
import bH.X;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UInterfaceBravo {
  public static String SInterfaceAlpha = SInterfaceAlpha.SInterfaceAlpha;
  
  public static String b = SInterfaceAlpha.b;
  
  public static String c = " && AppEvent.dataLoggingActive == 0 && isTrueFor(!logPlaybackActive(), 2)";
  
  public static String d = " && AppEvent.dataLoggingActive != 0 && AppEvent.dataLogTime > 1";
  
  public static String SInterfaceEcho = "AppEvent.dataLoggingActive == 0";
  
  public static String f = "AppEvent.dataLoggingActive != 0";
  
  public static String SInterfaceAlpha(SInterfaceJuliet paramj, int paramInt) {
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
  
  public static double SInterfaceAlpha(R paramR) {
    byte b1;
    SInterfaceJuliet SInterfaceJuliet = S.b.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), b);
    String str = SInterfaceAlpha(SInterfaceJuliet, -1);
    String[] arrayOfString = str.split(" ");
    if (arrayOfString.length == 3 && (arrayOfString[1].equals("<") || arrayOfString[1].equals("=") || arrayOfString[1].equals(">")) && I.SInterfaceAlpha(arrayOfString[2])) {
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
  
  public static void SInterfaceAlpha(R paramR, int paramInt) {
    SInterfaceJuliet SInterfaceJuliet = S.b.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), b);
    String str = "AppEvent.dataLogTime > " + paramInt;
    SInterfaceJuliet.SInterfaceEcho(str + d);
    SInterfaceJuliet.f(f);
    try {
      SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(paramR.c(), (SInterfaceAlpha)SInterfaceJuliet);
    } catch (q q) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)q);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/U/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */