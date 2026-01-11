package e;

import G.R;
import G.T;
import G.aH;
import G.i;
import V.g;
import d.c;
import d.i;
import d.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

public class e implements c {
  public static String a = "outputChannelName";
  
  public static String b = "ecuConfigName";
  
  String c = null;
  
  public String b() {
    return "Reset Runtime Value";
  }
  
  public String c() {
    return "Runtime Values";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str1 = paramProperties.getProperty(b);
    String str2 = paramProperties.getProperty(a, null);
    if (str2 == null)
      throw new d.e(a + " is required"); 
    try {
      i.a(str1, str2);
    } catch (g g) {
      throw new d.e(g.getMessage());
    } 
  }
  
  public String a() {
    return "resetRuntimeValues";
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str1 = paramProperties.getProperty(b);
    String str2 = paramProperties.getProperty(a, null);
    if (str2 == null)
      throw new d.e(a + " is required"); 
    if (str1 == null || str1.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str1);
    } 
    if (r == null) {
      if (str1 == null)
        throw new d.e("Configuration Name not found: " + str1); 
      throw new d.e("No working configuration and no config name requested");
    } 
    aH aH = r.g(str2);
    if (aH == null)
      throw new d.e("OutputChannel not found: " + str2); 
  }
  
  public k e() {
    k k = new k();
    i i = new i(a, null);
    R r = T.a().c();
    if (r != null && (this.c == null || !this.c.equals(r.c()))) {
      this.c = r.c();
      i.a(0);
      ArrayList<String> arrayList1 = new ArrayList();
      Iterator<aH> iterator = r.q();
      while (iterator.hasNext()) {
        aH aH = iterator.next();
        if (aH.s() && aH.w())
          arrayList1.add(aH.aL()); 
      } 
      Collections.sort(arrayList1);
      ArrayList<String> arrayList2 = new ArrayList();
      arrayList2.addAll(arrayList1);
      i.a(arrayList2);
      i.c("Select the Accumulated OutputChannel to Rest the accumulated value.");
    } 
    k.a(i);
    return k;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */