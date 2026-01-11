package aX;

import com.efiAnalytics.ui.bV;
import java.io.IOException;
import s.g;

class k implements Runnable {
  k(h paramh) {}
  
  public void run() {
    this.a.e.setEnabled(true);
    this.a.f.c();
    if (this.a.d.isEmpty()) {
      String str = g.b("No Un-Paired Bluetooth Adapters Found!");
      bV.d(str, this.a.e);
    } else {
      for (byte b = 0; b < this.a.d.size(); b++) {
        m m = this.a.d.elementAt(b);
        try {
          String str = m.a().getFriendlyName(false);
          if (str != null && (str.toLowerCase().startsWith("efi anal") || str.toLowerCase().startsWith("efianal"))) {
            this.a.c.setSelectedIndex(b);
            break;
          } 
        } catch (IOException iOException) {}
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */