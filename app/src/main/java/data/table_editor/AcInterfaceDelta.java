package ac;

import bH.X;

public class AcInterfaceDelta extends s implements a {
  private C j = null;

  private int k = 0;

  public void a(C paramC) {
    this.j = paramC;
  }

  public String c() {
    return (this.k == 7)
        ? ((this.j.a() != 0.0D) ? "Active" : "Inactive")
        : ((this.k == 6)
            ? ((this.j.a() != 0.0D) ? "High" : "Low")
            : ((this.k == 4)
                ? ((this.j.a() != 0.0D) ? "On" : "Off")
                : ((this.k == 5) ? ((this.j.a() != 0.0D) ? "Yes" : "No") : X.c(this.j.a(), i()))));
  }

  public String a() {
    return new String(d());
  }

  public String b() {
    return new String(e());
  }

  public double j() {
    return this.j.a();
  }

  public int k() {
    return this.k;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
