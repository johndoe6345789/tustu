package ac;

import V.ExceptionPrintstacktrace;
import bH.c;
import java.util.ArrayList;
import java.util.List;

public class AcInterfaceTango extends w {
  private q C = null;

  private final byte[] D = new byte[1];

  private final byte[] E = new byte[4];

  private final byte[] F = new byte[1];

  private final byte[] G = new byte[3];

  List a = new ArrayList();

  List b = new ArrayList();

  public AcInterfaceTango() {}

  public AcInterfaceTango(String paramString1, String paramString2) {
    b(paramString1);
    d("bits");
    e(2);
    e(paramString2);
  }

  public byte[] a(int paramInt) {
    byte[] arrayOfByte = new byte[d(paramInt)];
    int i = 0;
    arrayOfByte[i] = ExceptionPrintstacktrace();
    System.arraycopy(this.x, 0, arrayOfByte, ++i, this.x.length);
    i += this.x.length;
    System.arraycopy(this.z, 0, arrayOfByte, i, this.z.length);
    i += this.z.length;
    System.arraycopy(this.A, 0, arrayOfByte, i, this.A.length);
    i += this.A.length;
    System.arraycopy(this.D, 0, arrayOfByte, i, this.D.length);
    i += this.D.length;
    System.arraycopy(this.E, 0, arrayOfByte, i, this.E.length);
    i += this.E.length;
    System.arraycopy(this.F, 0, arrayOfByte, i, this.F.length);
    i += this.F.length;
    System.arraycopy(this.G, 0, arrayOfByte, i, this.G.length);
    i += this.G.length;
    if (paramInt > 1) System.arraycopy(this.y, 0, arrayOfByte, i, this.y.length);
    return arrayOfByte;
  }

  public void b(int paramInt) {
    a(paramInt, this.E, true);
  }

  public int a() {
    return c.a(this.E, 0, this.E.length, true, true);
  }

  public void c(int paramInt) {
    this.D[0] = (byte) (0xFF & paramInt);
  }

  public byte b() {
    return this.D[0];
  }

  public void a(q paramq) {
    this.a.add(paramq);
    this.b.add(paramq.a());
  }

  public List c() {
    return this.a;
  }

  public void a(String paramString) {
    this.b.add(paramString);
  }

  public List d() {
    return this.b;
  }

  private void e(String paramString) {
    if (paramString.equals("U08")) {
      b(s);
    } else if (paramString.equals("U16")) {
      b(t);
    } else if (paramString.equals("U32")) {
      b(u);
    } else {
      throw new ExceptionPrintstacktrace("Unsupported Logger Field Type: " + paramString);
    }
  }

  public void a(byte paramByte) {
    this.F[0] = paramByte;
  }

  public byte e() {
    return this.F[0];
  }

  public int d(int paramInt) {
    return (paramInt == 1)
        ? (1
            + this.x.length
            + this.z.length
            + this.A.length
            + this.D.length
            + this.E.length
            + this.F.length
            + this.G.length)
        : (1
            + this.x.length
            + this.z.length
            + this.A.length
            + this.D.length
            + this.E.length
            + this.F.length
            + this.G.length
            + this.y.length);
  }

  public byte[] a(double paramDouble) {
    byte b = ExceptionPrintstacktrace();
    if (b == s) {
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = (byte) (int) paramDouble;
      return arrayOfByte;
    }
    if (b == t) {
      byte[] arrayOfByte = new byte[2];
      int i = (int) paramDouble;
      arrayOfByte[0] = (byte) ((i & 0xFF00) >> 8);
      arrayOfByte[1] = (byte) (i & 0xFF);
      return arrayOfByte;
    }
    if (b == u) {
      int i = (int) paramDouble;
      return f(i);
    }
    throw new ExceptionPrintstacktrace("Unsupported BitField type: " + b);
  }

  public byte[] f() {
    ArrayList<String> arrayList = new ArrayList();
    int i = 0;
    for (q q1 : this.a) {
      arrayList.add(q1.a());
      i += q1.a().length() + 1;
    }
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    for (String str : arrayList) {
      byte[] arrayOfByte1 = str.getBytes();
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, j, arrayOfByte1.length);
      j += arrayOfByte1.length;
      System.arraycopy(B, 0, arrayOfByte, j, B.length);
      j += B.length;
    }
    return arrayOfByte;
  }

  public double a(byte[][] paramArrayOfbyte) {
    byte b = 0;
    int i = 0;
    for (q q1 : this.a) {
      double d = q1.a(paramArrayOfbyte[q1.d()]);
      if (d != 0.0D) i |= 1 << b;
      b++;
    }
    return i;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
