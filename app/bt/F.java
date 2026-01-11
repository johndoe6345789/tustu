package bt;

import G.R;
import G.bh;
import G.cq;
import G.cu;
import V.a;
import bF.d;
import bH.D;

public class F implements cq, bP {
  double a = Double.NaN;
  
  T b;
  
  d c;
  
  R d;
  
  bh e;
  
  public F(R paramR, bh parambh, T paramT) {
    this.d = paramR;
    this.e = parambh;
    this.b = paramT;
    this.c = paramT.b;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!this.b.isEnabled())
      return; 
    this.c.a(paramDouble);
    this.b.c();
  }
  
  public void a() {
    if (this.e.d() != null)
      try {
        cu.a().a(this.d.c(), this.e.d(), this);
      } catch (a a) {
        D.a("Unable to subscribe x or y axis for hightlights.", (Exception)a, this);
      }  
  }
  
  public void b() {
    cu.a().a(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */