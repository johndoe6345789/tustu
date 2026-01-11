package aK;

import java.util.HashMap;

public class HashMapTostring {
  private String a;
  
  private long b = 0L;
  
  private double c = 0.0D;
  
  private double d = 0.0D;
  
  private boolean e = false;
  
  private double f = 0.0D;
  
  private boolean g = false;
  
  private float h = 0.0F;
  
  private boolean i = false;
  
  private float j = 0.0F;
  
  private boolean k = false;
  
  private float l = 0.0F;
  
  private int m = 0;
  
  private double n = 0.0D;
  
  private double o = 0.0D;
  
  private double p = 0.0D;
  
  private double q = 0.0D;
  
  private float r = 0.0F;
  
  private float s = 0.0F;
  
  private float[] t = new float[2];
  
  private HashMap u = null;
  
  public HashMapTostring(String paramString) {
    this.a = paramString;
  }
  
  private static void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float[] paramArrayOffloat) {
    byte b1 = 20;
    paramDouble1 *= 0.017453292519943295D;
    paramDouble3 *= 0.017453292519943295D;
    paramDouble2 *= 0.017453292519943295D;
    paramDouble4 *= 0.017453292519943295D;
    double d1 = 6378137.0D;
    double d2 = 6356752.3142D;
    double d3 = (d1 - d2) / d1;
    double d4 = (d1 * d1 - d2 * d2) / d2 * d2;
    double d5 = paramDouble4 - paramDouble2;
    double d6 = 0.0D;
    double d7 = Math.atan((1.0D - d3) * Math.tan(paramDouble1));
    double d8 = Math.atan((1.0D - d3) * Math.tan(paramDouble3));
    double d9 = Math.cos(d7);
    double d10 = Math.cos(d8);
    double d11 = Math.sin(d7);
    double d12 = Math.sin(d8);
    double d13 = d9 * d10;
    double d14 = d11 * d12;
    double d15 = 0.0D;
    double d16 = 0.0D;
    double d17 = 0.0D;
    double d18 = 0.0D;
    double d19 = 0.0D;
    double d20 = 0.0D;
    double d21 = 0.0D;
    double d22 = 0.0D;
    double d23 = d5;
    for (byte b2 = 0; b2 < b1; b2++) {
      double d24 = d23;
      d21 = Math.cos(d23);
      d22 = Math.sin(d23);
      double d25 = d10 * d22;
      double d26 = d9 * d12 - d11 * d10 * d21;
      double d27 = d25 * d25 + d26 * d26;
      d20 = Math.sqrt(d27);
      d19 = d14 + d13 * d21;
      d15 = Math.atan2(d20, d19);
      double d28 = (d20 == 0.0D) ? 0.0D : (d13 * d22 / d20);
      d17 = 1.0D - d28 * d28;
      d18 = (d17 == 0.0D) ? 0.0D : (d19 - 2.0D * d14 / d17);
      double d29 = d17 * d4;
      d6 = 1.0D + d29 / 16384.0D * (4096.0D + d29 * (-768.0D + d29 * (320.0D - 175.0D * d29)));
      double d30 = d29 / 1024.0D * (256.0D + d29 * (-128.0D + d29 * (74.0D - 47.0D * d29)));
      double d31 = d3 / 16.0D * d17 * (4.0D + d3 * (4.0D - 3.0D * d17));
      double d32 = d18 * d18;
      d16 = d30 * d20 * (d18 + d30 / 4.0D * (d19 * (-1.0D + 2.0D * d32) - d30 / 6.0D * d18 * (-3.0D + 4.0D * d20 * d20) * (-3.0D + 4.0D * d32)));
      d23 = d5 + (1.0D - d31) * d3 * d28 * (d15 + d31 * d20 * (d18 + d31 * d19 * (-1.0D + 2.0D * d18 * d18)));
      double d33 = (d23 - d24) / d23;
      if (Math.abs(d33) < 1.0E-12D)
        break; 
    } 
    float f1 = (float)(d2 * d6 * (d15 - d16));
    paramArrayOffloat[0] = f1;
    if (paramArrayOffloat.length > 1) {
      float f2 = (float)Math.atan2(d10 * d22, d9 * d12 - d11 * d10 * d21);
      f2 = (float)(f2 * 57.29577951308232D);
      paramArrayOffloat[1] = f2;
      if (paramArrayOffloat.length > 2) {
        float f3 = (float)Math.atan2(d9 * d22, -d11 * d10 + d9 * d12 * d21);
        f3 = (float)(f3 * 57.29577951308232D);
        paramArrayOffloat[2] = f3;
      } 
    } 
  }
  
  public float a(f paramf) {
    synchronized (this.t) {
      if (this.c != this.n || this.d != this.o || paramf.c != this.p || paramf.d != this.q) {
        a(this.c, this.d, paramf.c, paramf.d, this.t);
        this.n = this.c;
        this.o = this.d;
        this.p = paramf.c;
        this.q = paramf.d;
        this.r = this.t[0];
        this.s = this.t[1];
      } 
      return this.r;
    } 
  }
  
  public float b(f paramf) {
    synchronized (this.t) {
      if (this.c != this.n || this.d != this.o || paramf.c != this.p || paramf.d != this.q) {
        a(this.c, this.d, paramf.c, paramf.d, this.t);
        this.n = this.c;
        this.o = this.d;
        this.p = paramf.c;
        this.q = paramf.d;
        this.r = this.t[0];
        this.s = this.t[1];
      } 
      return this.s;
    } 
  }
  
  public long a() {
    return this.b;
  }
  
  public void a(long paramLong) {
    this.b = paramLong;
  }
  
  public double b() {
    return this.c;
  }
  
  public void a(double paramDouble) {
    this.c = paramDouble;
  }
  
  public double c() {
    return this.d;
  }
  
  public void b(double paramDouble) {
    this.d = paramDouble;
  }
  
  public double d() {
    return this.f;
  }
  
  public void c(double paramDouble) {
    this.f = paramDouble;
    this.e = true;
  }
  
  public float e() {
    return this.h;
  }
  
  public void a(float paramFloat) {
    this.h = paramFloat;
    this.g = true;
  }
  
  public float f() {
    return this.j;
  }
  
  public void b(float paramFloat) {
    while (paramFloat < 0.0F)
      paramFloat += 360.0F; 
    while (paramFloat >= 360.0F)
      paramFloat -= 360.0F; 
    this.j = paramFloat;
    this.i = true;
  }
  
  public float g() {
    return this.l;
  }
  
  public void c(float paramFloat) {
    this.l = paramFloat;
    this.k = true;
  }
  
  public String toString() {
    return "Location[mProvider=" + this.a + ",mTime=" + this.b + ",mLatitude=" + this.c + ",mLongitude=" + this.d + ",mHasAltitude=" + this.e + ",mAltitude=" + this.f + ",mHasSpeed=" + this.g + ",mSpeed=" + this.h + ",mHasBearing=" + this.i + ",mBearing=" + this.j + ",mHasAccuracy=" + this.k + ",mAccuracy=" + this.l + "]";
  }
  
  public HashMap h() {
    return this.u;
  }
  
  public void a(HashMap paramHashMap) {
    this.u = paramHashMap;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */