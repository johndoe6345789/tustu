package ac;

import V.g;

public class z extends w {
  D a;
  
  private byte[] b = new byte[4];
  
  private byte[] C = new byte[4];
  
  private byte D = 0;
  
  private float E = 1.0F;
  
  private float F = 0.0F;
  
  public z(D paramD) {
    a(paramD);
  }
  
  public void a(D paramD) {
    this.a = paramD;
    this.E = (float)paramD.g();
    this.F = (float)paramD.h();
    b(paramD.f());
    if (paramD.f() == 1) {
      a("U32");
    } else if (paramD.f() == 3) {
      a("S64");
    } else {
      a("S32");
    } 
    d(paramD.b());
    a(paramD.i());
    b(this.E);
    c(this.F);
    b(paramD.a());
    e(paramD.k());
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
  
  public void c(float paramFloat) {
    this.F = paramFloat;
    this.C = a(paramFloat, this.C);
  }
  
  public void a(byte paramByte) {
    this.D = paramByte;
  }
  
  public double a(byte[][] paramArrayOfbyte) {
    return this.a.j();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */