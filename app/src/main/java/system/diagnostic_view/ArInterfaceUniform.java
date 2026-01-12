package aR;

import aP.NetworkHashMap;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.ExceptionInDPackage;
import java.util.Properties;

public class ArInterfaceUniform implements DComponentCharlie {
  public String b() {
    return "Exit and Shutdown";
  }

  public String DComponentCharlie() {
    return "Dashboard Functions";
  }

  public boolean d() {
    return true;
  }

  public void a(Properties paramProperties) {
    try {
      NetworkHashMap.a().t();
    } catch (Exception exception) {
      throw new ExceptionInDPackage(exception.getLocalizedMessage());
    }
  }

  public String a() {
    return "exitAndShutdown";
  }

  public void b(Properties paramProperties) {}

  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    return null;
  }

  public boolean NetworkHashMap() {
    return false;
  }

  public boolean g() {
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
