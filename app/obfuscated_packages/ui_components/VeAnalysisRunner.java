package ao;

import V.h;
import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.b;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import g.d;
import g.e;
import g.k;
import h.b;
import h.g;
import h.i;
import java.util.ArrayList;

public class hV implements Runnable {
  String a = "O2Corrected";
  
  String b = g.a().a(g.h);
  
  String c = this.a + "|nb.inc";
  
  String d = null;
  
  String e = null;
  
  String f = null;
  
  String g = null;
  
  String h = null;
  
  String i = g.a().a(g.e);
  
  String j = "MAP";
  
  String k = "RPM";
  
  b[][] l = (b[][])null;
  
  c m = new c();
  
  ArrayList n = new ArrayList();
  
  hY o = null;
  
  hY p = null;
  
  s q = null;
  
  s r;
  
  n s = null;
  
  private E[] B = null;
  
  int t = 1;
  
  int u = 2;
  
  Thread v = null;
  
  int w = 0;
  
  boolean x = false;
  
  int y = 5000;
  
  boolean z = i.a(i.aG, i.aH);
  
  j A = null;
  
  public hV() {
    this.e = i.c("DEFINE_CURRENT_CELL_VALUE");
    this.g = i.c("DEFINE_CURRENT_AFR_VALUE");
    this.f = i.c("DEFINE_INTERPOLATED_CELL_VALUE");
    this.h = i.c("DEFINE_AFR_RECORD_OFFSET_VALUE");
  }
  
  public void a(double paramDouble) {
    this.m.f(paramDouble);
  }
  
  public void a(hY paramhY1, hY paramhY2, s params, n paramn, int paramInt, String paramString1, String paramString2, E[] paramArrayOfE) {
    this.o = paramhY1;
    this.p = a(paramhY1);
    this.q = paramhY2;
    this.r = params;
    this.s = paramn;
    a(paramArrayOfE);
    this.t = paramInt;
    this.b = paramString1;
    this.A = null;
    if (this.v != null && this.v.isAlive())
      a(); 
    this.w = 0;
    this.d = "(cellValue*[GEGO_CHANNEL_TAG]/100*[AFR_CHANNEL_TAG+WBafrOffSet]/afrValue)+(cellInterpolated*[GEGO_CHANNEL_TAG]/100*[AFR_CHANNEL_TAG+WBafrOffSet]/afrValue)/2";
    this.d = g.a().c(this.d);
    this.j = paramhY1.v();
    this.k = g.a().a(g.d);
    if (this.e == null)
      throw new h("DEFINE_CURRENT_CELL_VALUE not found in Properties File. Please define in App properties"); 
    if (this.g == null)
      throw new h("DEFINE_CURRENT_AFR_VALUE not found in Properties File. Please define in App properties"); 
    if (this.h == null)
      throw new h("DEFINE_AFR_RECORD_OFFSET_VALUE not found in Properties File. Please define in MSGraph.properties"); 
    if (this.d == null)
      throw new h("formula not found in Properties File. Please define in MSGraph.properties"); 
    if (paramn.a(this.k) == null)
      throw new h("X axis field \"" + this.k + "\" not found in Log File.\nThis Field is required for VE Analyze to work."); 
    if (paramn.a(this.j) == null)
      throw new h("Y axis field \"" + this.j + "\" not found in Log File.\nPlease check to make sure it is available on the graph.\nIf this configuration is Alpha-N activate \"TP ADC\" from the Optional Fields menu.\nThen select \"TP ADC\" from the Options Menu"); 
    if (params == null) {
      this.d = k.a(this.d, this.h, i.a("WBafrOffSet", "2"));
      this.u = Integer.parseInt(i.a("WBafrOffSet", "2"));
    } 
    if (paramn.a(this.i) == null) {
      System.out.println(this.i + " not found, 100 assumed for VE Analysis.");
      this.d = k.a(this.d, "[GEGO_CHANNEL_TAG]", "100");
    } else if (paramn.a(this.i).a(0, paramn.d() - 1, -10.0F, 127.0F) < 50.0D) {
      this.d = k.a(this.d, "[GEGO_CHANNEL_TAG]", "([" + this.i + "]+100)");
    } else {
      this.d = k.a(this.d, "GEGO_CHANNEL_TAG", this.i);
    } 
    if (paramInt == 1) {
      if (paramn.a(paramString1) == null)
        throw new h("Please select WideBand O2 sensor from menu, or use Narrowband mode.\nNote: To use Narrowband the data log must be captured with a narrowband O2 sensor."); 
      if (paramn.a(paramString1).f() == 0.0D)
        throw new h("The selected EGO Sensor does not contain values.\nPlease check your log file."); 
      if (paramString1.toLowerCase().contains("lambda") && (paramhY2 == null || paramhY2.e(0, 0).doubleValue() > 2.5D)) {
        this.d = k.a(this.d, "AFR_CHANNEL_TAG", paramString1);
        this.d = k.a(this.d, "afrValue", "BlaHbLah");
        this.d = k.a(this.d, "BlaHbLah", "(afrValue/14.7)");
      } else if (paramString1.toLowerCase().contains("afr") && (paramhY2 == null || paramhY2.e(0, 0).doubleValue() < 2.5D)) {
        this.d = k.a(this.d, "AFR_CHANNEL_TAG", paramString1);
        this.d = k.a(this.d, "afrValue", "BlaHbLah");
        this.d = k.a(this.d, "BlaHbLah", "(afrValue*14.7)");
      } else {
        this.d = k.a(this.d, "AFR_CHANNEL_TAG", paramString1);
      } 
    } else if (paramInt == 2) {
      this.d = k.a(this.d, "AFR_CHANNEL_TAG", this.c);
    } 
    if (this.q == null && paramInt == 1)
      throw new h("No AFR Table set, only Narrow band is available"); 
    if (this.q == null)
      this.q = paramhY1.e(); 
    this.l = new b[paramhY1.getRowCount()][paramhY1.getColumnCount()];
    b();
  }
  
