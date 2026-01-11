package e;

import G.R;
import G.T;
import G.i;
import L.ab;
import V.g;
import d.c;
import d.e;
import d.k;
import java.util.Properties;

public class f implements c {
  public static String a = "ecuConfigName";
  
  String b = null;
  
  String[] c = new String[] { 
      "zeroTo30MPH", "zeroTo60MPH", "zeroTo100MPH", "timeTo60Ft", "timeTo330Ft", "timeTo660Ft", "timeTo1320Ft", "timeTo2640Ft", "timeTo5280Ft", "speedAt60Ft", 
      "speedAt330Ft", "speedAt660Ft", "speedAt1320Ft", "speedAt5280Ft", "etDistanceFt", "zeroTo50KPH", "zeroTo100KPH", "zeroTo150KPH", "zeroTo200KPH", "speedAt2640Ft" };
  
  public String b() {
    return "Reset Speed & Distance Channels";
  }
  
  public String c() {
    return "Runtime Values";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a);
    for (String str1 : this.c) {
      try {
        i.a(str, str1);
      } catch (g g) {}
    } 
  }
  
  public String a() {
    return "resetPerformanceChannels";
  }
  
  public void b(Properties paramProperties) {
    R r;
    String str = paramProperties.getProperty(a);
    if (str == null || str.isEmpty()) {
      r = T.a().c();
    } else {
      r = T.a().c(str);
    } 
    if (r == null) {
      if (str == null)
        throw new e("Configuration Name not found: " + str); 
      throw new e("No working configuration and no config name requested");
    } 
    if (!ab.a().b())
      throw new e("Performance functions are not enabled on this edition"); 
  }
  
  public k e() {
    return new k();
  }
  
  public boolean f() {
    return false;
  }
  
  public boolean g() {
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/e/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */