package ao;

import V.VInterfaceHotel;
import W.j;
import W.n;
import ax.ExceptionInAxPackage;
import bH.D;
import g.GInterfaceEcho;
import k.KComponentDelta;
import k.KInterfaceAlpha;

public class E {
  private String KInterfaceAlpha = null;

  private String b = null;

  private String c = null;

  private float KComponentDelta = 0.0F;

  private int GInterfaceEcho = 1;

  private String f = null;

  private int g = 0;

  public boolean KInterfaceAlpha(n paramn, int paramInt) {
    j j = paramn.KInterfaceAlpha(this.KInterfaceAlpha);
    if (this.GInterfaceEcho != 64 && j == null) return false;
    boolean bool = false;
    if (this.GInterfaceEcho == 64) {
      String str = null;
      try {
        str = GInterfaceEcho.b(paramn, this.c, paramInt);
        KInterfaceAlpha KInterfaceAlpha = KComponentDelta.KInterfaceAlpha().KInterfaceAlpha(str);
        bool = (KInterfaceAlpha.KComponentDelta() != 0.0D);
      } catch (VInterfaceHotel VInterfaceHotel) {
        D.b("Unable to evaluate filter condition, not filtering:" + this.c + "\n\t" + str);
        return false;
      } catch (ExceptionInAxPackage u) {
        D.b("Unable to evaluate filter condition, not filtering:" + this.c + "\n\t" + str);
        return false;
      }
    } else {
      float f1 = j.c(paramInt);
      float f2 = 0.0F;
      if (this.b == null || this.b.equals("")) {
        f2 = this.KComponentDelta;
      } else {
        j j1 = paramn.KInterfaceAlpha(this.b);
        if (j1 == null) return false;
        f2 = j1.c(paramInt);
      }
      bool = KInterfaceAlpha(f1, f2, this.GInterfaceEcho);
    }
    if (bool) c(KInterfaceAlpha() + 1);
    return bool;
  }

  public boolean KInterfaceAlpha(double paramDouble1, double paramDouble2, int paramInt) {
    if (paramInt == 1) return (paramDouble1 == paramDouble2);
    if (paramInt == 2) return (paramDouble1 > paramDouble2);
    if (paramInt == 16) return (paramDouble1 >= paramDouble2);
    if (paramInt == 4) return (paramDouble1 < paramDouble2);
    if (paramInt == 8) return (paramDouble1 <= paramDouble2);
    if (paramInt == 32) {
      int i = (int) paramDouble1;
      int j = (int) paramDouble2;
      return (j == (i & j));
    }
    return false;
  }

  public void KInterfaceAlpha(String paramString) {
    this.KInterfaceAlpha = paramString;
  }

  public void b(String paramString) {
    this.KComponentDelta = Float.parseFloat(paramString);
  }

  public void KInterfaceAlpha(float paramFloat) {
    this.KComponentDelta = paramFloat;
  }

  public void KInterfaceAlpha(int paramInt) {
    this.KComponentDelta = paramInt;
  }

  public void b(int paramInt) {
    this.GInterfaceEcho = paramInt;
  }

  public String toString() {
    return "Field="
        + this.KInterfaceAlpha
        + "\noperator="
        + this.GInterfaceEcho
        + "\ncompareField="
        + this.b
        + "\ncompareValue="
        + this.KComponentDelta;
  }

  public void c(String paramString) {
    this.c = paramString;
  }

  public int KInterfaceAlpha() {
    return this.g;
  }

  public void c(int paramInt) {
    this.g = paramInt;
  }

  public String b() {
    return (this.f != null && !this.f.equals(""))
        ? this.f
        : ((this.GInterfaceEcho == 64)
            ? this.c
            : ((this.KInterfaceAlpha != null) ? this.KInterfaceAlpha : "Undefined"));
  }

  public void KComponentDelta(String paramString) {
    this.f = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
