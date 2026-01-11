package bN;

import bH.c;
import bR.a;

public class l implements t {
  d a = new d(1);
  
  d b = new d(0);
  
  private boolean c = true;
  
  public void a(int paramInt) {
    this.a.a(paramInt);
  }
  
  public int a() {
    return this.a.a();
  }
  
  public int b() {
    return this.a.b() + this.b.b();
  }
  
  public byte[] c() {
    return this.b.d();
  }
  
  public byte[] d() {
    return c.a(this.a.d(), this.b.d());
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != b())
      throw new a(b(), paramArrayOfbyte.length); 
    int i = 0;
    System.arraycopy(this.a.d(), 0, paramArrayOfbyte, i, (this.a.d()).length);
    i += (this.a.d()).length;
    System.arraycopy(this.b.d(), 0, paramArrayOfbyte, i, (this.b.d()).length);
    return paramArrayOfbyte;
  }
  
  public void b(byte[] paramArrayOfbyte) {
    this.b.a(paramArrayOfbyte);
  }
  
  public void c(byte[] paramArrayOfbyte) {
    boolean bool = false;
    System.arraycopy(paramArrayOfbyte, bool, this.a.d(), 0, (this.a.d()).length);
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length - (this.a.d()).length];
    System.arraycopy(paramArrayOfbyte, (this.a.d()).length, arrayOfByte, 0, arrayOfByte.length);
    this.b.a(arrayOfByte);
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