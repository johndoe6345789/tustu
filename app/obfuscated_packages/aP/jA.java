package aP;

import G.J;
import G.R;
import G.S;
import G.a;
import G.aB;
import G.aD;
import G.aG;
import G.aM;
import G.aR;
import G.ai;
import G.bO;
import G.cB;
import G.cq;
import G.cu;
import H.a;
import H.b;
import V.a;
import aF.a;
import ac.g;
import bH.D;
import bl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import y.a;

public class jA implements S {
  private iH e = new iH();
  
  g a = new g();
  
  jI b = null;
  
  private static jA f = null;
  
  public static boolean c = true;
  
  public static boolean d = true;
  
  private jA() {
    jH jH = new jH(this);
    aB.a().a(jH);
    aB.a().a(jH);
  }
  
  public static jA a() {
    if (f == null)
      f = new jA(); 
    return f;
  }
  
  public void a(R paramR) {}
  
  public void b(R paramR) {
    paramR.C().b(bV.e());
    r.a().b();
  }
  
  public void c(R paramR) {
    paramR.C().a(new jJ(this));
    paramR.C().a((aG)dd.a().b());
    if (d && paramR.C().n(paramR.c()))
      paramR.C().a(new aR(paramR.c())); 
    ArrayList arrayList = a.a(new jH(this)).a(paramR);
    if (arrayList != null) {
      Iterator<bO> iterator = arrayList.iterator();
      while (iterator.hasNext())
        paramR.C().a(iterator.next()); 
    } 
    if (a.a().a(a.cm, "true").equals("false") || !paramR.O().aI())
      paramR.C().b(false); 
    if (a.a().a(a.aB, a.aC).equals("true")) {
      paramR.C();
      J.e(true);
    } 
    int i = a.a().b(a.aD, 0);
    paramR.C().e(i);
    paramR.b(this.e);
    paramR.a(this.e);
    paramR.C().a(new jB(this));
    if (c) {
      paramR.a(new hH());
    } else {
      paramR.a((cB)new a());
    } 
    if (paramR.O().D() == null) {
      a a = new a(paramR);
      paramR.C().a((aD)a);
      paramR.C().a((aG)a);
    } 
    if (a.b.equals(a.as) && paramR.i().length() < 3 && paramR.g("Vbatt") != null) {
      paramR.C().a((aD)new b());
      a a = new a();
      paramR.C().a((ai)a);
      try {
        cu.a().a(paramR.c(), "Vbatt", (cq)a);
      } catch (a a1) {
        D.a("Failed to subscribe OnlineApprover to Vbatt");
      } 
    } 
    if (a.b.equals(a.as) || a.b.equals(a.at)) {
      jC jC = new jC(this);
      paramR.C().a(jC);
    } 
    aM aM = paramR.c("tsCanId");
    if (aM != null)
      try {
        aR.a().a(paramR.c(), "tsCanId", new jG(this));
      } catch (a a) {
        Logger.getLogger(jA.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
      }  
    paramR.C().a((aG)this.a);
    paramR.C().a(bV.e());
  }
  
  private jI c() {
    if (this.b == null || !this.b.isAlive()) {
      this.b = new jI(this);
      this.b.start();
    } 
    return this.b;
  }
  
  public void a(iH paramiH) {
    this.e = paramiH;
  }
  
  public void b() {
    while (this.b != null && !this.b.a.isEmpty()) {
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(jA.class.getName()).log(Level.WARNING, "Not really", interruptedException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */