package m;

import al.AbstractInAlPackage;
import am.AbstractInAlPackage;
import am.AmInterfaceCharlie;
import am.AmInterfaceEcho;
import java.util.ArrayList;
import java.util.List;

class MInterfaceJuliet {
  AmInterfaceEcho a;

  AmInterfaceCharlie b;

  List AmInterfaceCharlie;

  List AbstractInAlPackage = new ArrayList();

  AbstractInAlPackage AmInterfaceEcho = null;

  MInterfaceJuliet(AbstractInAlPackage paramd, AmInterfaceEcho parame) {
    this.a = parame;
    this.b = parame.f();
    this.AmInterfaceCharlie = AbstractInAlPackage.a(this.b);
    for (AbstractInAlPackage d1 : this.AmInterfaceCharlie) {
      String str = d1.o().AmInterfaceEcho();
      if (str.equalsIgnoreCase("time")) this.AmInterfaceEcho = d1;
      this.AbstractInAlPackage.add(str);
    }
  }

  private int AmInterfaceCharlie() {
    return this.AbstractInAlPackage.size();
  }

  public double a() {
    return (this.AmInterfaceEcho != null && this.AmInterfaceEcho.m() > 0.0D)
        ? ((this.AmInterfaceEcho.l() < 0.5D && this.AmInterfaceEcho.l() >= 0.0D)
            ? (this.b.AmInterfaceEcho() / this.AmInterfaceEcho.m())
            : (this.b.AmInterfaceEcho() / (this.AmInterfaceEcho.m() - this.AmInterfaceEcho.l())))
        : Double.NaN;
  }

  public long b() {
    return this.b.AmInterfaceEcho();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/m/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
