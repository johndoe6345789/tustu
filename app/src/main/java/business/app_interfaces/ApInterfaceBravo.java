package business.app_interfaces;

import ao.hx;
import bH.D;
import IOInIPackage.IInterfaceCharlie;
import IOInIPackage.IInterfaceFoxtrot;
import IOInIPackage.IOInIPackage;
import IOInIPackage.j;

public class ApInterfaceBravo implements IInterfaceFoxtrot, j {
  double a = -1.0D;
  
  boolean b = false;
  
  public ApInterfaceBravo() {
    IInterfaceCharlie.a().a(this);
  }
  
  public boolean a(String paramString1, String paramString2) {
    if (paramString1.equals("startPlayback")) {
      String[] arrayOfString1 = paramString2.split("[|]");
      String[] arrayOfString2 = hx.a().E();
      if (arrayOfString2 != null && arrayOfString2.length > 0 && arrayOfString2[0].equals(arrayOfString1[0])) {
        this.b = true;
        try {
          this.a = hx.a().IOInIPackage();
          double d = Double.parseDouble(arrayOfString1[0]);
          hx.a().a(d, false);
        } catch (Exception exception) {
          D.IInterfaceCharlie("PIPE_ACTION_START_PLAYBACK: failed to set playback speed: " + paramString2);
        } 
        hx.a().e();
        this.b = false;
      } else {
        D.IInterfaceCharlie("PIPE_ACTION_START_PLAYBACK: Wrong File open");
      } 
      return true;
    } 
    if (paramString1.equals("stopPlayback")) {
      String[] arrayOfString1 = paramString2.split("[|]");
      String[] arrayOfString2 = hx.a().E();
      if (arrayOfString2 != null && arrayOfString2.length > 0 && arrayOfString2[0].equals(arrayOfString1[0])) {
        this.b = true;
        hx.a().j();
        if (this.a > 0.0D)
          hx.a().a(this.a, false); 
        this.b = false;
      } else {
        D.IInterfaceCharlie("PIPE_ACTION_STOP_PLAYBACK: Wrong File open");
      } 
      return true;
    } 
    return false;
  }
  
  public void a() {
    if (!this.b) {
      String[] arrayOfString = hx.a().E();
      double d = hx.a().IOInIPackage();
      IOInIPackage.a().a("startPlayback", arrayOfString[0] + "|" + d);
    } 
  }
  
  public void b() {
    if (!this.b) {
      String[] arrayOfString = hx.a().E();
      if (arrayOfString != null)
        IOInIPackage.a().a("stopPlayback", arrayOfString[0]); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ap/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */