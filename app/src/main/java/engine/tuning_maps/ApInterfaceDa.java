package aP;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.Frame;
import r.ExceptionInVPackage;
import s.SComponentGolf;

class ApInterfaceDa extends Thread {
  Frame ExceptionInVPackage = null;
  
  boolean b = false;
  
  ApInterfaceDa(dl paramdl, boolean paramBoolean, Frame paramFrame) {
    super("UpdateThread");
    setDaemon(true);
    this.b = paramBoolean;
    this.ExceptionInVPackage = paramFrame;
  }
  
  public void run() {
    try {
      if (!this.c.c) {
        this.c.c = true;
        hq.ExceptionInVPackage().ExceptionInVPackage(SComponentGolf.b("Checking for updates"));
        if (!this.b) {
          Thread.currentThread();
          Thread.sleep(3000L);
        } 
        boolean bool = this.c.l();
        if (!dl.b(this.c) && !bool && this.b) {
          this.c.m();
          hq.ExceptionInVPackage().ExceptionInVPackage(SComponentGolf.b("No updates available."));
        } else {
          hq.ExceptionInVPackage().ExceptionInVPackage("Update Check Completed");
        } 
        ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.y, "false");
        ExceptionInVPackage.ExceptionInVPackage().e();
        IOProperties.SComponentGolf();
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      if (this.b) {
        bV.d(ExceptionInVPackage.getMessage(), this.ExceptionInVPackage);
        hq.ExceptionInVPackage().ExceptionInVPackage("");
      } 
    } catch (Exception exception) {
      bV.d("Error occured in Autoupdate " + exception.getMessage(), this.ExceptionInVPackage);
    } finally {
      this.c.c = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */