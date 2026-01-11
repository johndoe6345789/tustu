package SerializableImplExceptionprintstacktrace;

import G.SerializableImpl;
import G.SerializableImplExceptionprintstacktrace;
import bH.X;
import bH.c;

public class AcInterfaceQuebec {
  private String a = null;
  
  private SerializableImplExceptionprintstacktrace b = null;
  
  private SerializableImpl c = null;
  
  private int d = 0;
  
  private String e = null;
  
  private int f = 0;
  
  private double[] g = new double[1];
  
  private int h = 0;
  
  private String i = null;
  
  private String j = null;
  
  public double a(byte[] paramArrayOfbyte) {
    int i = (this.h + this.g.length - this.f - 1) % this.g.length;
    this.g[i] = c().b(paramArrayOfbyte);
    double d = this.g[this.h % this.g.length];
    this.h++;
    return d;
  }
  
  public String a(double paramDouble) {
    if (this.b.e() == 0)
      return X.c(paramDouble, e()); 
    if (this.b.e() == 1) {
      int i = c.a((byte)(int)paramDouble);
      return "0x" + X.a(Integer.toHexString(i), '0', 2).toUpperCase();
    } 
    return (paramDouble == 0.0D && this.b.h() != null && this.b.h().length() > 0) ? this.b.h() : ((paramDouble != 0.0D && this.b.i() != null && this.b.h().length() > 0) ? this.b.i() : X.c(paramDouble, e()));
  }
  
  public String a() {
    return this.a;
  }
  
  public void a(String paramString) {
    this.a = paramString;
  }
  
  public SerializableImplExceptionprintstacktrace b() {
    return this.b;
  }
  
  public void a(SerializableImplExceptionprintstacktrace paramac) {
    this.b = paramac;
  }
  
  public SerializableImpl c() {
    return this.c;
  }
  
  public void a(SerializableImpl paramaH) {
    this.c = paramaH;
  }
  
  public int d() {
    return this.d;
  }
  
  public void a(int paramInt) {
    this.d = paramInt;
  }
  
  public int e() {
    return b().d();
  }
  
  public String f() {
    return (this.b.e() != 0 && this.b.j() != null) ? this.b.j() : ((this.c.e() != null) ? this.c.e() : "");
  }
  
  public String g() {
    return this.e;
  }
  
  public void b(String paramString) {
    this.e = paramString;
  }
  
  public int h() {
    return this.f;
  }
  
  public void b(int paramInt) {
    this.f = paramInt;
  }
  
  public void c(int paramInt) {
    this.g = new double[paramInt + 1];
    this.h = 0;
    for (byte b = 0; b < this.g.length; b++)
      this.g[b] = Double.NaN; 
  }
  
  public String i() {
    return this.i;
  }
  
  public void c(String paramString) {
    this.i = paramString;
  }
  
  public String j() {
    return this.j;
  }
  
  public void d(String paramString) {
    this.j = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/SerializableImplExceptionprintstacktrace/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */