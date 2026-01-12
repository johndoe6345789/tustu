package ae;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInAePackage extends Thread {
  ThreadExtensionInAePackage(f paramf, w paramw) {}

  public void run() {
    List<d> list = null;
    try {
      list = f.a(this.b);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, "Communication Exception", iOException);
      d d = new d();
      d.a(d.b);
      d.a("Unable to communicate with the controller.");
      list = new ArrayList<>();
      list.add(d);
    } catch (Exception exception) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String) null, exception);
    } finally {
      if (list == null) {
        d d = new d();
        d.a(d.b);
        d.a("Unhandled Error occurred.");
        list = new ArrayList<>();
        list.add(d);
      }
      this.a.a(list);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
