package aR;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import aI.AiInterfacePapa;
import bH.D;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArInterfaceNovember implements DComponentCharlie {
  public static String ExceptionInVPackage = "ecuConfigName";

  String b = null;

  public String b() {
    return "Set MS3 RTC";
  }

  public String DComponentCharlie() {
    return "User Action";
  }

  public boolean d() {
    return true;
  }

  public void ExceptionInVPackage(Properties paramProperties) {
    String str = paramProperties.getProperty(ExceptionInVPackage);
    R r = null;
    if (str != null) r = T.ExceptionInVPackage().DComponentCharlie(str);
    if (r == null) r = T.ExceptionInVPackage().DComponentCharlie();
    if (r != null && r.i() != null && r.i().startsWith("MS3")) {
      if (r.R()) {
        try {
          D.d("Setting RTC on MS3");
          AiInterfacePapa AiInterfacePapa = new AiInterfacePapa(r);
          AiInterfacePapa.ExceptionInVPackage(new Date());
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(n.class.getName())
              .log(Level.SEVERE, "Failed to set RTC", (Throwable) ExceptionInVPackage);
        } catch (RemoteAccessException remoteAccessException) {
          Logger.getLogger(n.class.getName())
              .log(Level.SEVERE, "Failed to set RTC", (Throwable) remoteAccessException);
        }
      } else {
        D.d("Not Setting RTC on MS3, it appears to not be online.");
      }
    } else {
      D.d("No MS3 found to set RTC");
    }
  }

  public String ExceptionInVPackage() {
    return "setMs3Rtc";
  }

  public void b(Properties paramProperties) {}

  public ArrayListExtensionInDPackage e() {
    return new ArrayListExtensionInDPackage();
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
