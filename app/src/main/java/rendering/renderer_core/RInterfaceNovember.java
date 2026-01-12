package R;

import bH.D;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RInterfaceNovember {
  g a = g.a();

  public void a() {
    ArrayList arrayList = this.a.b();
    for (l l : arrayList) {
      boolean bool = a(l);
      if (bool) this.a.a(l.k());
    }
  }

  private boolean a(l paraml) {
    c c = d.a().a(paraml.a());
    if (c == null) {
      D.c("No MessageProcessor to process message type: " + paraml.a());
      return false;
    }
    try {
      return c.a(paraml);
    } catch (k k) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String) null, k);
      return false;
    }
  }

  boolean b() {
    return this.a.d();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
