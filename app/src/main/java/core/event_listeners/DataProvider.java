package ao;

import W.WInterfaceAq;
import com.efiAnalytics.ui.bV;
import java.awt.Window;
import javax.swing.JDialog;

class d implements WInterfaceAq {
  JDialog a = null;

  d(b paramb, Window paramWindow) {}

  public void a(double paramDouble) {
    if (this.a == null) this.a = bV.a(this.b, "Writing to file");
  }

  public void a() {
    if (this.a != null) this.a.dispose();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
