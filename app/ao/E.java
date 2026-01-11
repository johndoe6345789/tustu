package ao;

import V.h;
import W.j;
import W.n;
import ax.U;
import bH.D;
import g.e;
import k.a;
import k.d;

public class E {
  private String a = null;
  
  private String b = null;
  
  private String c = null;
  
  private float d = 0.0F;
  
  private int e = 1;
  
  private String f = null;
  
  private int g = 0;
  
  public boolean a(n paramn, int paramInt) {
    j j = paramn.a(this.a);
    if (this.e != 64 && j == null)
      return false; 
    boolean bool = false;
    if (this.e == 64) {
      String str = null;
      try {
        str = e.b(paramn, this.c, paramInt);
        a a = d.a().a(str);
        bool = (a.d() != 0.0D);
      } catch (h h) {
        D.b("Unable to evaluate filter condition, not filtering:" + this.c + "\n\t" + str);
        return false;
      } catch (U u) {
        D.b("Unable to evaluate filter condition, not filtering:" + this.c + "\n\t" + str);
        return false;
      } 
    } else {
      float f1 = j.c(paramInt);
      float f2 = 0.0F;
      if (this.b == null || this.b.equals("")) {
        f2 = this.d;
      } else {
        j j1 = paramn.a(this.b);
        if (j1 == null)
          return false; 
        f2 = j1.c(paramInt);
      } 
      bool = a(f1, f2, this.e);
    } 
    if (bool)
      c(a() + 1); 
    return bool;
  }
  
  public boolean a(double paramDouble1, double paramDouble2, int paramInt) {
    if (paramInt == 1)
      return (paramDouble1 == paramDouble2); 
    if (paramInt == 2)
      return (paramDouble1 > paramDouble2); 
    if (paramInt == 16)
      return (paramDouble1 >= paramDouble2); 
    if (paramInt == 4)
      return (paramDouble1 < paramDouble2); 
    if (paramInt == 8)
      return (paramDouble1 <= paramDouble2); 
    if (paramInt == 32) {
      int i = (int)paramDouble1;
      int j = (int)paramDouble2;
      return (j == (i & j));
    } 
    return false;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public void b(String paramString) {
    this.d = Float.parseFloat(paramString);
  }
  
  public void a(float paramFloat) {
    this.d = paramFloat;
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public void b(int paramInt) {
    this.e = paramInt;
  }
  
  public String toString() {
    return "Field=" + this.a + "\noperator=" + this.e + "\ncompareField=" + this.b + "\ncompareValue=" + this.d;
  }
  
  public void c(String paramString) {
    this.c = paramString;
  }
  
  public int a() {
    return this.g;
  }
  
  public void c(int paramInt) {
    this.g = paramInt;
  }
  
  public String b() {
    return (this.f != null && !this.f.equals("")) ? this.f : ((this.e == 64) ? this.c : ((this.a != null) ? this.a : "Undefined"));
  }
  
  public void d(String paramString) {
    this.f = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */