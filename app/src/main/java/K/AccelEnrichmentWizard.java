package K;

import G.R;
import G.GInterfaceAc;
import G.Manager;
import G.Abstract;
import G.CloneableImplInGPackage;
import G.GComponentBq;
import G.GInterfaceBr;
import G.GComponentBs;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.c;
import G.GInterfaceDb;

public class AccelEnrichmentWizard extends ArrayListExceptionprintstacktraceInGPackage {
  private String a = "";
  
  private R f = null;
  
  public AccelEnrichmentWizard(R paramR, int paramInt, boolean paramBoolean) {
    if (paramInt > 0)
      this.a = paramInt + ""; 
    this.f = paramR;
    s("Accel Enrichment Wizard");
    Manager aM1 = paramR.c(GInterfaceAc.h + this.a);
    Manager aM2 = paramR.c(GInterfaceAc.i + this.a);
    Manager aM3 = paramR.c(GInterfaceAc.s + this.a);
    Manager aM4 = paramR.c(GInterfaceAc.t + this.a);
    Manager aM5 = paramR.c(GInterfaceAc.r + this.a);
    Manager aM6 = paramR.c(GInterfaceAc.u + this.a);
    ArrayListExceptionprintstacktraceInGPackage bv1 = new ArrayListExceptionprintstacktraceInGPackage();
    bv1.v("accelCurves");
    bv1.i(0);
    if (aM3 != null && aM4 != null) {
      CloneableImplInGPackage CloneableImplInGPackage = new CloneableImplInGPackage();
      CloneableImplInGPackage.s("MAP Based AE");
      CloneableImplInGPackage.v("mapDotCurve");
      CloneableImplInGPackage.c(aM3.aL());
      CloneableImplInGPackage.a(aM4.aL());
      CloneableImplInGPackage.g(aM4.b());
      CloneableImplInGPackage.h(aM3.b() + 2);
      CloneableImplInGPackage.a((GInterfaceDb)new c("PW Adder"));
      CloneableImplInGPackage.c((GInterfaceDb)new c("Rate"));
      CloneableImplInGPackage.d(500.0D);
      CloneableImplInGPackage.c(aM3.r());
      CloneableImplInGPackage.b(true);
      if (aM4.s() > 20.0D) {
        CloneableImplInGPackage.b(20.0D);
      } else {
        CloneableImplInGPackage.b(aM4.s());
      } 
      CloneableImplInGPackage.a(aM4.r());
      CloneableImplInGPackage.d(GInterfaceAc.v);
      if (aM1 != null) {
        CloneableImplInGPackage.u("mapProportion" + this.a + " > 0");
      } else if (aM2 != null) {
        CloneableImplInGPackage.u("tpsProportion" + this.a + " <100");
      } 
      bv1.a((ArrayListExceptionprintstacktraceInGPackage)CloneableImplInGPackage);
    } 
    double d = 30.0D;
    if (aM5 != null && aM6 != null) {
      CloneableImplInGPackage CloneableImplInGPackage = new CloneableImplInGPackage();
      CloneableImplInGPackage.s("TPS Based AE");
      CloneableImplInGPackage.v("tpsDotCurve");
      CloneableImplInGPackage.c(aM5.aL());
      CloneableImplInGPackage.a(aM6.aL());
      CloneableImplInGPackage.g(aM6.b());
      CloneableImplInGPackage.h(aM5.b() + 2);
      CloneableImplInGPackage.a((GInterfaceDb)new c("PW Adder"));
      CloneableImplInGPackage.c((GInterfaceDb)new c("Rate"));
      CloneableImplInGPackage.b(true);
      if (aM5.s() > 2000.0D) {
        CloneableImplInGPackage.d(2000.0D);
        d = 2000.0D;
      } else {
        CloneableImplInGPackage.d(aM5.s());
      } 
      CloneableImplInGPackage.c(aM5.r());
      if (aM6.s() > 20.0D) {
        CloneableImplInGPackage.b(20.0D);
      } else {
        CloneableImplInGPackage.b(aM6.s());
      } 
      CloneableImplInGPackage.a(aM6.r());
      CloneableImplInGPackage.d(GInterfaceAc.w);
      if (aM3 == null || aM4 == null)
        CloneableImplInGPackage.c(true); 
      if (aM2 != null) {
        CloneableImplInGPackage.u("tpsProportion" + this.a + " > 0");
      } else if (aM1 != null) {
        CloneableImplInGPackage.u("mapProportion" + this.a + " == 0");
      } 
      bv1.a((ArrayListExceptionprintstacktraceInGPackage)CloneableImplInGPackage);
    } 
    a(bv1);
    ArrayListExceptionprintstacktraceInGPackage bv2 = new ArrayListExceptionprintstacktraceInGPackage();
    bv2.i(0);
    if (aM1 != null) {
      GComponentBq bq1 = new GComponentBq();
      bq1.e("Throttle Position vs Manifold Pressure Accel Enrichment Strategy");
      bq1.b(aM1.aL());
      bq1.c(true);
      bv2.a((Abstract)bq1);
    } 
    if (aM2 != null) {
      GComponentBq bq1 = new GComponentBq();
      bq1.e("Throttle Position vs Manifold Pressure Accel Enrichment Strategy, Percent TPS Driven");
      bq1.b(aM2.aL());
      bv2.a((Abstract)bq1);
    } 
    a(bv2);
    if (paramBoolean) {
      GInterfaceBr GInterfaceBr = new GInterfaceBr();
      GComponentBs GComponentBs = new GComponentBs();
      GComponentBs.a(GInterfaceAc.v);
      GComponentBs.a(0.0D);
      GComponentBs.b(100.0D);
      GComponentBs.b("kPa/s");
      GComponentBs.b(true);
      GComponentBs.a(false);
      GComponentBs.a(0.0D);
      GInterfaceBr.a(GComponentBs);
      GComponentBs = new GComponentBs();
      GComponentBs.a(GInterfaceAc.w);
      GComponentBs.a(0.0D);
      GComponentBs.b(10.0D);
      GComponentBs.b(true);
      GComponentBs.a(true);
      if (aM5 != null)
        GComponentBs.b(aM5.p()); 
      GInterfaceBr.a(GComponentBs);
      if (paramR.g(GInterfaceAc.y) != null) {
        GComponentBs = new GComponentBs();
        GComponentBs.a(GInterfaceAc.y);
        GInterfaceBr.a(GComponentBs);
      } else if (paramR.g(GInterfaceAc.y + "1") != null) {
        GComponentBs = new GComponentBs();
        GComponentBs.a(GInterfaceAc.y + "1");
        GInterfaceBr.a(GComponentBs);
      } else {
        GComponentBs = new GComponentBs();
        GComponentBs.a(GInterfaceAc.x);
        GInterfaceBr.a(GComponentBs);
      } 
      a((ArrayListExceptionprintstacktraceInGPackage)GInterfaceBr);
    } 
    ArrayListExceptionprintstacktraceInGPackage bv3 = new ArrayListExceptionprintstacktraceInGPackage();
    bv3.i(0);
    ArrayListExceptionprintstacktraceInGPackage bv4 = new ArrayListExceptionprintstacktraceInGPackage();
    bv4.s(" ");
    GComponentBq GComponentBq = null;
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.o + this.a);
    GComponentBq.e("MAPdot Threshold");
    bv4.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.l + this.a);
    GComponentBq.e("Accel Time");
    bv4.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.q + this.a);
    GComponentBq.e("Accel Taper Time");
    bv4.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.p + this.a);
    GComponentBq.e("End Pulsewidth");
    bv4.a((Abstract)GComponentBq);
    bv3.a(bv4);
    ArrayListExceptionprintstacktraceInGPackage bv5 = new ArrayListExceptionprintstacktraceInGPackage();
    bv5.s(" ");
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.k + this.a);
    GComponentBq.e("TPSdot Threshold");
    bv5.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.m + this.a);
    GComponentBq.e("Decel Fuel Amount");
    bv5.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.j + this.a);
    GComponentBq.e("Cold Accel Enrichment");
    bv5.a((Abstract)GComponentBq);
    GComponentBq = new GComponentBq();
    GComponentBq.b(GInterfaceAc.n + this.a);
    GComponentBq.e("Cold Accel Multiplier");
    bv5.a((Abstract)GComponentBq);
    bv3.a(bv5);
    a(bv3);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */