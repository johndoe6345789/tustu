package aP;

import G.R;
import s.SComponentGolf;
import u.SComponentGolf;

class SComponentGolfImplInApPackage implements SComponentGolf {
  R a;

  hK(hH paramhH, R paramR) {
    this.a = paramR;
  }

  public String a() {
    return SComponentGolf.b("Exit & Go offline");
  }

  public String b() {
    return SComponentGolf.b(
        "Go offline and Exits the Difference Report with no changes to the currently loaded tune or"
            + " Controller.");
  }

  public boolean d() {
    this.a.C().c();
    return true;
  }

  public boolean c() {
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
