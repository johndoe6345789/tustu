package aP;

import V.a;
import com.efiAnalytics.ui.bV;
import h.i;
import java.awt.Frame;
import r.a;
import s.g;

class dA extends Thread {
  Frame a = null;
  
  boolean b = false;
  
  dA(dl paramdl, boolean paramBoolean, Frame paramFrame) {
    super("UpdateThread");
    setDaemon(true);
    this.b = paramBoolean;
    this.a = paramFrame;
  }
  
  public void run() {
    try {
      if (!this.c.c) {
        this.c.c = true;
        hq.a().a(g.b("Checking for updates"));
        if (!this.b) {
          Thread.currentThread();
          Thread.sleep(3000L);
        } 
        boolean bool = this.c.l();
        if (!dl.b(this.c) && !bool && this.b) {
          this.c.m();
          hq.a().a(g.b("No updates available."));
        } else {
          hq.a().a("Update Check Completed");
        } 
        a.a().b(a.y, "false");
        a.a().e();
        i.g();
      } 
    } catch (a a) {
      if (this.b) {
        bV.d(a.getMessage(), this.a);
        hq.a().a("");
      } 
    } catch (Exception exception) {
      bV.d("Error occured in Autoupdate " + exception.getMessage(), this.a);
    } finally {
      this.c.c = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */