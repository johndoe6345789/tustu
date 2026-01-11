package an;

import al.c;
import am.b;
import am.d;
import bH.D;
import bH.c;
import java.util.List;

public abstract class a implements c {
  protected d a = null;
  
  protected b b;
  
  boolean c = false;
  
  private List d = null;
  
  private int e;
  
  private int f;
  
  a(d paramd, b paramb) {
    this.a = paramd;
    this.b = paramb;
    this.c = a(paramd.e());
    this.e = (int)(paramd.h() / 8L);
    this.f = (int)paramd.g();
  }
  
  public abstract double a(byte[] paramArrayOfbyte);
  
  public static a a(d paramd) {
    b b1 = paramd.p();
    if (b1 == null)
      return new c(paramd, b1); 
    switch (b1.e()) {
      case 0:
        return new c(paramd, b1);
      case 1:
        return new b(paramd, b1);
      case 2:
        return new d(paramd, b1);
      case 7:
        return new e(paramd, b1);
    } 
    D.b("Unsupported Conversion: " + b1.e());
    return new c(paramd, b1);
  }
  
  public double a(double paramDouble) {
    return paramDouble;
  }
  
  public double b(byte[] paramArrayOfbyte) {
    byte b1 = this.a.e();
    switch (b1) {
      case 0:
        return (this.e > 4) ? c.b(paramArrayOfbyte, this.f, this.e, this.c, false) : c.a(paramArrayOfbyte, this.f, this.e, this.c, false);
      case 1:
        return (this.e > 4) ? c.b(paramArrayOfbyte, this.f, this.e, this.c, false) : c.a(paramArrayOfbyte, this.f, this.e, this.c, false);
      case 2:
        return (this.e > 4) ? c.b(paramArrayOfbyte, this.f, this.e, this.c, true) : c.a(paramArrayOfbyte, this.f, this.e, this.c, true);
      case 3:
        return (this.e > 4) ? c.b(paramArrayOfbyte, this.f, this.e, this.c, true) : c.a(paramArrayOfbyte, this.f, this.e, this.c, true);
      case 4:
        return (this.e == 4) ? Float.intBitsToFloat(c.a(paramArrayOfbyte, (int)this.a.g(), this.e, this.c, false)) : Double.longBitsToDouble(c.b(paramArrayOfbyte, (int)this.a.g(), this.e, this.c, false));
      case 5:
        return (this.e == 4) ? Float.intBitsToFloat(c.a(paramArrayOfbyte, (int)this.a.g(), this.e, this.c, false)) : Double.longBitsToDouble(c.b(paramArrayOfbyte, (int)this.a.g(), this.e, this.c, false));
    } 
    return Double.NaN;
  }
  
  public List a() {
    return this.d;
  }
  
  public void a(List paramList) {
    this.d = paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/an/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */