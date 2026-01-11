package bt;

import G.cq;
import G.cu;
import V.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import java.awt.Component;

class aa implements cq, bP {
  double ExceptionInVPackage = Double.NaN;
  
  aa(W paramW) {}
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (this.b.c == null)
      return; 
    if (this.b.c.d() != null && paramString.equals(this.b.c.d())) {
      this.b.b(paramDouble);
    } else if (this.b.c.f() != null && paramString.equals(this.b.c.f())) {
      this.b.ExceptionInVPackage(paramDouble);
    } 
  }
  
  public void ExceptionInVPackage() {
    cu cu = cu.ExceptionInVPackage();
    try {
      cu.ExceptionInVPackage(W.ExceptionInVPackage(this.b).c(), this.b.c.d(), this);
      cu.ExceptionInVPackage(W.ExceptionInVPackage(this.b).c(), this.b.c.f(), this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d("Error subscribing output channel.", (Component)this.b.b);
      ExceptionInVPackage.printStackTrace();
    } 
  }
  
  public void b() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */