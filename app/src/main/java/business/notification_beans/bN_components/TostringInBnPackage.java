package business.notification_beans.bN_components;

import bH.c;
import bR.ExceptionInBrPackage;

public class TostringInBnPackage implements t {
  d ExceptionInBrPackage = new d(1);
  
  d b = new d(0);
  
  private boolean c = true;
  
  public void ExceptionInBrPackage(int paramInt) {
    this.ExceptionInBrPackage.ExceptionInBrPackage(paramInt);
  }
  
  public int ExceptionInBrPackage() {
    return this.ExceptionInBrPackage.ExceptionInBrPackage();
  }
  
  public int b() {
    return this.ExceptionInBrPackage.b() + this.b.b();
  }
  
  public byte[] c() {
    return this.b.d();
  }
  
  public byte[] d() {
    return c.ExceptionInBrPackage(this.ExceptionInBrPackage.d(), this.b.d());
  }
  
  public byte[] ExceptionInBrPackage(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != b())
      throw new ExceptionInBrPackage(b(), paramArrayOfbyte.length); 
    int i = 0;
    System.arraycopy(this.ExceptionInBrPackage.d(), 0, paramArrayOfbyte, i, (this.ExceptionInBrPackage.d()).length);
    i += (this.ExceptionInBrPackage.d()).length;
    System.arraycopy(this.b.d(), 0, paramArrayOfbyte, i, (this.b.d()).length);
    return paramArrayOfbyte;
  }
  
  public void b(byte[] paramArrayOfbyte) {
    this.b.ExceptionInBrPackage(paramArrayOfbyte);
  }
  
  public void c(byte[] paramArrayOfbyte) {
    boolean bool = false;
    System.arraycopy(paramArrayOfbyte, bool, this.ExceptionInBrPackage.d(), 0, (this.ExceptionInBrPackage.d()).length);
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length - (this.ExceptionInBrPackage.d()).length];
    System.arraycopy(paramArrayOfbyte, (this.ExceptionInBrPackage.d()).length, arrayOfByte, 0, arrayOfByte.length);
    this.b.ExceptionInBrPackage(arrayOfByte);
  }
  
  public boolean e() {
    return this.c;
  }
  
  public String toString() {
    byte[] arrayOfByte = d();
    return (arrayOfByte == null) ? super.toString() : c.d(arrayOfByte);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */