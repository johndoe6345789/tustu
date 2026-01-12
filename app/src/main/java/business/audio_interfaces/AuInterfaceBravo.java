package business.audio_interfaces;

import G.GComponentCd;
import G.GComponentCe;
import G.GComponentCf;
import V.ExceptionPrintstacktrace;
import aO.AoInterfaceJuliet;
import bH.D;
import java.util.ArrayList;

public class AuInterfaceBravo implements AoInterfaceJuliet {
  public static String a = "NextAddress";

  public static String b = "LastAddress";

  public static String c = "Units";

  public ArrayList a(String paramString) {
    ArrayList<GComponentCd> arrayList = new ArrayList();
    arrayList.add(a(a(), paramString));
    arrayList.add(a(b(), paramString));
    arrayList.add(a(d(), paramString));
    arrayList.add(a(c(), paramString));
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
    GComponentCd.d("r\\x00\\xf2\\x00\\x00\\x04\\x00");
    GComponentCd.a(10000);
    GComponentCf GComponentCf = new GComponentCf();
    GComponentCf.d(3);
    GComponentCf.f(1);
    GComponentCe GComponentCe = new GComponentCe();
    GComponentCe.b("PriLevel");
    GComponentCe.a(1, 22);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("SecLevel");
    GComponentCe.a(1, 23);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("Trigger");
    GComponentCe.a(1, 21);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("Sync");
    GComponentCe.a(1, 20);
    GComponentCe.c("Flag");
    GComponentCf.a(GComponentCe);
    GComponentCe = new GComponentCe();
    GComponentCe.b("ToothTime");
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
    GComponentCd.d("r\\x00\\xf3\\x00\\x00\\x04\\x00");
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
    GComponentCd.d("r\\x00\\xf1\\x00\\x00\\x04\\x00");
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
    GComponentCd.d("r\\x00\\xf0\\x00\\x00\\x04\\x00");
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
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/au/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
