package com.efiAnalytics.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProgressDialog extends JDialog {
  dM a = new dM();

  ArrayList b = new ArrayList();

  JLabel c = new JLabel("", 0);

  public ProgressDialog(
      Window paramWindow,
      String paramString1,
      String paramString2,
      boolean paramBoolean1,
      boolean paramBoolean2) {
    super(paramWindow, paramString1, JDialog.DEFAULT_MODALITY_TYPE);
    setModal(paramBoolean2);
    setLayout(new BorderLayout());
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    this.c.setText(paramString2);
    jPanel.add("Center", this.c);
    jPanel.add("South", this.a);
    add("Center", jPanel);
    add("North", new JLabel("   "));
    add("West", new JLabel("   "));
    add("East", new JLabel("   "));
    if (paramBoolean1) {
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new FlowLayout(2));
      JButton jButton = new JButton("Cancel");
      jButton.addActionListener(new eC(this));
      jPanel1.add(jButton);
      add("South", jPanel1);
    }
    pack();
    bV.a(paramWindow, this);
  }

  public void a(double paramDouble) {
    this.a.b(paramDouble);
  }

  public void a(String paramString) {
    this.c.setText(paramString);
  }

  public void a(aQ paramaQ) {
    this.b.add(paramaQ);
  }

  private void a() {
    Iterator<aQ> iterator = this.b.iterator();
    while (iterator.hasNext()) ((aQ) iterator.next()).a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
