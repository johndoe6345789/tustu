package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedSettingsPanel extends JPanel {
  JButton a = new JButton("Cancel");

  JButton b = new JButton("Ok");

  String c = null;

  JTabbedPane d = new JTabbedPane();

  ArrayList e = new ArrayList();

  boolean f = false;

  public TabbedSettingsPanel(String paramString) {
    paramString = (paramString == null) ? "" : paramString;
    this.c = paramString;
    setLayout(new BorderLayout());
    add("Center", this.d);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    if (bV.d()) {
      jPanel.add(this.b);
      jPanel.add(this.a);
    } else {
      jPanel.add(this.a);
      jPanel.add(this.b);
    }
    this.b.addActionListener(new dt(this));
    this.a.addActionListener(new du(this));
    add("South", jPanel);
    this.d.addChangeListener(new dv(this));
  }

  private void c() {
    a();
  }

  private void d() {
    b();
  }

  public void a() {
    if (a(e()))
      for (fS fS : this.e) {
        if (!fS.b()) break;
      }
  }

  public boolean a(Container paramContainer) {
    for (fS fS : this.e) {
      if (!fS.a(paramContainer)) return false;
    }
    return true;
  }

  public void b() {
    for (fS fS : this.e) fS.c();
  }

  private Container e() {
    return (Container) this.d.getComponentAt(this.d.getSelectedIndex());
  }

  public void a(Container paramContainer, String paramString) {
    if (paramContainer instanceof javax.swing.JScrollPane) {
      this.d.add(paramString, paramContainer);
    } else {
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new dx(this));
      jPanel.add(paramContainer);
      this.d.add(paramString, jPanel);
    }
  }

  public void a(fS paramfS) {
    this.e.add(paramfS);
  }

  public void a(Window paramWindow, String paramString) {
    if (paramString == null || paramString.equals("")) paramString = "Wizard";
    JDialog jDialog = new JDialog(paramWindow, paramString);
    jDialog.add("Center", this);
    jDialog.pack();
    a(new dw(this, jDialog));
    bV.a(paramWindow, jDialog);
    jDialog.setVisible(true);
  }

  public void a(Component paramComponent) {
    this.d.setSelectedComponent(paramComponent.getParent());
  }

  public boolean a(String paramString) {
    for (byte b = 0; b < this.d.getTabCount(); b++) {
      if (this.d.getTitleAt(b).equals(paramString)) {
        this.d.setSelectedIndex(b);
        return true;
      }
    }
    return false;
  }

  public void a(int paramInt, boolean paramBoolean) {
    this.d.setEnabledAt(paramInt, paramBoolean);
  }

  public boolean a(String paramString, boolean paramBoolean) {
    for (byte b = 0; b < this.d.getTabCount(); b++) {
      if (this.d.getTitleAt(b).equals(paramString)) {
        a(b, paramBoolean);
        return true;
      }
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
