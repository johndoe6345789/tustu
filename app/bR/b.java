package bR;

import bH.D;
import bN.d;
import bN.k;

public class b {
  d a;
  
  d b;
  
  protected b(k paramk) {
    this.a = new d(paramk.c());
    this.a.a(false);
    this.b = new d(paramk.d());
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
    System.arraycopy(paramArrayOfbyte, i, this.a.d(), 0, (this.a.d()).length);
    i += (this.a.d()).length;
    System.arraycopy(paramArrayOfbyte, i, this.b.d(), 0, (this.b.d()).length);
  }
  
  public byte[] b(byte[] paramArrayOfbyte) {
    int i = a();
    if (paramArrayOfbyte.length != i)
      throw new a(i, paramArrayOfbyte.length); 
    int j = 0;
    System.arraycopy(this.a.d(), 0, paramArrayOfbyte, j, (this.a.d()).length);
    j += (this.a.d()).length;
    System.arraycopy(this.b.d(), 0, paramArrayOfbyte, j, (this.b.d()).length);
    return paramArrayOfbyte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bR/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */