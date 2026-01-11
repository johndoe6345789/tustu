package business.binary_transformers;

import G.R;
import G.CloneableImpl;
import G.GComponentCq;
import G.ManagerUsingArrayList;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.w;

class Table2DOutputChannelSubscriber implements GComponentCq, bP {
  double ExceptionInVPackage = Double.NaN;
  
  w b;
  
  private p e = null;
  
  R c;
  
  CloneableImpl d;
  
  public H(R paramR, CloneableImpl parambe, w paramw) {
    this.c = paramR;
    this.d = parambe;
    this.b = paramw;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (paramString.equals(this.b.g().w())) {
      this.ExceptionInVPackage = paramDouble;
    } else if (paramString.equals(this.b.g().v()) && this.ExceptionInVPackage != Double.NaN) {
      try {
        this.b.h().ExceptionInVPackage(paramDouble + "", this.ExceptionInVPackage + "");
        if (this.e != null)
          this.e.ExceptionInVPackage(paramDouble, this.ExceptionInVPackage); 
      } catch (Exception exception) {}
    } 
  }
  
  public void ExceptionInVPackage() {
    try {
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.f(), this);
      ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.d(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
    } 
  }
  
  public void b() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void ExceptionInVPackage(p paramp) {
    this.e = paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */