package system.notification_system;

import G.R;
import G.T;
import V.ExceptionPrintstacktrace;
import W.NetworkExceptionprintstacktrace;
import W.d;
import aE.PropertiesExtension;
import ac.AcInterfaceVictor;
import bH.D;
import bH.X;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.PropertiesExtension;
import r.RInterfaceIndia;

public class NInterfaceMike implements AcInterfaceVictor {
  public String PropertiesExtension() {
    return "LogStart_MAIN_TUNE";
  }
  
  public String b() {
    return "msq";
  }
  
  public boolean c() {
    return false;
  }
  
  public String d() {
    if (!RInterfaceIndia.PropertiesExtension().PropertiesExtension(" 09s98r32-po3q9264") || !PropertiesExtension.PropertiesExtension().c(PropertiesExtension.ae, PropertiesExtension.af)) {
      D.d("Not saving tune to data log, option disabled.");
      return null;
    } 
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    String str = null;
    if (PropertiesExtension != null) {
      File file = PropertiesExtension.c(PropertiesExtension.u());
      if (file.exists() && file.lastModified() > System.currentTimeMillis() - 172800000L)
        try {
          str = new String(d.PropertiesExtension(file));
        } catch (IOException iOException) {
          Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Error reading " + file.getName(), iOException);
        }  
    } 
    if (str != null)
      return str; 
    D.c("No currenttune, will generate new msq for infodata.");
    NetworkExceptionprintstacktrace NetworkExceptionprintstacktrace = new NetworkExceptionprintstacktrace();
    R r = T.PropertiesExtension().c();
    if (r != null) {
      try {
        File file = File.createTempFile(X.PropertiesExtension(), "msq");
        NetworkExceptionprintstacktrace.PropertiesExtension(r, file.getAbsolutePath(), new o());
        str = new String(d.PropertiesExtension(file));
      } catch (IOException iOException) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Failed to create temp file for start tune Info Data", iOException);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Failed to save temp file msq for start tune Info Data", (Throwable)ExceptionPrintstacktrace);
      } 
    } else {
      D.c("Main Config is null, skipping tune info data.");
    } 
    return str;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/n/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */