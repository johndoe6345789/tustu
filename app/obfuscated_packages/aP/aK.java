package aP;

import G.aM;
import G.aN;
import V.g;
import java.util.logging.Level;
import java.util.logging.Logger;

class aK implements aN {
  aK(aG paramaG) {}
  
  public void a(String paramString1, String paramString2) {
    String str = aG.a(this.a).G().c();
    aM aM = aG.a(this.a).c(str);
    if (aM != null && paramString2.equals(str))
      try {
        this.a.g = (int)aM.j(aG.a(this.a).h());
        this.a.c.setText("" + this.a.g);
      } catch (g g) {
        Logger.getLogger(aG.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */