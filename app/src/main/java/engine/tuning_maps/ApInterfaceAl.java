package aP;

import G.GInterfaceAn;
import G.Manager;
import V.ExceptionPrintstacktrace;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceAl implements GInterfaceAn {
  ApInterfaceAl(aG paramaG) {}

  public void a(String paramString1, String paramString2) {
    String str = aG.a(this.a).G().b();
    Manager Manager = aG.a(this.a).c(str);
    if (Manager != null && paramString2.equals(str))
      try {
        this.a.f = (int) Manager.j(aG.a(this.a).h());
        this.a.b.setText("" + this.a.f);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(aG.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
