package aS;

import G.R;
import G.GComponentCq;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;

class AsInterfaceIndia implements GComponentCq {
  boolean a = false;
  
  k b = null;
  
  R c = null;
  
  i(g paramg, R paramR) {
    this.c = paramR;
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (this.b != null)
      this.b.a(false); 
    if (paramDouble != 0.0D) {
      if (this.b == null || !this.b.isAlive()) {
        this.b = new k(this.d, this.c);
        this.b.start();
      } else {
        this.b.a(true);
      } 
      this.a = true;
    } else if (this.a && paramDouble == 0.0D) {
      if (this.b.b() != null)
        this.b.b().ac(); 
      ThreadedJFrameIsoptimizeddrawingenabled.a().b().ac();
      this.a = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */