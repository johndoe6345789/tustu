package aX;

import aW.a;
import aW.q;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import s.g;

public class b implements q {
  a a = null;
  
  public void a(a parama, String paramString) {
    if (aC.b.a()) {
      this.a = new a();
      this.a.a(parama);
      Window window = bV.b((Component)parama);
      this.a.a(window);
    } else {
      String str = g.b("Bluetooth is not enabled on this computer.");
      bV.d(str, (Component)parama);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */