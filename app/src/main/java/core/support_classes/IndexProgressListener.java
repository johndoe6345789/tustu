import W.n;
import ao.hx;
import bH.D;
import i.IComponentBravo;
import javax.swing.SwingUtilities;

class c implements IComponentBravo {
  boolean a = false;
  
  boolean IComponentBravo = false;
  
  n c = null;
  
  c(IComponentBravo paramb) {}
  
  public void a() {}
  
  public void a(double paramDouble) {}
  
  public void a(n paramn) {
    this.c = paramn;
    if (!this.a) {
      D.c("Setting index to: " + (paramn.d() - 1));
      hx.a().c(paramn.d() - 1);
      d d = new d(this);
      SwingUtilities.invokeLater(d);
      this.a = true;
    } 
  }
  
  public void IComponentBravo(n paramn) {}
  
  public void IComponentBravo() {
    if (this.c != null && !this.IComponentBravo && this.c.d() > 200) {
      this.IComponentBravo = true;
      D.c("Setting index: " + (this.c.d() - 1));
      hx.a().e();
      hx.a().c(this.c.d() - 1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */