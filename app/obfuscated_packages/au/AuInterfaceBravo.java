package au;

import G.cd;
import G.ce;
import G.cf;
import V.ExceptionPrintstacktrace;
import aO.AoInterfaceJuliet;
import bH.D;
import java.util.ArrayList;

public class AuInterfaceBravo implements AoInterfaceJuliet {
  public static String a = "NextAddress";
  
  public static String b = "LastAddress";
  
  public static String c = "Units";
  
  public ArrayList a(String paramString) {
    ArrayList<cd> arrayList = new ArrayList();
    arrayList.add(a(a(), paramString));
    arrayList.add(a(b(), paramString));
    arrayList.add(a(d(), paramString));
    arrayList.add(a(c(), paramString));
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
    cd.d("r\\x00\\xf2\\x00\\x00\\x04\\x00");
    cd.a(10000);
    cf cf = new cf();
    cf.d(3);
    cf.f(1);
    ce ce = new ce();
    ce.b("PriLevel");
    ce.a(1, 22);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("SecLevel");
    ce.a(1, 23);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("Trigger");
    ce.a(1, 21);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("Sync");
    ce.a(1, 20);
    ce.c("Flag");
    cf.a(ce);
    ce = new ce();
    ce.b("ToothTime");
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
    cd.d("r\\x00\\xf3\\x00\\x00\\x04\\x00");
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
    cd.d("r\\x00\\xf1\\x00\\x00\\x04\\x00");
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
    cd.d("r\\x00\\xf0\\x00\\x00\\x04\\x00");
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
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/au/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */