import aP.dl;
import aP.f;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Window;
import r.a;
import r.i;
import s.g;

final class g implements Runnable {
  g(boolean paramBoolean, String[] paramArrayOfString) {}
  
  public void run() {
    dl dl = new dl(this.a);
    TunerStudio.a = dl;
    if (TunerStudio.c)
      bV.d("Unable to delete " + TunerStudio.b + "\nAttempted to clear file instead.", (Component)dl); 
    if (this.b.length > 0 && !this.b[0].equals("")) {
      for (byte b = 0; b < this.b.length; b++)
        System.out.println("arg found " + b + ":" + this.b[b]); 
      String[] arrayOfString = a.a().a(a.cx, a.cw).split(";");
      boolean bool = false;
      if (arrayOfString != null)
        for (String str : arrayOfString) {
          if (this.b[0].toLowerCase().endsWith(str.toLowerCase())) {
            bool = true;
            break;
          } 
        }  
      if (this.b[0].toLowerCase().contains(".msq") || bool) {
        f.a().c((Window)dl, this.b[0]);
      } else if (this.b[0].toLowerCase().endsWith("." + a.t)) {
        if (i.a().a("09RGDKDG;LKIGD")) {
          f.a().a(this.b[0]);
        } else {
          bV.d(g.b("Open Project Archive not supported in this edition."), (Component)dl);
          dl.n();
        } 
      } else {
        dl.i();
      } 
    } else {
      dl.i();
    } 
    TunerStudio.a.h();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */