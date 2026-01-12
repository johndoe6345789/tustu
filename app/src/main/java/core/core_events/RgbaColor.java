package G;

import java.io.Serializable;

public class RgbaColor implements Serializable {
  public static final k a = new k(255, 255, 255);

  public static final k b = a;

  public static final k c = new k(192, 192, 192);

  public static final k d = c;

  public static final k e = new k(128, 128, 128);

  public static final k f = e;

  public static final k g = new k(64, 64, 64);

  public static final k h = g;

  public static final k i = new k(0, 0, 0);

  public static final k j = i;

  public static final k k = new k(255, 0, 0);

  public static final k l = k;

  public static final k m = new k(255, 175, 175);

  public static final k n = m;

  public static final k o = new k(255, 200, 0);

  public static final k p = o;

  public static final k q = new k(255, 255, 0);

  public static final k r = q;

  public static final k s = new k(0, 255, 0);

  public static final k t = s;

  public static final k u = new k(255, 0, 255);

  public static final k v = u;

  public static final k w = new k(0, 255, 255);

  public static final k x = w;

  public static final k y = new k(0, 0, 255);

  public static final k z = y;

  public static k A = new k(0, 0, 0, 0);

  private int B = 0;

  public k(int paramInt1, int paramInt2, int paramInt3) {
    this(paramInt1, paramInt2, paramInt3, 255);
  }

  public k(int paramInt) {
    this.B = paramInt;
  }

  public k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.B =
        (paramInt4 & 0xFF) << 24
            | (paramInt1 & 0xFF) << 16
            | (paramInt2 & 0xFF) << 8
            | (paramInt3 & 0xFF) << 0;
    a(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool = false;
    String str = "";
    if (paramInt4 < 0 || paramInt4 > 255) {
      bool = true;
      str = str + " Alpha";
    }
    if (paramInt1 < 0 || paramInt1 > 255) {
      bool = true;
      str = str + " Red";
    }
    if (paramInt2 < 0 || paramInt2 > 255) {
      bool = true;
      str = str + " Green";
    }
    if (paramInt3 < 0 || paramInt3 > 255) {
      bool = true;
      str = str + " Blue";
    }
    if (bool == true)
      throw new IllegalArgumentException("Color parameter outside of expected range:" + str);
  }

  public int a() {
    return this.B;
  }

  public int b() {
    return this.B >> 16 & 0xFF;
  }

  public int c() {
    return this.B >> 8 & 0xFF;
  }

  public int d() {
    return this.B >> 0 & 0xFF;
  }

  public int e() {
    return this.B >> 24 & 0xFF;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
