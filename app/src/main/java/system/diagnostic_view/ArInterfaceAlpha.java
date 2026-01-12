package aR;

import G.ExceptionprintstacktraceInGPackage;
import G.R;
import G.T;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import br.BrInterfaceFoxtrot;
import br.BrInterfaceJuliet;
import com.efiAnalytics.ui.cY;
import d.ArrayListExtensionInDPackage;
import d.DComponentCharlie;
import d.DInterfaceIndia;
import d.ExceptionInDPackage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import r.DInterfaceIndia;
import s.ExceptionPrintstacktrace;

public class ArInterfaceAlpha implements cY, DComponentCharlie {
  public static String ExceptionInVPackage = "toggleAutoTune";

  public static String b = "tableName";

  ArrayListExtensionInDPackage DComponentCharlie = new ArrayListExtensionInDPackage();

  String d = null;

  public ArInterfaceAlpha() {
    DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(b, "");
    DInterfaceIndia.ExceptionInVPackage(0);
    ArrayList<String> arrayList = new ArrayList();
    for (String str : BrInterfaceFoxtrot.ExceptionInVPackage().DComponentCharlie())
      arrayList.add(str);
    DInterfaceIndia.ExceptionInVPackage(arrayList);
    DInterfaceIndia.DComponentCharlie(
        "This is the name of the Table in which you wish to toggle Auto Tune active state. If"
            + " autotune is running, it will stop it, if not running will start it on this table.");
    this.DComponentCharlie.ExceptionInVPackage(DInterfaceIndia);
    h();
  }

  private void h() {
    if (T.ExceptionInVPackage().DComponentCharlie() == null) {
      this.d = null;
    } else {
      this.d = T.ExceptionInVPackage().DComponentCharlie().DComponentCharlie();
    }
  }

  public String ExceptionInVPackage() {
    return ExceptionInVPackage;
  }

  public String b() {
    return ExceptionPrintstacktrace.b("Toggle Auto Tune");
  }

  public String DComponentCharlie() {
    return "Settings Dialogs";
  }

  public boolean d() {
    return (T.ExceptionInVPackage().DComponentCharlie() != null && ExceptionInVPackage.A() != null);
  }

  public void ExceptionInVPackage(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null) throw new ExceptionInDPackage("Table name is required.");
    try {
      BrInterfaceFoxtrot.ExceptionInVPackage().ExceptionInVPackage(str);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw new ExceptionInDPackage(ExceptionInVPackage.getLocalizedMessage());
    }
  }

  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(b);
    if (str == null) throw new ExceptionInDPackage("Table name is required.");
    List list = j();
    if (!list.contains(str)
        && DInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("poij  fdsz poi9ure895 ms7("))
      throw new ExceptionInDPackage("Invalid Table Index: " + str);
  }

  public ArrayListExtensionInDPackage ExceptionInDPackage() {
    if (this.DComponentCharlie.isEmpty()
        || this.d == null
        || (DInterfaceIndia() != null && !this.d.equals(DInterfaceIndia()))) {
      List list = j();
      DInterfaceIndia DInterfaceIndia = new DInterfaceIndia(b, "");
      ArrayList<String> arrayList = new ArrayList();
      for (String str : list) arrayList.add(str);
      DInterfaceIndia.ExceptionInVPackage(arrayList);
      this.DComponentCharlie.ExceptionInVPackage(DInterfaceIndia);
      this.d = DInterfaceIndia();
    }
    return this.DComponentCharlie;
  }

  private String DInterfaceIndia() {
    R r = T.ExceptionInVPackage().DComponentCharlie();
    return (r == null) ? null : r.DComponentCharlie();
  }

  public boolean BrInterfaceFoxtrot() {
    return true;
  }

  public boolean ExceptionPrintstacktrace() {
    return true;
  }

  public List ExceptionInVPackage(ActionListener paramActionListener) {
    ArrayList<JMenu> arrayList = new ArrayList();
    JMenu jMenu = new JMenu(b());
    arrayList.add(jMenu);
    B b = new B(this, paramActionListener);
    List list = j();
    for (String str : list) {
      JMenuItem jMenuItem =
          new JMenuItem(
              ExceptionprintstacktraceInGPackage.DComponentCharlie(
                  T.ExceptionInVPackage().DComponentCharlie(), str));
      jMenuItem.setActionCommand(str);
      jMenuItem.addActionListener(b);
      jMenu.add(jMenuItem);
    }
    return arrayList;
  }

  private List j() {
    try {
      return BrInterfaceJuliet.ExceptionInVPackage()
          .ExceptionInVPackage(T.ExceptionInVPackage().DComponentCharlie());
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(A.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      return new ArrayList();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
