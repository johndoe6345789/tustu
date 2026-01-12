package business.buffer_loaders.bL_components;

import G.GInterfaceAi;
import G.SerializableImpl;
import G.i;
import bH.D;
import com.efiAnalytics.ui.et;

public class TostringInBlPackage {
  private String b = null;

  private String c = null;

  private String d = "";

  private double e = 0.0D;

  private int f = 1;

  private String g = null;

  protected int a = 0;

  private et h = null;

  private boolean i = true;

  public boolean a(GInterfaceAi paramaI, byte[] paramArrayOfbyte) {
    boolean bool = false;
    if (this.f == 128) {
      if (this.c == null || this.c.equals("")) return false;
      String str = null;
      try {
        bool = (i.a(this.c, paramaI, paramArrayOfbyte) != 0.0D);
      } catch (Exception exception) {
        D.b("Unable to evaluate filter condition, not filtering:" + this.c + "\n\t" + str);
        return false;
      }
    } else {
      try {
        SerializableImpl SerializableImpl = paramaI.g(this.b);
        double d1 = SerializableImpl.b(paramArrayOfbyte);
        double d2 = 0.0D;
        d2 = this.e;
        bool = a(d1, d2, this.f);
      } catch (Exception exception) {
        D.b("unable to do simple compare for channels: " + this.b);
        return false;
      }
    }
    if (bool) this.a++;
    return bool;
  }

  private boolean a(double paramDouble1, double paramDouble2, int paramInt) {
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

  public String b() {
    return this.b;
  }

  public void a(String paramString) {
    this.b = paramString;
  }

  public double c() {
    return this.e;
  }

  public void b(String paramString) {
    if (paramString != null && !paramString.equals("")) a(Double.parseDouble(paramString));
  }

  public void a(double paramDouble) {
    this.e = paramDouble;
    if (this.h != null) this.h.a(g(), paramDouble + "");
  }

  public void d() {
    if (this.h != null) {
      String str = this.h.a(g());
      if (str != null && !str.equals(""))
        if (this.f == 128) {
          c(str);
        } else {
          b(str);
        }
    }
  }

  public int e() {
    return this.f;
  }

  public void a(int paramInt) {
    this.f = paramInt;
  }

  public String toString() {
    return this.g + "\nChannel=" + this.b + "\noperator=" + this.f + "\ncompareValue=" + this.e;
  }

  public String f() {
    return this.c;
  }

  public void c(String paramString) {
    this.c = paramString;
    if (this.h != null) this.h.a(g(), paramString + "");
  }

  public String a() {
    return (this.g != null && !this.g.equals(""))
        ? this.g
        : ((this.f == 128) ? this.c : ((this.b != null) ? this.b : "Undefined"));
  }

  public void d(String paramString) {
    this.g = paramString;
  }

  public String g() {
    return this.d;
  }

  public void e(String paramString) {
    this.d = paramString;
  }

  public void a(et paramet) {
    this.h = paramet;
  }

  public boolean h() {
    return this.i;
  }

  public void a(boolean paramBoolean) {
    this.i = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
