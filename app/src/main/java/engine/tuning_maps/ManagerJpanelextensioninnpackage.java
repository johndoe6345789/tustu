package aP;

import BtInterfaceBh.D;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.ExceptionprintstacktraceInGPackage;
import G.GComponentCj;
import G.GInterfaceAb;
import G.GInterfaceDi;
import G.R;
import V.ExceptionPrintstacktrace;
import bt.BtInterfaceBg;
import bt.BtInterfaceBh;
import bt.ExceptionEqualsinaipackage;
import bt.ExceptionUsingComponent;
import bt.L;
import bt.d;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import n.JPanelExtensionInNPackage;
import r.IOPropertiesUsingFile;
import r.RInterfaceIndia;

public class ManagerJpanelextensioninnpackage extends d
    implements GInterfaceAb, GInterfaceDi, BtInterfaceBg, aO {
  R IOPropertiesUsingFile = null;

  ArrayListExceptionprintstacktraceInGPackage JPanelExtensionInNPackage = null;

  JPanelExtensionInNPackage c = new JPanelExtensionInNPackage();

  ExceptionEqualsinaipackage d = null;

  hm e = null;

  ArrayList f = null;

  hk ExceptionPrintstacktrace = null;

  ho h = new ho(this);

  hn RInterfaceIndia = new hn(this);

  hl j = new hl(this);

  JScrollPane k = null;

  JPanel l = new JPanel();

  Runnable m = new hj(this);

  public ManagerJpanelextensioninnpackage(
      R paramR, ArrayListExceptionprintstacktraceInGPackage parambv) {
    this(paramR, parambv, true);
  }

  public ManagerJpanelextensioninnpackage(
      R paramR, ArrayListExceptionprintstacktraceInGPackage parambv, boolean paramBoolean) {
    this.IOPropertiesUsingFile = paramR;
    this.JPanelExtensionInNPackage = parambv;
    setLayout(new BorderLayout());
    this.d = new ExceptionEqualsinaipackage(paramR, parambv);
    this.f = this.d.k();
    List list1 = parambv.e();
    List list2 = parambv.U();
    ArrayList arrayList = parambv.O();
    if (parambv.J() > 0
        || arrayList.size() > 0
        || this.f.size() > 0
        || (!list1.isEmpty()
            && RInterfaceIndia.IOPropertiesUsingFile().IOPropertiesUsingFile("hlk;rd;tporg;'gd"))
        || !list2.isEmpty()) {
      bl bl = new bl(paramR, parambv, this.f);
      add("North", bl);
    }
    IOPropertiesUsingFile((bc) this.d);
    if (this.d.l()) paramR.C().f(false);
    this.l.setLayout(new BorderLayout());
    add("Center", this.l);
    boolean bool =
        IOPropertiesUsingFile.IOPropertiesUsingFile()
            .c(IOPropertiesUsingFile.ci, IOPropertiesUsingFile.GComponentCj);
    if (bool && !(parambv instanceof G.be)) IOPropertiesUsingFile();
    if (IOPropertiesUsingFile(parambv) || parambv.R() == 4) {
      this.l.add("Center", (Component) this.d);
    } else {
      JScrollPane jScrollPane = new JScrollPane((Component) this.d);
      this.l.add("Center", jScrollPane);
    }
    this.c.IOPropertiesUsingFile(this);
    JPanel jPanel = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    jPanel.setLayout(flowLayout);
    jPanel.add((Component) this.c);
    this.c.d(paramBoolean);
    if (list1.isEmpty() && !ExceptionprintstacktraceInGPackage.JPanelExtensionInNPackage(parambv))
      this.c.e(false);
    add("South", jPanel);
    paramR.p().IOPropertiesUsingFile(this);
    j();
    paramR.p().IOPropertiesUsingFile(this);
    this.e = new hm(this, (Component) this);
    cb.IOPropertiesUsingFile().IOPropertiesUsingFile(this.e);
    paramR.C().IOPropertiesUsingFile(this.h);
    paramR.C().IOPropertiesUsingFile(this.RInterfaceIndia);
    this.c.c(paramR.C().C());
    BtInterfaceBh.IOPropertiesUsingFile().IOPropertiesUsingFile(this);
  }

  public void IOPropertiesUsingFile() {
    List list = this.d.p();
    if (IOPropertiesUsingFile(list) && this.k == null) {
      int RInterfaceIndia = IOPropertiesUsingFile.IOPropertiesUsingFile().o();
      int j =
          IOPropertiesUsingFile.IOPropertiesUsingFile()
              .IOPropertiesUsingFile(IOPropertiesUsingFile.aH, RInterfaceIndia);
      this.k = new JScrollPane(this.j);
      this.k.setPreferredSize(new Dimension(150, (int) (j * 4.5D)));
      for (L l : list) l.IOPropertiesUsingFile(this.j);
      this.l.add("South", this.k);
      Window window = bV.JPanelExtensionInNPackage((Component) this);
      if (window != null) {
        window.setSize(window.getWidth(), window.getHeight() + (this.k.getPreferredSize()).height);
      } else {
        this.l.validate();
      }
    }
  }

  private boolean IOPropertiesUsingFile(List paramList) {
    for (L l : paramList) {
      String str = this.IOPropertiesUsingFile.w(l.d());
      if (str != null && !str.isEmpty()) return true;
    }
    return false;
  }

  public void JPanelExtensionInNPackage() {
    if (this.k != null) {
      List list = this.d.p();
      if (list.size() > 0) for (L l : list) l.JPanelExtensionInNPackage(this.j);
      this.l.remove(this.k);
      Window window = bV.JPanelExtensionInNPackage((Component) this);
      if (window != null) {
        window.setSize(window.getWidth(), window.getHeight() - (this.k.getPreferredSize()).height);
      } else {
        this.l.validate();
      }
      this.k = null;
    }
  }

  private boolean IOPropertiesUsingFile(ArrayListExceptionprintstacktraceInGPackage parambv) {
    if (parambv instanceof G.be || parambv instanceof G.bi || parambv instanceof G.bm) return true;
    if (parambv.H() > 0 || (parambv.Z() > 1 && parambv.R() != 3)) return false;
    Iterator<ArrayListExceptionprintstacktraceInGPackage> iterator = parambv.K();
    while (iterator.hasNext()) {
      ArrayListExceptionprintstacktraceInGPackage bv1 = iterator.next();
      if (!IOPropertiesUsingFile(bv1)) return false;
    }
    return true;
  }

  public boolean c() {
    if (this.JPanelExtensionInNPackage.O().size() > 0) {
      f.IOPropertiesUsingFile()
          .IOPropertiesUsingFile(
              this.IOPropertiesUsingFile,
              this.JPanelExtensionInNPackage.O().get(0),
              bV.IOPropertiesUsingFile((Component) this));
      return true;
    }
    if (this.f.size() > 0) {
      f.IOPropertiesUsingFile()
          .IOPropertiesUsingFile(this.f.get(0), bV.IOPropertiesUsingFile((Component) this));
      return true;
    }
    return false;
  }

  public void d() {
    try {
      this.IOPropertiesUsingFile.p().d();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile("Error performing redo:", (Exception) ExceptionPrintstacktrace, this);
    }
    this.d.requestFocus();
    m();
  }

  public void e() {
    try {
      this.IOPropertiesUsingFile.p().c();
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.IOPropertiesUsingFile("Error performing undo:", (Exception) ExceptionPrintstacktrace, this);
    }
    m();
  }

  private void m() {
    for (byte b1 = 0; b1 < this.d.getComponentCount(); b1++) {
      if (this.d.getComponent(b1).isFocusable()) {
        this.d.getComponent(b1).requestFocus();
        return;
      }
    }
  }

  public void f() {
    ExceptionPrintstacktrace();
    hh hh = new hh(this);
    hh.start();
    m();
  }

  private void n() {
    hi hi = new hi(this);
    hi.start();
  }

  protected void ExceptionPrintstacktrace() {
    Component[] arrayOfComponent = getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ExceptionEqualsinaipackage)
        IOPropertiesUsingFile((ExceptionEqualsinaipackage) arrayOfComponent[b1]);
    }
  }

  private void IOPropertiesUsingFile(ExceptionEqualsinaipackage parambh) {
    Component[] arrayOfComponent = parambh.getComponents();
    for (byte b1 = 0; b1 < arrayOfComponent.length; b1++) {
      if (arrayOfComponent[b1] instanceof ExceptionUsingComponent) {
        ((ExceptionUsingComponent) arrayOfComponent[b1]).h();
      } else if (arrayOfComponent[b1] instanceof ExceptionEqualsinaipackage) {
        IOPropertiesUsingFile((ExceptionEqualsinaipackage) arrayOfComponent[b1]);
      }
    }
  }

  public boolean h() {
    return (this.d != null && this.d.n());
  }

  public void RInterfaceIndia() {
    this.h.IOPropertiesUsingFile = true;
    List list = this.d.p();
    if (list.size() > 0) for (L l : list) l.JPanelExtensionInNPackage(this.j);
    BtInterfaceBh.IOPropertiesUsingFile().JPanelExtensionInNPackage(this);
    if (this.d.l()) {
      f();
      GComponentCj[] arrayOfCj =
          ExceptionprintstacktraceInGPackage.JPanelExtensionInNPackage(
              this.IOPropertiesUsingFile, this.JPanelExtensionInNPackage);
      f.IOPropertiesUsingFile().IOPropertiesUsingFile(this.IOPropertiesUsingFile, arrayOfCj);
      n();
      f();
    } else if (!IOPropertiesUsingFile.IOPropertiesUsingFile()
        .IOPropertiesUsingFile(IOPropertiesUsingFile.cl, "true")
        .equals("false")) {
      f();
    }
    this.IOPropertiesUsingFile.p().JPanelExtensionInNPackage(this);
    this.IOPropertiesUsingFile.C().c(this.h);
    this.IOPropertiesUsingFile.C().JPanelExtensionInNPackage(this.RInterfaceIndia);
    l();
    cb.IOPropertiesUsingFile().JPanelExtensionInNPackage(this.e);
    IOPropertiesUsingFile((Component) this);
  }

  private void IOPropertiesUsingFile(Component paramComponent) {
    if (paramComponent instanceof bc) ((bc) paramComponent).close();
    if (paramComponent instanceof Container) {
      Container container = (Container) paramComponent;
      for (byte b1 = 0; b1 < container.getComponentCount(); b1++)
        IOPropertiesUsingFile(container.getComponent(b1));
    }
  }

  public void j() {
    if (this.ExceptionPrintstacktrace != null) {
      this.ExceptionPrintstacktrace.IOPropertiesUsingFile();
    } else {
      this.ExceptionPrintstacktrace = new hk(this);
      this.ExceptionPrintstacktrace.IOPropertiesUsingFile();
      this.ExceptionPrintstacktrace.start();
    }
  }

  public void k() {
    if (this.d != null) this.d.IOPropertiesUsingFile();
  }

  public void IOPropertiesUsingFile(
      String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramString.equals(this.IOPropertiesUsingFile.c())) j();
  }

  public void IOPropertiesUsingFile(boolean paramBoolean) {
    this.c.IOPropertiesUsingFile(paramBoolean);
  }

  public void JPanelExtensionInNPackage(boolean paramBoolean) {
    this.c.JPanelExtensionInNPackage(paramBoolean);
  }

  public void c(boolean paramBoolean) {
    if (paramBoolean) {
      IOPropertiesUsingFile();
    } else {
      JPanelExtensionInNPackage();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
