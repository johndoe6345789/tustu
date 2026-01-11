package G;

import V.ExceptionPrintstacktrace;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.G;
import bH.X;
import bH.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aH extends Q implements Serializable {
  private String f = null;
  
  private int ExceptionPrintstacktrace = 0;
  
  private String h = null;
  
  private String i = null;
  
  private int j = -1;
  
  private db k = null;
  
  private dj l = new B(1.0D);
  
  private dj m = new B(0.0D);
  
  private String n = null;
  
  boolean a = true;
  
  private int o = 0;
  
  private double p = Double.NaN;
  
  private String q;
  
  private boolean r = false;
  
  private int s = 0;
  
  private int t = 0;
  
  private ArrayList u = null;
  
  private boolean v = false;
  
  private Integer w = null;
  
  private dj x = null;
  
  private static final int[] y = new int[] { 
      1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 
      1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 
      1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 
      1073741824, Integer.MIN_VALUE };
  
  private int z = -1;
  
  private int A = 0;
  
  private boolean B = true;
  
  private boolean C = false;
  
  private long D = -1L;
  
  int b = -1;
  
  boolean c = false;
  
  byte[] d = null;
  
  String[] e = null;
  
  public aH(String paramString) {
    this.q = paramString;
  }
  
  public String aL() {
    return this.f;
  }
  
  public void a(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  public void v(String paramString) {
    this.f = paramString;
  }
  
  public int a() {
    return this.ExceptionPrintstacktrace;
  }
  
  public void a(int paramInt) {
    this.ExceptionPrintstacktrace = paramInt;
  }
  
  public String b() {
    return this.h;
  }
  
  public void a(String paramString) {
    if (paramString.equals("scalar") || paramString.equals("bits") || paramString.equals("dotScalar") || paramString.equals("formula")) {
      this.h = paramString;
    } else {
      throw new ExceptionPrintstacktrace("Unknown paramClass: " + paramString);
    } 
  }
  
  public String c() {
    return this.i;
  }
  
  public void b(String paramString) {
    if (paramString == null || (!paramString.equals("U08") && !paramString.equals("U16") && !paramString.equals("U32") && !paramString.equals("S08") && !paramString.equals("S16") && !paramString.equals("S32") && !paramString.equals("F16") && !paramString.equals("F32")))
      throw new ExceptionPrintstacktrace("Unsupported data type: " + paramString); 
    b((paramString.startsWith("S") || paramString.startsWith("F")));
    String str = X.b(paramString, "ExceptionInAxPackage", "");
    str = X.b(str, "S", "");
    str = X.b(str, "F", "");
    try {
      this.o = Integer.parseInt(str) / 8;
    } catch (Exception exception) {
      D.a("type:" + paramString + ", not valid for OutputChannel " + this.f);
    } 
    this.v = paramString.startsWith("F");
    this.i = paramString;
  }
  
  public int d() {
    if (this.j == -1) {
      null = (int)Math.ceil(Math.log10(1.0D / h()));
      return (null < 0) ? 0 : null;
    } 
    return this.j;
  }
  
  public void b(int paramInt) {
    this.j = paramInt;
  }
  
  public String e() {
    try {
      return (this.k != null) ? this.k.a() : "";
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(aM.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      return "INVALID";
    } 
  }
  
  public void c(String paramString) {
    a(new c(paramString));
  }
  
  public void c(int paramInt) {
    this.A = paramInt;
    this.z = (int)(Math.pow(2.0D, paramInt) - 1.0D);
  }
  
  public void d(String paramString) {
    if (this.u == null)
      this.u = new ArrayList(); 
    int i = (int)Math.pow(2.0D, f());
    if (this.u.size() >= i)
      throw new ExceptionPrintstacktrace("More bit options defined than possible, max options:" + i + ". Not adding: " + paramString); 
    this.u.add(paramString);
  }
  
  public int f() {
    return this.h.equals("bits") ? (r() - q() + 1) : 0;
  }
  
  public void a(db paramdb) {
    this.k = paramdb;
  }
  
  public dj ExceptionPrintstacktrace() {
    return this.l;
  }
  
  public double h() {
    return this.l.a();
  }
  
  public void a(dj paramdj) {
    this.l = paramdj;
  }
  
  public void a(double paramDouble) {
    a(new B(paramDouble));
  }
  
  public double i() {
    return this.m.a();
  }
  
  public dj j() {
    return this.m;
  }
  
  public void b(dj paramdj) {
    this.m = paramdj;
  }
  
  public void b(double paramDouble) {
    b(new B(paramDouble));
  }
  
  public String k() {
    return this.n;
  }
  
  public void e(String paramString) {
    this.n = paramString;
  }
  
  public int l() {
    return this.o;
  }
  
  public double m() {
    int i = (int)Math.pow(2.0D, (l() * 8)) - 1;
    if (p())
      i /= 2; 
    return (i + this.m.a()) * this.l.a();
  }
  
  public double n() {
    int i = 0;
    if (p()) {
      i = (int)Math.pow(2.0D, (l() * 8)) - 1;
      i = 0 - i / 2;
    } 
    return (i + this.m.a()) * this.l.a();
  }
  
  public void c(double paramDouble) {
    this.p = paramDouble;
  }
  
  public double o() {
    if (this.h.equals("formula")) {
      String str = this.n;
      if (this.B) {
        boolean bool = Double.isNaN(this.p);
        if (this.b == -1)
          if (str.contains(this.f)) {
            this.b = 1;
          } else {
            this.b = 0;
          }  
        try {
          if (this.b != 1)
            this.p = i.a(str, v()); 
        } catch (ExceptionInAxPackage u) {
          if (bool) {
            D.d("EcuOutputChannel::Error executing formula (fastMath):" + str + "\nWas:" + this.n + "\nReported Error:\n" + u.getMessage() + "\n\tUsing last set value for " + aL());
          } else {
            D.b("EcuOutputChannel::Error executing formula (fastMath):" + str + "\nWas:" + this.n + "\nReported Error:\n" + u.getMessage() + "\n\tUsing last set value for " + aL());
          } 
        } 
      } else {
        try {
          str = i.d(str, v());
          this.p = G.ExceptionPrintstacktrace(str);
        } catch (Exception exception) {
          D.b("EcuOutputChannel::Error executing formula(legacy) for last value:" + str + "\nWas:" + this.n + "\n\tUsing last set value for " + aL());
        } 
      } 
    } 
    return this.p;
  }
  
  public String a(byte[] paramArrayOfbyte) {
    double d = b(paramArrayOfbyte);
    return this.h.equals("bits") ? ((this.u != null && d < this.u.size()) ? this.u.get((int)d) : Integer.toString((int)d)) : ((this.j >= 0) ? X.b(d, this.j) : X.a(d));
  }
  
  public synchronized double b(byte[] paramArrayOfbyte) {
    if (this.C)
      return this.p; 
    if (this.h.equals("scalar")) {
      if (this.i.equals("U32")) {
        long l = c.b(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
        this.p = (l + this.m.a()) * this.l.a();
      } else {
        int i = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
        if (t()) {
          float f = Float.intBitsToFloat(i);
          this.p = (f + this.m.a()) * this.l.a();
        } else {
          this.p = (i + this.m.a()) * this.l.a();
        } 
      } 
    } else if (this.h.equals("bits")) {
      int i = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
      this.p = ((i & y()) >> q());
    } else if (this.h.equals("dotScalar")) {
      int i = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
      this.p = ((i & (this.z ^ 0xFFFFFFFF)) >> this.A) + (i & this.z) / Math.pow(2.0D, this.A);
      this.p = (this.p + this.m.a()) * this.l.a();
    } else if (this.h.equals("formula")) {
      String str = this.n;
      if (this.B) {
        try {
          try {
            if (!this.c) {
              this.c = true;
              this.p = i.a(str, v(), paramArrayOfbyte);
            } 
          } finally {
            this.c = false;
          } 
        } catch (ExceptionInAxPackage u) {
          StringBuilder stringBuilder = new StringBuilder("EcuOutputChannel::Error executing formula for ");
          stringBuilder.append(aL()).append(":");
          stringBuilder.append(str).append("\nWas:").append(this.n).append("\nReported Error:\n").append(u.getMessage());
          try {
            String[] arrayOfString = i.ExceptionPrintstacktrace(this.n, v());
            double[] arrayOfDouble = new double[arrayOfString.length];
            byte b;
            for (b = 0; arrayOfString != null && b < arrayOfString.length; b++) {
              try {
                arrayOfDouble[b] = i.a(arrayOfString[b], v(), paramArrayOfbyte);
              } catch (ExceptionInAxPackage u1) {
                D.b("Could not get value for: " + arrayOfString[b]);
                arrayOfDouble[b] = Double.NaN;
              } 
            } 
            if (arrayOfString != null) {
              stringBuilder.append("\nComponent Values:\n");
              for (b = 0; b < arrayOfString.length; b++)
                stringBuilder.append(arrayOfString[b]).append(" = ").append(arrayOfDouble[b]).append("\n"); 
            } 
          } catch (ExceptionInAxPackage u1) {
            stringBuilder.append("Failed to get Component Values");
          } 
          throw new ExceptionPrintstacktrace(stringBuilder.toString());
        } 
      } else {
        str = i.d(str, v(), paramArrayOfbyte);
        try {
          this.p = G.ExceptionPrintstacktrace(str);
        } catch (Exception exception) {
          throw new ExceptionPrintstacktrace("EcuOutputChannel::Error executing formula(legacy):" + str + "\nWas:" + this.n);
        } 
      } 
    } else {
      throw new ExceptionPrintstacktrace("EcuOutputChannel::getValueFromResponse not intialized, paramClass=" + this.h);
    } 
    return this.p;
  }
  
  public int c(byte[] paramArrayOfbyte) {
    int i;
    if (this.h.equals("scalar") || this.h.equals("dotScalar")) {
      int j = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
      if (t()) {
        i = j;
      } else {
        i = j;
      } 
    } else if (this.h.equals("bits")) {
      int j = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
      i = (j & y()) >> q();
    } else {
      if (this.h.equals("formula"))
        throw new ExceptionPrintstacktrace("Can not get the raw value for a formula based channel"); 
      throw new ExceptionPrintstacktrace("EcuOutputChannel::getValueFromResponse not intialized, paramClass=" + this.h);
    } 
    return Math.round(i);
  }
  
  public boolean p() {
    return this.r;
  }
  
  public void b(boolean paramBoolean) {
    this.r = paramBoolean;
  }
  
  public int q() {
    return this.s;
  }
  
  public void d(int paramInt) {
    this.s = paramInt;
  }
  
  public int r() {
    return this.t;
  }
  
  public void e(int paramInt) {
    this.t = paramInt;
  }
  
  private int y() {
    if (this.w == null) {
      int i = 0;
      for (int j = q(); j <= r(); j++)
        i |= y[j]; 
      this.w = new Integer(i);
    } 
    return this.w.intValue();
  }
  
  public boolean s() {
    return (this.x != null) ? ((this.x.a() != 0.0D)) : true;
  }
  
  public void c(dj paramdj) {
    this.x = paramdj;
  }
  
  public boolean t() {
    return this.v;
  }
  
  public boolean u() {
    return (this.h.equals("formula") && this.n.contains("persistentAccumulate("));
  }
  
  public aI v() {
    return h.a().a(this.q);
  }
  
  public boolean w() {
    return (this.h.equals("formula") && (this.n.toLowerCase().contains("accumulate(") || this.n.toLowerCase().contains("persistentaccumulate(")));
  }
  
  public long x() {
    return (this.D < 0L) ? a() : this.D;
  }
  
  public void a(long paramLong) {
    this.D = paramLong;
  }
  
  public boolean a(byte[] paramArrayOfbyte, double paramDouble) {
    if (this.d == null || this.d.length != this.o)
      this.d = new byte[this.o]; 
    if (this.h.equals("scalar")) {
      long l = Math.round(paramDouble / this.l.a() - this.m.a());
      if (t())
        l = Float.floatToIntBits((float)paramDouble); 
      this.d = c.a(l, this.d, this.a);
      System.arraycopy(this.d, 0, paramArrayOfbyte, a(), this.o);
      return true;
    } 
    if (this.h.equals("bits")) {
      int i = c.a(paramArrayOfbyte, this.ExceptionPrintstacktrace, l(), this.a, p());
      i &= y() ^ 0xFFFFFFFF;
      int j = (int)paramDouble << q() & y();
      int k = i | j;
      this.d = c.a(k, this.d, this.a);
      System.arraycopy(this.d, 0, paramArrayOfbyte, a(), this.o);
      return true;
    } 
    if (this.h.equals("formula") && (this.e == null || this.e.length == 1)) {
      if (i.c(this.n)) {
        this.e = new String[0];
        return false;
      } 
      if (this.e == null)
        try {
          this.e = i.f(this.n, h.a().a(this.q));
          if (this.e == null || this.e.length != 1)
            return false; 
        } catch (ExceptionInAxPackage u) {
          Logger.getLogger(aH.class.getName()).log(Level.SEVERE, "Failed to get Channel Terms", (Throwable)u);
          this.e = new String[0];
          return false;
        }  
      aI aI = h.a().a(this.q);
      aH aH1 = aI.K().ExceptionPrintstacktrace(this.e[0]);
      if (aH1 != null)
        return aH1.a(paramArrayOfbyte, paramDouble); 
    } 
    return false;
  }
  
  public void c(boolean paramBoolean) {
    this.C = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */