package aR;

import V.ExceptionInVPackage;
import aP.NInterfaceIndiaImpl;
import aP.NetworkHashMap;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import bH.D;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import java.util.Properties;
import s.SComponentGolf;

public class ArInterfaceXray implements DComponentCharlie {
  public static String ExceptionInVPackage = "silent";

  public String b() {
    return SComponentGolf.b("Start Data Logging");
  }

  public String DComponentCharlie() {
    return "Data Logging";
  }

  public boolean d() {
    return true;
  }

  public void ExceptionInVPackage(Properties paramProperties) {
    boolean bool = Boolean.parseBoolean(paramProperties.getProperty(ExceptionInVPackage, "true"));
    try {
      if (bool) {
        NetworkHashMap.ExceptionInVPackage().o();
      } else {
        NetworkHashMap.ExceptionInVPackage()
            .NetworkHashMap(
                ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().DComponentCharlie());
      }
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      NInterfaceIndiaImpl.ExceptionInVPackage().d(ExceptionInVPackage.getLocalizedMessage());
      D.d(ExceptionInVPackage.getLocalizedMessage());
    }
  }

  public String ExceptionInVPackage() {
    return "startDatalogging";
  }

  public void b(Properties paramProperties) {}

  public ArrayListExtensionInDPackage e() {
    return null;
  }

  public boolean NetworkHashMap() {
    return false;
  }

  public boolean SComponentGolf() {
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
