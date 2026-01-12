package L;

import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;

public class IsTrueForFunction extends AbstractInAxPackage {
  private AxInterfaceAb b;

  private AxInterfaceAb c;

  long a = -1L;

  public E(AxInterfaceAb paramab1, AxInterfaceAb paramab2) {
    this.b = paramab1;
    this.c = paramab2;
  }

  public double a(CloneableImplInAxPackage paramS) {
    if (this.b.b(paramS) != 0.0D) {
      if (this.a < 0L) this.a = System.currentTimeMillis();
      return ((System.currentTimeMillis() - this.a) >= this.c.b(paramS) * 1000.0D) ? 1.0D : 0.0D;
    }
    if (this.a > 0L) this.a = -1L;
    return 0.0D;
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  public String toString() {
    return "isTrueFor( " + this.b.toString() + ", " + this.c.toString() + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
