package ac;

import G.R;
import G.f;
import G.i;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import bH.c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcInterfaceUniform extends h {
  static final byte[] a = new byte[] { 77, 76, 86, 76, 71, 0 };
  
  private static u z = null;
  
  private List A = Collections.synchronizedList(new ArrayList());
  
  private List B = Collections.synchronizedList(new ArrayList());
  
  List b = new ArrayList();
  
  private int C = 0;
  
  private int D = 0;
  
  private double E = -1.0D;
  
  private boolean F = false;
  
  private int G = 0;
  
  private int H = 21;
  
  private double I = this.H;
  
  int c = -1;
  
  int p = 0;
  
  int q = 0;
  
  int r = 4;
  
  byte s = 0;
  
  long t = 0L;
  
  int u = 0;
  
  private double J = 0.0D;
  
  private int K = (this.C == 1) ? 22 : 24;
  
  byte[] v = new byte[] { 0 };
  
  List w = new ArrayList();
  
  f x = new f();
  
  private d L = new n();
  
  byte[] y = new byte[2];
  
  private int M = 0;
  
  public static u a() {
    if (z == null)
      z = new u(); 
    return z;
  }
  
  public void a(v paramv) {
    this.w.add(paramv);
  }
  
  protected void a(R[] paramArrayOfR, OutputStream paramOutputStream) {
    try {
      byte[] arrayOfByte1;
      this.A = a(paramArrayOfR);
      this.B = a(this.A);
      StringBuilder stringBuilder1 = new StringBuilder();
      String str = this.L.a(paramArrayOfR);
      if (str != null)
        stringBuilder1.append(str).append("\n"); 
      StringBuilder stringBuilder2 = new StringBuilder();
      for (q q : this.A) {
        if (q.j() != null && !q.j().isEmpty())
          stringBuilder2.append(q.a()).append(" = ").append(q.j()).append("\n"); 
      } 
      if (stringBuilder2.length() > 0) {
        stringBuilder1.append("NEW_INFO_PROVIDER").append(",").append("Field Descriptions").append(",").append("Type:Properties").append("Visible:true").append("Length:").append(stringBuilder2.length()).append("\n");
        stringBuilder1.append(stringBuilder2);
      } 
      for (v v : this.w) {
        String str1 = v.d();
        if (str1 != null && !str1.isEmpty()) {
          stringBuilder1.append("NEW_INFO_PROVIDER").append(",").append(v.a()).append(",").append("Type:").append(v.b()).append("Visible:").append(v.c()).append("Length:").append((str1.getBytes()).length).append("\n");
          stringBuilder1.append(str1);
        } 
      } 
      if (stringBuilder1.length() > 0) {
        byte[] arrayOfByte = stringBuilder1.toString().getBytes();
        arrayOfByte1 = new byte[arrayOfByte.length + 1];
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte.length);
        arrayOfByte1[arrayOfByte.length] = 0;
      } else {
        arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 0;
      } 
      paramOutputStream.write(a);
      byte[] arrayOfByte2 = new byte[2];
      arrayOfByte2 = c.a(2, arrayOfByte2, true);
      paramOutputStream.write(arrayOfByte2);
      int i = (int)(System.currentTimeMillis() / 1000L);
      byte[] arrayOfByte3 = new byte[4];
      arrayOfByte3 = c.a(i, arrayOfByte3, true);
      paramOutputStream.write(arrayOfByte3);
      byte[] arrayOfByte4 = new byte[4];
      arrayOfByte4 = c.a(this.C, arrayOfByte4, true);
      paramOutputStream.write(arrayOfByte4);
      int j = this.C + arrayOfByte1.length;
      byte[] arrayOfByte5 = c.a(j, new byte[4], true);
      paramOutputStream.write(arrayOfByte5);
      this.q = 0;
      for (w w : this.B)
        this.q += w.m(); 
      byte[] arrayOfByte6 = c.a(this.q, new byte[2], true);
      paramOutputStream.write(arrayOfByte6);
      byte[] arrayOfByte7 = c.a(this.B.size(), new byte[2], true);
      paramOutputStream.write(arrayOfByte7);
      for (w w : this.B) {
        byte[] arrayOfByte = w.a(2);
        paramOutputStream.write(arrayOfByte);
      } 
      for (w w : this.B) {
        if (w instanceof t) {
          t t = (t)w;
          paramOutputStream.write(t.f());
        } 
      } 
      paramOutputStream.write(arrayOfByte1);
      paramOutputStream.flush();
      this.p = 0;
      this.G = 0;
      this.D = 0;
      this.s = 0;
      this.t = System.nanoTime();
      D.c("MLG header created");
      a(this);
    } catch (IOException iOException) {
      D.a("Failed to write Log Header.", iOException, null);
    } 
  }
  
  protected void a(OutputStream paramOutputStream, String paramString) {
    this.o.add(new l(this, paramString, r()));
  }
  
  private void a(OutputStream paramOutputStream, l paraml) {
    if (this.G > 0)
      try {
        String str = "MARK " + X.a("" + this.D, '0', 3) + " - " + paraml.a() + " - " + (new Date()).toString();
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 1;
        paramOutputStream.write(arrayOfByte1);
        byte[] arrayOfByte2 = new byte[1];
        this.D++;
        this.s = (byte)(this.s + 1);
        arrayOfByte2[0] = this.s;
        paramOutputStream.write(arrayOfByte2);
        paramOutputStream.write(e());
        byte[] arrayOfByte3 = new byte[50];
        w.a(arrayOfByte3, str);
        paramOutputStream.write(arrayOfByte3);
      } catch (IOException iOException) {
        Logger.getLogger(u.class.getName()).log(Level.WARNING, "Unable to write Mark to data log", iOException);
      }  
  }
  
  private byte[] e() {
    B b = s();
    if (b != null) {
      int i = (int)(b.a() * 100000.0D);
      int j = i % 65535;
      this.y[0] = (byte)(j >>> 8);
      this.y[1] = (byte)(j & 0xFF);
      return this.y;
    } 
    long l1 = System.nanoTime() - this.t;
    long l2 = l1 / 10000L;
    long l3 = l2 % 65535L;
    this.y[0] = (byte)(int)(l3 >>> 8L);
    this.y[1] = (byte)(int)(l3 & 0xFFL);
    return this.y;
  }
  
  protected synchronized void a(OutputStream paramOutputStream, byte[][] paramArrayOfbyte) {
    if (this.G == 0)
      i.b(); 
    byte[] arrayOfByte1 = this.x.b(this.q + this.r + 1);
    int i = 0;
    byte b = 0;
    a(arrayOfByte1, this.v, i++);
    byte[] arrayOfByte2 = new byte[1];
    this.s = (byte)(this.s + 1);
    arrayOfByte2[0] = this.s;
    a(arrayOfByte1, arrayOfByte2, i);
    i += arrayOfByte2.length;
    byte[] arrayOfByte3 = e();
    a(arrayOfByte1, arrayOfByte3, i);
    i += arrayOfByte3.length;
    int j;
    for (j = 0; j < this.B.size(); j++) {
      w w = this.B.get(j);
      double d1 = 0.0D;
      try {
        d1 = w.a(paramArrayOfbyte);
        if (w.j() == null) {
          D.c("Invalid Field Name.");
        } else if (w.j().equals("SecL")) {
          if (d1 == 0.0D && this.E > 0.0D && this.E != 65535.0D && this.E != 255.0D) {
            a(paramOutputStream, "RESET");
            this.E = d1;
            this.c = 0;
            return;
          } 
          if (this.E > d1) {
            this.E = d1;
            this.c = 0;
            return;
          } 
          if (this.E == -1.0D) {
            this.c = this.H;
            this.I = this.H;
            this.E = d1;
          } else if (this.E < d1) {
            if (this.I == this.H) {
              this.I = this.c;
            } else {
              this.I = (this.c + b()) / 2.0D;
            } 
            this.c = 1;
          } else {
            this.c++;
          } 
          this.E = d1;
        } 
        if (Double.isNaN(d1) && w.j().equals("Time"))
          if (s() != null) {
            this.J = s().a();
            d1 = s().a();
          } else if (d()) {
            this.J = c() + 1.0D / b();
            d1 = c();
          }  
        byte[] arrayOfByte = w.a(d1);
        a(arrayOfByte1, arrayOfByte, i);
        i += arrayOfByte.length;
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        if (this.p < 10)
          D.a("problem getting log value for " + w.j() + ": " + ExceptionPrintstacktrace.getMessage()); 
        this.p++;
        i += w.m();
      } catch (Exception exception) {
        if (this.p < 10)
          D.a("error getting log value for " + w.j() + ": " + exception.getMessage()); 
        d1 = 0.0D;
        this.p++;
        i += w.m();
      } 
      if (Double.isNaN(d1))
        b++; 
    } 
    j = 0;
    for (int k = this.r; k < arrayOfByte1.length - 1; k++)
      j += arrayOfByte1[k]; 
    arrayOfByte1[arrayOfByte1.length - 1] = (byte)(0xFF & j);
    try {
      if (b < 15 || this.M > 20) {
        paramOutputStream.write(arrayOfByte1);
        paramOutputStream.flush();
        this.p = 0;
        this.M = 0;
        if (!this.o.isEmpty()) {
          Iterator<l> iterator = this.o.iterator();
          while (iterator.hasNext()) {
            l l = iterator.next();
            if (l.b() <= 0) {
              a(paramOutputStream, l);
              iterator.remove();
              continue;
            } 
            l.a(l.b() - 1);
          } 
        } 
      } else {
        D.c("Skipping Record: nanCount=" + b);
        this.M++;
      } 
      if (arrayOfByte1.length != i + 1)
        D.b("Record size does not match the defined size!"); 
    } catch (IOException iOException) {
      Logger.getLogger(u.class.getName()).log(Level.SEVERE, "Failed to write log record", iOException);
    } finally {
      this.x.a(arrayOfByte1);
    } 
    this.G++;
  }
  
  private byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte1, paramInt, paramArrayOfbyte2.length);
    return paramArrayOfbyte1;
  }
  
  protected void a(OutputStream paramOutputStream) {
    this.A.clear();
    try {
      paramOutputStream.flush();
      paramOutputStream.close();
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  public double b() {
    return this.I;
  }
  
  public double c() {
    return this.J;
  }
  
  public boolean d() {
    return this.F;
  }
  
  private List a(List paramList) {
    this.B.clear();
    List<x> list = this.B;
    t t = null;
    boolean bool = false;
    for (q q : paramList) {
      if (!q.b().l()) {
        try {
          x x = new x(q);
          list.add(x);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(u.class.getName()).log(Level.WARNING, "Unable to create Logger Field", (Throwable)ExceptionPrintstacktrace);
        } 
        continue;
      } 
      if (t == null || t.c().size() >= t.m() * 8 || t.b() != q.b().e()) {
        try {
          t = new t("", "U08");
          list.add(t);
          t.a(q);
          t.e(2);
          t.c(q.b().e());
          t.a((byte)1);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(u.class.getName()).log(Level.WARNING, "Unable to create MlvLgBitField", (Throwable)ExceptionPrintstacktrace);
        } 
        continue;
      } 
      t.a(q);
      t.a((byte)(t.e() + 1));
    } 
    for (a a : j()) {
      if (a instanceof D) {
        D d1 = (D)a;
        try {
          z z = new z(d1);
          list.add(z);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(u.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } 
      } 
    } 
    int i = this.K;
    for (w w : list)
      i += w.d(2); 
    this.b.clear();
    for (w w : list) {
      if (w instanceof t) {
        t t1 = (t)w;
        t1.b(i);
        byte[] arrayOfByte = t1.f();
        this.b.add(arrayOfByte);
        i += arrayOfByte.length;
      } 
    } 
    this.C = i;
    return list;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ac/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */