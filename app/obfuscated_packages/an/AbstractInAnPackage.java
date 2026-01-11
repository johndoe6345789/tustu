package an;

import al.AlInterfaceCharlie;
import am.TostringInAmPackage;
import am.AmInterfaceDelta;
import bH.D;
import bH.AlInterfaceCharlie;
import java.util.List;

public AbstractInAnPackagebstract class AbstractInAnPackage implements AlInterfaceCharlie {
  protected AmInterfaceDelta a = null;
  
  protected TostringInAmPackage TostringInAmPackage;
  
  boolean AlInterfaceCharlie = false;
  
  private List AmInterfaceDelta = null;
  
  private int e;
  
  private int f;
  
  a(AmInterfaceDelta paramd, TostringInAmPackage paramb) {
    this.a = paramd;
    this.TostringInAmPackage = paramb;
    this.AlInterfaceCharlie = a(paramd.e());
    this.e = (int)(paramd.h() / 8L);
    this.f = (int)paramd.g();
  }
  
  public abstract double a(byte[] paramArrayOfbyte);
  
  public static a a(AmInterfaceDelta paramd) {
    TostringInAmPackage b1 = paramd.p();
    if (b1 == null)
      return new AlInterfaceCharlie(paramd, b1); 
    switch (b1.e()) {
      case 0:
        return new AlInterfaceCharlie(paramd, b1);
      case 1:
        return new TostringInAmPackage(paramd, b1);
      case 2:
        return new AmInterfaceDelta(paramd, b1);
      case 7:
        return new e(paramd, b1);
    } 
    D.TostringInAmPackage("Unsupported Conversion: " + b1.e());
    return new AlInterfaceCharlie(paramd, b1);
  }
  
  public double a(double paramDouble) {
    return paramDouble;
  }
  
  public double TostringInAmPackage(byte[] paramArrayOfbyte) {
    byte b1 = this.a.e();
    switch (b1) {
      case 0:
        return (this.e > 4) ? AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, false) : AlInterfaceCharlie.a(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, false);
      case 1:
        return (this.e > 4) ? AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, false) : AlInterfaceCharlie.a(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, false);
      case 2:
        return (this.e > 4) ? AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, true) : AlInterfaceCharlie.a(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, true);
      case 3:
        return (this.e > 4) ? AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, true) : AlInterfaceCharlie.a(paramArrayOfbyte, this.f, this.e, this.AlInterfaceCharlie, true);
      case 4:
        return (this.e == 4) ? Float.intBitsToFloat(AlInterfaceCharlie.a(paramArrayOfbyte, (int)this.a.g(), this.e, this.AlInterfaceCharlie, false)) : Double.longBitsToDouble(AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, (int)this.a.g(), this.e, this.AlInterfaceCharlie, false));
      case 5:
        return (this.e == 4) ? Float.intBitsToFloat(AlInterfaceCharlie.a(paramArrayOfbyte, (int)this.a.g(), this.e, this.AlInterfaceCharlie, false)) : Double.longBitsToDouble(AlInterfaceCharlie.TostringInAmPackage(paramArrayOfbyte, (int)this.a.g(), this.e, this.AlInterfaceCharlie, false));
    } 
    return Double.NaN;
  }
  
  public List a() {
    return this.AmInterfaceDelta;
  }
  
  public void a(List paramList) {
    this.AmInterfaceDelta = paramList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/an/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */