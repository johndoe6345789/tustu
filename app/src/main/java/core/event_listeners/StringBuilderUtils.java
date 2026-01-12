package ao;

import V.ExceptionInVPackage;
import az.ExceptionInVPackage;
import bH.D;
import h.IOProperties;
import java.util.logging.Level;
import java.util.logging.Logger;

class ei extends Thread {
  ei(
      eg parameg,
      String paramString1,
      String paramString2,
      String paramString3,
      String paramString4,
      ExceptionInVPackage parama) {}

  public void run() {
    try {
      Thread.sleep(200L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    try {
      IOProperties.d("firstName", this.ExceptionInVPackage);
      IOProperties.d("lastName", this.b);
      IOProperties.d("registrationKeyV2", this.c);
      IOProperties.d("userEmail", this.d);
      IOProperties.c("quadraticInterpolation", "false");
      IOProperties.c("valid", "false");
      if (cd.e(this.f.ExceptionInVPackage)) {
        try {
          IOProperties.h();
          IOProperties.g();
        } catch (ExceptionInVPackage a1) {
          D.ExceptionInVPackage(
              "Failed to save Registration Information.",
              (Exception) a1,
              bq.ExceptionInVPackage().b());
          return;
        }
        cd.f(this.f.ExceptionInVPackage);
      }
    } finally {
      this.e.setVisible(false);
      this.e.dispose();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
