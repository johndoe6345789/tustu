package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class SpinnerButtonPanel extends JPanel {
  ArrayList a = new ArrayList();

  public SpinnerButtonPanel() {
    setLayout(new GridLayout(2, 1));
    ez ez = new ez(this, 1);
    ez.setFocusable(false);
    ez.addActionListener(new ex(this));
    add(ez);
    ez = new ez(this, 2);
    ez.setFocusable(false);
    ez.addActionListener(new ey(this));
    add(ez);
  }

  protected void a() {
    for (cP cP : this.a) cP.l();
  }

  protected void b() {
    for (cP cP : this.a) cP.m();
  }

  public void a(cP paramcP) {
    this.a.add(paramcP);
  }

  public void setEnabled(boolean paramBoolean) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) arrayOfComponent[b].setEnabled(paramBoolean);
  }

  public void setToolTipText(String paramString) {
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof JComponent)
        ((JComponent) arrayOfComponent[b]).setToolTipText(paramString);
    }
    super.setToolTipText(paramString);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
