package ak;

import bH.X;

class AkInterfaceAm extends ak {
  protected int a;

  protected String b;

  public AkInterfaceAm(aa paramaa, int paramInt) {
    super(paramaa, paramInt);
    this.b = X.k(aa.a(paramaa, paramInt + 4, this.a - 4));
  }

  public String toString() {
    return "\"" + this.b + "\"";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
