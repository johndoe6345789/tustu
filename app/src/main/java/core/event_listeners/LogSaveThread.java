package ao;

import W.n;
import W.o;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.io.IOException;

class g extends Thread {
  o a;

  n b;

  public void g(b paramb, o paramo, n paramn) {
    this.a = paramo;
    this.b = paramn;
  }

  public void run() {
    long l = System.currentTimeMillis();
    try {
      this.a.a(this.b);
      this.a.b(this.b);
    } catch (IOException iOException) {
      bV.d("Error Saving Log File:\n" + iOException.getMessage(), bq.a().b());
      iOException.printStackTrace();
    } finally {
      try {
        this.a.a();
      } catch (Exception exception) {
      }
    }
    D.c("Wrote to file. " + (System.currentTimeMillis() - l) + "ms.");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