  private int a(double paramDouble1, double paramDouble2, int paramInt) {
    j j1 = d();
    if (this.r == null || j1 == null)
      return i.b("WBafrOffSet", 2); 
    double d = fh.a(this.r, paramDouble1, paramDouble2) / 1000.0D;
    float f1 = j1.d(paramInt);
    float f2 = f1;
    int i = j1.v();
    for (byte b1 = 0; b1 + paramInt < i; b1++) {
      float f = f2;
      f2 = j1.d(paramInt + b1);
      if ((f2 - f1) > d)
        return (b1 > 0 && Math.abs(f1 - f2) < Math.abs(f1 - f)) ? b1 : (b1 - 1); 
    } 
    return i.b("WBafrOffSet", 2);
  }
  
  private j d() {
    if (this.A == null) {
      this.A = this.s.a(g.a().a("Time"));
      if (this.A == null)
        D.b("No time column for using Lambda Delay Table"); 
    } 
    return this.A;
  }
  
  private double a(n paramn) {
    j j1 = paramn.a(this.b);
    if (j1 == null) {
      String str = "O2 Voltage field " + this.b + " not found in current log,\nThis is required for Narrow Band mode.\n";
      throw new h(str);
    } 
    float[] arrayOfFloat = new float[paramn.d()];
    double d1 = 0.0D;
    double d2 = 0.0D;
    byte b1 = 0;
    byte b2 = 0;
    float f1 = 0.1F;
    float f2 = 0.451F;
    for (byte b3 = 0; b3 < arrayOfFloat.length; b3++) {
      arrayOfFloat[b3] = j1.c(b3);
      boolean bool = false;
      try {
        bool = a(paramn, c(), b3);
        String str = g.a().a(g.f);
        if (!bool && paramn.a(str) != null) {
          double d = paramn.a(str).c(b3);
          bool = (d > 80.0D);
        } 
      } catch (Exception exception) {}
      if (!bool)
        if (arrayOfFloat[b3] < f2 - f1) {
          b2++;
          d2 += arrayOfFloat[b3];
        } else if (arrayOfFloat[b3] > f2 + f1) {
          b1++;
          d1 += arrayOfFloat[b3];
        }  
    } 
    double d3 = f2 - (d2 / b2 + d1 / b1) / 2.0D;
    if (Double.isNaN(d3))
      d3 = 0.0D; 
    D.c("low Average=" + (d2 / b2) + ", High Average=" + (d1 / b1) + ", Offset=" + d3);
    if (paramn.a(this.a) != null)
      paramn.e(this.a); 
    j j2 = new j(this.a);
    paramn.a(j2);
    for (byte b4 = 0; b4 < arrayOfFloat.length; b4++)
      j2.b("" + (arrayOfFloat[b4] + d3)); 
    return d3;
  }
  
  protected hY a(hY paramhY) {
    hY hY1 = new hY();
    hY1.a(paramhY.getRowCount(), paramhY.getColumnCount());
    hY1 = (hY)fh.a(paramhY, hY1);
    hY1.a(paramhY.j());
    hY1.d(paramhY.v());
    hY1.a(paramhY.g());
    b(hY1);
    return hY1;
  }
  
  public void a() {
    if (this.v != null && this.v.isAlive()) {
      this.x = true;
      while (this.x) {
        try {
          Thread.currentThread();
          Thread.sleep(20L);
        } catch (Exception exception) {}
      } 
    } 
  }
  
  private void e() {
    long l = System.currentTimeMillis();
    s s1 = this.q;
    this.l = a(this.l, this.p, s1);
    this.p.c(1);
    int i = this.s.d();
    if (this.t == 2)
      double d = a(this.s); 
    j j1 = this.s.a(this.b);
    String str1 = s1.v();
    String str2 = (str1 == null || str1.isEmpty() || this.s.a(str1) == null) ? this.j : str1;
    this.z = i.a(i.aG, i.aH);
    for (byte b1 = 0; b1 + this.u < i; b1++) {
      if (this.x) {
        this.x = false;
        return;
      } 
      if (a(this.s, c(), b1) || (this.z && j1 != null && j1.e() != j1.f() && j1.c(b1) == j1.e())) {
        this.w++;
      } else {
        if (!b.a().a("advancedVeAnalyze")) {
          String str = "";
          for (byte b2 = 0; b2 < 'Ǵ'; b2++)
            str = str + "S" + b2; 
          if (b1 - this.w >= this.y) {
            f();
            this.w += i - b1;
            break;
          } 
        } 
        float f1 = this.s.a(this.k).c(b1);
        float f2 = this.s.a(this.j).c(b1);
        float f3 = this.s.a(str2).c(b1);
        try {
          double d1 = fh.b(this.o.d(), f1);
          double d2 = this.o.getRowCount() - fh.a(this.o.c(), f2) - 1.0D;
          double d3 = fh.b(s1.b(), f1);
          double d4 = s1.getRowCount() - fh.a(s1.a(), f3) - 1.0D;
          for (byte b2 = 0; b2 < this.o.getRowCount(); b2++)
            a(d1, f1, d2, f2, b2, s1, d4, d3, b1); 
        } catch (Exception exception) {
          exception.printStackTrace();
          throw new h("Error calculating VE values. Debug info written to log file.");
        } 
      } 
      a(this.l, b1 + 1, i);
    } 
    System.out.println("VE Analyze completed in: " + ((System.currentTimeMillis() - l) / 1000.0D) + " s.");
    a(this.l, this.p, this.w);
  }
  
  public void a(double paramDouble1, float paramFloat1, double paramDouble2, float paramFloat2, int paramInt1, s params, double paramDouble3, double paramDouble4, int paramInt2) {
    for (byte b1 = 0; b1 < this.o.getColumnCount(); b1++) {
      if (b1 - paramDouble1 > -1.0D && b1 - paramDouble1 < 1.0D && paramInt1 - paramDouble2 > -1.0D && paramInt1 - paramDouble2 < 1.0D)
        a(paramDouble1, paramFloat1, b1, paramDouble2, paramFloat2, paramInt1, params, paramDouble3, paramDouble4, paramInt2); 
    } 
  }
  
  public void a(double paramDouble1, float paramFloat1, int paramInt1, double paramDouble2, float paramFloat2, int paramInt2, s params, double paramDouble3, double paramDouble4, int paramInt3) {
    double d1 = (paramDouble1 - paramInt1 >= 0.0D) ? Math.abs(paramDouble1 - paramInt1 - 1.0D) : Math.abs(1.0D + paramDouble1 - paramInt1);
    double d2 = (paramDouble2 - paramInt2 >= 0.0D) ? Math.abs(paramDouble2 - paramInt2 - 1.0D) : Math.abs(1.0D + paramDouble2 - paramInt2);
    String str1 = k.a(this.d, this.e, (this.o.e(paramInt2, paramInt1).doubleValue() + this.o.j()) + "");
    if (this.f != null && str1.indexOf(this.f) != -1)
      str1 = k.a(str1, this.f, (this.o.a(paramDouble2, paramDouble1) + this.o.j()) + ""); 
    str1 = k.a(str1, this.g, params.a(paramDouble3, paramDouble4) + "");
    this.u = a(paramFloat1, paramFloat2, paramInt3);
    str1 = k.a(str1, this.h, this.u + "");
    double d3 = (d1 == 0.0D || d2 == 0.0D) ? 0.005D : (d1 * d2);
    str1 = d.a(this.s, str1, paramInt3);
    if (this.o.j() != 0.0D)
      str1 = " ( " + str1 + " ) - " + this.o.j(); 
    String str2 = e.a(this.s, str1, paramInt3);
    this.l[paramInt2][paramInt1].a(new Double(str2), d3);
  }
  
  public void run() {
    try {
      e();
    } catch (h h) {
      a(h);
      h.printStackTrace();
    } 
  }
  
  public boolean a(n paramn, E[] paramArrayOfE, int paramInt) {
    if (paramArrayOfE == null)
      return false; 
    for (byte b1 = 0; b1 < paramArrayOfE.length; b1++) {
      try {
        boolean bool = paramArrayOfE[b1].a(paramn, paramInt);
        if (bool)
          return true; 
      } catch (Exception exception) {
        throw new h("Invalid filter criteria:\n" + paramArrayOfE[b1].toString());
      } 
    } 
    return false;
  }
  
  public b[][] a(b[][] paramArrayOfb, s params1, s params2) {
    double d1 = Double.MIN_VALUE;
    double d2 = Double.MIN_VALUE;
    double d3 = Double.MIN_VALUE;
    double d4 = Double.NaN;
    try {
      d1 = Double.parseDouble(i.a("veAnalysisWeightThreshold", "0.0"));
      System.out.println("weightThreshold set to:" + d1);
    } catch (Exception exception) {
      d1 = 0.0D;
      System.out.println("Error retrieving veAnalysisWeightThreshold from properties file. using 0.0");
    } 
    try {
      d2 = Double.parseDouble(i.a("veAnalysisWindowThreshold", "0.0"));
    } catch (Exception exception) {
      d2 = 0.0D;
      System.out.println("Error retrieving veAnalysisWindowThreshold from properties file. using 0.0");
    } 
    try {
      d3 = Double.parseDouble(i.a("veAnalysisMaxValChange", "50.0"));
    } catch (Exception exception) {
      d2 = 0.0D;
      System.out.println("Error retrieving veAnalysisMaxValChange from properties file. using 50.0");
    } 
    try {
      d4 = Double.parseDouble(i.a("veAnalysisMaxPercentChange", "50.0")) / 100.0D;
    } catch (Exception exception) {
      d2 = 0.0D;
      System.out.println("Error retrieving veAnalysisMaxPercentChange from properties file. Disabling");
    } 
    this.m.c(d2);
    this.m.a(d1);
    this.m.e(d4);
    this.m.d(d3);
    return params1.a(params2, this.m);
  }
  
  public void a(a parama) {
    this.n.add(parama);
  }
  
  private void a(b[][] paramArrayOfb, int paramInt1, int paramInt2) {
    for (a a : this.n)
      a.a(paramArrayOfb, paramInt1, paramInt2); 
  }
  
  private void a(h paramh) {
    for (a a : this.n)
      a.a(paramh); 
  }
  
  private void a(b[][] paramArrayOfb, hY paramhY, int paramInt) {
    for (a a : this.n)
      a.a(paramArrayOfb, paramhY, paramInt); 
  }
  
  private void b(hY paramhY) {
    for (a a : this.n)
      a.a(paramhY); 
  }
  
  public void b() {
    if (this.v == null || !this.v.isAlive()) {
      this.v = new Thread(this);
      this.v.start();
    } 
  }
  
  public E[] c() {
    return this.B;
  }
  
  public void a(E[] paramArrayOfE) {
    this.B = paramArrayOfE;
  }
  
  private void f() {
    String str = "<html><body>The " + b.b + " edition of VE Analyze is limited to " + this.y + " records.<br><br>Only the first " + this.y + " records have been used.<br>The remainder will be included int the Filtered Record Count.<br><br><b>Upgrade to:</b><br> - Set AFR Target Table<br> - Adjust Target AFR Values<br> - Set Limits<br> - Adjust Filters<br> - Process larger files<br> - Process 5 times faster<br></body></html>";
    bV.d(str, null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */