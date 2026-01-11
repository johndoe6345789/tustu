package bt;

import G.R;
import G.bm;
import G.cq;
import G.cu;
import V.a;
import bH.D;
import com.efiAnalytics.ui.bN;

public class CurveOutputChannelSubscriber implements cq, bP {
  double a = Double.NaN;
  
  bN b;
  
  R c;
  
  bm d;
  
  an e;
  
  public G(R paramR, bm parambm, an paraman) {
    this.c = paramR;
    this.d = parambm;
    this.b = paraman.p;
    this.e = paraman;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!this.e.isEnabled())
      return; 
    if (paramString.equals(this.d.l())) {
      this.b.f(paramDouble);
      if (this.b.H() < paramDouble || System.currentTimeMillis() - this.b.J() > this.b.G())
        this.b.l(paramDouble); 
      if (this.b.isEnabled())
        this.e.n(); 
    } else if (paramString.equals(this.d.f())) {
      this.b.k(paramDouble);
      if (this.b.isEnabled())
        this.e.n(); 
    } 
  }
  
  public void a() {
    if (this.d.l() != null)
      try {
        cu.a().a(this.c.c(), this.d.l(), this);
      } catch (a a) {
        D.a("Unable to subscribe x or y axis for hightlights.", (Exception)a, this);
      }  
    if (this.d.f() != null)
      try {
        cu.a().a(this.c.c(), this.d.f(), this);
      } catch (a a) {
        D.a("Unable to subscribe x or y axis for hightlights.", (Exception)a, this);
      }  
  }
  
  public void b() {
    cu.a().a(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */