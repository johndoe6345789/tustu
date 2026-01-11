package aP;

import G.R;
import G.Y;
import com.efiAnalytics.ui.bV;
import r.a;
import s.g;
import u.g;

class hN implements g {
  R a;
  
  Y b;
  
  boolean c = false;
  
  hN(hH paramhH, R paramR, Y paramY) {
    this.a = paramR;
    this.b = paramY;
  }
  
  public String a() {
    return "Send Current " + a.b + " Settings";
  }
  
  public String b() {
    return "Update the Controller with the current " + a.b + " settings.";
  }
  
  public boolean d() {
    double d = 0.0D;
    if (this.a.g("rpm") != null && this.a.O().C() == null)
      d = this.a.g("rpm").o(); 
    byte b = 0;
    while (b++ < 3 && d > 10.0D) {
      bV.d(g.b("Turn off engine before sending local Tune."), dd.a().c());
      d = this.a.g("rpm").o();
    } 
    boolean bool = hH.a(this.d, this.a, this.b);
    this.c = true;
    return bool;
  }
  
  public boolean c() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */