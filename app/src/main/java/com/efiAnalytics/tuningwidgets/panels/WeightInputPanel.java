package com.efiAnalytics.tuningwidgets.panels;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WeightInputPanel extends JPanel {
  JTextField a;

  JTextField b;

  public WeightInputPanel(String paramString) {
    setBorder(BorderFactory.createTitledBorder(paramString));
    WeightFieldFocusAdapter weightFieldFocusAdapter = new WeightFieldFocusAdapter(this);
    setLayout(new GridLayout(1, 2, 14, 14));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add("East", new JLabel("lbs."));
    this.a = new JTextField("", 6);
    this.a.addKeyListener(new PoundsKeyAdapter(this));
    this.a.addFocusListener(weightFieldFocusAdapter);
    jPanel1.add("Center", this.a);
    add(jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("East", new JLabel("kg."));
    this.b = new JTextField("", 6);
    this.b.addKeyListener(new KilogramsKeyAdapter(this));
    this.b.addFocusListener(weightFieldFocusAdapter);
    jPanel2.add("Center", this.b);
    add(jPanel2);
  }

  public String a() {
    return this.a.getText();
  }

  public void a(String paramString) {
    try {
      int i = Integer.parseInt(paramString) * 10 / 22;
      this.a.setText(paramString);
      this.b.setText(i + "");
    } catch (NumberFormatException numberFormatException) {
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/aQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
