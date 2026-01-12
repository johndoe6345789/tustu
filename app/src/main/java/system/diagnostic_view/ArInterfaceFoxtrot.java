package aR;

import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ExceptionInDPackage;
import java.util.Properties;

public class ArInterfaceFoxtrot implements DComponentCharlie {
  public static String a = "Warning_Message";

  public static String b = "globalWarning";

  ArrayListExtensionInDPackage DComponentCharlie = null;

  public String a() {
    return b;
  }

  public String b() {
    return "Show a Global Warning";
  }

  public String DComponentCharlie() {
    return "Other Actions";
  }

  public boolean d() {
    return true;
  }

  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null || str.isEmpty()) throw new ExceptionInDPackage(a + " is required");
    aP.f.a().d(str);
  }

  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null || str.isEmpty()) throw new ExceptionInDPackage(a + " is required");
  }

  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    if (this.DComponentCharlie == null) {
      this.DComponentCharlie = new ArrayListExtensionInDPackage();
      DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(a, "");
      DInterfaceIndia.a(1);
      DInterfaceIndia.DComponentCharlie(
          "Set the message you want displayed throughout the application when this User Action is"
              + " triggered.");
      this.DComponentCharlie.a(DInterfaceIndia);
    }
    return this.DComponentCharlie;
  }

  public boolean f() {
    return true;
  }

  public boolean g() {
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
