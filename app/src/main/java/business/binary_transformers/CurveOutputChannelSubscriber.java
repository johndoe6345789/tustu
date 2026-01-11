package business.binary_transformers;

import G.R;
import G.CloneableImplInGPackage;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.bN;

public class CurveOutputChannelSubscriber implements GComponentCq, bP {
  double ExceptionInVPackage = Double.NaN;
  
  bN b;
  
  R c;
  
  CloneableImplInGPackage d;
  
  an e;
  
  public G(R paramR, CloneableImplInGPackage parambm, an paraman) {
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
  
  public void ExceptionInVPackage() {
    if (this.d.l() != null)
      try {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.l(), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
      }  
    if (this.d.f() != null)
      try {
        ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.f(), this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
      }  
  }
  
  public void b() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */