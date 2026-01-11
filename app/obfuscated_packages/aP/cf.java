package aP;

import W.n;
import ao.hx;
import bH.X;
import i.IComponentBravo;
import java.io.File;

class cf implements IComponentBravo {
  cf(cc paramcc) {}
  
  public void a() {}
  
  public void a(double paramDouble) {
    if (paramDouble == 1.0D)
      cc.f(this.a); 
  }
  
  public void a(n paramn) {
    this.a.e();
    if (paramn != null) {
      File file = paramn.k();
      this.a.C = file.getName();
      this.a.A.setText(this.a.C);
      this.a.A.setToolTipText(this.a.C);
    } else {
      this.a.A.setText("");
      this.a.A.setToolTipText(null);
    } 
  }
  
  public void IComponentBravo(n paramn) {
    if (paramn != null) {
      File file = paramn.k();
      this.a.C = file.getName();
      this.a.A.setText("1: " + this.a.C + " - 2:" + file.getName());
      this.a.A.setToolTipText("<html>" + X.IComponentBravo(this.a.A.getText(), " - ", "<br>"));
    } else if (hx.a().r() != null) {
      File file = hx.a().r().k();
      this.a.C = file.getName();
      this.a.A.setText(this.a.C);
      this.a.A.setToolTipText(this.a.C);
    } else {
      this.a.A.setText("");
      this.a.A.setToolTipText(null);
    } 
  }
  
  public void IComponentBravo() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */