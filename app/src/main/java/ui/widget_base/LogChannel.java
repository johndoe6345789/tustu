package W;

import bH.D;
import bH.L;
import bH.R;
import bH.X;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class LogChannel implements R {
  public String a = null;

  private String e = null;

  private float f = Float.NaN;

  private float g = Float.NaN;

  private float h = Float.NaN;

  private float i = Float.NaN;

  private String j = null;

  private String k = null;

  private int l = -1;

  private int m = -1;

  private String n = null;

  private boolean o = false;

  private int p = 0;

  private float q = 1.0F;

  private float r = 0.0F;

  private float s = 0.0F;

  private int t = 0;

  private boolean u = false;

  private float v = Float.POSITIVE_INFINITY;

  private boolean w = false;

  private int x = 2;

  List b = new ArrayList();

  k c;

  private String y = null;

  L d;

  private static int z = 1000;

  private static int A = 250000;

  private Map B = null;

  private boolean C = true;

  public LogChannel() {
    this.d = new L();
  }

  public LogChannel(String paramString) {
    this.d = new L();
    this.a = paramString;
  }

  public LogChannel(String paramString, int paramInt) {
    paramInt = (paramInt < z) ? z : paramInt;
    paramInt = (paramInt > A) ? A : paramInt;
    this.d = new L(paramInt);
    this.a = paramString;
  }

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public boolean b(String paramString) {
    return a(Float.parseFloat(paramString));
  }

  public boolean a(float paramFloat) {
    paramFloat = (paramFloat + this.r) * this.q;
    boolean bool = this.d.a(paramFloat);
    try {
      if (!Float.isNaN(paramFloat)) {
        if (this.w) {
          int i = v() - 1 - this.x;
          if (i >= 0) paramFloat = d(i);
        }
        if (this.C) {
          int i = v() - 1;
          if (i > 0 && d(i - 1) > paramFloat) this.C = false;
        }
        if (Float.isNaN(this.f) || paramFloat < this.f) d(paramFloat);
        if (paramFloat < 1.0E7F && (Float.isNaN(this.g) || paramFloat > this.g)) e(paramFloat);
        this.u = true;
      }
    } catch (Exception exception) {
    }
    return bool;
  }

  public boolean a(int paramInt, float paramFloat) {
    return this.d.a(paramInt, paramFloat);
  }

  public void b(int paramInt, float paramFloat) {
    this.d.b(paramInt, paramFloat);
  }

  public boolean b(float paramFloat) {
    return this.d.a(paramFloat);
  }

  public String a(int paramInt) {
    float f = c(paramInt);
    return c(f);
  }

  public String b(int paramInt) {
    if (o()) paramInt = this.d.a() - 1 - paramInt;
    float f = this.d.a(paramInt) + this.s;
    return c(f);
  }

  public String b() {
    float f1 = e();
    String str = c(f1);
    float f2 = h();
    if (f2 != f1) {
      switch (this.p) {
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
          return c(0.0F) + " [" + c(f2) + "]";
      }
      return str + " [" + c(f2) + "]";
    }
    return str;
  }

  public String d() {
    float f1 = f();
    String str = c(f1);
    float f2 = g();
    if (f2 != f1) {
      switch (this.p) {
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
          return c(1.0F) + " [" + c(f2) + "]";
      }
      return str + " [" + c(f2) + "]";
    }
    return str;
  }

  public String c(float paramFloat) {
    if (this.B != null && paramFloat >= 1.0E7F && this.B.containsKey(Float.valueOf(paramFloat)))
      return (String) this.B.get(Float.valueOf(paramFloat));
    if (this.p == 0)
      return Float.isNaN(paramFloat)
          ? "NaN"
          : ((this.w || this.l >= 0)
              ? X.b(paramFloat, this.l)
              : ((paramFloat > 999999.0F) ? X.b(paramFloat, 0) : X.b(paramFloat, 3)));
    if (this.p == 4) return (paramFloat == 0.0F) ? "Off" : "On";
    if (this.p == 5) return (paramFloat == 0.0F) ? "No" : "Yes";
    if (this.p == 7) return (paramFloat == 0.0F) ? "Inactive" : "Active";
    if (this.p == 6) return (paramFloat == 0.0F) ? "Low" : "High";
    if (this.p == 8) return (paramFloat == 0.0F) ? "False" : "True";
    if (this.p == 3) {
      DateFormat dateFormat = DateFormat.getDateInstance();
      Date date = k(paramFloat);
      return dateFormat.format(date);
    }
    if (this.p == 1) return "0x" + Integer.toHexString((int) paramFloat).toUpperCase();
    if (this.p == 2)
      return (this.l > 0)
          ? ("0b" + X.a(Integer.toBinaryString((int) paramFloat), '0', this.l))
          : ("0b" + Integer.toBinaryString((int) paramFloat));
    if (this.p == 255 && this.c != null) return this.c.a(paramFloat);
    D.b("Column " + this.a + " set to invalid DisplayType. Setting to the default float type.");
    f(0);
    return c(paramFloat);
  }

  public float c(int paramInt) {
    Float float_ = Float.valueOf(d(paramInt));
    return float_.floatValue();
  }

  public float d(int paramInt) {
    if (o()) paramInt = this.d.a() - 1 - paramInt;
    try {
      return this.w ? a(paramInt, this.x).floatValue() : (this.d.a(paramInt + this.t) + this.s);
    } catch (Exception exception) {
      return Float.NaN;
    }
  }

  public Float a(int paramInt1, int paramInt2) {
    float f;
    if (this.t != 0) paramInt1 += this.t;
    try {
      if (paramInt2 > 0 && (this.B == null || this.d.a(paramInt1) < 1.0E7F)) {
        int i = paramInt1 + paramInt2 + 1;
        if (i > this.d.a()) i = this.d.a();
        byte b1 = 0;
        float f1 = 0.0F;
        for (byte b2 = (paramInt2 > paramInt1) ? 0 : (paramInt1 - paramInt2); b2 < i; b2++) {
          float f2 = this.d.a(b2);
          if (!Float.isNaN(f2)) {
            f1 += f2 + this.s;
            b1++;
          }
        }
        f = f1 / b1;
      } else {
        f = this.d.a(paramInt1) + this.s;
      }
    } catch (Exception exception) {
      f = this.d.a(paramInt1) + this.s;
    }
    return Float.valueOf(f);
  }

  public void d(float paramFloat) {
    if (!Float.isInfinite(-paramFloat)) this.f = paramFloat;
  }

  public float e() {
    if (!Float.isNaN(this.h)) return this.h;
    if (this.p == 4 || this.p == 5 || this.p == 6 || this.p == 7) return -0.1F;
    if (Float.isNaN(this.f) && this.d.a() > 0)
      for (byte b = 0; b < this.d.a(); b++) {
        float f = c(b);
        if (f < this.f || Float.isNaN(this.f)) this.f = f;
      }
    return this.f;
  }

  public float f() {
    if (!Float.isNaN(this.i)) return this.i;
    if (this.p == 4 || this.p == 5 || this.p == 6 || this.p == 7) return 1.1F;
    if (Float.isNaN(this.g) && this.d.a() > 0)
      for (byte b = 0; b < this.d.a(); b++) {
        float f = c(b);
        if (((this.B == null || f < 1.0E7F) && f > this.g) || Float.isNaN(this.g)) this.g = f;
      }
    return this.g;
  }

  public float g() {
    if (this.p == 4 || this.p == 5 || this.p == 6 || this.p == 7) return 1.0F;
    if (Float.isNaN(this.g) && this.d.a() > 0)
      for (byte b = 0; b < this.d.a(); b++) {
        float f = c(b);
        if ((this.B == null || f < 1.0E7F) && (f > this.g || Float.isNaN(this.g))) this.g = f;
      }
    return this.g;
  }

  public float h() {
    if (this.p == 4 || this.p == 5 || this.p == 6 || this.p == 7) return 0.0F;
    if (Float.isNaN(this.f) && this.d.a() > 0)
      for (byte b = 0; b < this.d.a(); b++) {
        float f = c(b);
        if (f < this.f || Float.isNaN(this.f)) this.f = f;
      }
    return this.f;
  }

  public void e(float paramFloat) {
    if (!Float.isInfinite(paramFloat) && (this.B == null || paramFloat < 1.0E7F))
      this.g = paramFloat;
  }

  public void f(float paramFloat) {
    this.i = paramFloat;
  }

  public void g(float paramFloat) {
    this.h = paramFloat;
  }

  public int i() {
    return this.d.a();
  }

  public String j() {
    return this.j;
  }

  public double b(int paramInt1, int paramInt2) {
    double d = 0.0D;
    for (byte b = 0; b <= paramInt2 - paramInt1; b++) d = (d * b + c(paramInt1 + b)) / (b + 1);
    return d;
  }

  public double c(int paramInt1, int paramInt2) {
    double d = Double.POSITIVE_INFINITY;
    for (int i = paramInt1; i <= paramInt2; i++) {
      if (d > c(i)) d = c(i);
    }
    return d;
  }

  public double d(int paramInt1, int paramInt2) {
    double d = Double.NEGATIVE_INFINITY;
    for (int i = paramInt1; i <= paramInt2; i++) {
      float f = c(i);
      if ((this.B == null || f < 1.0E7F) && d < f) d = f;
    }
    return d;
  }

  public double a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2) {
    double d = 0.0D;
    for (byte b = 0; b <= paramInt2 - paramInt1; b++) {
      float f = c(paramInt1 + b);
      if (f >= paramFloat1 && f <= paramFloat2) d = (d * b + c(paramInt1 + b)) / (b + 1);
    }
    return d;
  }

  public void c(String paramString) {
    this.j = paramString;
  }

  public String k() {
    return this.k;
  }

  public void d(String paramString) {
    this.k = paramString;
  }

  public boolean l() {
    return ((this.k != null && this.k.indexOf("|") != -1)
        || (this.j != null && this.j.indexOf("logVal") == -1));
  }

  public int m() {
    return this.l;
  }

  public void e(int paramInt) {
    this.l = paramInt;
  }

  public String n() {
    return this.n;
  }

  public void e(String paramString) {
    this.n = paramString;
  }

  public boolean o() {
    return this.o;
  }

  public void a(boolean paramBoolean) {
    this.o = paramBoolean;
  }

  public int p() {
    return this.p;
  }

  public void f(int paramInt) {
    this.p = paramInt;
  }

  public void h(float paramFloat) {
    this.q = paramFloat;
  }

  public void i(float paramFloat) {
    this.r = paramFloat;
  }

  private static Date k(float paramFloat) {
    long l = (long) paramFloat;
    l *= 1000L;
    return new Date(l);
  }

  protected void e(int paramInt1, int paramInt2) {
    this.d.a(paramInt1, paramInt2);
    this.f = Float.NaN;
    this.g = Float.NaN;
    for (byte b = 0; b < this.d.a(); b++) {
      float f = this.d.a(b);
      if (!Float.isNaN(f)) {
        if (Float.isNaN(this.f) || f < this.f) d(f);
        if (Float.isNaN(this.g) || f > this.g) e(f);
      }
    }
  }

  public boolean q() {
    return this.u;
  }

  public String c() {
    return a();
  }

  public boolean r() {
    return this.w;
  }

  public void b(boolean paramBoolean) {
    this.w = paramBoolean;
    t();
  }

  public int s() {
    return this.x;
  }

  public void g(int paramInt) {
    this.x = paramInt;
  }

  public void t() {
    this.f = Float.NaN;
    this.g = Float.NaN;
  }

  public void j(float paramFloat) {
    this.s = paramFloat;
    C();
  }

  public void a(i parami) {
    this.b.add(parami);
  }

  public void b(i parami) {
    this.b.remove(parami);
  }

  private void C() {
    for (i i : this.b) i.a(this.a);
  }

  public String u() {
    return this.e;
  }

  public void f(String paramString) {
    this.e = paramString;
  }

  public int v() {
    return this.d.a();
  }

  public void w() {
    this.d.b();
  }

  public void a(k paramk) {
    this.c = paramk;
  }

  public boolean x() {
    return (this.d.a() == 0);
  }

  public void h(int paramInt) {
    this.d.a(paramInt, paramInt + 1);
  }

  public String y() {
    return this.y;
  }

  public void g(String paramString) {
    this.y = paramString;
  }

  public void a(Map paramMap) {
    this.B = paramMap;
    t();
  }

  public boolean z() {
    return this.C;
  }

  public int A() {
    return this.t;
  }

  public void i(int paramInt) {
    this.t = paramInt;
  }

  public int B() {
    return this.m;
  }

  public void j(int paramInt) {
    this.m = paramInt;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
