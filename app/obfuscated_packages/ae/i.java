package ae;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class i extends Thread {
  i(f paramf, w paramw) {}
  
  public void run() {
    List<d> list = null;
    try {
      list = f.c(this.b);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      d d = new d();
      d.a(d.b);
      d.a("Unable to communicate with the controller.");
      list = new ArrayList<>();
      list.add(d);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */