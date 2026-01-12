package aR;

import G.T;
import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import aP.ThreadedJFrameIsoptimizeddrawingenabled;
import br.BrInterfaceFoxtrot;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ExceptionInDPackage;
import java.util.ArrayList;
import java.util.Properties;
import s.SComponentGolf;

public class ArInterfaceWhiskey implements DComponentCharlie {
  public static String ExceptionInVPackage = "startAutoTune";

  public static String b = "tableIndex";

  ArrayListExtensionInDPackage DComponentCharlie = new ArrayListExtensionInDPackage();

  public String ExceptionInVPackage() {
    return ExceptionInVPackage;
  }

  public String b() {
    return SComponentGolf.b("Start Auto Tune");
  }

  public String DComponentCharlie() {
    return "Project";
  }

  public boolean d() {
    return (T.ExceptionInVPackage().DComponentCharlie() != null && ExceptionInVPackage.A() != null);
  }

  public void ExceptionInVPackage(Properties paramProperties) {
    int DInterfaceIndia;
    String str = paramProperties.getProperty(b);
    if (str == null) throw new ExceptionInDPackage("Table Index is required.");
    try {
      DInterfaceIndia = Integer.parseInt(str);
    } catch (Exception exception) {
      throw new ExceptionInDPackage("Invalid Table Index: " + str);
    }
    try {
      BrInterfaceFoxtrot.ExceptionInVPackage().ExceptionInVPackage(DInterfaceIndia);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw new ExceptionInDPackage(ExceptionInVPackage.getLocalizedMessage());
    }
  }

  public void b(Properties paramProperties) {
    int DInterfaceIndia;
    String str = paramProperties.getProperty(b);
    if (str == null) throw new ExceptionInDPackage("Table Index is required.");
    try {
      DInterfaceIndia = Integer.parseInt(str);
    } catch (Exception exception) {
      throw new ExceptionInDPackage("Invalid Table Index: " + str);
    }
    if (ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o() != null
        && (DInterfaceIndia < 0
            || DInterfaceIndia
                > ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage()
                    .o()
                    .DComponentCharlie()))
      throw new ExceptionInDPackage("Invalid Table Index: " + str);
  }

  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    this.DComponentCharlie.clear();
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(b, "");
    DInterfaceIndia.ExceptionInVPackage(0);
    if (ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o() != null) {
      int j = ThreadedJFrameIsoptimizeddrawingenabled.ExceptionInVPackage().o().DComponentCharlie();
      ArrayList<String> arrayList = new ArrayList();
      for (byte b = 0; b <= j; b++) arrayList.add(Integer.toString(b));
      DInterfaceIndia.ExceptionInVPackage(arrayList);
    }
    DInterfaceIndia.DComponentCharlie(
        "This is the index of the Tab in which you wish to start Auto Tune on. It starts with tab 0"
            + " and increase as you move to the right.");
    this.DComponentCharlie.ExceptionInVPackage(DInterfaceIndia);
    return this.DComponentCharlie;
  }

  public boolean BrInterfaceFoxtrot() {
    return true;
  }

  public boolean SComponentGolf() {
    return true;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
