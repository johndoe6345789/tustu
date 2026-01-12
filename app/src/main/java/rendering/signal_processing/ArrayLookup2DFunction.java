package L;

import G.GInterfaceAi;
import G.Manager;
import V.ExceptionPrintstacktrace;
import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;

public class ArrayLookup2DFunction extends AbstractInAxPackage {
  GInterfaceAi a;

  AxInterfaceAb b;

  AxInterfaceAb c;

  AxInterfaceAb d;

  Manager e = null;

  Manager f = null;

  public U(
      GInterfaceAi paramaI,
      AxInterfaceAb paramab1,
      AxInterfaceAb paramab2,
      AxInterfaceAb paramab3) {
    this.a = paramaI;
    this.b = paramab1;
    this.c = paramab2;
    this.d = paramab3;
  }

  public double a(CloneableImplInAxPackage paramS) {
    c(paramS);
    try {
      double d1 = this.d.b(paramS);
      double[][] arrayOfDouble1 = this.f.i(this.a.h());
      double d2 = b(arrayOfDouble1, d1);
      double[][] arrayOfDouble2 = this.e.i(this.a.h());
      return a(arrayOfDouble2, d2);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ax.U(
          "Unable to evaluate tableLookup: " + ExceptionPrintstacktrace.getLocalizedMessage());
    }
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  private void c(CloneableImplInAxPackage paramS) {
    if (this.e == null) {
      this.e = l.a().a((int) this.b.b(paramS));
      if (this.e == null) throw new ax.U("Array Parameter not found!");
      if (!this.e.i().equals("array")) throw new ax.U("Array Parameter must be of type array!");
      if (this.e.m() != 1) throw new ax.U("Array Parameter must be 1D array!");
    }
    if (this.f == null) {
      this.f = l.a().a((int) this.c.b(paramS));
      if (this.f == null) throw new ax.U("Array Parameter not found!");
      if (!this.f.i().equals("array")) throw new ax.U("Array Parameter must be of type array!");
      if (this.f.m() != 1) throw new ax.U("Array Parameter must be 1D array!");
    }
  }

  public double a(double[][] paramArrayOfdouble, double paramDouble) {
    int i = (int) paramDouble;
    int j = (int) Math.ceil(paramDouble);
    double d = paramDouble - i;
    return paramArrayOfdouble[i][0] + d * (paramArrayOfdouble[j][0] - paramArrayOfdouble[i][0]);
  }

  public static double b(double[][] paramArrayOfdouble, double paramDouble) {
    double d1 = 0.0D;
    double d2 = (paramArrayOfdouble.length - 1);
    boolean bool =
        (paramArrayOfdouble[0][0] <= paramArrayOfdouble[paramArrayOfdouble.length - 1][0])
            ? true
            : false;
    if (bool) {
      for (byte b = 0; b < paramArrayOfdouble.length; b++) {
        double d = paramArrayOfdouble[b][0];
        if (d == paramDouble) {
          d2 = b;
          break;
        }
        if (d > paramDouble) {
          if (b == 0 && paramDouble <= d) {
            d2 = 0.0D;
            break;
          }
          d2 = b - 1.0D + (paramDouble - d1) / (d - d1);
          break;
        }
        d1 = d;
      }
    } else {
      d2 = 0.0D;
      d1 = paramArrayOfdouble[paramArrayOfdouble.length - 1][0];
      for (int i = paramArrayOfdouble.length - 1; i >= 0; i--) {
        double d = paramArrayOfdouble[i][0];
        if (d == paramDouble) {
          d2 = i;
          break;
        }
        if (d > paramDouble) {
          if (i == paramArrayOfdouble.length && paramDouble <= d) {
            d2 = paramArrayOfdouble.length;
            break;
          }
          d2 = i + (d1 - paramDouble) / (d - d1);
          break;
        }
        d1 = d;
      }
    }
    return d2;
  }

  public String toString() {
    return "tableLookup("
        + this.b.toString()
        + ", "
        + this.c.toString()
        + ", "
        + this.d.toString()
        + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
