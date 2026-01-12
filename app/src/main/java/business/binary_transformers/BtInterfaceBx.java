package business.binary_transformers;

import G.AeInterfaceMikeTostring;
import G.CloneableImpl;
import G.GInterfaceAg;
import G.R;
import com.efiAnalytics.tuningwidgets.panels.Q;
import com.efiAnalytics.ui.w;

public class BtInterfaceBx implements GInterfaceAg, bP {
  H a;

  Q b;

  bP c;

  public BtInterfaceBx(R paramR, CloneableImpl parambe, w paramw, p paramp) {
    this.a = new H(paramR, parambe, paramw);
    this.a.a(paramp);
    this.b = new Q(paramR, parambe, paramp);
    if (paramR.R()) {
      this.c = this.a;
    } else {
      this.c = (bP) this.b;
    }
    a();
  }

  public void a() {
    this.c.a();
  }

  public void b() {
    this.c.b();
  }

  public boolean a(String paramString, AeInterfaceMikeTostring parambT) {
    b();
    this.c = this.a;
    a();
    return true;
  }

  public void a(String paramString) {
    b();
    this.c = (bP) this.b;
    a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
