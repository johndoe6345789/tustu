package ac;

import bH.D;
import bH.X;
import bH.c;

public abstract class AcInterfaceWhiskey {
  public static byte c = 0;

  public static byte d = 1;

  public static byte e = 2;

  public static byte f = 3;

  public static byte g = 4;

  public static byte h = 5;

  public static byte i = 6;

  public static byte j = 7;

  public static byte k = 8;

  public static byte l = 9;

  public static byte m = 10;

  public static byte n = 11;

  public static byte o = 12;

  public static byte p = 13;

  public static byte q = 14;

  public static byte r = 15;

  public static byte s = 16;

  public static byte t = 17;

  public static byte u = 18;

  public static byte v = 19;

  public static byte w = 20;

  private byte a = h;

  protected final byte[] x = new byte[34];

  protected final byte[] y = new byte[34];

  protected final byte[] z = new byte[10];

  protected final byte[] A = new byte[1];

  protected static final byte[] B = new byte[] {0};

  public void b(byte paramByte) {
    this.a = paramByte;
  }

  public byte g() {
    return this.a;
  }

  public boolean h() {
    return ((this.a >= c && this.a <= k) || (this.a >= s && this.a <= u));
  }

  public boolean i() {
    return (this.a == j || this.a == k || this.a == q || this.a == r);
  }

  public void b(String paramString) {
    paramString = X.b(paramString, "-", " ");
    paramString = X.b(paramString, "(", "_");
    paramString = X.b(paramString, ")", "");
    a(this.x, paramString);
  }

  public void c(String paramString) {
    a(this.y, paramString);
  }

  public String j() {
    return X.k(new String(this.x));
  }

  public void d(String paramString) {
    a(this.z, paramString);
  }

  public String k() {
    return X.k(new String(this.z));
  }

  public void e(int paramInt) {
    this.A[0] = (byte) (0xFF & paramInt);
  }

  public byte l() {
    return this.A[0];
  }

  public static byte[] a(byte[] paramArrayOfbyte, String paramString) {
    if (paramString == null) {
      c.a(paramArrayOfbyte, (byte) 0);
      return paramArrayOfbyte;
    }
    try {
      byte[] arrayOfByte = paramString.getBytes();
      if (arrayOfByte.length > paramArrayOfbyte.length)
        D.c(
            "String too large for buffer! Will truncate. buffer size: "
                + paramArrayOfbyte.length
                + ", string len: "
                + arrayOfByte.length
                + ", string val: "
                + paramString);
      int i =
          (arrayOfByte.length <= paramArrayOfbyte.length)
              ? arrayOfByte.length
              : paramArrayOfbyte.length;
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, 0, i);
      if (i < paramArrayOfbyte.length) System.arraycopy(B, 0, paramArrayOfbyte, i, B.length);
    } catch (Exception exception) {
      D.c("Boom 53242");
    }
    return paramArrayOfbyte;
  }

  public abstract byte[] a(int paramInt);

  public abstract int d(int paramInt);

  public int m() {
    return (this.a == c || this.a == d || this.a == s)
        ? 1
        : ((this.a == e || this.a == f || this.a == l || this.a == m || this.a == t)
            ? 2
            : ((this.a == g || this.a == h || this.a == u || this.a == j)
                ? 4
                : ((this.a == i) ? 8 : 0)));
  }

  public abstract byte[] a(double paramDouble);

  public abstract double a(byte[][] paramArrayOfbyte);

  protected byte[] a(float paramFloat, byte[] paramArrayOfbyte) {
    int i = Float.floatToIntBits(paramFloat);
    return a(i, paramArrayOfbyte, true);
  }

  public static byte[] a(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    int i = 2147483392;
    boolean bool = false;
    if (paramInt < 0) {
      paramInt = (paramInt ^ 0xFFFFFFFF) + 0;
      bool = true;
    }
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (paramBoolean) {
        paramArrayOfbyte[paramArrayOfbyte.length - b - 1] = (byte) (paramInt & (i ^ 0xFFFFFFFF));
        if (bool)
          paramArrayOfbyte[paramArrayOfbyte.length - b - 1] =
              (byte) (255 - paramArrayOfbyte[paramArrayOfbyte.length - b - 1]);
      } else {
        paramArrayOfbyte[b] = (byte) (paramInt & (i ^ 0xFFFFFFFF));
        if (bool) paramArrayOfbyte[b] = (byte) (255 - paramArrayOfbyte[b]);
      }
      paramInt >>= 8;
    }
    return paramArrayOfbyte;
  }

  public static byte[] f(int paramInt) {
    return new byte[] {
      (byte) (paramInt >>> 24), (byte) (paramInt >>> 16), (byte) (paramInt >>> 8), (byte) paramInt
    };
  }

  public static byte[] a(long paramLong) {
    return new byte[] {
      (byte) (int) (paramLong >>> 56L),
      (byte) (int) (paramLong >>> 48L),
      (byte) (int) (paramLong >>> 40L),
      (byte) (int) (paramLong >>> 32L),
      (byte) (int) (paramLong >>> 24L),
      (byte) (int) (paramLong >>> 16L),
      (byte) (int) (paramLong >>> 8L),
      (byte) (int) paramLong
    };
  }

  public static byte[] a(float paramFloat) {
    return f(Float.floatToIntBits(paramFloat));
  }

  public boolean n() {
    return (g() == d || g() == f || g() == h || g() == i || g() == j);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
