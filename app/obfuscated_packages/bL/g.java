package bL;

import bH.D;

public class g {
  h[] a = null;
  
  public g(int paramInt, double paramDouble) {
    a(paramInt, paramDouble);
  }
  
  public void a(int paramInt, double paramDouble) {
    this.a = new h[paramInt];
    for (byte b = 0; b < this.a.length; b++) {
      this.a[b] = new h(this);
      this.a[b].a(paramDouble);
    } 
  }
  
  public void a(double paramDouble, long paramLong) {
    h h1 = this.a[this.a.length - 1];
    for (int i = this.a.length - 1; i > 0; i--)
      this.a[i] = this.a[i - 1]; 
    this.a[0] = h1;
    this.a[0].a(paramDouble);
    this.a[0].a(paramLong);
  }
  
  public double a(long paramLong, int paramInt) {
    h h1 = a(paramLong);
    return (Math.abs(paramLong - h1.b()) > paramInt) ? Double.NaN : h1.a();
  }
  
  private h a(long paramLong) {
    long l = Long.MAX_VALUE;
    for (byte b = 0; b < this.a.length; b++) {
      if (this.a[b].b() < paramLong)
        return (Math.abs(this.a[b].b() - paramLong) > Math.abs(l - paramLong)) ? this.a[b - 1] : this.a[b]; 
      l = this.a[b].b();
    } 
    D.c("timestamp is older than we have returning the oldest double I have. timestamp=" + paramLong);
    return this.a[this.a.length - 1];
  }
  
  public int a() {
    return this.a.length;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bL/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */