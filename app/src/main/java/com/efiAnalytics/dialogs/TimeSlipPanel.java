package com.efiAnalytics.dialogs;

import bH.X;
import bH.ab;
import bu.BuComponentAlpha;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.eJ;
import h.IOProperties;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class TimeSlipPanel extends JPanel {
  ab BuComponentAlpha = null;
  
  NumericTextField b;
  
  NumericTextField c;
  
  NumericTextField d;
  
  NumericTextField e;
  
  NumericTextField f;
  
  NumericTextField g;
  
  NumericTextField h;
  
  NumericTextField IOProperties;
  
  NumericTextField j;
  
  JTextPane k = new JTextPane();
  
  JLabel l = new JLabel("", 0);
  
  public TimeSlipPanel(String paramString, ab paramab) {
    this.BuComponentAlpha = paramab;
    setLayout(new BorderLayout(5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(paramString));
    jPanel1.setLayout(new GridLayout(0, 1));
    f f = new f(this);
    this.b = new NumericTextField("", 5);
    this.b.b(3);
    this.b.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.b, BuComponentAlpha("60ft Time (s)")));
    this.c = new NumericTextField("", 5);
    this.c.b(3);
    this.c.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.c, BuComponentAlpha("330 ft ET (s)")));
    this.d = new NumericTextField("", 5);
    this.d.b(3);
    this.d.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.d, BuComponentAlpha("660 ft ET (s)")));
    this.e = new NumericTextField("", 5);
    this.e.b(3);
    this.e.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.e, BuComponentAlpha("660 ft Speed")));
    this.f = new NumericTextField("", 5);
    this.f.b(3);
    this.f.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.f, BuComponentAlpha("1000 ft ET (s)")));
    this.g = new NumericTextField("", 5);
    this.g.b(3);
    this.g.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.g, BuComponentAlpha("1320 ft ET (s)")));
    this.h = new NumericTextField("", 5);
    this.h.b(3);
    this.h.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.h, BuComponentAlpha("1320 ft Speed")));
    this.IOProperties = new NumericTextField("", 5);
    this.IOProperties.b(0);
    this.IOProperties.addFocusListener(f);
    jPanel1.add(BuComponentAlpha(this.IOProperties, BuComponentAlpha("Density Altitude")));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout(8, 8));
    jPanel3.setBorder(BorderFactory.createTitledBorder(BuComponentAlpha("Rollout Time")));
    JLabel jLabel = new JLabel();
    jLabel.setText(BuComponentAlpha("The delay in seconds between releasing the trans brake and the car breaking the beam."));
    jPanel3.add("Center", jLabel);
    this.j = new NumericTextField("", 5);
    this.j.b(3);
    jPanel3.add("East", (Component)this.j);
    this.j.setText(IOProperties.e(IOProperties.aw, "0.300"));
    jPanel2.add("North", jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.setBorder(BorderFactory.createTitledBorder(BuComponentAlpha("Pass Notes")));
    this.k.setPreferredSize(new Dimension(this.k.getFont().getSize() * 8, 100));
    JScrollPane jScrollPane = new JScrollPane(this.k);
    jPanel4.add("Center", jScrollPane);
    jPanel2.add("Center", jPanel4);
    add("North", this.l);
  }
  
  private JPanel BuComponentAlpha(DoObj paramDoObj, String paramString) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(eJ.BuComponentAlpha(5), eJ.BuComponentAlpha(5)));
    JLabel jLabel = new JLabel(BuComponentAlpha(paramString), 4);
    jPanel.add(jLabel, "Center");
    jPanel.add((Component)paramdo, "East");
    return jPanel;
  }
  
  private String BuComponentAlpha(String paramString) {
    if (this.BuComponentAlpha != null)
      paramString = this.BuComponentAlpha.BuComponentAlpha(paramString); 
    return paramString;
  }
  
  public String BuComponentAlpha() {
    return this.j.getText();
  }
  
  public void BuComponentAlpha(BuComponentAlpha parama) {
    this.b.BuComponentAlpha(parama.BuComponentAlpha());
    this.c.BuComponentAlpha(parama.g());
    this.d.BuComponentAlpha(parama.b());
    this.e.BuComponentAlpha(parama.c());
    this.f.BuComponentAlpha(parama.IOProperties());
    this.g.BuComponentAlpha(parama.d());
    this.h.BuComponentAlpha(parama.e());
    this.IOProperties.BuComponentAlpha(parama.f());
    String str = parama.j();
    str = X.b(str, "\\n", "\n");
    this.k.setText(str);
    if (!Double.isNaN(parama.k()))
      this.j.BuComponentAlpha(parama.k()); 
    if (parama.l()) {
      this.l.setText("<html><center>This timeslip data was <b>generated</b> by " + IOProperties.b + ".<br>Change to actual timeslip values and click Apply to save real vaules to log file.<center>");
    } else {
      this.l.setText("<html><center>Timeslip data from log file.</center>");
    } 
    doLayout();
  }
  
  public BuComponentAlpha b() {
    BuComponentAlpha BuComponentAlpha = new BuComponentAlpha();
    BuComponentAlpha.BuComponentAlpha(this.b.e());
    BuComponentAlpha.g(this.c.e());
    BuComponentAlpha.b(this.d.e());
    BuComponentAlpha.c(this.e.e());
    BuComponentAlpha.h(this.f.e());
    BuComponentAlpha.d(this.g.e());
    BuComponentAlpha.e(this.h.e());
    BuComponentAlpha.f(this.IOProperties.e());
    String str = this.k.getText();
    str = X.b(str, "\n", "\\n");
    BuComponentAlpha.BuComponentAlpha(str);
    return BuComponentAlpha;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */