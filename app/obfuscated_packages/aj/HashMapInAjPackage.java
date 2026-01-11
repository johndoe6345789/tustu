package aj;

import G.R;
import G.T;
import G.aB;
import G.aI;
import G.cc;
import G.cd;
import G.ce;
import G.cf;
import G.cq;
import G.cu;
import G.dc;
import G.i;
import G.m;
import G.o;
import L.k;
import L.n;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import W.j;
import W.n;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.G;
import bH.X;
import bH.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashMapInAjPackage implements cq {
  byte[][] ExceptionInVPackage = null;
  
  byte[][] b = null;
  
  byte[][] c = null;
  
  private R p = null;
  
  protected static boolean d = false;
  
  private boolean q = true;
  
  private String r = null;
  
  private cd s = null;
  
  h e = new h(this);
  
  ArrayList f = new ArrayList();
  
  String ExceptionPrintstacktrace = "";
  
  List h = new ArrayList();
  
  private HashMap t = new HashMap<>();
  
  public static String i = cd.b;
  
  public static String j = cd.c;
  
  public static String k = cd.ExceptionInVPackage;
  
  public static String l = cd.d;
  
  private dc u = new dc();
  
  private static String v = "tsInternalLoggerCommand";
  
  private String w = i;
  
  private int x = 500;
  
  private int y = 10000;
  
  private String z = null;
  
  private long A = 0L;
  
  private double B = 0.0D;
  
  private i C = null;
  
  private j D = null;
  
  private int E = -1;
  
  int m = 0;
  
  double n = 1.0D;
  
  boolean o = false;
  
  public void ExceptionInVPackage() {
    c();
    f(i);
    this.ExceptionInVPackage = null;
    this.b = null;
    ExceptionInVPackage((cd)null);
    e("");
    this.m = 0;
    this.h.clear();
  }
  
  public void b() {
    if (d)
      return; 
    d = true;
    this.B = 0.0D;
    this.q = true;
    if (this.r != null) {
      cu.ExceptionInVPackage().ExceptionInVPackage(i().c(), this.r, this);
      e();
    } else {
      if (this.C != null)
        this.C.ExceptionInVPackage(); 
      if (this.E != -1 && this.E >= i().O().ExceptionPrintstacktrace())
        throw new ExceptionInVPackage("Please enable the LOGPAGES setting in Project Properties"); 
      this.C = new i(this);
      this.C.start();
    } 
  }
  
  public void c() {
    cu.ExceptionInVPackage().ExceptionInVPackage(this);
    d = false;
    if (this.C != null) {
      this.C.ExceptionInVPackage();
      this.C = null;
    } 
    if (this.D != null) {
      this.D.b();
      this.D = null;
    } 
    D.d("Logger Processor stopped.");
  }
  
  protected void d() {
    m m = m.d(i().O(), this.E);
    m.b(this.e);
    m.b(new e(this));
    i().C().b(m);
  }
  
  protected void e() {
    if (this.E == -1) {
      byte[][] arrayOfByte;
      int[] arrayOfInt = null;
      this.o = true;
      boolean bool = (this.q && this.b != null) ? true : false;
      if (bool) {
        arrayOfByte = this.b;
      } else {
        arrayOfByte = this.ExceptionInVPackage;
      } 
      this.q = false;
      for (byte b = 0; b < arrayOfByte.length; b++) {
        byte[] arrayOfByte1 = arrayOfByte[b];
        int[] arrayOfInt1 = new int[arrayOfByte1.length];
        for (byte b1 = 0; b1 < arrayOfInt1.length; b1++)
          arrayOfInt1[b1] = c.ExceptionInVPackage(arrayOfByte1[b1]); 
        m m = m.ExceptionInVPackage(arrayOfInt1);
        m.i(150);
        m.e(true);
        m.h(i().O());
        m.b(new f(this));
        o o = this.u.ExceptionInVPackage(i(), m, 2000);
        if (o.ExceptionInVPackage() == 1) {
          if (arrayOfInt == null) {
            arrayOfInt = o.e();
          } else {
            int[] arrayOfInt2 = new int[arrayOfInt.length + (o.e()).length];
            int[] arrayOfInt3 = o.e();
            System.arraycopy(arrayOfInt, 0, arrayOfInt2, 0, arrayOfInt.length);
            System.arraycopy(arrayOfInt3, 0, arrayOfInt2, arrayOfInt.length, arrayOfInt3.length);
            arrayOfInt = arrayOfInt2;
          } 
        } else {
          D.ExceptionInVPackage("Unable to read Logger data. " + o.c());
          b(new n());
        } 
      } 
      this.o = false;
      if (!bool) {
        if (this.s != null && !this.s.l())
          c(); 
        ExceptionInVPackage(arrayOfInt);
      } 
    } else {
      d();
    } 
    this.A = System.currentTimeMillis();
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (d && this.r != null && paramString.equals(this.r)) {
      String str = X.b(this.z, this.r, paramDouble + "");
      try {
        if (!this.o && (System.currentTimeMillis() - this.A > this.y || G.ExceptionPrintstacktrace(str) != 0.0D))
          j(); 
      } catch (Exception exception) {
        D.ExceptionInVPackage("Unable to evaluate Logger condition:" + this.z);
        exception.printStackTrace();
      } 
    } 
  }
  
  public boolean f() {
    return d;
  }
  
  public void ExceptionInVPackage(String paramString) {
    if (paramString != null) {
      this.ExceptionInVPackage = d(paramString);
    } else {
      this.ExceptionInVPackage = null;
    } 
  }
  
  public void b(String paramString) {
    if (paramString != null) {
      this.b = d(paramString);
    } else {
      this.b = null;
    } 
  }
  
  public void c(String paramString) {
    if (paramString != null) {
      this.c = d(paramString);
    } else {
      this.c = null;
    } 
  }
  
  public byte[][] d(String paramString) {
    int k = i().O().G(0);
    if (!i().equals(T.ExceptionInVPackage().c())) {
      int i1 = T.ExceptionInVPackage().c().O().G(0);
      k = (i1 < k) ? i1 : k;
    } 
    byte[] arrayOfByte = i().O().e(paramString).d();
    int m = (arrayOfByte.length == 7) ? c.ExceptionInVPackage(arrayOfByte, 3, 2, true, false) : -1;
    int n = (arrayOfByte.length == 7 && this.s.m() < 0) ? c.ExceptionInVPackage(arrayOfByte, 5, 2, true, false) : this.s.m();
    if (m && n >= 0 && k > 0 && k < n - m) {
      int i1 = (int)Math.ceil(n / k);
      byte[][] arrayOfByte2 = new byte[i1][7];
      byte[] arrayOfByte3 = new byte[2];
      for (byte b = 0; b < arrayOfByte2.length; b++) {
        int i2 = (k < n - m) ? k : (n - m);
        arrayOfByte2[b][0] = arrayOfByte[0];
        arrayOfByte2[b][1] = arrayOfByte[1];
        arrayOfByte2[b][2] = arrayOfByte[2];
        arrayOfByte3 = c.ExceptionInVPackage(m, arrayOfByte3, true);
        arrayOfByte2[b][3] = arrayOfByte3[0];
        arrayOfByte2[b][4] = arrayOfByte3[1];
        arrayOfByte3 = c.ExceptionInVPackage(i2, arrayOfByte3, true);
        arrayOfByte2[b][5] = arrayOfByte3[0];
        arrayOfByte2[b][6] = arrayOfByte3[1];
        m += i2;
      } 
      return arrayOfByte2;
    } 
    byte[][] arrayOfByte1 = new byte[1][1];
    arrayOfByte1[0] = arrayOfByte;
    return arrayOfByte1;
  }
  
  public void e(String paramString) {
    this.r = paramString;
  }
  
  protected void ExceptionInVPackage(int[] paramArrayOfint) {
    if (this.s != null && this.s.d().equals(l)) {
      b(paramArrayOfint);
    } else {
      d(paramArrayOfint);
    } 
  }
  
  private void b(int[] paramArrayOfint) {
    cf cf;
    try {
      cf = ExceptionPrintstacktrace();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      D.ExceptionInVPackage("Failed to generate Logger Record Definitions: \n" + ExceptionPrintstacktrace.getMessage(), (Exception)ExceptionPrintstacktrace, null);
      return;
    } 
    n n = new n();
    for (byte b1 = 0; b1 < cf.f(); b1++) {
      ce ce = cf.b(b1);
      if (ce.b().equals(c.ExceptionInVPackage)) {
        this.m = (int)cf.ExceptionInVPackage(b1, paramArrayOfint);
      } else if (ce.b().equals(c.b)) {
        this.m = (int)cf.ExceptionInVPackage(b1, paramArrayOfint) + cf.c();
      } else if (ce.b().equals(c.c)) {
        int m = (int)cf.ExceptionInVPackage(b1, paramArrayOfint);
        if (m == 1) {
          this.n = 100.0D;
        } else {
          this.n = 1.0D;
        } 
      } 
    } 
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (cf.d() > 0) {
      String str = "";
      for (byte b = 0; b < cf.d(); b++) {
        ce ce = cf.c(b);
        if (ce.d().length() > 0) {
          str = str + ce.ExceptionPrintstacktrace() + "(" + ce.d() + ") = " + cf.b(b, paramArrayOfint);
        } else {
          str = str + ce.ExceptionPrintstacktrace() + " = " + cf.b(b, paramArrayOfint);
        } 
        if (b + 1 < cf.d())
          str = str + "; "; 
        hashMap.put(ce.b(), Double.valueOf(cf.b(b, paramArrayOfint)));
      } 
      if (str.length() > 0)
        str = "\"" + str; 
      n.d(str);
    } 
    String[] arrayOfString1 = cf.ExceptionInVPackage();
    for (byte b2 = 0; b2 < arrayOfString1.length; b2++)
      hashMap.put(arrayOfString1[b2], Double.valueOf(Double.NaN)); 
    String[] arrayOfString2 = cf.b();
    int k;
    for (k = 0; k < arrayOfString2.length; k++) {
      j j1 = new j(arrayOfString2[k]);
      j1.e(cf.ExceptionInVPackage(k).d());
      n.ExceptionInVPackage(j1);
    } 
    if (!c(paramArrayOfint)) {
      k = (paramArrayOfint.length - cf.e() - cf.ExceptionPrintstacktrace()) / cf.c();
      cf.ExceptionPrintstacktrace(this.m);
      byte b;
      for (b = 0; b < k; b++) {
        n.ExceptionInVPackage().b(b);
        for (byte b3 = 0; b3 < n.size(); b3++) {
          ce ce = cf.ExceptionInVPackage(arrayOfString1[b3]);
          j j1 = (j)n.get(b3);
          if (ce instanceof cc) {
            cc cc = (cc)ce;
            double d1 = Double.NaN;
            try {
              d1 = ExceptionInVPackage(cc.ExceptionInVPackage(), hashMap, (aI)this.p);
            } catch (ExceptionInAxPackage u) {
              Logger.getLogger(d.class.getName()).log(Level.SEVERE, "Failed to evaluate Expression: '" + cc.ExceptionInVPackage() + "'", (Throwable)u);
            } 
            hashMap.put(arrayOfString1[b3], Double.valueOf(d1));
            j1.b("" + d1);
          } else if (ExceptionInVPackage(hashMap, ce)) {
            double d1 = cf.ExceptionInVPackage(b3, paramArrayOfint, b);
            hashMap.put(arrayOfString1[b3], Double.valueOf(d1));
            j1.b("" + d1);
          } else {
            Double double_ = (Double)hashMap.get(arrayOfString1[b3]);
            if (double_ == null) {
              j1.b("NaN");
            } else {
              j1.b(double_.toString());
            } 
          } 
        } 
      } 
      for (b = 0; b < cf.i(); b++) {
        if (n.ExceptionInVPackage(cf.ExceptionInVPackage(b).ExceptionPrintstacktrace()) != null && cf.ExceptionInVPackage(b).i())
          n.e(cf.ExceptionInVPackage(b).ExceptionPrintstacktrace()); 
      } 
      if (this.s == null || this.h.size() < this.s.p()) {
        this.h.add(n);
      } else {
        D.b("Logger overflow, skipping data set.");
      } 
      if (this.s != null && this.s.p() > 1 && this.s.p() == this.h.size()) {
        n n1 = this.h.get(0);
        for (byte b3 = 1; b3 < this.h.size(); b3++) {
          n n2 = this.h.get(b3);
          String str = n1.ExceptionPrintstacktrace();
          if (n2.ExceptionPrintstacktrace() != null && !n2.ExceptionPrintstacktrace().isEmpty()) {
            str = str + "\n" + n2.ExceptionPrintstacktrace();
            n1.d(str);
          } 
          for (byte b4 = 0; b4 < n1.size(); b4++) {
            j j1 = (j)n1.get(b4);
            j j2 = (j)n2.get(b4);
            for (byte b5 = 0; b5 < j1.i() && b5 < j2.i(); b5++) {
              if (Float.isNaN(j1.d(b5)) && !Float.isNaN(j2.d(b5)))
                j1.b(b5, j2.d(b5)); 
            } 
          } 
        } 
        ExceptionInVPackage(n1);
        this.h.clear();
      } else if (this.s == null || this.s.p() <= 1) {
        ExceptionInVPackage(n);
        this.h.clear();
      } 
    } else {
      b(n);
    } 
  }
  
  private boolean ExceptionInVPackage(HashMap paramHashMap, ce paramce) {
    if (paramce.h() == null || paramce.h().length() == 0)
      return true; 
    try {
      String str = paramce.h();
      double d1 = ExceptionInVPackage(str, paramHashMap, (aI)this.p);
      return (d1 != 0.0D);
    } catch (ExceptionInAxPackage u) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      return true;
    } 
  }
  
  private boolean c(int[] paramArrayOfint) {
    if (paramArrayOfint != null)
      for (byte b = 0; b < paramArrayOfint.length; b++) {
        if (paramArrayOfint[b] != 0)
          return false; 
      }  
    return true;
  }
  
  private void d(int[] paramArrayOfint) {
    cf cf;
    n n = new n();
    try {
      cf = ExceptionPrintstacktrace();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      D.ExceptionInVPackage("Failed to generate Logger Record Definitions: \n" + ExceptionPrintstacktrace.getMessage(), (Exception)ExceptionPrintstacktrace, null);
      return;
    } 
    for (byte b1 = 0; b1 < cf.f(); b1++) {
      ce ce = cf.b(b1);
      if (ce.b().equals(c.ExceptionInVPackage)) {
        this.m = (int)cf.ExceptionInVPackage(b1, paramArrayOfint);
      } else if (ce.b().equals(c.b)) {
        this.m = (int)cf.ExceptionInVPackage(b1, paramArrayOfint) + cf.c();
      } else if (ce.b().equals(c.c)) {
        int k = (int)cf.ExceptionInVPackage(b1, paramArrayOfint);
        if (k == 1) {
          this.n = 100.0D;
        } else {
          this.n = 1.0D;
        } 
      } 
    } 
    if (cf.d() > 0) {
      String str1 = "";
      for (byte b = 0; b < cf.d(); b++) {
        ce ce = cf.c(b);
        str1 = str1 + ce.ExceptionPrintstacktrace() + "(" + ce.d() + ") = " + cf.b(b, paramArrayOfint);
        if (b + 1 < cf.d())
          str1 = str1 + "; "; 
      } 
      n.d(str1);
    } 
    String[] arrayOfString1 = cf.b();
    String[] arrayOfString2 = cf.ExceptionInVPackage();
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (byte b2 = 0; b2 < arrayOfString1.length; b2++)
      hashMap.put(arrayOfString2[b2], Double.valueOf(Double.NaN)); 
    String str = null;
    j j1 = null;
    for (byte b3 = 0; b3 < arrayOfString1.length; b3++) {
      j j3 = new j(arrayOfString1[b3]);
      j3.e(cf.ExceptionInVPackage(b3).d());
      n.ExceptionInVPackage(j3);
      if (arrayOfString1[b3].contains("ToothTime") || arrayOfString1[b3].contains("TriggerTime")) {
        str = arrayOfString1[b3];
        j1 = j3;
      } 
    } 
    j j2 = n.ExceptionInVPackage("Time");
    boolean bool = false;
    if (str != null && j2 == null) {
      j2 = new j("Time");
      j2.e(j1.n());
      n.ExceptionInVPackage(j2);
    } else {
      bool = true;
    } 
    if (!c(paramArrayOfint)) {
      int k = (paramArrayOfint.length - cf.e() - cf.ExceptionPrintstacktrace()) / cf.c();
      cf.ExceptionPrintstacktrace(this.m);
      byte b;
      for (b = 0; b < k; b++) {
        for (byte b4 = 0; b4 < n.size(); b4++) {
          j j3 = (j)n.get(b4);
          if (!bool && j3.ExceptionInVPackage().equals(j2.ExceptionInVPackage())) {
            if (b > 0) {
              this.B = (j1.c(b) + j2.c(b - 1));
              hashMap.put(j3.ExceptionInVPackage(), Double.valueOf(this.B));
              j3.ExceptionInVPackage((float)this.B);
            } else {
              double d1 = j1.c(b) * this.n + this.B;
              hashMap.put(j3.ExceptionInVPackage(), Double.valueOf(d1));
              j3.ExceptionInVPackage((float)d1);
            } 
          } else {
            if (b == 1 && j3.ExceptionInVPackage().equals("PriLevel")) {
              j3.e(Float.MIN_VALUE);
              j3.d(Float.MAX_VALUE);
            } 
            ce ce = cf.ExceptionInVPackage(arrayOfString2[b4]);
            if (ce instanceof cc) {
              cc cc = (cc)ce;
              double d1 = Double.NaN;
              try {
                d1 = ExceptionInVPackage(cc.ExceptionInVPackage(), hashMap, (aI)this.p);
              } catch (ExceptionInAxPackage u) {
                String str1 = "Failed to evaluate Expression: '" + cc.ExceptionInVPackage() + "'";
                Logger.getLogger(d.class.getName()).log(Level.SEVERE, str1, (Throwable)u);
                n.d(str1);
                ExceptionInVPackage(n);
                return;
              } 
              hashMap.put(arrayOfString2[b4], Double.valueOf(d1));
              j3.ExceptionInVPackage((float)d1);
            } else if (j3.ExceptionInVPackage().equals(str)) {
              double d1 = cf.ExceptionInVPackage(b4, paramArrayOfint, b) * this.n;
              hashMap.put(arrayOfString2[b4], Double.valueOf(d1));
              j3.ExceptionInVPackage((float)d1);
            } else if (ExceptionInVPackage(hashMap, ce)) {
              double d1 = cf.ExceptionInVPackage(b4, paramArrayOfint, b);
              hashMap.put(arrayOfString2[b4], Double.valueOf(d1));
              j3.b("" + d1);
            } else {
              Double double_ = (Double)hashMap.get(arrayOfString2[b4]);
              if (double_ == null) {
                j3.ExceptionInVPackage(Float.NaN);
              } else {
                j3.ExceptionInVPackage(double_.floatValue());
              } 
            } 
          } 
        } 
      } 
      for (b = 0; b < cf.i(); b++) {
        if (n.ExceptionInVPackage(cf.ExceptionInVPackage(b).ExceptionPrintstacktrace()) != null && cf.ExceptionInVPackage(b).i() && n.e(cf.ExceptionInVPackage(b).ExceptionPrintstacktrace()))
          b--; 
      } 
      ExceptionInVPackage(n);
    } else {
      b(n);
    } 
  }
  
  private void ExceptionInVPackage(n paramn) {
    Iterator<b> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      try {
        ((b)iterator.next()).ExceptionInVPackage(paramn);
      } catch (Exception exception) {
        D.b("Caught Exception Notifying LoggerDataListener, continuing");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void b(n paramn) {
    Iterator<b> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      try {
        ((b)iterator.next()).b(paramn);
      } catch (Exception exception) {
        D.b("Caught Exception Notifying LoggerDataListener, continuing");
        exception.printStackTrace();
      } 
    } 
  }
  
  public void ExceptionInVPackage(b paramb) {
    this.f.add(paramb);
  }
  
  public void f(String paramString) {
    this.w = paramString;
  }
  
  public void ExceptionInVPackage(int paramInt) {
    this.x = paramInt;
  }
  
  public void b(int paramInt) {
    this.y = paramInt;
  }
  
  public void ExceptionPrintstacktrace(String paramString) {
    if (paramString == null) {
      this.z = paramString;
      e(null);
      return;
    } 
    String[] arrayOfString = i.e(paramString, (aI)i());
    if (arrayOfString == null || arrayOfString.length == 0)
      throw new ExceptionInVPackage("Invalid Logger Read Condition:\nThe expression must contain at least 1 valid OutputChannel:\n" + paramString); 
    e(arrayOfString[0]);
    this.z = paramString;
  }
  
  public cf ExceptionPrintstacktrace() {
    return (this.s == null) ? null : this.s.b();
  }
  
  public void ExceptionInVPackage(cd paramcd) {
    this.s = paramcd;
    this.t.clear();
  }
  
  public cd h() {
    return this.s;
  }
  
  public R i() {
    return this.p;
  }
  
  public void ExceptionInVPackage(R paramR) {
    this.p = paramR;
    this.t.clear();
  }
  
  public void c(int paramInt) {
    this.E = paramInt;
  }
  
  public double ExceptionInVPackage(String paramString, HashMap paramHashMap, aI paramaI) {
    k k = (k)this.t.get(paramString);
    if (k == null) {
      k = new k(paramaI);
      k.ExceptionInVPackage(paramString);
      this.t.put(paramString, k);
    } 
    String[] arrayOfString = k.ExceptionInVPackage();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (paramHashMap.get(arrayOfString[b]) != null) {
        double d1 = ((Double)paramHashMap.get(arrayOfString[b])).doubleValue();
        k.ExceptionInVPackage(arrayOfString[b], d1);
      } else {
        try {
          double d1 = i.b(arrayOfString[b], paramaI);
          k.ExceptionInVPackage(arrayOfString[b], d1);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          throw new ExceptionInAxPackage(ExceptionPrintstacktrace.getMessage());
        } 
      } 
    } 
    return k.d();
  }
  
  public void j() {
    if (this.D == null || !this.D.isAlive()) {
      this.D = new j(this);
      this.D.start();
    } 
    this.D.ExceptionInVPackage();
  }
  
  private void k() {
    if (this.c != null) {
      byte[][] arrayOfByte = this.c;
      for (byte b = 0; b < arrayOfByte.length; b++) {
        byte[] arrayOfByte1 = arrayOfByte[b];
        int[] arrayOfInt = new int[arrayOfByte1.length];
        for (byte b1 = 0; b1 < arrayOfInt.length; b1++)
          arrayOfInt[b1] = c.ExceptionInVPackage(arrayOfByte1[b1]); 
        m m = m.ExceptionInVPackage(arrayOfInt);
        m.i(150);
        m.e(true);
        m.h(i().O());
        m.b(new ExceptionPrintstacktrace(this));
        o o = this.u.ExceptionInVPackage(i(), m, 2000);
        if (o.ExceptionInVPackage() != 1)
          aB.ExceptionInVPackage().ExceptionInVPackage("Logger Stop Command failed."); 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */