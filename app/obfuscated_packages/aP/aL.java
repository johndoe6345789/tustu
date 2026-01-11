package aP;

import G.aM;
import G.aN;
import V.g;
import java.util.logging.Level;
import java.util.logging.Logger;

class aL implements aN {
  aL(aG paramaG) {}
  
  public void a(String paramString1, String paramString2) {
    String str = aG.a(this.a).G().b();
    aM aM = aG.a(this.a).c(str);
    if (aM != null && paramString2.equals(str))
      try {
        this.a.f = (int)aM.j(aG.a(this.a).h());
        this.a.b.setText("" + this.a.f);
      } catch (g g) {
        Logger.getLogger(aG.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */