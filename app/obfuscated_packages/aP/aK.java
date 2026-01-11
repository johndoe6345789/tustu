package aP;

import G.aM;
import G.aN;
import V.ExceptionPrintstacktrace;
import java.util.logging.Level;
import java.util.logging.Logger;

class aK implements aN {
  aK(aG paramaG) {}
  
  public void a(String paramString1, String paramString2) {
    String str = aG.a(this.a).G().c();
    aM aM = aG.a(this.a).c(str);
    if (aM != null && paramString2.equals(str))
      try {
        this.a.ExceptionPrintstacktrace = (int)aM.j(aG.a(this.a).h());
        this.a.c.setText("" + this.a.ExceptionPrintstacktrace);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(aG.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */