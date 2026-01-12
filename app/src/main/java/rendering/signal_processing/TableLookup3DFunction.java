package L;

import G.GInterfaceAi;
import G.Manager;
import V.ExceptionPrintstacktrace;
import ax.AbstractInAxPackage;
import ax.AxInterfaceAb;
import ax.CloneableImplInAxPackage;
import ax.ExceptionInAxPackage;

public class TableLookup3DFunction extends AbstractInAxPackage {
  GInterfaceAi a;

  AxInterfaceAb b;

  AxInterfaceAb c;

  AxInterfaceAb d;

  AxInterfaceAb e;

  AxInterfaceAb f;

  Manager ExceptionPrintstacktrace = null;

  Manager h = null;

  Manager i = null;

  double[] j = null;

  double[] k = null;

  public T(
      GInterfaceAi paramaI,
      AxInterfaceAb paramab1,
      AxInterfaceAb paramab2,
      AxInterfaceAb paramab3,
      AxInterfaceAb paramab4,
      AxInterfaceAb paramab5) {
    this.a = paramaI;
    this.b = paramab1;
    this.c = paramab2;
    this.d = paramab3;
    this.e = paramab4;
    this.f = paramab5;
  }

  public double a(CloneableImplInAxPackage paramS) {
    c(paramS);
    try {
      double[] arrayOfDouble1 = a();
      double[] arrayOfDouble2 = b();
      double d1 = this.e.b(paramS);
      double d2 = this.f.b(paramS);
      double d3 = b(arrayOfDouble1, d1);
      double d4 = a(arrayOfDouble2, d2);
      return a(d4, d3);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      throw new ExceptionInAxPackage(
          "Unable to evaluate tableLookup: " + ExceptionPrintstacktrace.getLocalizedMessage());
    }
  }

  public double b(CloneableImplInAxPackage paramS) {
    return a(paramS);
  }

  private void c(CloneableImplInAxPackage paramS) {
    if (this.ExceptionPrintstacktrace == null) {
      this.ExceptionPrintstacktrace = l.a().a((int) this.b.b(paramS));
      if (this.ExceptionPrintstacktrace == null)
        throw new ExceptionInAxPackage("Z Parameter not found!");
    }
    if (this.h == null) {
      this.h = l.a().a((int) this.c.b(paramS));
      if (this.h == null) throw new ExceptionInAxPackage("X Parameter not found!");
    }
    if (this.i == null) {
      this.i = l.a().a((int) this.d.b(paramS));
      if (this.i == null) throw new ExceptionInAxPackage("Y Parameter not found!");
    }
  }

  public double a(double paramDouble1, double paramDouble2) {
    int i = (int) paramDouble1;
    int j = (int) paramDouble2;
    double[][] arrayOfDouble = this.ExceptionPrintstacktrace.i(this.a.h());
    int k = (i < arrayOfDouble.length - 1) ? (i + 1) : i;
    int m = (j < (arrayOfDouble[0]).length - 1) ? (j + 1) : j;
    double d1 = paramDouble1 - i;
    double d2 = paramDouble2 - j;
    return arrayOfDouble[i][j] * (1.0D - d2) * (1.0D - d1)
        + arrayOfDouble[i][m] * d2 * (1.0D - d1)
        + arrayOfDouble[k][j] * (1.0D - d2) * d1
        + arrayOfDouble[k][m] * d2 * d1;
  }

  public static double a(double[] paramArrayOfdouble, double paramDouble) {
    double d1 = 10.0D;
    try {
      d1 = paramArrayOfdouble[paramArrayOfdouble.length - 1];
    } catch (Exception exception) {
      System.out.println("axisValues=" + paramArrayOfdouble);
      System.out.println(
          "Exception in getYaxisPosition, axisValues[axisValues.length-1]="
              + paramArrayOfdouble[paramArrayOfdouble.length - 1]
              + ", axisValues.length="
              + paramArrayOfdouble.length);
    }
    double d2 = 0.0D;
    for (int i = paramArrayOfdouble.length - 1; i >= 0; i--) {
      double d = paramArrayOfdouble[i];
      if (d == paramDouble) {
        d2 = i;
        break;
      }
      if (d < paramDouble) {
        if (i == paramArrayOfdouble.length - 1) {
          d2 = i;
          break;
        }
        d2 = i + (d - paramDouble) / (d - d1);
        break;
      }
      if (i == 0) return i;
      d1 = d;
    }
    return d2;
  }

  public static double b(double[] paramArrayOfdouble, double paramDouble) {
    double d1 = 0.0D;
    double d2 = (paramArrayOfdouble.length - 1);
    for (byte b = 0; b < paramArrayOfdouble.length; b++) {
      double d = paramArrayOfdouble[b];
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
    return d2;
  }

  private double[] a() {
    double[][] arrayOfDouble = this.h.i(this.a.h());
    if (this.j == null) this.j = new double[arrayOfDouble.length];
    for (byte b = 0; b < this.j.length; b++) this.j[b] = arrayOfDouble[b][0];
    return this.j;
  }

  private double[] b() {
    double[][] arrayOfDouble = this.i.i(this.a.h());
    if (this.k == null) this.k = new double[this.ExceptionPrintstacktrace.a()];
    if (arrayOfDouble.length == this.k.length * 2) {
      for (byte b = 0; b < this.j.length; b++) {
        if (b % 2 == 0) this.k[b / 2] = arrayOfDouble[b][0];
      }
    } else {
      for (byte b = 0; b < this.j.length; b++) this.k[b] = arrayOfDouble[b][0];
    }
    return this.k;
  }

  public String toString() {
    return "tableLookup("
        + this.b.toString()
        + ", "
        + this.c.toString()
        + ", "
        + this.d.toString()
        + ", "
        + this.e.toString()
        + ", "
        + this.f.toString()
        + " )";
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/L/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
