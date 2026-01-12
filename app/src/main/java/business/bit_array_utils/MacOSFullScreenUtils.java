package business.bit_array_utils;

import java.util.Arrays;

public class L {
  private float[] a = new float[0];

  private int b = 0;

  public L() {}

  public L(int paramInt) {}

  private void b(int paramInt) {
    if (paramInt - this.a.length > 0) {
      int i = this.a.length + 10000;
      this.a = Arrays.copyOf(this.a, i);
    }
  }

  public boolean a(float paramFloat) {
    b(this.b + 1);
    this.a[this.b++] = paramFloat;
    return true;
  }

  public boolean a(int paramInt, float paramFloat) {
    b(this.b + 1);
    System.arraycopy(this.a, paramInt, this.a, paramInt + 1, this.b - paramInt);
    this.a[paramInt] = paramFloat;
    this.b++;
    return true;
  }

  public float a(int paramInt) {
    return this.a[paramInt];
  }

  public void b(int paramInt, float paramFloat) {
    this.a[paramInt] = paramFloat;
  }

  public int a() {
    return this.b;
  }

  public void a(int paramInt1, int paramInt2) {
    int i = this.b - paramInt2;
    System.arraycopy(this.a, paramInt2, this.a, paramInt1, i);
    int j = this.b - paramInt2 - paramInt1;
    for (int k = j; k < this.b; k++) this.a[k] = Float.NaN;
    this.b = j;
  }

  public void b() {
    this.a = new float[0];
    this.b = 0;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
