package br;

import G.R;
import G.aF;
import G.aH;
import G.aI;
import G.aM;
import G.be;
import G.cu;
import G.dm;
import G.i;
import V.a;
import V.g;
import bH.D;
import bH.G;
import bH.X;
import bH.p;
import bL.k;
import bL.l;
import bL.p;
import bt.bQ;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class n implements aF, bc {
  dm a = null;
  
  ArrayList b = new ArrayList();
  
  bL.n c = null;
  
  R d = null;
  
  aH e = null;
  
  aH f = null;
  
  aH g = null;
  
  aH h = null;
  
  aH i = null;
  
  aH j = null;
  
  private aH m = null;
  
  private int n = 0;
  
  private int o = 0;
  
  private s p = null;
  
  private s q = null;
  
  private s r = null;
  
  private s s = null;
  
  private String t = "";
  
  o k = null;
  
  private long u = 0L;
  
  private int v = 40;
  
  p l = new p(this);
  
  protected n(R paramR, dm paramdm, String paramString, c paramc) {
    this.a = paramdm;
    this.d = paramR;
    try {
      this.p = bQ.a().a(paramR, paramString, "", paramString);
      this.q = bQ.a().a(paramR, paramString, "veAnalyze_", paramString);
      this.r = a(paramR, paramdm);
      this.s = bQ.a().a(this.p, paramString);
      this.q.a(this.r, paramc);
      this.k = new o(this, this.q, this.r);
      this.r.addTableModelListener(this.k);
      this.c = new bL.n(g(), h(), i(), j(), paramc);
      this.c.a(paramdm.o());
      ArrayList arrayList = e.a().a(paramR, this.a);
      Iterator<k> iterator = arrayList.iterator();
      while (iterator.hasNext())
        a(iterator.next()); 
    } catch (g g) {
      g.printStackTrace();
      throw new a(g.getMessage());
    } 
    if (paramdm.f() != null && !paramdm.f().equals(""))
      this.j = paramR.g(paramdm.f()); 
    this.i = paramR.g(paramdm.e());
    if (this.i == null)
      throw new a("VE Analyze can not locate OutputChannel:" + paramdm.e() + " in the current Configuration."); 
    this.e = paramR.g(paramdm.g());
    if (this.e == null)
      throw new a("VE Analyze can not locate OutputChannel:" + paramdm.g() + " in the current Configuration."); 
    this.f = paramR.g(paramdm.h());
    if (this.f == null)
      throw new a("VE Analyze can not locate OutputChannel:" + paramdm.h() + " in the current Configuration."); 
    this.g = paramR.g(paramdm.p());
    if (this.g == null)
      throw new a("VE Analyze can not locate OutputChannel:" + paramdm.p() + " in the current Configuration."); 
    this.h = paramR.g(paramdm.q());
    if (this.h == null)
      throw new a("VE Analyze can not locate OutputChannel:" + paramdm.q() + " in the current Configuration."); 
    this.m = paramR.g(paramdm.r());
    if (this.m == null);
    paramR.C().a(this);
  }
  
  public void a() {
    try {
      this.r = a(this.d, this.a);
      this.c.a(this.r);
      this.q.a(this.r, this.c.f());
    } catch (g g) {
      Logger.getLogger(n.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
  }
  
  private s a(R paramR, dm paramdm) {
    s s1 = bQ.a().a(paramR, paramdm.c(), paramdm.b());
    if (bQ.a().b(paramdm.c()))
      return s1; 
    be be = (be)paramR.e().c(paramdm.c());
    if (be == null)
      return null; 
    aM aM = paramR.c(be.c());
    if (aM.p() != null && aM.p().equalsIgnoreCase("Volts")) {
      s s2 = new s();
      s2.a(s1.getRowCount(), s1.getColumnCount());
      fh.a(s1, s2);
      aH aH1 = paramR.g(paramdm.e());
      if (aH1 == null)
        throw new g("Unable to calculate AFR based on current sensor configuration."); 
      String str = aH1.k();
      for (byte b = 0; b < s2.getRowCount(); b++) {
        for (byte b1 = 0; b1 < s2.getColumnCount(); b1++) {
          double d = s2.d(b, b1).doubleValue();
          int i = (int)Math.round(d * 255.0D / 5.0D);
          String str1 = X.b(str, "egoADC", i + "");
          str1 = X.b(str1, "egoVoltage", d + "");
          str1 = i.c(str1, (aI)paramR);
          try {
            double d1 = G.g(str1);
            s2.setValueAt(Double.valueOf(d1), b, b1);
          } catch (Exception exception) {
            throw new g("Error calculating target AFR with formula:\n" + str + "\nUsing input values of:\n" + str1);
          } 
        } 
      } 
      s2.a(false);
      s1.addTableModelListener(new q(this, str, s2, s1));
      return s2;
    } 
    return s1;
  }
  
  protected boolean a(byte[] paramArrayOfbyte) {
    for (k k : this.b) {
      if (k.a((aI)this.d, paramArrayOfbyte)) {
        this.t = k.a();
        this.o++;
        return true;
      } 
    } 
    this.t = "";
    return false;
  }
  
  public void a(l paraml) {
    this.c.a(paraml);
  }
  
  public void b(l paraml) {
    this.c.b(paraml);
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (!b() || !f() || !paramString.equals(this.d.c()) || System.currentTimeMillis() - this.u < this.v)
      return; 
    p p1 = null;
    if (p1 == null) {
      p1 = new p();
      p1.a(System.currentTimeMillis());
      if (this.j == null)
        p1.c(100.0D); 
    } 
    try {
      if (this.j != null) {
        double d1 = this.j.b(paramArrayOfbyte);
        p1.c(d1);
      } 
      double d = this.e.b(paramArrayOfbyte);
      p1.a(d);
      d = this.f.b(paramArrayOfbyte);
      p1.b(d);
      d = this.g.b(paramArrayOfbyte);
      p1.e(d);
      d = this.h.b(paramArrayOfbyte);
      p1.f(d);
      d = this.i.b(paramArrayOfbyte);
      p1.d(d);
      if (this.m != null) {
        d = this.m.b(paramArrayOfbyte);
        p1.g(d);
      } 
    } catch (g g) {
      g.printStackTrace();
      e();
    } 
    if (p1.f()) {
      p1.a(a(paramArrayOfbyte));
      this.n++;
      this.u = System.currentTimeMillis();
      p1.a(this.u);
      this.c.a(p1);
      p1 = null;
    } 
  }
  
  public void a(k paramk) {
    this.b.add(paramk);
  }
  
  public boolean b() {
    return (this.c != null && this.c.e());
  }
  
  public void c() {
    cu.a().a(this.d.c(), this.i.aL(), this.l);
    cu.a().a(this.d.c(), this.e.aL(), this.l);
    cu.a().a(this.d.c(), this.f.aL(), this.l);
    cu.a().a(this.d.c(), this.g.aL(), this.l);
    cu.a().a(this.d.c(), this.h.aL(), this.l);
    if (this.j != null)
      cu.a().a(this.d.c(), this.j.aL(), this.l); 
    this.c.b();
    a();
    this.c.c();
  }
  
  public void d() {
    this.c.b();
  }
  
  public void e() {
    this.c.d();
    cu.a().a(this.l);
  }
  
  public boolean f() {
    if (this.a.d() == null || this.a.d().equals(""))
      return true; 
    try {
      String str = i.d(this.a.d(), (aI)this.d);
      return p.a(str, this.d);
    } catch (g g) {
      D.c("VE Analyze Live is Unable to evaluate TableActiveCondition :\n\t" + this.a.d() + "\n\tAssuming the table is active");
      return true;
    } catch (Exception exception) {
      D.c("VE Analyze Live is Unable to evaluate TableActiveCondition :\n\t" + this.a.d() + "\n\tAssuming the table is active");
      exception.printStackTrace();
      return true;
    } 
  }
  
  public s g() {
    return this.p;
  }
  
  public s h() {
    return this.q;
  }
  
  public s i() {
    return this.r;
  }
  
  public s j() {
    return this.s;
  }
  
  public String k() {
    return this.t;
  }
  
  public void close() {
    this.r.removeTableModelListener(this.k);
  }
  
  public void a(aH paramaH) {
    this.m = paramaH;
  }
  
  public void a(String paramString) {
    aH aH1 = this.d.g(paramString);
    if (aH1 == null)
      throw new g(paramString + " is not a valid channel in configuration " + this.d.c()); 
    this.i = aH1;
  }
  
  public void b(String paramString) {
    aH aH1 = this.d.g(paramString);
    if (aH1 == null)
      throw new g(paramString + " is no a valid channel in configuration " + this.d.c()); 
    this.j = aH1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */