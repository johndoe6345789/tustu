package bt;

import G.R;
import G.be;
import G.cq;
import G.cu;
import V.a;
import bH.D;
import com.efiAnalytics.ui.w;

class H implements cq, bP {
  double a = Double.NaN;
  
  w b;
  
  private p e = null;
  
  R c;
  
  be d;
  
  public H(R paramR, be parambe, w paramw) {
    this.c = paramR;
    this.d = parambe;
    this.b = paramw;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals(this.b.g().w())) {
      this.a = paramDouble;
    } else if (paramString.equals(this.b.g().v()) && this.a != Double.NaN) {
      try {
        this.b.h().a(paramDouble + "", this.a + "");
        if (this.e != null)
          this.e.a(paramDouble, this.a); 
      } catch (Exception exception) {}
    } 
  }
  
  public void a() {
    try {
      cu.a().a(this.c.c(), this.d.f(), this);
      cu.a().a(this.c.c(), this.d.d(), this);
    } catch (a a) {
      D.a("Unable to subscribe x or y axis for hightlights.", (Exception)a, this);
    } 
  }
  
  public void b() {
    cu.a().a(this);
  }
  
  public void a(p paramp) {
    this.e = paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */