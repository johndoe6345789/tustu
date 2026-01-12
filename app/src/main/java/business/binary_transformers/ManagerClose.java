package business.binary_transformers;

import G.GComponentBw;
import G.GComponentBx;
import G.GInterfaceAn;
import G.Manager;
import G.ManagerUsingConcurrentHashMap;
import G.R;
import V.ExceptionExtensionGetmessage;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.p;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import s.ExceptionPrintstacktrace;

public class ManagerClose extends JPanel implements GInterfaceAn, bZ, ca, h, bc {
  private R ExceptionInVPackage = null;

  private GComponentBx b = null;

  private y c = new y();

  private static String d = ExceptionPrintstacktrace.b("Custom");

  private ArrayList e = null;

  private boolean f = false;

  private String ExceptionPrintstacktrace = null;

  public ManagerClose(R paramR, GComponentBx parambx) {
    this.ExceptionInVPackage = paramR;
    this.b = parambx;
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    bb bb = new bb(ExceptionPrintstacktrace.b(parambx.l()));
    jPanel.add("Center", bb);
    jPanel.add("East", this.c);
    this.c.addItem(d);
    null = parambx.ExceptionInVPackage();
    while (null.hasNext())
      this.c.addItem(
          ExceptionPrintstacktrace.b(((GComponentBw) null.next()).ExceptionInVPackage()));
    this.c.ExceptionInVPackage(this);
    add("North", jPanel);
    this.e = ExceptionInVPackage(parambx);
    for (String str : this.e) {
      ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
          ManagerUsingConcurrentHashMap.ExceptionInVPackage();
      try {
        ManagerUsingConcurrentHashMap.ExceptionInVPackage(paramR.c(), str, this);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        ExceptionInVPackage.printStackTrace();
        D.ExceptionInVPackage(
            "SettingSelector, Error subscribing to ParameterValue Changes. Parameter:" + str,
            (Exception) ExceptionInVPackage,
            this);
      }
    }
    c();
  }

  private void c() {
    if (this.f) return;
    GComponentBw GComponentBw =
        this.b.ExceptionInVPackage(ExceptionPrintstacktrace.c(this.c.ExceptionInVPackage()));
    if (GComponentBw != null && ExceptionInVPackage(GComponentBw)) return;
    if (this.ExceptionPrintstacktrace != null) {
      GComponentBw = this.b.ExceptionInVPackage(this.ExceptionPrintstacktrace);
      if (GComponentBw != null && ExceptionInVPackage(GComponentBw)) return;
    }
    Iterator<GComponentBw> iterator = this.b.ExceptionInVPackage();
    while (iterator.hasNext()) {
      GComponentBw bw1 = iterator.next();
      boolean bool = ExceptionInVPackage(bw1);
      if (bool) return;
    }
    this.c.ExceptionInVPackage(d);
  }

  private boolean ExceptionInVPackage(GComponentBw parambw) {
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.ExceptionInVPackage(str);
      Manager Manager = this.ExceptionInVPackage.c(str);
      try {
        if (Math.abs(Manager.ExceptionExtensionGetmessage(this.ExceptionInVPackage.h()) - d)
            > 1.0E-8D) return false;
        if (!iterator.hasNext()) {
          this.c.setSelectedItem(ExceptionPrintstacktrace.b(parambw.ExceptionInVPackage()));
          return true;
        }
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        return false;
      }
    }
    return false;
  }

  private void b(GComponentBw parambw) {
    this.f = true;
    Iterator<String> iterator = parambw.b();
    while (iterator.hasNext()) {
      String str = iterator.next();
      double d = parambw.ExceptionInVPackage(str);
      Manager Manager = this.ExceptionInVPackage.c(str);
      try {
        Manager.ExceptionInVPackage(this.ExceptionInVPackage.h(), d);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        D.c("Unable to set parameter value for " + str);
        ExceptionPrintstacktrace.printStackTrace();
      } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
        D.b("Invalid value set in settingSelector '" + this.b.l() + "' for parameter:" + str);
      }
    }
    this.f = false;
    c();
  }

  private ArrayList ExceptionInVPackage(GComponentBx parambx) {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<GComponentBw> iterator = parambx.ExceptionInVPackage();
    while (iterator.hasNext()) {
      GComponentBw GComponentBw = iterator.next();
      Iterator<String> iterator1 = GComponentBw.b();
      while (iterator1.hasNext()) {
        String str = iterator1.next();
        if (!arrayList.contains(str)) arrayList.add(str);
      }
    }
    return arrayList;
  }

  public void close() {
    ManagerUsingConcurrentHashMap ManagerUsingConcurrentHashMap =
        ManagerUsingConcurrentHashMap.ExceptionInVPackage();
    ManagerUsingConcurrentHashMap.ExceptionInVPackage(this);
  }

  public void ExceptionInVPackage(String paramString1, String paramString2) {
    c();
  }

  public void b(String paramString) {
    if (!paramString.equals(d)) {
      GComponentBw GComponentBw =
          this.b.ExceptionInVPackage(ExceptionPrintstacktrace.c(paramString));
      if (GComponentBw != null) b(GComponentBw);
      this.ExceptionPrintstacktrace = paramString;
    }
  }

  public void ExceptionInVPackage() {
    if (this.b != null && this.b.aJ() != null && !this.b.aJ().isEmpty())
      try {
        boolean bool = p.ExceptionInVPackage(this.b.aJ(), this.ExceptionInVPackage);
        if (bool ^ this.c.isEnabled()) this.c.setEnabled(bool);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bp.class.getName())
            .log(
                Level.SEVERE,
                "Bad enable expresstion  on settingSelector",
                (Throwable) ExceptionPrintstacktrace);
      }
  }

  public void b() {
    if (this.b != null && this.b.m() != null && !this.b.m().isEmpty())
      try {
        boolean bool = p.ExceptionInVPackage(this.b.m(), this.ExceptionInVPackage);
        if (bool ^ this.c.isVisible()) this.c.setVisible(bool);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(bp.class.getName())
            .log(
                Level.SEVERE,
                "Bad enable expresstion  on settingSelector",
                (Throwable) ExceptionPrintstacktrace);
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
