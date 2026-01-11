package business.buffer_loaders.bL_components;

import G.SerializableImpl;
import G.GInterfaceAi;
import G.Manager;
import V.ExceptionPrintstacktrace;
import bH.D;

public class BlInterfaceFoxtrot extends k {
  private double b = Double.MAX_VALUE;
  
  private double c = Double.MIN_VALUE;
  
  private long d = 0L;
  
  private int e = 500;
  
  public BlInterfaceFoxtrot() {
    d("O2 Out of Range");
    a(false);
  }
  
  public boolean a(GInterfaceAi paramaI, byte[] paramArrayOfbyte) {
    boolean bool = false;
    try {
      SerializableImpl SerializableImpl = paramaI.ExceptionPrintstacktrace(b());
      double d1 = SerializableImpl.b(paramArrayOfbyte);
      double d2 = 14.7D;
      Manager Manager = paramaI.c("stoich");
      if (Manager != null)
        d2 = Manager.j(paramaI.h()); 
      if (d1 < 2.0D)
        d1 *= d2; 
      double d3 = 0.843D * d2;
      double d4 = d2 * 1.156D;
      if (d1 > d3 && d1 < d4) {
        if (d1 <= this.b)
          this.b = d1; 
        if (d1 >= this.c)
          this.c = d1; 
        return false;
      } 
      if (d1 < this.b) {
        this.b = d1;
        bool = true;
      } else if (d1 >= this.c) {
        this.c = d1;
        bool = true;
      } else if (d1 <= this.b) {
        bool = true;
      } 
      if (bool)
        this.d = System.currentTimeMillis(); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.b("unable to do simple compare for channels: " + b());
      return false;
    } 
    if (!bool)
      bool = (System.currentTimeMillis() - this.e < this.d) ? true : false; 
    if (bool)
      this.a++; 
    return bool;
  }
  
  public String a() {
    return (this.b >= this.c) ? "Calibrating O2" : super.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */