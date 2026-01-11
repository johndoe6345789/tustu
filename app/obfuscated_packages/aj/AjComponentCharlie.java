package aj;

import G.R;
import G.cd;
import G.ce;
import G.cf;
import V.ExceptionPrintstacktrace;
import bH.D;
import java.util.ArrayList;

public AjComponentCharlielass AjComponentCharlie {
  public static String a = "NextAddress";
  
  public static String b = "LastAddress";
  
  public static String c = "Units";
  
  public ArrayList a(R paramR) {
    ArrayList<cd> arrayList = new ArrayList();
    String str = paramR.i();
    if (paramR.z()) {
      if (paramR.m(cd.e)) {
        cd cd = a();
        arrayList.add(cd);
      } 
      if (paramR.m(cd.f)) {
        cd cd = a();
        a(cd);
        arrayList.add(cd);
      } 
      if (paramR.m(cd.ExceptionPrintstacktrace)) {
        cd cd = b();
        arrayList.add(cd);
      } 
      if (paramR.m(cd.h)) {
        cd cd = b();
        a(cd);
        arrayList.add(cd);
      } 
      if (paramR.m(cd.i)) {
        cd cd = d();
        arrayList.add(cd);
      } 
      if (paramR.m(cd.j)) {
        cd cd = d();
        a(cd);
        arrayList.add(cd);
      } 
      if (paramR.m(cd.k)) {
        cd cd = c();
        arrayList.add(cd);
      } 
      if (paramR.m(cd.l)) {
        cd cd = c();
        a(cd);
        arrayList.add(cd);
      } 
    } else {
      if (str.startsWith("MS2Extra Rel 2.1") || str.startsWith("MS2Extra Ser") || str.startsWith("MS2Extra serial") || str.startsWith("MS3") || str.startsWith("MS2Extra 3") || str.startsWith("MS2Extra comms") || str.startsWith("MS2Extra Rel 3")) {
        arrayList.add(a(a(), str));
        arrayList.add(a(b(), str));
      } 
      if (str.startsWith("MS2Extra Rel 2") || str.startsWith("MS2Extra Ser") || str.startsWith("MS3") || str.startsWith("MS2Extra 3") || str.startsWith("MS2Extra comms") || str.startsWith("MS2Extra Rel 3")) {
        arrayList.add(a(d(), str));
        arrayList.add(a(c(), str));
      } 
      if (str.startsWith("MSnS-extra") || str.startsWith("MS1/Extra") || str.startsWith("MS/Extra")) {
        arrayList.add(e());
        arrayList.add(f());
      } 
    } 
    return arrayList;
  }
  
  private cd a(cd paramcd, String paramString) {
    if (paramString.startsWith("MS3"))
      a(paramcd); 
    return paramcd;
  }
  
  private cd a(cd paramcd) {
    int i = paramcd.b().b("ToothTime");
    i = (i == -1) ? paramcd.b().b("TriggerTime") : i;
    if (i == -1) {
      D.b("Did not find Time Column, not adjusting scalar");
      return paramcd;
    } 
    ce ce = paramcd.b().a(i);
    ce.a(0.001D);
    return paramcd;
  }
  
  public cd a() {
    cd cd = new cd();
    try {
      cd.a(cd.a);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.b("( status3 & 0x02 ) == 0x02");
    cd.c("Composite Logger");
    cd.d("r\\$tsCanId\\xf2\\x00\\x00\\x04\\x00");
    cd.a(10000);
    cf cf = new cf();
    cf.d(3);
    cf.f(1);
    ce ce = new ce();
    ce.b("PriLevel");
    ce.d("PriLevel");
    ce.a(1, 22);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("SecLevel");
    ce.d("SecLevel");
    ce.a(1, 23);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("Trigger");
    ce.d("Trigger");
    ce.a(1, 21);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("Sync");
    ce.d("Sync");
    ce.a(1, 20);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("ToothTime");
    ce.d("ToothTime");
    ce.a(6.6E-4D);
    ce.a(20, 0);
    ce.b(524287);
    ce.c("ms");
    cf.a(ce);
    cd.a(cf);
    return cd;
  }
  
  public cd b() {
    cd cd = new cd();
    try {
      cd.a(cd.a);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.b("( status3 & 0x02 ) == 0x02");
    cd.c("Sync Error Logger");
    cd.d("r\\$tsCanId\\xf3\\x00\\x00\\x04\\x00");
    cd.a(1000000000);
    cf cf = new cf();
    cf.d(3);
    cf.f(1);
    ce ce1 = new ce();
    ce1.b("PriLevel");
    ce1.a(1, 22);
    ce1.c("Flag");
    cf.a(ce1);
    ce1 = new ce();
    ce1.b("SecLevel");
    ce1.a(1, 23);
    ce1.c("Flag");
    cf.a(ce1);
    ce1 = new ce();
    ce1.b("Trigger");
    ce1.a(1, 21);
    ce1.c("Flag");
    cf.a(ce1);
    ce1 = new ce();
    ce1.b("Sync");
    ce1.a(1, 20);
    ce1.c("Flag");
    cf.a(ce1);
    ce1 = new ce();
    ce1.b("ToothTime");
    ce1.a(6.6E-4D);
    ce1.a(20, 0);
    ce1.c("ms");
    cf.a(ce1);
    ce ce2 = new ce();
    ce2.b(b);
    ce2.a(1.0D);
    ce2.a(1021);
    ce2.a(16, 0);
    cf.b(ce2);
    cd.a(cf);
    return cd;
  }
  
  public cd c() {
    cd cd = new cd();
    try {
      cd.a(cd.c);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.c("Trigger Logger");
    cd.d("r\\$tsCanId\\xf1\\x00\\x00\\x04\\x00");
    cf cf = new cf();
    cf.d(3);
    cf.f(1);
    ce ce = new ce();
    ce = new ce();
    ce.b("TriggerTime");
    ce.a(6.6E-4D);
    ce.a(20, 0);
    ce.c("ms");
    cf.a(ce);
    cd.a(cf);
    return cd;
  }
  
  public cd d() {
    cd cd = new cd();
    try {
      cd.a(cd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.c("Tooth Logger");
    cd.d("r\\$tsCanId\\xf0\\x00\\x00\\x04\\x00");
    cf cf = new cf();
    cf.d(3);
    cf.f(1);
    ce ce = new ce();
    ce = new ce();
    ce.b("ToothTime");
    ce.a(6.6E-4D);
    ce.a(20, 0);
    ce.c("ms");
    cf.a(ce);
    cd.a(cf);
    return cd;
  }
  
  public cd e() {
    cd cd = new cd();
    try {
      cd.a(cd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.c("Tooth Logger");
    cd.b(9);
    cd.d("V");
    cf cf = new cf();
    cf.d(2);
    ce ce1 = new ce();
    ce1.b("ToothTime");
    ce1.a(1.0D);
    ce1.a(16, 0);
    ce1.c("us");
    cf.a(ce1);
    cd.a(cf);
    cf.f(2);
    ce ce2 = new ce();
    ce2.b(a);
    ce2.a(1.0D);
    ce2.a(187);
    ce2.a(8, 0);
    cf.b(ce2);
    ce2 = new ce();
    ce2.b(c);
    ce2.a(1.0D);
    ce2.a(188);
    ce2.a(8, 0);
    cf.b(ce2);
    return cd;
  }
  
  public cd f() {
    cd cd = new cd();
    try {
      cd.a(cd.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      D.c(ExceptionPrintstacktrace.getMessage());
    } 
    cd.c("Trigger Logger");
    cd.b(10);
    cd.d("V");
    cf cf = new cf();
    cf.d(2);
    cf.f(2);
    ce ce1 = new ce();
    ce1 = new ce();
    ce1.b("TriggerTime");
    ce1.a(1.0D);
    ce1.a(16, 0);
    ce1.c("us");
    cf.a(ce1);
    cd.a(cf);
    ce ce2 = new ce();
    ce2.b(a);
    ce2.a(1.0D);
    ce2.a(187);
    ce2.a(8, 0);
    cf.b(ce2);
    ce2 = new ce();
    ce2.b(c);
    ce2.a(1.0D);
    ce2.a(188);
    ce2.a(8, 0);
    cf.b(ce2);
    return cd;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */