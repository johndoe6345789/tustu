package K;

import G.R;
import G.aC;
import G.bA;
import G.bm;
import G.bq;
import G.br;
import G.bs;
import G.bv;
import G.c;
import G.db;
import G.t;
import bH.T;

public class i extends bv {
  private String a = "";
  
  private R f = null;
  
  private double[] g = new double[] { -40.0D, -29.0D, -18.0D, -7.0D, 4.0D, 16.0D, 27.0D, 38.0D, 54.0D, 71.0D };
  
  private double[] h = new double[] { -40.0D, -20.0D, 0.0D, 20.0D, 40.0D, 60.0D, 80.0D, 100.0D, 130.0D, 160.0D };
  
  private String[] i = new String[] { "cltGauge" };
  
  public i(R paramR, int paramInt) {
    if (paramInt > 0)
      this.a = paramInt + ""; 
    this.f = paramR;
    boolean bool = t.a(paramR);
    bm bm = new bm();
    bm.a(aC.a + this.a);
    bm.d(aC.A);
    bm.b(240.0D);
    bm.a(0.0D);
    bm.g(13);
    bm.a((db)new c("Enrichment"));
    bm.c((db)new c("Coolant Temp"));
    if (bool) {
      bm.a(this.g);
      bm.d(90.0D);
      bm.c(-50.0D);
    } else {
      bm.a(this.h);
      bm.d(200.0D);
      bm.c(-60.0D);
    } 
    if (paramR.c("tempTable") != null) {
      bm.c("tempTable");
      bm.a(null);
    } 
    bm.h(13);
    bm.a(this.i);
    a((bv)bm);
    br br = new br();
    bs bs = new bs();
    bs.a(aC.B);
    br.a(bs);
    bs = new bs();
    bs.a(aC.z);
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
    bv bv1 = new bv();
    bv1.i(0);
    String str1 = aC.b + this.a;
    String str2 = aC.c + this.a;
    String str3 = aC.d + this.a;
    String str4 = aC.e + this.a;
    if (a(paramR, str1) || a(paramR, str2) || a(paramR, str3) || a(paramR, str4)) {
      bv bv2 = new bv();
      bv2.s("Cranking Pulsewidth");
      if (a(paramR, str1)) {
        bq bq = new bq();
        String str = "Priming Pulse";
        bq.e(str);
        bq.b(str1);
        bv2.a((bA)bq);
      } 
      if (a(paramR, str2)) {
        bq bq = new bq();
        String str = bool ? ("Pulsewidth at -40" + T.a() + "C") : ("Pulsewidth at -40" + T.a() + "F");
        bq.e(str);
        bq.b(str2);
        bv2.a((bA)bq);
      } 
      if (a(paramR, str3)) {
        bq bq = new bq();
        String str = bool ? ("Pulsewidth at 71" + T.a() + "C") : ("Pulsewidth at 160" + T.a() + "F");
        bq.e(str);
        bq.b(str3);
        bv2.a((bA)bq);
      } 
      if (a(paramR, str4)) {
        bq bq = new bq();
        String str = "Flood Clear Threshold";
        bq.e(str);
        bq.b(str4);
        bv2.a((bA)bq);
      } 
      bv1.a(bv2);
    } 
    String str5 = aC.f + this.a;
    String str6 = aC.g + this.a;
    if (a(paramR, str5) || a(paramR, str5)) {
      bv bv2 = new bv();
      bv2.s("Afterstart Enrichment");
      if (a(paramR, str5)) {
        bq bq = new bq();
        String str = "Additive Enrichment";
        bq.e(str);
        bq.b(str5);
        bv2.a((bA)bq);
      } 
      if (a(paramR, str6)) {
        bq bq = new bq();
        String str = "Number of Ignition Cycles";
        bq.e(str);
        bq.b(str6);
        bv2.a((bA)bq);
      } 
      bv1.a(bv2);
    } 
    if (bv1.L())
      a(bv1); 
  }
  
  private boolean a(R paramR, String paramString) {
    return (paramR.c(paramString) != null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/K/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */