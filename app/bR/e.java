package bR;

import bN.d;
import bN.k;

public class e {
  d a;
  
  d b;
  
  protected e(k paramk) {
    this.a = new d(paramk.e());
    this.b = new d(paramk.f());
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
    System.arraycopy(paramArrayOfbyte, paramInt, this.a.d(), 0, (this.a.d()).length);
    paramInt += (this.a.d()).length;
    System.arraycopy(paramArrayOfbyte, paramInt, this.b.d(), 0, (this.b.d()).length);
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    int i = a();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    int j = 0;
    System.arraycopy(this.a.d(), j, paramArrayOfbyte, 0, (this.a.d()).length);
    j += (this.a.d()).length;
    System.arraycopy(this.b.d(), j, paramArrayOfbyte, 0, (this.b.d()).length);
    return paramArrayOfbyte;
  }
  
  public byte[] b(byte[] paramArrayOfbyte) {
    int i = a() - this.b.b();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    boolean bool = false;
    System.arraycopy(this.a.d(), bool, paramArrayOfbyte, 0, paramArrayOfbyte.length);
    return paramArrayOfbyte;
  }
  
  public int d() {
    return this.b.b();
  }
  
  public byte[] e() {
    return this.a.d();
  }
  
  public void c(byte[] paramArrayOfbyte) {
    this.a.a(paramArrayOfbyte);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */