package ao;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.Frame;

class en extends Thread {
  Frame a = null;

  boolean b = false;

  public void en(cd paramcd, boolean paramBoolean, Frame paramFrame) {
    super("UpdateThread");
    setDaemon(true);
    this.b = paramBoolean;
    this.a = paramFrame;
  }

  public void run() {
    try {
      if (!cd.r) {
        cd.r = true;
        if (!this.b) Thread.sleep(2000L);
        boolean bool = this.c.b();
        if (!cd.d(this.c) && !bool && this.b) this.c.g();
        IOProperties.c(IOProperties.y, "false");
        IOProperties.g();
      }
    } catch (Exception exception) {
      bV.d("Error occured in Autoupdate " + exception.getMessage(), this.a);
      exception.printStackTrace();
    } finally {
      cd.r = false;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/en.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
