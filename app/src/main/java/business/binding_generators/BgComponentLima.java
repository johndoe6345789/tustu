package business.binding_generators;

import V.ExceptionInVPackage;
import bH.D;
import com.efiAnalytics.apps.ts.tuningViews.F;
import com.efiAnalytics.apps.ts.tuningViews.b;
import com.efiAnalytics.ui.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import javax.swing.SwingUtilities;
import v.VInterfaceGolf;

class BgComponentLima implements ExceptionInVPackage {
  private b b = null;
  
  private String[] c = null;
  
  BgComponentLima(ExceptionInVPackage parama, b paramb, String[] paramArrayOfString) {
    this.b = paramb;
    this.c = paramArrayOfString;
  }
  
  public boolean ExceptionInVPackage() {
    c();
    return true;
  }
  
  public void b() {}
  
  public void c() {
    m m = new m(this);
    SwingUtilities.invokeLater(m);
  }
  
  private void d() {
    try {
      VInterfaceGolf VInterfaceGolf = new VInterfaceGolf();
      F f = VInterfaceGolf.ExceptionInVPackage(this.b.ExceptionInVPackage());
      if (this.b.b() && !ExceptionInVPackage(f.ExceptionInVPackage())) {
        String str = this.c[0];
        for (byte b1 = 1; b1 < this.c.length; b1++)
          str = str + " & " + this.c[b1]; 
        boolean bool = bV.ExceptionInVPackage("Warning: Tune View firmware signature (" + f.ExceptionInVPackage() + ")\ndoes not match current firmware (" + str + ").\nYou may need to edit some components of the layout.\n \nContinue Loading?", this.ExceptionInVPackage.getParent(), true);
        if (!bool)
          return; 
      } 
      f.ExceptionInVPackage(this.c[0]);
      this.ExceptionInVPackage.ExceptionInVPackage(f);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Unable to load dash file:\n" + this.b.ExceptionInVPackage(), (Exception)a1, this.ExceptionInVPackage.getParent());
    } 
  }
  
  private boolean ExceptionInVPackage(String paramString) {
    for (byte b1 = 0; b1 < this.c.length; b1++) {
      if (this.c[b1].equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bg/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */