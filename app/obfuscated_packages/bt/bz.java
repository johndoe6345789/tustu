package bt;

import G.bM;
import G.bR;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fz;
import java.awt.Component;
import s.SComponentGolf;

class bz implements fz {
  bz(bu parambu) {}
  
  public boolean a(double paramDouble1, double paramDouble2) {
    if (paramDouble1 > this.a.d.s()) {
      String str1 = this.a.SComponentGolf.getText();
      if (str1.isEmpty())
        str1 = this.a.d.aL(); 
      String str2 = str1 + " " + SComponentGolf.b("value") + " " + paramDouble1 + " " + SComponentGolf.b("is too high.") + "\n" + SComponentGolf.b("Must be less than:") + " " + this.a.d.s();
      if (this.a.d.t() instanceof bR) {
        bR bR = (bR)this.a.d.t();
        String[] arrayOfString = bR.b();
        if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
          String str = bM.b(this.a.a, arrayOfString[0]);
          if (str != null)
            str2 = str2 + "\n\n" + SComponentGolf.b("Note!") + "\n" + SComponentGolf.b("This limit can be adjusted at:") + "\n" + str; 
        } 
      } 
      bV.d(str2, (Component)this.a.f);
      return false;
    } 
    if (paramDouble1 < this.a.d.r()) {
      String str1 = this.a.SComponentGolf.getText();
      if (str1.isEmpty())
        str1 = this.a.d.aL(); 
      String str2 = str1 + " " + SComponentGolf.b("value") + " " + paramDouble1 + " " + SComponentGolf.b("is too low.") + "\n" + SComponentGolf.b("Must be greater than:") + " " + this.a.d.r();
      if (this.a.d.u() instanceof bR) {
        bR bR = (bR)this.a.d.u();
        String[] arrayOfString = bR.b();
        if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
          String str = bM.b(this.a.a, arrayOfString[0]);
          if (str != null)
            str2 = str2 + "\n\n" + SComponentGolf.b("Note!") + "\n" + SComponentGolf.b("This limit can be adjusted at:") + "\n" + str; 
        } 
      } 
      bV.d(str2, (Component)this.a.f);
      return false;
    } 
    return true;
  }
  
  public boolean b(double paramDouble1, double paramDouble2) {
    if (paramDouble1 > this.a.c.s()) {
      String str1 = this.a.e.getText();
      if (str1.isEmpty())
        str1 = this.a.c.aL(); 
      String str2 = str1 + " " + SComponentGolf.b("value") + " " + paramDouble1 + " " + SComponentGolf.b("is too high.") + "\n" + SComponentGolf.b("Must be less than:") + " " + this.a.c.s();
      if (this.a.c.t() instanceof bR) {
        bR bR = (bR)this.a.c.t();
        String[] arrayOfString = bR.b();
        if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
          String str = bM.b(this.a.a, arrayOfString[0]);
          if (str != null)
            str2 = str2 + "\n\n" + SComponentGolf.b("Note!") + "\n" + SComponentGolf.b("This limit can be adjusted at:") + "\n" + str; 
        } 
      } 
      bV.d(str2, (Component)this.a.f);
      return false;
    } 
    if (paramDouble1 < this.a.c.r()) {
      String str1 = this.a.e.getText();
      if (str1.isEmpty())
        str1 = this.a.c.aL(); 
      String str2 = str1 + " " + SComponentGolf.b("value") + " " + paramDouble1 + " " + SComponentGolf.b("is too low.") + "\n" + SComponentGolf.b("Must be greater than:") + " " + this.a.c.r();
      if (this.a.c.u() instanceof bR) {
        bR bR = (bR)this.a.c.u();
        String[] arrayOfString = bR.b();
        if (arrayOfString != null && arrayOfString.length == 1 && arrayOfString[0].equals(bR.c().trim())) {
          String str = bM.b(this.a.a, arrayOfString[0]);
          if (str != null)
            str2 = str2 + "\n\n" + SComponentGolf.b("Note!") + "\n" + SComponentGolf.b("This limit can be adjusted at:") + "\n" + str; 
        } 
      } 
      bV.d(str2, (Component)this.a.f);
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */