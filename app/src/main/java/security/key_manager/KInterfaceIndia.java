package K;

import G.Abstract;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.CloneableImplInGPackage;
import G.GComponentBq;
import G.GComponentBs;
import G.GInterfaceAc;
import G.GInterfaceBr;
import G.GInterfaceDb;
import G.R;
import G.c;
import G.t;
import bH.T;

public class KInterfaceIndia extends ArrayListExceptionprintstacktraceInGPackage {
  private String a = "";

  private R f = null;

  private double[] g =
      new double[] {-40.0D, -29.0D, -18.0D, -7.0D, 4.0D, 16.0D, 27.0D, 38.0D, 54.0D, 71.0D};

  private double[] h =
      new double[] {-40.0D, -20.0D, 0.0D, 20.0D, 40.0D, 60.0D, 80.0D, 100.0D, 130.0D, 160.0D};

  private String[] i = new String[] {"cltGauge"};

  public KInterfaceIndia(R paramR, int paramInt) {
    if (paramInt > 0) this.a = paramInt + "";
    this.f = paramR;
    boolean bool = t.a(paramR);
    CloneableImplInGPackage CloneableImplInGPackage = new CloneableImplInGPackage();
    CloneableImplInGPackage.a(GInterfaceAc.a + this.a);
    CloneableImplInGPackage.d(GInterfaceAc.A);
    CloneableImplInGPackage.b(240.0D);
    CloneableImplInGPackage.a(0.0D);
    CloneableImplInGPackage.g(13);
    CloneableImplInGPackage.a((GInterfaceDb) new c("Enrichment"));
    CloneableImplInGPackage.c((GInterfaceDb) new c("Coolant Temp"));
    if (bool) {
      CloneableImplInGPackage.a(this.g);
      CloneableImplInGPackage.d(90.0D);
      CloneableImplInGPackage.c(-50.0D);
    } else {
      CloneableImplInGPackage.a(this.h);
      CloneableImplInGPackage.d(200.0D);
      CloneableImplInGPackage.c(-60.0D);
    }
    if (paramR.c("tempTable") != null) {
      CloneableImplInGPackage.c("tempTable");
      CloneableImplInGPackage.a(null);
    }
    CloneableImplInGPackage.h(13);
    CloneableImplInGPackage.a(this.i);
    a((ArrayListExceptionprintstacktraceInGPackage) CloneableImplInGPackage);
    GInterfaceBr GInterfaceBr = new GInterfaceBr();
    GComponentBs GComponentBs = new GComponentBs();
    GComponentBs.a(GInterfaceAc.B);
    GInterfaceBr.a(GComponentBs);
    GComponentBs = new GComponentBs();
    GComponentBs.a(GInterfaceAc.z);
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
    a((ArrayListExceptionprintstacktraceInGPackage) GInterfaceBr);
    ArrayListExceptionprintstacktraceInGPackage bv1 =
        new ArrayListExceptionprintstacktraceInGPackage();
    bv1.i(0);
    String str1 = GInterfaceAc.b + this.a;
    String str2 = GInterfaceAc.c + this.a;
    String str3 = GInterfaceAc.d + this.a;
    String str4 = GInterfaceAc.e + this.a;
    if (a(paramR, str1) || a(paramR, str2) || a(paramR, str3) || a(paramR, str4)) {
      ArrayListExceptionprintstacktraceInGPackage bv2 =
          new ArrayListExceptionprintstacktraceInGPackage();
      bv2.s("Cranking Pulsewidth");
      if (a(paramR, str1)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str = "Priming Pulse";
        GComponentBq.e(str);
        GComponentBq.b(str1);
        bv2.a((Abstract) GComponentBq);
      }
      if (a(paramR, str2)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str =
            bool ? ("Pulsewidth at -40" + T.a() + "C") : ("Pulsewidth at -40" + T.a() + "F");
        GComponentBq.e(str);
        GComponentBq.b(str2);
        bv2.a((Abstract) GComponentBq);
      }
      if (a(paramR, str3)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str =
            bool ? ("Pulsewidth at 71" + T.a() + "C") : ("Pulsewidth at 160" + T.a() + "F");
        GComponentBq.e(str);
        GComponentBq.b(str3);
        bv2.a((Abstract) GComponentBq);
      }
      if (a(paramR, str4)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str = "Flood Clear Threshold";
        GComponentBq.e(str);
        GComponentBq.b(str4);
        bv2.a((Abstract) GComponentBq);
      }
      bv1.a(bv2);
    }
    String str5 = GInterfaceAc.f + this.a;
    String str6 = GInterfaceAc.g + this.a;
    if (a(paramR, str5) || a(paramR, str5)) {
      ArrayListExceptionprintstacktraceInGPackage bv2 =
          new ArrayListExceptionprintstacktraceInGPackage();
      bv2.s("Afterstart Enrichment");
      if (a(paramR, str5)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str = "Additive Enrichment";
        GComponentBq.e(str);
        GComponentBq.b(str5);
        bv2.a((Abstract) GComponentBq);
      }
      if (a(paramR, str6)) {
        GComponentBq GComponentBq = new GComponentBq();
        String str = "Number of Ignition Cycles";
        GComponentBq.e(str);
        GComponentBq.b(str6);
        bv2.a((Abstract) GComponentBq);
      }
      bv1.a(bv2);
    }
    if (bv1.L()) a(bv1);
  }

  private boolean a(R paramR, String paramString) {
    return (paramR.c(paramString) != null);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
