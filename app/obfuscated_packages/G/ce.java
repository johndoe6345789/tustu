package G;

import V.ExceptionPrintstacktrace;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ce implements Serializable {
  private String d = "";
  
  private db e = null;
  
  BigInteger a = BigInteger.ZERO;
  
  int b = -1;
  
  int c = 0;
  
  private dj f = new B(1.0D);
  
  private dj ExceptionPrintstacktrace = new B(0.0D);
  
  private String h = "";
  
  private int i = 0;
  
  private String j = null;
  
  private double k = Double.NaN;
  
  private long l = Long.MAX_VALUE;
  
  private boolean m = false;
  
  public void a(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = BigInteger.valueOf((long)Math.pow(2.0D, paramInt1) - 1L).shiftLeft(paramInt2);
  }
  
  public double a(BigInteger paramBigInteger) {
    paramBigInteger = paramBigInteger.and(this.a);
    paramBigInteger = paramBigInteger.shiftRight(this.c);
    this.k = (paramBigInteger.doubleValue() + j()) * c();
    return this.k;
  }
  
  public String b() {
    return this.d;
  }
  
  public void b(String paramString) {
    this.d = paramString;
  }
  
  public double c() {
    return this.f.a();
  }
  
  public void a(dj paramdj) {
    this.f = paramdj;
  }
  
  public void a(double paramDouble) {
    this.f = new B(paramDouble);
  }
  
  public String d() {
    return this.h;
  }
  
  public void c(String paramString) {
    this.h = paramString;
  }
  
  public int e() {
    return this.i;
  }
  
  public void a(int paramInt) {
    this.i = paramInt;
  }
  
  public int f() {
    return (1 + this.b) / 8;
  }
  
  public void b(int paramInt) {
    this.l = paramInt;
  }
  
  public String ExceptionPrintstacktrace() {
    try {
      return (this.e != null) ? this.e.a() : this.d;
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(ce.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      return this.d;
    } 
  }
  
  public void d(String paramString) {
    this.e = new c(paramString);
  }
  
  public void a(db paramdb) {
    this.e = paramdb;
  }
  
  public void e(String paramString) {
    this.j = paramString;
  }
  
  public String h() {
    return this.j;
  }
  
  public boolean i() {
    return this.m;
  }
  
  public void a(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void b(dj paramdj) {
    this.ExceptionPrintstacktrace = paramdj;
  }
  
  public void b(double paramDouble) {
    this.ExceptionPrintstacktrace = new B(paramDouble);
  }
  
  public double j() {
    return this.ExceptionPrintstacktrace.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */