package bR;

import bH.D;
import bN.BnInterfaceDelta;
import bN.BnInterfaceKilo;

public class BrInterfaceBravo {
  BnInterfaceDelta a;
  
  BnInterfaceDelta b;
  
  protected BrInterfaceBravo(BnInterfaceKilo paramk) {
    this.a = new BnInterfaceDelta(paramk.c());
    this.a.a(false);
    this.b = new BnInterfaceDelta(paramk.BnInterfaceDelta());
    this.b.a(false);
  }
  
  public int a() {
    return this.a.b() + this.b.b();
  }
  
  public int b() {
    return (this.a.b() > 0) ? this.a.a() : -1;
  }
  
  public void a(int paramInt) {
    this.a.a(paramInt);
  }
  
  public int c() {
    return (this.b.b() > 0) ? this.b.a() : -1;
  }
  
  public void b(int paramInt) {
    this.b.a(paramInt);
  }
  
  public void a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != a())
      D.a("wrong size header buffer!!! Len: " + paramArrayOfbyte.length + ", expected: " + a()); 
    int i = 0;
    System.arraycopy(paramArrayOfbyte, i, this.a.BnInterfaceDelta(), 0, (this.a.BnInterfaceDelta()).length);
    i += (this.a.BnInterfaceDelta()).length;
    System.arraycopy(paramArrayOfbyte, i, this.b.BnInterfaceDelta(), 0, (this.b.BnInterfaceDelta()).length);
  }
  
  public byte[] b(byte[] paramArrayOfbyte) {
    int i = a();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    int j = 0;
    System.arraycopy(this.a.BnInterfaceDelta(), 0, paramArrayOfbyte, j, (this.a.BnInterfaceDelta()).length);
    j += (this.a.BnInterfaceDelta()).length;
    System.arraycopy(this.b.BnInterfaceDelta(), 0, paramArrayOfbyte, j, (this.b.BnInterfaceDelta()).length);
    return paramArrayOfbyte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */