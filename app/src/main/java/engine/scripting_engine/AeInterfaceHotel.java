package ae;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class AeInterfaceHotel extends Thread {
  AeInterfaceHotel(f paramf, w paramw) {}

  public void run() {
    try {
      d d = f.b(this.b);
      ArrayList<d> arrayList = new ArrayList();
      arrayList.add(d);
      this.a.a(arrayList);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String) null, iOException);
      d d = new d();
      d.a(d.b);
      d.a("Unable to communicate with the controller.");
      ArrayList<d> arrayList = new ArrayList();
      arrayList.add(d);
      this.a.a(arrayList);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
