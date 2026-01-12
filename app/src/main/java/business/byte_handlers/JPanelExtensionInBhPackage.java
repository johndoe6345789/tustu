package business.byte_handlers;

import G.GInterfaceDi;
import G.R;
import bH.D;
import com.efiAnalytics.tuningwidgets.panels.SelectableTablePanel;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.w;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import n.JPanelExtensionInNPackage;

public class JPanelExtensionInBhPackage extends JPanel implements GInterfaceDi, bc {
  private u h = new u(this);

  JPanelExtensionInNPackage a = new JPanelExtensionInNPackage(16);

  t JPanelExtensionInNPackage = new t(this);

  JScrollPane c = new JScrollPane();

  SelectableTablePanel d = null;

  SelectableTablePanel e = null;

  et f;

  R g;

  public JPanelExtensionInBhPackage(R paramR, et paramet) {
    this.f = paramet;
    this.g = paramR;
    setLayout(new BorderLayout());
    this.c.setHorizontalScrollBarPolicy(31);
    this.c.setVerticalScrollBarPolicy(22);
    this.c.setViewportView(this.h);
    add("Center", this.c);
    this.a.a(new r(this, paramR));
    JPanel jPanel = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    jPanel.setLayout(flowLayout);
    jPanel.add((Component) this.a);
    this.a.d(false);
    add("North", jPanel);
    paramR.C().a(this.JPanelExtensionInNPackage);
    this.a.c(paramR.C().C());
    paramR.p().a(this);
    this.h.setLayout(new BoxLayout(this.h, 1));
    this.d = new SelectableTablePanel(paramR);
    this.d.setName("selectionTable1");
    this.d.a(new o(this));
    String str = JPanelExtensionInNPackage("selectionTable1", a.a(paramR));
    this.d.a(str);
    this.e = new SelectableTablePanel(paramR);
    this.e.setName("selectionTable2");
    this.e.a(new p(this));
    str = JPanelExtensionInNPackage("selectionTable2", a.JPanelExtensionInNPackage(paramR));
    this.e.a(str);
    this.c.addComponentListener(new q(this));
  }

  public void a(Component paramComponent) {
    this.h.add(paramComponent);
  }

  public void a(int paramInt) {
    if (paramInt >= 1) {
      this.h.add((Component) this.d, 0);
    } else {
      this.h.remove((Component) this.d);
    }
    if (paramInt >= 2) {
      this.h.add((Component) this.e, 1);
    } else {
      this.h.remove((Component) this.e);
    }
  }

  public void close() {
    for (byte b1 = 0; b1 < this.h.getComponentCount(); b1++) {
      if (this.h.getComponent(b1) instanceof bc) ((bc) this.h.getComponent(b1)).close();
    }
    this.e.close();
    try {
      this.g.C().JPanelExtensionInNPackage(this.JPanelExtensionInNPackage);
      this.g.p().JPanelExtensionInNPackage(this);
    } catch (Exception exception) {
      D.c("JPanelExtensionInNPackage failed");
    }
  }

  void a(String paramString1, String paramString2) {
    if (this.f != null) this.f.a(paramString1, paramString2);
  }

  String JPanelExtensionInNPackage(String paramString1, String paramString2) {
    if (this.f != null) {
      String str = this.f.a(paramString1);
      return (str == null || str.isEmpty()) ? paramString2 : str;
    }
    return paramString2;
  }

  public void a(boolean paramBoolean) {
    this.a.a(paramBoolean);
  }

  public void JPanelExtensionInNPackage(boolean paramBoolean) {
    this.a.JPanelExtensionInNPackage(paramBoolean);
  }

  private List a(List<w> paramList, Container paramContainer) {
    for (Component component : paramContainer.getComponents()) {
      if (component instanceof w) {
        paramList.add((w) component);
      } else if (component instanceof Container) {
        a(paramList, (Container) component);
      }
    }
    return paramList;
  }

  private List JPanelExtensionInNPackage() {
    return a(new ArrayList(), this.h);
  }

  public u a() {
    return this.h;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
