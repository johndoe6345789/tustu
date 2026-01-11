package K;

import G.R;
import G.aC;
import G.aM;
import G.bA;
import G.bm;
import G.bq;
import G.br;
import G.bs;
import G.bv;
import G.c;
import G.db;

public class AccelEnrichmentWizard extends bv {
  private String a = "";
  
  private R f = null;
  
  public AccelEnrichmentWizard(R paramR, int paramInt, boolean paramBoolean) {
    if (paramInt > 0)
      this.a = paramInt + ""; 
    this.f = paramR;
    s("Accel Enrichment Wizard");
    aM aM1 = paramR.c(aC.h + this.a);
    aM aM2 = paramR.c(aC.i + this.a);
    aM aM3 = paramR.c(aC.s + this.a);
    aM aM4 = paramR.c(aC.t + this.a);
    aM aM5 = paramR.c(aC.r + this.a);
    aM aM6 = paramR.c(aC.u + this.a);
    bv bv1 = new bv();
    bv1.v("accelCurves");
    bv1.i(0);
    if (aM3 != null && aM4 != null) {
      bm bm = new bm();
      bm.s("MAP Based AE");
      bm.v("mapDotCurve");
      bm.c(aM3.aL());
      bm.a(aM4.aL());
      bm.g(aM4.b());
      bm.h(aM3.b() + 2);
      bm.a((db)new c("PW Adder"));
      bm.c((db)new c("Rate"));
      bm.d(500.0D);
      bm.c(aM3.r());
      bm.b(true);
      if (aM4.s() > 20.0D) {
        bm.b(20.0D);
      } else {
        bm.b(aM4.s());
      } 
      bm.a(aM4.r());
      bm.d(aC.v);
      if (aM1 != null) {
        bm.u("mapProportion" + this.a + " > 0");
      } else if (aM2 != null) {
        bm.u("tpsProportion" + this.a + " <100");
      } 
      bv1.a((bv)bm);
    } 
    double d = 30.0D;
    if (aM5 != null && aM6 != null) {
      bm bm = new bm();
      bm.s("TPS Based AE");
      bm.v("tpsDotCurve");
      bm.c(aM5.aL());
      bm.a(aM6.aL());
      bm.g(aM6.b());
      bm.h(aM5.b() + 2);
      bm.a((db)new c("PW Adder"));
      bm.c((db)new c("Rate"));
      bm.b(true);
      if (aM5.s() > 2000.0D) {
        bm.d(2000.0D);
        d = 2000.0D;
      } else {
        bm.d(aM5.s());
      } 
      bm.c(aM5.r());
      if (aM6.s() > 20.0D) {
        bm.b(20.0D);
      } else {
        bm.b(aM6.s());
      } 
      bm.a(aM6.r());
      bm.d(aC.w);
      if (aM3 == null || aM4 == null)
        bm.c(true); 
      if (aM2 != null) {
        bm.u("tpsProportion" + this.a + " > 0");
      } else if (aM1 != null) {
        bm.u("mapProportion" + this.a + " == 0");
      } 
      bv1.a((bv)bm);
    } 
    a(bv1);
    bv bv2 = new bv();
    bv2.i(0);
    if (aM1 != null) {
      bq bq1 = new bq();
      bq1.e("Throttle Position vs Manifold Pressure Accel Enrichment Strategy");
      bq1.b(aM1.aL());
      bq1.c(true);
      bv2.a((bA)bq1);
    } 
    if (aM2 != null) {
      bq bq1 = new bq();
      bq1.e("Throttle Position vs Manifold Pressure Accel Enrichment Strategy, Percent TPS Driven");
      bq1.b(aM2.aL());
      bv2.a((bA)bq1);
    } 
    a(bv2);
    if (paramBoolean) {
      br br = new br();
      bs bs = new bs();
      bs.a(aC.v);
      bs.a(0.0D);
      bs.b(100.0D);
      bs.b("kPa/s");
      bs.b(true);
      bs.a(false);
      bs.a(0.0D);
      br.a(bs);
      bs = new bs();
      bs.a(aC.w);
      bs.a(0.0D);
      bs.b(10.0D);
      bs.b(true);
      bs.a(true);
      if (aM5 != null)
        bs.b(aM5.p()); 
      br.a(bs);
      if (paramR.g(aC.y) != null) {
        bs = new bs();
        bs.a(aC.y);
        br.a(bs);
      } else if (paramR.g(aC.y + "1") != null) {
        bs = new bs();
        bs.a(aC.y + "1");
        br.a(bs);
      } else {
        bs = new bs();
        bs.a(aC.x);
        br.a(bs);
      } 
      a((bv)br);
    } 
    bv bv3 = new bv();
    bv3.i(0);
    bv bv4 = new bv();
    bv4.s(" ");
    bq bq = null;
    bq = new bq();
    bq.b(aC.o + this.a);
    bq.e("MAPdot Threshold");
    bv4.a((bA)bq);
    bq = new bq();
    bq.b(aC.l + this.a);
    bq.e("Accel Time");
    bv4.a((bA)bq);
    bq = new bq();
    bq.b(aC.q + this.a);
    bq.e("Accel Taper Time");
    bv4.a((bA)bq);
    bq = new bq();
    bq.b(aC.p + this.a);
    bq.e("End Pulsewidth");
    bv4.a((bA)bq);
    bv3.a(bv4);
    bv bv5 = new bv();
    bv5.s(" ");
    bq = new bq();
    bq.b(aC.k + this.a);
    bq.e("TPSdot Threshold");
    bv5.a((bA)bq);
    bq = new bq();
    bq.b(aC.m + this.a);
    bq.e("Decel Fuel Amount");
    bv5.a((bA)bq);
    bq = new bq();
    bq.b(aC.j + this.a);
    bq.e("Cold Accel Enrichment");
    bv5.a((bA)bq);
    bq = new bq();
    bq.b(aC.n + this.a);
    bq.e("Cold Accel Multiplier");
    bv5.a((bA)bq);
    bv3.a(bv5);
    a(bv3);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */