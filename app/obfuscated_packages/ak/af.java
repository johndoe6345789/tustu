package ak;

import W.T;
import W.k;
import bH.D;
import bH.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Objects;

class af extends ak implements T {
  protected int a;
  
  protected int b;
  
  protected int c;
  
  protected boolean d;
  
  protected String e;
  
  protected int f;
  
  protected int g;
  
  protected int h;
  
  protected double i;
  
  protected int j;
  
  protected int k;
  
  public ag l = new ag(this, this.b);
  
  protected am m;
  
  protected am n;
  
  protected am o;
  
  int p = 0;
  
  double q = Double.NaN;
  
  double r = Double.NaN;
  
  public af(ae paramae, int paramInt) {
    super(paramae.m.f.o, paramInt);
    if (this.c != 0)
      this.m = new am(paramae.m.f.o, this.c); 
    if (this.j != 0)
      this.n = new am(paramae.m.f.o, this.j); 
    if (this.k != 0)
      this.o = new am(paramae.m.f.o, this.k); 
  }
  
  public String toString() {
    return "CNBlock{name=" + String.format("%-30s", new Object[] { '"' + this.e + '"' }) + ", unit=" + this.l.a + ", sr=" + this.i + ", dt=" + aa.s[this.h] + ", cnvT=" + this.l.b + ", sizeInfo=" + this.l.c + ", rParams=" + ((this.l.d != null) ? Arrays.toString(this.l.d) : "null") + ", sParams=" + ((this.l.e != null) ? Arrays.toString((Object[])this.l.e) : "null") + ", offsetBits=" + this.f + ", signalBits=" + this.g + '}';
  }
  
  public String a() {
    return this.e;
  }
  
  public String b() {
    return this.l.a;
  }
  
  public int e() {
    return -1;
  }
  
  public int f() {
    return (this.l.b == 11) ? 255 : 0;
  }
  
  public float d() {
    return Float.NaN;
  }
  
  public float c() {
    return Float.NaN;
  }
  
  int k() {
    return this.s.j + this.p;
  }
  
  double a(int paramInt) {
    int i = this.s.m.c + this.f / 8 + paramInt * this.s.f;
    int j = this.g / 8;
    double d = Double.NaN;
    try {
      switch (this.h) {
        case 0:
        case 1:
          d = (j > 4) ? c.b(this.s.m.f.o.e, i, j, this.s.m.f.o.k, aa.l()[this.h]) : c.a(this.s.m.f.o.e, i, j, this.s.m.f.o.k, aa.l()[this.h]);
          break;
        case 2:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 4).order(this.s.m.f.o.k ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN).getFloat();
          break;
        case 3:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 8).order(this.s.m.f.o.k ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN).getDouble();
          break;
        case 7:
        case 8:
          d = Double.NaN;
          break;
        case 9:
        case 10:
          d = (j > 4) ? c.b(this.s.m.f.o.e, i, j, true, aa.l()[this.h]) : c.a(this.s.m.f.o.e, i, j, true, aa.l()[this.h]);
          break;
        case 11:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 4).order(ByteOrder.BIG_ENDIAN).getFloat();
          break;
        case 12:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 8).order(ByteOrder.BIG_ENDIAN).getDouble();
          break;
        case 13:
        case 14:
          d = (j > 4) ? c.b(this.s.m.f.o.e, i, j, false, aa.l()[this.h]) : c.a(this.s.m.f.o.e, i, j, false, aa.l()[this.h]);
          break;
        case 15:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 4).order(ByteOrder.LITTLE_ENDIAN).getFloat();
          break;
        case 16:
          d = ByteBuffer.wrap(this.s.m.f.o.e, i, 8).order(ByteOrder.LITTLE_ENDIAN).getDouble();
          break;
        default:
          throw new IllegalArgumentException("Channel data type " + aa.s[this.h] + " is not supported");
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      D.a(indexOutOfBoundsException.getMessage());
      return Double.NaN;
    } 
    switch (this.l.b) {
      case 0:
        return (this.l.d != null) ? (this.l.d[0] + this.l.d[1] * d) : d;
      case 11:
        return d;
      case 65535:
        return d;
      case 1:
      case 2:
      case 6:
      case 9:
      case 132:
      case 133:
        return d;
    } 
    throw new IllegalArgumentException("Channel conversion type " + this.l.b + " is not supported");
  }
  
  public int hashCode() {
    null = 7;
    return 37 * null + Objects.hashCode(a());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    af af1 = (af)paramObject;
    return Objects.equals(a(), af1.a());
  }
  
  public k g() {
    return (this.l.b == 11) ? new aj(this.s.m.f.o, this.l.d, this.l.e) : null;
  }
  
  public float h() {
    return Float.NaN;
  }
  
  public float i() {
    return Float.NaN;
  }
  
  public String j() {
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */