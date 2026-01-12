package business.buffer_utilities;

import W.n;

public class BuComponentAlpha {
  private double a = Double.NaN;

  private double b = Double.NaN;

  private double c = Double.NaN;

  private double d = Double.NaN;

  private double e = Double.NaN;

  private double f = Double.NaN;

  private double g = Double.NaN;

  private double h = Double.NaN;

  private double i = Double.NaN;

  private String j = "";

  private boolean k = false;

  public double a() {
    return this.b;
  }

  public void a(double paramDouble) {
    this.b = paramDouble;
  }

  public double b() {
    return this.d;
  }

  public void b(double paramDouble) {
    this.d = paramDouble;
  }

  public double c() {
    return this.e;
  }

  public void c(double paramDouble) {
    this.e = paramDouble;
  }

  public double d() {
    return this.g;
  }

  public void d(double paramDouble) {
    this.g = paramDouble;
  }

  public double e() {
    return this.h;
  }

  public void e(double paramDouble) {
    this.h = paramDouble;
  }

  public double f() {
    return this.i;
  }

  public void f(double paramDouble) {
    this.i = paramDouble;
  }

  public static a a(n paramn) {
    a a1 = new a();
    byte b = 0;
    if (paramn != null) {
      String str = paramn.f("60ftET");
      if (str == null) {
        str = paramn.f("60ftETGen");
        if (str != null) b++;
      }
      if (str != null) {
        double d = b(str);
        a1.a(d);
      }
      str = paramn.f("330ftET");
      if (str == null) {
        str = paramn.f("330ftETGen");
        if (str != null) b++;
      }
      if (str != null) {
        double d = b(str);
        a1.g(d);
      }
      str = paramn.f("660ftET");
      if (str == null) {
        str = paramn.f("660ftETGen");
        if (str != null) b++;
      }
      if (str != null) {
        double d = b(str);
        a1.b(d);
      }
      str = paramn.f("660ftMPH");
      if (str == null) {
        str = paramn.f("660ftMPHGen");
        if (str != null) b++;
      }
      if (str != null) {
        double d = b(str);
        a1.c(d);
      }
      str = paramn.f("1000ftET");
      if (str == null) {
        str = paramn.f("1000ftETGen");
        if (str != null) b++;
      }
      if (str != null) {
        double d = b(str);
        a1.h(d);
      }
      str = paramn.f("1320ftET");
      if (str == null) str = paramn.f("1320ftETGen");
      if (str != null) {
        double d = b(str);
        a1.d(d);
      }
      str = paramn.f("1320ftMPH");
      if (str == null) str = paramn.f("1320ftMPHGen");
      if (str != null) {
        double d = b(str);
        a1.e(d);
      }
      str = paramn.f("rolloutTime");
      if (str != null) {
        double d = b(str);
        a1.i(d);
      }
      str = paramn.f("DensityAltitude");
      if (str != null) {
        double d = b(str);
        a1.f(d);
      }
      str = paramn.f("TimeSlipNotes");
      if (str != null) a1.a(str);
      if (b > 2) a1.a(true);
    }
    return a1;
  }

  public n b(n paramn) {
    paramn.a("60ftET", Double.toString(a()));
    paramn.a("330ftET", Double.toString(g()));
    paramn.a("660ftET", Double.toString(b()));
    paramn.a("660ftMPH", Double.toString(c()));
    paramn.a("1000ftET", Double.toString(i()));
    paramn.a("1320ftET", Double.toString(d()));
    paramn.a("1320ftMPH", Double.toString(e()));
    paramn.a("DensityAltitude", Double.toString(f()));
    paramn.a("TimeSlipNotes", j());
    return paramn;
  }

  private static double b(String paramString) {
    try {
      return Double.parseDouble(paramString);
    } catch (NumberFormatException numberFormatException) {
      return Double.NaN;
    }
  }

  public double g() {
    return this.c;
  }

  public void g(double paramDouble) {
    this.c = paramDouble;
  }

  public boolean h() {
    return (!Double.isNaN(this.b)
        || !Double.isNaN(this.c)
        || !Double.isNaN(this.e)
        || !Double.isNaN(this.f)
        || !Double.isNaN(this.g)
        || !Double.isNaN(this.h)
        || !Double.isNaN(this.i));
  }

  public double i() {
    return this.f;
  }

  public void h(double paramDouble) {
    this.f = paramDouble;
  }

  public String j() {
    return this.j;
  }

  public void a(String paramString) {
    this.j = paramString;
  }

  public double k() {
    return this.a;
  }

  public void i(double paramDouble) {
    this.a = paramDouble;
  }

  public boolean l() {
    return this.k;
  }

  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bu/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
