package business.binary_transformers;

import bH.I;
import com.efiAnalytics.apps.ts.dashboard.aH;
import com.efiAnalytics.ui.cy;
import java.awt.Color;

class LiveGraphDataSeries extends aH implements cy {
  private String b = null;

  private double c = 0.0D;

  private double d = 0.0D;

  private Color e = Color.RED;

  private String f = null;

  private int g = 0;

  private String h = null;

  private boolean i = true;

  private boolean j = false;

  private int k = 0;

  LiveGraphDataSeries(s params) {}

  public void a(double paramDouble) {
    if (this.i && (Double.isNaN(this.d) || paramDouble > this.d)) {
      this.d = I.a(paramDouble);
      this.a.validate();
    }
    if (this.j && (Double.isNaN(this.c) || paramDouble < this.c)) {
      this.c = paramDouble;
      this.a.validate();
    }
    super.a(paramDouble);
    this.k++;
    if (h() && this.k % 10 == 0) {
      double d1 = Double.MAX_VALUE;
      double d2 = -1.0E7D;
      for (byte b = 0; b < size(); b++) {
        double d = a(b);
        if (d < d1) d1 = d;
        if (d > d2) d2 = d;
      }
      this.d = I.a(d2);
      if (d1 <= 0.0D) this.c = -I.a(Math.abs(d1));
    }
  }

  public void c(int paramInt) {
    b(paramInt);
  }

  public int b() {
    return this.g;
  }

  public double c() {
    return this.c;
  }

  public void b(double paramDouble) {
    this.c = paramDouble;
  }

  public double d() {
    return this.d;
  }

  public void c(double paramDouble) {
    this.d = paramDouble;
  }

  public Color e() {
    return this.e;
  }

  public void a(Color paramColor) {
    this.e = paramColor;
  }

  public String f() {
    return this.f;
  }

  public void a(String paramString) {
    this.f = paramString;
  }

  public void d(int paramInt) {
    this.g = paramInt;
  }

  public void b(String paramString) {
    this.b = paramString;
  }

  public String g() {
    return this.h;
  }

  public void c(String paramString) {
    this.h = paramString;
  }

  public boolean h() {
    return this.i;
  }

  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }

  public void b(boolean paramBoolean) {
    this.j = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
