package ac;

import G.aH;
import G.ac;
import V.g;

public class x extends w {
  private q a = null;
  
  private byte[] b = new byte[4];
  
  private byte[] C = new byte[4];
  
  private byte D = 0;
  
  private float E = 1.0F;
  
  private float F = 0.0F;
  
  public x() {}
  
  public x(q paramq) {
    a(paramq);
  }
  
  public void a(q paramq) {
    this.a = paramq;
    aH aH = paramq.c();
    if (!aH.b().equals("formula")) {
      this.E = (float)aH.h();
      this.F = (float)aH.i();
      a(aH.c());
    } else if (paramq.b().e() == 1 || paramq.b().e() == 2) {
      a("U32");
    } else if (paramq.b().e() == 3) {
      a("S64");
    } else {
      a("F32");
    } 
    d(paramq.f());
    a((byte)paramq.e());
    b(this.E);
    c(this.F);
    ac ac = paramq.b();
    b(paramq.a());
    e(ac.e());
    c(paramq.i());
  }
  
  public byte[] a(int paramInt) {
    byte[] arrayOfByte = new byte[d(paramInt)];
    int i = 0;
    arrayOfByte[i] = g();
    System.arraycopy(this.x, 0, arrayOfByte, ++i, this.x.length);
    i += this.x.length;
    System.arraycopy(this.z, 0, arrayOfByte, i, this.z.length);
    i += this.z.length;
    System.arraycopy(this.A, 0, arrayOfByte, i, this.A.length);
    i += this.A.length;
    System.arraycopy(this.b, 0, arrayOfByte, i, this.b.length);
    i += this.b.length;
    System.arraycopy(this.C, 0, arrayOfByte, i, this.C.length);
    i += this.C.length;
    arrayOfByte[i] = this.D;
    if (paramInt > 1)
      System.arraycopy(this.y, 0, arrayOfByte, ++i, this.y.length); 
    return arrayOfByte;
  }
  
  public byte[] a(double paramDouble) {
    byte b = g();
    if (b == d || b == c) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = (byte)(int)Math.round(paramDouble / this.E - this.F);
      return arrayOfByte;
    } 
    if (b == f || b == e) {
      byte[] arrayOfByte = new byte[2];
      int i = (int)Math.round(paramDouble / this.E - this.F);
      arrayOfByte[0] = (byte)((i & 0xFF00) >> 8);
      arrayOfByte[1] = (byte)(i & 0xFF);
      return arrayOfByte;
    } 
    if (b == h || b == g) {
      int i = (int)Math.round(paramDouble / this.E - this.F);
      return f(i);
    } 
    if (b == j) {
      float f = (float)(paramDouble / this.E - this.F);
      return a(f);
    } 
    if (b == i) {
      long l = Math.round(paramDouble / this.E - this.F);
      return a(l);
    } 
    throw new g("Unsupported Field type: " + b);
  }
  
  public int d(int paramInt) {
    return (paramInt == 1) ? (1 + this.x.length + this.z.length + this.A.length + this.b.length + this.C.length + 1) : (1 + this.x.length + this.z.length + this.A.length + this.b.length + this.C.length + this.y.length + 1);
  }
  
  private void a(String paramString) {
    if (paramString.equals("U08")) {
      b(c);
    } else if (paramString.equals("S08")) {
      b(d);
    } else if (paramString.equals("U16")) {
      b(e);
    } else if (paramString.equals("S16")) {
      b(f);
    } else if (paramString.equals("U32")) {
      b(g);
    } else if (paramString.equals("S32")) {
      b(h);
    } else if (paramString.equals("F32")) {
      b(j);
    } else {
      throw new g("Unsupported Logger Field Type: " + paramString);
    } 
  }
  
  public void b(float paramFloat) {
    this.E = paramFloat;
    this.b = a(paramFloat, this.b);
  }
  
  public float a() {
    return this.E;
  }
  
  public void c(float paramFloat) {
    this.F = paramFloat;
    this.C = a(paramFloat, this.C);
  }
  
  public float b() {
    return this.F;
  }
  
  public void a(byte paramByte) {
    this.D = paramByte;
  }
  
  public byte c() {
    return this.D;
  }
  
  public double a(byte[][] paramArrayOfbyte) {
    return this.a.a(paramArrayOfbyte[this.a.d()]);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */