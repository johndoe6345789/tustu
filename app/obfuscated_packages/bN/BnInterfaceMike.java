package bN;

import bH.c;
import bR.ExceptionInBrPackage;

public class BnInterfaceMike implements t {
  d ExceptionInBrPackage = new d(1);
  
  d b = new d(0);
  
  d c = new d(0);
  
  d d = new d(0);
  
  d e = new d(0);
  
  private boolean f = false;
  
  public BnInterfaceMike() {}
  
  public BnInterfaceMike(k paramk) {
    this.d = new d(paramk.ExceptionInBrPackage());
  }
  
  public int ExceptionInBrPackage() {
    return this.ExceptionInBrPackage.ExceptionInBrPackage();
  }
  
  public int b() {
    return this.ExceptionInBrPackage.b() + this.b.b() + this.c.b() + this.d.b() + this.e.b();
  }
  
  public void ExceptionInBrPackage(int paramInt) {
    if (this.d.b() != paramInt)
      this.d.ExceptionInBrPackage(new byte[paramInt]); 
  }
  
  public byte[] c() {
    return this.e.d();
  }
  
  public void b(byte[] paramArrayOfbyte) {
    this.e.ExceptionInBrPackage(paramArrayOfbyte);
  }
  
  public byte[] d() {
    null = c.ExceptionInBrPackage(this.ExceptionInBrPackage.d(), this.b.d());
    null = c.ExceptionInBrPackage(null, this.c.d());
    null = c.ExceptionInBrPackage(null, this.d.d());
    return c.ExceptionInBrPackage(null, this.e.d());
  }
  
  public void c(byte[] paramArrayOfbyte) {
    try {
      int i = 0;
      System.arraycopy(paramArrayOfbyte, i, this.ExceptionInBrPackage.d(), 0, (this.ExceptionInBrPackage.d()).length);
      i += (this.ExceptionInBrPackage.d()).length;
      System.arraycopy(paramArrayOfbyte, i, this.b.d(), 0, (this.b.d()).length);
      i += (this.b.d()).length;
      System.arraycopy(paramArrayOfbyte, i, this.c.d(), 0, (this.c.d()).length);
      i += (this.c.d()).length;
      System.arraycopy(paramArrayOfbyte, i, this.d.d(), 0, (this.d.d()).length);
      i += (this.d.d()).length;
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length - i];
      System.arraycopy(paramArrayOfbyte, i, arrayOfByte, 0, arrayOfByte.length);
      this.e.ExceptionInBrPackage(arrayOfByte);
    } catch (Exception exception) {
      throw new o("Invalid data for DTO Packet: \n" + c.d(paramArrayOfbyte));
    } 
  }
  
  public byte[] ExceptionInBrPackage(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != b())
      throw new ExceptionInBrPackage(b(), paramArrayOfbyte.length); 
    int i = 0;
    System.arraycopy(this.ExceptionInBrPackage.d(), 0, paramArrayOfbyte, i, (this.ExceptionInBrPackage.d()).length);
    i += (this.ExceptionInBrPackage.d()).length;
    System.arraycopy(this.b.d(), 0, paramArrayOfbyte, i, (this.b.d()).length);
    i += (this.b.d()).length;
    System.arraycopy(this.c.d(), 0, paramArrayOfbyte, i, (this.c.d()).length);
    i += (this.c.d()).length;
    System.arraycopy(this.d.d(), 0, paramArrayOfbyte, i, (this.d.d()).length);
    i += (this.d.d()).length;
    System.arraycopy(this.e.d(), 0, paramArrayOfbyte, i, (this.e.d()).length);
    return paramArrayOfbyte;
  }
  
  public boolean e() {
    return this.f;
  }
  
  public byte[] f() {
    return this.d.d();
  }
  
  public void d(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 0 && paramArrayOfbyte.length != this.d.b())
      throw new ExceptionInBrPackage(this.d.b(), paramArrayOfbyte.length); 
    this.d.ExceptionInBrPackage(paramArrayOfbyte);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */