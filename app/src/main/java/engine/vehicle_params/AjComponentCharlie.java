package aj;

import G.GComponentCd;
import G.GComponentCe;
import G.GComponentCf;
import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.ArrayList;

public class AjComponentCharlie {
  public static String a = "NextAddress";

  public static String b = "LastAddress";

  public static String c = "Units";

  public ArrayList a(R paramR) {
    ArrayList<GComponentCd> arrayList = new ArrayList();
    String str = paramR.i();
    if (paramR.z()) {
      if (paramR.m(GComponentCd.e)) {
        GComponentCd GComponentCd = a();
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.f)) {
        GComponentCd GComponentCd = a();
        a(GComponentCd);
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.ExceptionPrintstacktrace)) {
        GComponentCd GComponentCd = b();
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.h)) {
        GComponentCd GComponentCd = b();
        a(GComponentCd);
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.i)) {
        GComponentCd GComponentCd = d();
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.j)) {
        GComponentCd GComponentCd = d();
        a(GComponentCd);
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.k)) {
        GComponentCd GComponentCd = c();
        arrayList.add(GComponentCd);
      }
      if (paramR.m(GComponentCd.l)) {
        GComponentCd GComponentCd = c();
        a(GComponentCd);
        arrayList.add(GComponentCd);
      }
    } else {
      if (str.startsWith("MS2Extra Rel 2.1")
          || str.startsWith("MS2Extra Ser")
          || str.startsWith("MS2Extra serial")
          || str.startsWith("MS3")
          || str.startsWith("MS2Extra 3")
          || str.startsWith("MS2Extra comms")
          || str.startsWith("MS2Extra Rel 3")) {
        arrayList.add(a(a(), str));
        arrayList.add(a(b(), str));
      }
      if (str.startsWith("MS2Extra Rel 2")
          || str.startsWith("MS2Extra Ser")
          || str.startsWith("MS3")
          || str.startsWith("MS2Extra 3")
          || str.startsWith("MS2Extra comms")
          || str.startsWith("MS2Extra Rel 3")) {
        arrayList.add(a(d(), str));
        arrayList.add(a(c(), str));
      }
      if (str.startsWith("MSnS-extra")
          || str.startsWith("MS1/Extra")
          || str.startsWith("MS/Extra")) {
        arrayList.add(e());
        arrayList.add(f());
      }
    }
    return arrayList;
  }

  private GComponentCd a(GComponentCd paramcd, String paramString) {
    if (paramString.startsWith("MS3")) a(paramcd);
    return paramcd;
  }

  private GComponentCd a(GComponentCd paramcd) {
    int i = paramcd.b().b("ToothTime");
    i = (i == -1) ? paramcd.b().b("TriggerTime") : i;
    if (i == -1) {
      D.b("Did not find Time Column, not adjusting scalar");
      return paramcd;
    }
    GComponentCe GComponentCe = paramcd.b().a(i);
    GComponentCe.a(0.001D);
    return paramcd;
  }

  public GComponentCd a() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.a);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.b("( status3 & 0x02 ) == 0x02");
    GComponentCd.c("Composite Logger");
    GComponentCd.d("r\\$tsCanId\\xf2\\x00\\x00\\x04\\x00");
    GComponentCd.a(10000);
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(3);
    GComponentCf.f(1);
    GComponentCe GComponentCe = new GComponentCe();
    GComponentCe.b("PriLevel");
    GComponentCe.d("PriLevel");
    GComponentCe.a(1, 22);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("SecLevel");
    GComponentCe.d("SecLevel");
    GComponentCe.a(1, 23);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("Trigger");
    GComponentCe.d("Trigger");
    GComponentCe.a(1, 21);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("Sync");
    GComponentCe.d("Sync");
    GComponentCe.a(1, 20);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("ToothTime");
    GComponentCe.d("ToothTime");
    GComponentCe.a(6.6E-4D);
    GComponentCe.a(20, 0);
    GComponentCe.b(524287);
    GComponentCe.c("ms");
    GComponentCf.a(GComponentCe);
    GComponentCd.a(GComponentCf);
    return GComponentCd;
  }

  public GComponentCd b() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.a);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.b("( status3 & 0x02 ) == 0x02");
    GComponentCd.c("Sync Error Logger");
    GComponentCd.d("r\\$tsCanId\\xf3\\x00\\x00\\x04\\x00");
    GComponentCd.a(1000000000);
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(3);
    GComponentCf.f(1);
    GComponentCe ce1 = new GComponentCe();
    ce1.b("PriLevel");
    ce1.a(1, 22);
    ce1.c("Flag");
    GComponentCf.a(ce1);
    ce1 = new GComponentCe();
    ce1.b("SecLevel");
    ce1.a(1, 23);
    ce1.c("Flag");
    GComponentCf.a(ce1);
    ce1 = new GComponentCe();
    ce1.b("Trigger");
    ce1.a(1, 21);
    ce1.c("Flag");
    GComponentCf.a(ce1);
    ce1 = new GComponentCe();
    ce1.b("Sync");
    ce1.a(1, 20);
    ce1.c("Flag");
    GComponentCf.a(ce1);
    ce1 = new GComponentCe();
    ce1.b("ToothTime");
    ce1.a(6.6E-4D);
    ce1.a(20, 0);
    ce1.c("ms");
    GComponentCf.a(ce1);
    GComponentCe ce2 = new GComponentCe();
    ce2.b(b);
    ce2.a(1.0D);
    ce2.a(1021);
    ce2.a(16, 0);
    GComponentCf.b(ce2);
    GComponentCd.a(GComponentCf);
    return GComponentCd;
  }

  public GComponentCd c() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.c);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.c("Trigger Logger");
    GComponentCd.d("r\\$tsCanId\\xf1\\x00\\x00\\x04\\x00");
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(3);
    GComponentCf.f(1);
    GComponentCe GComponentCe = new GComponentCe();
    GComponentCe = new GComponentCe();
    GComponentCe.b("TriggerTime");
    GComponentCe.a(6.6E-4D);
    GComponentCe.a(20, 0);
    GComponentCe.c("ms");
    GComponentCf.a(GComponentCe);
    GComponentCd.a(GComponentCf);
    return GComponentCd;
  }

  public GComponentCd d() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.c("Tooth Logger");
    GComponentCd.d("r\\$tsCanId\\xf0\\x00\\x00\\x04\\x00");
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(3);
    GComponentCf.f(1);
    GComponentCe GComponentCe = new GComponentCe();
    GComponentCe = new GComponentCe();
    GComponentCe.b("ToothTime");
    GComponentCe.a(6.6E-4D);
    GComponentCe.a(20, 0);
    GComponentCe.c("ms");
    GComponentCf.a(GComponentCe);
    GComponentCd.a(GComponentCf);
    return GComponentCd;
  }

  public GComponentCd e() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.c("Tooth Logger");
    GComponentCd.b(9);
    GComponentCd.d("V");
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(2);
    GComponentCe ce1 = new GComponentCe();
    ce1.b("ToothTime");
    ce1.a(1.0D);
    ce1.a(16, 0);
    ce1.c("us");
    GComponentCf.a(ce1);
    GComponentCd.a(GComponentCf);
    GComponentCf.f(2);
    GComponentCe ce2 = new GComponentCe();
    ce2.b(a);
    ce2.a(1.0D);
    ce2.a(187);
    ce2.a(8, 0);
    GComponentCf.b(ce2);
    ce2 = new GComponentCe();
    ce2.b(c);
    ce2.a(1.0D);
    ce2.a(188);
    ce2.a(8, 0);
    GComponentCf.b(ce2);
    return GComponentCd;
  }

  public GComponentCd f() {
    GComponentCd GComponentCd = new GComponentCd();
    try {
      GComponentCd.a(GComponentCd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    }
    GComponentCd.c("Trigger Logger");
    GComponentCd.b(10);
    GComponentCd.d("V");
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(2);
    GComponentCf.f(2);
    GComponentCe ce1 = new GComponentCe();
    ce1 = new GComponentCe();
    ce1.b("TriggerTime");
    ce1.a(1.0D);
    ce1.a(16, 0);
    ce1.c("us");
    GComponentCf.a(ce1);
    GComponentCd.a(GComponentCf);
    GComponentCe ce2 = new GComponentCe();
    ce2.b(a);
    ce2.a(1.0D);
    ce2.a(187);
    ce2.a(8, 0);
    GComponentCf.b(ce2);
    ce2 = new GComponentCe();
    ce2.b(c);
    ce2.a(1.0D);
    ce2.a(188);
    ce2.a(8, 0);
    GComponentCf.b(ce2);
    return GComponentCd;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
