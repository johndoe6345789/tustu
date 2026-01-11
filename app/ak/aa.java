package ak;

import V.a;
import W.V;
import W.X;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class aa extends V {
  String a;
  
  String b = "";
  
  byte[] e;
  
  public static final byte[] f = new byte[] { 77, 68, 70, 32, 32, 32, 32, 32 };
  
  HashMap g = new HashMap<>();
  
  List h = new ArrayList();
  
  Set i = new TreeSet();
  
  int j;
  
  boolean k;
  
  float[] l = null;
  
  int m = 0;
  
  int n = 0;
  
  double o = Double.MAX_VALUE;
  
  double p = Double.NaN;
  
  double q = Double.MIN_VALUE;
  
  double r = 0.02D;
  
  public static final String[] s = new String[] { 
      "UINT", "INT", "FLOAT", "DOUBLE", "F_FLOAT", "G_FLOAT", "D_FLOAT", "STRING", "BYTE_ARRAY", "UINT_BE", 
      "INT_BE", "FLOAT_BE", "DOUBLE_BE", "UINT_LE", "INT_LE", "FLOAT_LE", "DOUBLE_LE" };
  
  private static final boolean[] t = new boolean[] { 
      false, true, true, true, true, true, true, true, true, false, 
      true, true, true, false, true, true, true };
  
  public boolean a(String paramString) {
    this.a = paramString;
    RandomAccessFile randomAccessFile = null;
    try {
      randomAccessFile = new RandomAccessFile(paramString, "r");
      this.e = new byte[(int)randomAccessFile.length()];
      randomAccessFile.readFully(this.e);
      ah ah = new ah(this);
      ac ac = new ac(this, 64);
      StringBuilder stringBuilder = (new StringBuilder()).append("Date: ").append(ac.e).append("\n").append("Time: ").append(ac.f).append("\n").append("Format: ").append(ah.a).append(" ").append(ah.b).append(" ").append(ah.d ? "BE" : "LE").append("\n").append("Program: ").append(ah.c).append("\n").append("Operator: ").append(ac.g).append("\n").append("Divition: ").append(ac.h).append("\n").append("Project: ").append(ac.i).append("\n").append("Sub Project: ").append(ac.j).append("\n");
      if (ac.l != null) {
        stringBuilder.append("Start Comment:\n").append(ac.l.b).append("\nEndComment\n").append("Logged Fields:\n");
      } else {
        stringBuilder.append("Start Comment:\n").append("").append("\nEndComment\n").append("Logged Fields:\n");
      } 
      for (ad ad : ac.n) {
        for (ae ae : ad.e) {
          byte b3 = 0;
          for (af af : ae.h) {
            if (af.h == 7)
              b3++; 
          } 
          if (b3 < ae.e - 1)
            this.i.add(ae); 
        } 
      } 
      this.h.add(new ai(this));
      int i = 1;
      byte b = -1;
      byte b1 = 0;
      for (ae ae : this.i) {
        ae.j = i;
        i += ae.h.size();
        if (ae.g > this.n)
          this.n = ae.g; 
        for (af af : ae.h) {
          if (af.d) {
            if (++b > 0) {
              ((af)ae.h.get(0)).e += b;
            } else {
              ((af)ae.h.get(0)).e += "0";
              if (af.i > 0.0D && af.i < this.r)
                this.r = af.i; 
            } 
            stringBuilder.append("\nChannelGroup").append(b1).append(" ").append(ae.g).append(" records (").append(af.i).append("s ):\n");
            this.o = (af.q < this.o) ? af.q : this.o;
            this.q = (af.r > this.q) ? af.r : this.q;
          } 
          stringBuilder.append(af.e).append("\n");
          this.h.add(af);
        } 
        b1++;
      } 
      this.p = this.o = (int)(this.o / this.r) * this.r;
      this.q = (int)(this.q / this.r) * this.r;
      if (this.q > this.o && this.r > 0.0D)
        this.n = (int)((this.q - this.o) / this.r) + 2; 
      this.l = new float[this.h.size()];
      this.b = stringBuilder.toString();
      byte b2;
      for (b2 = 0; b2 < this.l.length; b2++)
        this.l[b2] = Float.NaN; 
      b2 = 1;
      return b2;
    } catch (IOException|a iOException) {
      throw new a(iOException.getMessage(), iOException);
    } finally {
      if (randomAccessFile != null)
        try {
          randomAccessFile.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  public void a() {}
  
  public String i() {
    return X.L;
  }
  
  public Iterator b() {
    return this.h.iterator();
  }
  
  public float[] c() {
    this.l[0] = (float)this.p;
    for (ae ae : this.i)
      ae.a(); 
    this.p += this.r;
    this.m++;
    return this.l;
  }
  
  public long d() {
    return this.n;
  }
  
  public boolean e() {
    return (this.m < this.n);
  }
  
  public boolean f() {
    return true;
  }
  
  public HashMap g() {
    return this.g;
  }
  
  public String h() {
    return this.b;
  }
  
  private String a(int paramInt1, int paramInt2) {
    return (new String(this.e, paramInt1, paramInt2, StandardCharsets.US_ASCII)).replace("�", "°");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */