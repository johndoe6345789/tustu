package aR;

import aP.NInterfaceIndiaImpl;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ExceptionInDPackage;
import java.util.Properties;

public class ArInterfaceVictor implements DComponentCharlie {
  public static String a = "Message";

  public static String b = "passiveMessage";

  ArrayListExtensionInDPackage DComponentCharlie = null;

  public String a() {
    return b;
  }

  public String b() {
    return "Show a Passive Message";
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
    NInterfaceIndiaImpl.a().a(str);
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
          "Set the message you want displayed in the lower toolbar when this User Action is"
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
