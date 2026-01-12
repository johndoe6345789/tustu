package com.efiAnalytics.dialogs;

import bH.J;
import bH.ab;
import bu.BuComponentAlpha;
import com.efiAnalytics.ui.BuComponentAlpha;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class TimeSlipDialog extends JDialog {
  e BuComponentAlpha;

  ab b = null;

  ArrayList c = new ArrayList();

  public TimeSlipDialog(Window paramWindow, String paramString, ab paramab) {
    super(paramWindow, paramString, Dialog.ModalityType.MODELESS);
    this.BuComponentAlpha = new e(paramString, paramab);
    this.b = paramab;
    setLayout(new BorderLayout());
    add(this.BuComponentAlpha, "Center");
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new FlowLayout(2));
    JButton jButton1 = new JButton(BuComponentAlpha("Apply"));
    jButton1.addActionListener(new c(this));
    JButton jButton2 = new JButton(BuComponentAlpha("Cancel"));
    jButton2.addActionListener(new d(this));
    if (J.BuComponentAlpha()) {
      jPanel.add(jButton1);
      jPanel.add(jButton2);
    } else {
      jPanel.add(jButton2);
      jPanel.add(jButton1);
    }
    add(jPanel, "South");
  }

  public void BuComponentAlpha(BuComponentAlpha parama) {
    this.BuComponentAlpha.BuComponentAlpha(parama);
  }

  public BuComponentAlpha BuComponentAlpha() {
    return this.BuComponentAlpha.b();
  }

  public String b() {
    return this.BuComponentAlpha.BuComponentAlpha();
  }

  private void c() {
    for (BuComponentAlpha BuComponentAlpha : this.c) {
      if (!BuComponentAlpha.BuComponentAlpha()) return;
    }
    dispose();
  }

  private void d() {
    for (BuComponentAlpha BuComponentAlpha : this.c) BuComponentAlpha.b();
    dispose();
  }

  public void BuComponentAlpha(BuComponentAlpha parama) {
    this.c.add(parama);
  }

  private String BuComponentAlpha(String paramString) {
    if (this.b != null) paramString = this.b.BuComponentAlpha(paramString);
    return paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
