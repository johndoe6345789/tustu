package aR;

import G.R;
import G.T;
import V.a;
import aI.p;
import bH.D;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import d.c;
import d.k;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class n implements c {
  public static String a = "ecuConfigName";
  
  String b = null;
  
  public String b() {
    return "Set MS3 RTC";
  }
  
  public String c() {
    return "User Action";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a);
    R r = null;
    if (str != null)
      r = T.a().c(str); 
    if (r == null)
      r = T.a().c(); 
    if (r != null && r.i() != null && r.i().startsWith("MS3")) {
      if (r.R()) {
        try {
          D.d("Setting RTC on MS3");
          p p = new p(r);
          p.a(new Date());
        } catch (a a) {
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, "Failed to set RTC", (Throwable)a);
        } catch (RemoteAccessException remoteAccessException) {
          Logger.getLogger(n.class.getName()).log(Level.SEVERE, "Failed to set RTC", (Throwable)remoteAccessException);
        } 
      } else {
        D.d("Not Setting RTC on MS3, it appears to not be online.");
      } 
    } else {
      D.d("No MS3 found to set RTC");
    } 
  }
  
  public String a() {
    return "setMs3Rtc";
  }
  
  public void b(Properties paramProperties) {}
  
  public k e() {
    return new k();
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */