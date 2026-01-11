package com.efiAnalytics.dialogs;

import bH.X;
import bH.ab;
import bu.a;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import h.i;
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
  ab a = null;
  
  do b;
  
  do c;
  
  do d;
  
  do e;
  
  do f;
  
  do g;
  
  do h;
  
  do i;
  
  do j;
  
  JTextPane k = new JTextPane();
  
  JLabel l = new JLabel("", 0);
  
  public e(String paramString, ab paramab) {
    this.a = paramab;
    setLayout(new BorderLayout(5, 5));
    JPanel jPanel1 = new JPanel();
    jPanel1.setBorder(BorderFactory.createTitledBorder(paramString));
    jPanel1.setLayout(new GridLayout(0, 1));
    f f = new f(this);
    this.b = new do("", 5);
    this.b.b(3);
    this.b.addFocusListener(f);
    jPanel1.add(a(this.b, a("60ft Time (s)")));
    this.c = new do("", 5);
    this.c.b(3);
    this.c.addFocusListener(f);
    jPanel1.add(a(this.c, a("330 ft ET (s)")));
    this.d = new do("", 5);
    this.d.b(3);
    this.d.addFocusListener(f);
    jPanel1.add(a(this.d, a("660 ft ET (s)")));
    this.e = new do("", 5);
    this.e.b(3);
    this.e.addFocusListener(f);
    jPanel1.add(a(this.e, a("660 ft Speed")));
    this.f = new do("", 5);
    this.f.b(3);
    this.f.addFocusListener(f);
    jPanel1.add(a(this.f, a("1000 ft ET (s)")));
    this.g = new do("", 5);
    this.g.b(3);
    this.g.addFocusListener(f);
    jPanel1.add(a(this.g, a("1320 ft ET (s)")));
    this.h = new do("", 5);
    this.h.b(3);
    this.h.addFocusListener(f);
    jPanel1.add(a(this.h, a("1320 ft Speed")));
    this.i = new do("", 5);
    this.i.b(0);
    this.i.addFocusListener(f);
    jPanel1.add(a(this.i, a("Density Altitude")));
    add("West", jPanel1);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(5, 5));
    add("Center", jPanel2);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout(8, 8));
    jPanel3.setBorder(BorderFactory.createTitledBorder(a("Rollout Time")));
    JLabel jLabel = new JLabel();
    jLabel.setText(a("The delay in seconds between releasing the trans brake and the car breaking the beam."));
    jPanel3.add("Center", jLabel);
    this.j = new do("", 5);
    this.j.b(3);
    jPanel3.add("East", (Component)this.j);
    this.j.setText(i.e(i.aw, "0.300"));
    jPanel2.add("North", jPanel3);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.setBorder(BorderFactory.createTitledBorder(a("Pass Notes")));
    this.k.setPreferredSize(new Dimension(this.k.getFont().getSize() * 8, 100));
    JScrollPane jScrollPane = new JScrollPane(this.k);
    jPanel4.add("Center", jScrollPane);
    jPanel2.add("Center", jPanel4);
    add("North", this.l);
  }
  
  private JPanel a(do paramdo, String paramString) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JLabel jLabel = new JLabel(a(paramString), 4);
    jPanel.add(jLabel, "Center");
    jPanel.add((Component)paramdo, "East");
    return jPanel;
  }
  
  private String a(String paramString) {
    if (this.a != null)
      paramString = this.a.a(paramString); 
    return paramString;
  }
  
  public String a() {
    return this.j.getText();
  }
  
  public void a(a parama) {
    this.b.a(parama.a());
    this.c.a(parama.g());
    this.d.a(parama.b());
    this.e.a(parama.c());
    this.f.a(parama.i());
    this.g.a(parama.d());
    this.h.a(parama.e());
    this.i.a(parama.f());
    String str = parama.j();
    str = X.b(str, "\\n", "\n");
    this.k.setText(str);
    if (!Double.isNaN(parama.k()))
      this.j.a(parama.k()); 
    if (parama.l()) {
      this.l.setText("<html><center>This timeslip data was <b>generated</b> by " + i.b + ".<br>Change to actual timeslip values and click Apply to save real vaules to log file.<center>");
    } else {
      this.l.setText("<html><center>Timeslip data from log file.</center>");
    } 
    doLayout();
  }
  
  public a b() {
    a a = new a();
    a.a(this.b.e());
    a.g(this.c.e());
    a.b(this.d.e());
    a.c(this.e.e());
    a.h(this.f.e());
    a.d(this.g.e());
    a.e(this.h.e());
    a.f(this.i.e());
    String str = this.k.getText();
    str = X.b(str, "\n", "\\n");
    a.a(str);
    return a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/dialogs/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */