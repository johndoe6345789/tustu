package ExceptionInDPackage;

import G.R;
import G.T;
import G.i;
import L.ab;
import V.ExceptionPrintstacktrace;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import java.util.Properties;

public class EComponentFoxtrot implements DComponentCharlie {
  public static String a = "ecuConfigName";

  String b = null;

  String[] DComponentCharlie =
      new String[] {
        "zeroTo30MPH", "zeroTo60MPH", "zeroTo100MPH", "timeTo60Ft", "timeTo330Ft", "timeTo660Ft",
            "timeTo1320Ft", "timeTo2640Ft", "timeTo5280Ft", "speedAt60Ft",
        "speedAt330Ft", "speedAt660Ft", "speedAt1320Ft", "speedAt5280Ft", "etDistanceFt",
            "zeroTo50KPH", "zeroTo100KPH", "zeroTo150KPH", "zeroTo200KPH", "speedAt2640Ft"
      };

  public String b() {
    return "Reset Speed & Distance Channels";
  }

  public String DComponentCharlie() {
    return "Runtime Values";
  }

  public boolean d() {
    return true;
  }

  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a);
    for (String str1 : this.DComponentCharlie) {
      try {
        i.a(str, str1);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      }
    }
  }

  public String a() {
    return "resetPerformanceChannels";
  }

  public void b(Properties paramProperties) {
    R r;
    String str = paramProperties.getProperty(a);
    if (str == null || str.isEmpty()) {
      r = T.a().DComponentCharlie();
    } else {
      r = T.a().DComponentCharlie(str);
    }
    if (r == null) {
      if (str == null) throw new ExceptionInDPackage("Configuration Name not found: " + str);
      throw new ExceptionInDPackage("No working configuration and no config name requested");
    }
    if (!ab.a().b())
      throw new ExceptionInDPackage("Performance functions are not enabled on this edition");
  }

  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    return new ArrayListExtensionInDPackage();
  }

  public boolean f() {
    return false;
  }

  public boolean ExceptionPrintstacktrace() {
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ExceptionInDPackage/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
