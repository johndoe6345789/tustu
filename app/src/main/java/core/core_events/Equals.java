package G;

import java.io.Serializable;

class Equals implements Serializable {
  private int b = -1;

  private int c = -1;

  private int[] d = null;

  private long e = System.currentTimeMillis();

  private Equals(Y paramY) {}

  public int a() {
    return this.b;
  }

  public void a(int paramInt) {
    this.b = paramInt;
  }

  public int b() {
    return this.c;
  }

  public void b(int paramInt) {
    this.c = paramInt;
  }

  public int[] c() {
    return this.d;
  }

  public void a(int[] paramArrayOfint) {
    this.d = paramArrayOfint;
  }

  public int d() {
    return this.b * 10 ^ 4 + this.c;
  }

  public int e() {
    return this.b * 10 ^ 4 + this.c + this.d.length - 1;
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof aa) || paramObject == null) return false;
    aa aa1 = (aa) paramObject;
    if (aa1.d() != d()) return false;
    if (aa1.e() != e()) return false;
    for (byte b = 0; b < (c()).length; b++) {
      if (c()[b] != aa1.c()[b]) return false;
    }
    return true;
  }

  public long f() {
    return this.e;
  }

  public void a(long paramLong) {
    this.e = paramLong;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
