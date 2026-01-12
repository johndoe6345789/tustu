package business.binding_generators.bG_components;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigInteger implements i, l {
  ArrayList a = new ArrayList();

  List b = new ArrayList();

  double c = 360.0D;

  double d = Double.NaN;

  private double g = Double.NaN;

  int e = 720;

  byte[] f =
      new byte[] {
        0, 1, -1, -4, 0, 0, 0, 0, 0, 0,
        0, 0, 0, Byte.MAX_VALUE, -1, 0, 1, -1, -4, 0,
        7, -1, -16, 0, 31, -1, -64, 0, Byte.MAX_VALUE, -1,
        0, 1, -1, -4, 0, 7, -1, -16, 0, 31,
        -1, -64, 0, Byte.MAX_VALUE, -1, 0, 1, -1, -4, 0,
        7, -1, -16, 0, 31, -1, -64, 0, Byte.MAX_VALUE, -1,
        0, 1, -1, -4, 0, 7, -1, -16, 0, 31,
        -1, -64, 0, Byte.MAX_VALUE, -1, 0, 1, -1, -4, 0,
        7, -1, -16, 0, 31, -1, -64, 0, Byte.MAX_VALUE, -1
      };

  private BigInteger h = null;

  public BigInteger() {
    a(this.f);
  }

  public void a(E paramE) {
    this.b.add(paramE);
  }

  private void e() {
    for (E e : this.b) e.d();
  }

  public ArrayList a() {
    return this.a;
  }

  public double b() {
    return Double.isNaN(this.g) ? this.d : this.g;
  }

  private void f() {
    double d1 = this.c / this.e;
    this.a.clear();
    k k = new k();
    boolean bool = this.h.testBit(0);
    this.d = Double.NaN;
    double d2 = 0.0D;
    double d3 = 0.0D;
    for (byte b1 = 0; b1 < 2; b1++) {
      for (byte b2 = 0; b2 < this.e; b2++) {
        if (bool != this.h.testBit(this.e - b2 - 1)) {
          double d = b2 * d1;
          if (b1 > 0 && d >= this.d) break;
          if (this.h.testBit(this.e - b2 - 1)) {
            k.a(d);
            if (Double.isNaN(this.d) || d < this.d) this.d = d;
          } else {
            k.b((360.0D + d - k.a()) % 360.0D);
            d3 = d;
          }
          if (k.c()) {
            this.a.add(k);
            if (b1 > 0) break;
            k = new k();
          }
          if (k.a() + k.b() > 360.0D) {
            bool = false;
            break;
          }
          bool = this.h.testBit(this.e - b2 - 1);
        }
      }
    }
  }

  public void a(List paramList) {
    int j = this.e;
    double d = this.c / j;
    byte[] arrayOfByte = {0};
    this.h = this.h.and(new BigInteger(arrayOfByte));
    for (k k : paramList) {
      double d1 = k.a();
      int m = (int) Math.round(d1 / d);
      for (int n = m + (int) Math.round(k.b() / d) - 1; n >= m; n--)
        this.h = this.h.setBit(j - n % j - 1);
    }
    f();
    e();
  }

  public byte[] c() {
    byte[] arrayOfByte = this.h.toByteArray();
    int j = this.e / 8;
    if (arrayOfByte.length < j) {
      byte[] arrayOfByte1 = new byte[j];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, j - arrayOfByte.length, arrayOfByte.length);
      return arrayOfByte1;
    }
    if (arrayOfByte.length > j) {
      byte[] arrayOfByte1 = new byte[j];
      System.arraycopy(
          arrayOfByte,
          arrayOfByte.length - arrayOfByte1.length,
          arrayOfByte1,
          0,
          arrayOfByte1.length);
      return arrayOfByte1;
    }
    return arrayOfByte;
  }

  public void a(byte[] paramArrayOfbyte) {
    this.e = paramArrayOfbyte.length * 8;
    this.h = new BigInteger(paramArrayOfbyte);
    f();
  }

  public void a(int paramInt) {
    if (paramInt < this.a.size()) this.a.remove(paramInt);
  }

  public double d() {
    return this.c / this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
