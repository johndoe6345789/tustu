package bt;

import G.R;
import G.be;
import G.cq;
import G.cu;
import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.ui.w;

class Table2DOutputChannelSubscriber implements cq, bP {
  double ExceptionInVPackage = Double.NaN;
  
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
      cu.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.f(), this);
      cu.ExceptionInVPackage().ExceptionInVPackage(this.c.c(), this.d.d(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      D.ExceptionInVPackage("Unable to subscribe x or y axis for hightlights.", (Exception)ExceptionInVPackage, this);
    } 
  }
  
  public void b() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void ExceptionInVPackage(p paramp) {
    this.e = paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/H.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */