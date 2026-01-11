package r;

import V.a;
import com.efiAnalytics.apps.ts.dashboard.Z;
import java.io.File;
import javax.swing.SwingUtilities;
import v.c;

class e extends Thread {
  e(b paramb, File paramFile) {}
  
  public void run() {
    c c = new c(j.G());
    Z z = null;
    try {
      z = c.a(this.a.getAbsolutePath());
      if (b.a(this.b) != null)
        z.d(b.a(this.b).c()); 
      this.b.b.a(z);
      this.b.b.e(true);
      SwingUtilities.invokeLater(this.b.g);
    } catch (a a) {
      a.printStackTrace();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */