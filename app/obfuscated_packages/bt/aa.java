package bt;

import G.cq;
import G.cu;
import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.Component;

class aa implements cq, bP {
  double a = Double.NaN;
  
  aa(W paramW) {}
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (this.b.c == null)
      return; 
    if (this.b.c.d() != null && paramString.equals(this.b.c.d())) {
      this.b.b(paramDouble);
    } else if (this.b.c.f() != null && paramString.equals(this.b.c.f())) {
      this.b.a(paramDouble);
    } 
  }
  
  public void a() {
    cu cu = cu.a();
    try {
      cu.a(W.a(this.b).c(), this.b.c.d(), this);
      cu.a(W.a(this.b).c(), this.b.c.f(), this);
    } catch (a a) {
      bV.d("Error subscribing output channel.", (Component)this.b.b);
      a.printStackTrace();
    } 
  }
  
  public void b() {
    cu.a().a(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */