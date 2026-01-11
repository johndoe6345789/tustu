package business.byte_readers.bR_components;

import bN.BnInterfaceDelta;
import bN.BnInterfaceKilo;

public class BrInterfaceEcho {
  BnInterfaceDelta a;
  
  BnInterfaceDelta b;
  
  protected BrInterfaceEcho(BnInterfaceKilo paramk) {
    this.a = new BnInterfaceDelta(paramk.e());
    this.b = new BnInterfaceDelta(paramk.f());
  }
  
  public int a() {
    return this.a.b() + this.b.b();
  }
  
  public int b() {
    return this.a.b();
  }
  
  public int c() {
    return (this.b.b() > 0) ? this.b.a() : -1;
  }
  
  public void a(int paramInt) {
    this.b.a(paramInt);
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt) {
    System.arraycopy(paramArrayOfbyte, paramInt, this.a.BnInterfaceDelta(), 0, (this.a.BnInterfaceDelta()).length);
    paramInt += (this.a.BnInterfaceDelta()).length;
    System.arraycopy(paramArrayOfbyte, paramInt, this.b.BnInterfaceDelta(), 0, (this.b.BnInterfaceDelta()).length);
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    int i = a();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    int j = 0;
    System.arraycopy(this.a.BnInterfaceDelta(), j, paramArrayOfbyte, 0, (this.a.BnInterfaceDelta()).length);
    j += (this.a.BnInterfaceDelta()).length;
    System.arraycopy(this.b.BnInterfaceDelta(), j, paramArrayOfbyte, 0, (this.b.BnInterfaceDelta()).length);
    return paramArrayOfbyte;
  }
  
  public byte[] b(byte[] paramArrayOfbyte) {
    int i = a() - this.b.b();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    boolean bool = false;
    System.arraycopy(this.a.BnInterfaceDelta(), bool, paramArrayOfbyte, 0, paramArrayOfbyte.length);
    return paramArrayOfbyte;
  }
  
  public int BnInterfaceDelta() {
    return this.b.b();
  }
  
  public byte[] e() {
    return this.a.BnInterfaceDelta();
  }
  
  public void c(byte[] paramArrayOfbyte) {
    this.a.a(paramArrayOfbyte);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */