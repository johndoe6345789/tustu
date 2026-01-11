package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import bH.I;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fp;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import r.i;
import s.g;

class TriggerConditionPanel extends JPanel {
  JRadioButton a = new JRadioButton(g.b("Manual"));
  
  JRadioButton b = new JRadioButton(g.b("Simple"));
  
  JRadioButton c = new JRadioButton(g.b("Expression"));
  
  JRadioButton d = new JRadioButton(g.b("Log For"));
  
  JSlider e = null;
  
  JComboBox f = new JComboBox();
  
  JTextField g;
  
  do h;
  
  V i;
  
  JPanel j;
  
  JPanel k;
  
  JPanel l;
  
  JPanel m = null;
  
  boolean n;
  
  public k(g paramg, R paramR, boolean paramBoolean1, boolean paramBoolean2) {
    ButtonGroup buttonGroup = new ButtonGroup();
    this.n = i.a().a("sa0-0o0os-0o-0DS");
    l l = new l(this, paramg);
    if (paramBoolean2) {
      buttonGroup.add(this.a);
      buttonGroup.add(this.b);
    } 
    if (paramBoolean2) {
      this.a.addActionListener(l);
      this.b.addActionListener(l);
    } 
    if (!this.n) {
      buttonGroup.add(this.c);
      this.c.addActionListener(l);
    } 
    setLayout(new BoxLayout(this, 1));
    this.k = a(this.a);
    this.k.add("Center", new JLabel());
    if (paramBoolean2)
      add(this.k); 
    this.j = a(this.b);
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout(3, 3));
    this.i = new V(paramR);
    if (this.n) {
      this.i.removeAllItems();
      this.i.a("TPS_Pct");
    } 
    jPanel.add("West", (Component)this.i);
    this.f.setEditable(false);
    this.f.addItem(">");
    this.f.addItem("=");
    this.f.addItem("<");
    jPanel.add("Center", this.f);
    this.h = new do("", 4);
    jPanel.add("East", (Component)this.h);
    this.j.add("Center", jPanel);
    if (paramBoolean2)
      add(this.j); 
    this.l = a(this.c);
    this.g = new JTextField("", 25);
    this.g.setBorder(BorderFactory.createLoweredBevelBorder());
    this.l.add("Center", this.g);
    if (!this.n)
      add(this.l); 
    if (paramBoolean1) {
      this.m = a(this.d);
      if (i.a().a("sa0-0o0os-0o-0DS")) {
        this.e = new JSlider(0, 0, 30, 30);
        this.e.setMajorTickSpacing(10);
        this.e.setMinorTickSpacing(1);
      } else {
        this.e = new JSlider(0, 0, 600, 30);
        this.e.setMajorTickSpacing(100);
        this.e.setMinorTickSpacing(10);
      } 
      this.e.setPaintLabels(true);
      this.e.setPaintTicks(true);
      buttonGroup.add(this.d);
      this.d.addActionListener(l);
      this.m.add("Center", this.e);
      JLabel jLabel = new JLabel("   " + this.e.getValue() + " s.");
      this.e.addChangeListener(new m(this, paramg, jLabel));
      this.m.add("East", jLabel);
      add(this.m);
    } 
  }
  
  public void a(String paramString) {
    if (paramString == null || paramString.trim().equals(""))
      paramString = g.q; 
    if (paramString.equals(g.q)) {
      this.a.setSelected(true);
    } else {
      this.g.setText(paramString);
      String[] arrayOfString = paramString.split(" ");
      if (arrayOfString.length == 3 && (arrayOfString[1].equals("<") || arrayOfString[1].equals("=") || arrayOfString[1].equals(">")) && I.a(arrayOfString[2])) {
        String str = arrayOfString[0].trim();
        if (this.e != null && str.equals("AppEvent.dataLogTime")) {
          int i = (int)Double.parseDouble(arrayOfString[2]);
          this.e.setValue(i);
          this.d.setSelected(true);
        } else {
          this.i.setSelectedItem(str);
          this.f.setSelectedItem(arrayOfString[1].trim());
          this.h.setText(arrayOfString[2].trim());
          this.b.setSelected(true);
        } 
      } else {
        this.c.setSelected(true);
      } 
    } 
    b();
  }
  
  public String a() {
    if (this.a.isSelected())
      return g.q; 
    if (this.d != null && this.d.isSelected()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AppEvent.dataLogTime").append(" > ").append(this.e.getValue());
      return stringBuilder.toString();
    } 
    if (this.b.isSelected()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.i.getSelectedItem().toString()).append(" ").append(this.f.getSelectedItem().toString()).append(" ").append(this.h.getText());
      return stringBuilder.toString();
    } 
    return this.g.getText();
  }
  
  public void b() {
    if (this.a.isSelected()) {
      fp.a(this.k.getComponent(1), true);
      fp.a(this.j.getComponent(1), false);
      fp.a(this.l.getComponent(1), false);
      if (this.m != null) {
        fp.a(this.m.getComponent(1), false);
        fp.a(this.m.getComponent(2), false);
      } 
    } else if (this.b.isSelected()) {
      fp.a(this.k.getComponent(1), false);
      fp.a(this.j.getComponent(1), true);
      fp.a(this.l.getComponent(1), false);
      if (this.m != null) {
        fp.a(this.m.getComponent(1), false);
        fp.a(this.m.getComponent(2), false);
      } 
    } else if (this.d.isSelected()) {
      fp.a(this.k.getComponent(1), false);
      fp.a(this.j.getComponent(1), false);
      fp.a(this.l.getComponent(1), false);
      fp.a(this.m.getComponent(1), true);
      fp.a(this.m.getComponent(2), true);
    } else {
      fp.a(this.k.getComponent(1), false);
      fp.a(this.j.getComponent(1), false);
      fp.a(this.l.getComponent(1), true);
      if (this.m != null) {
        fp.a(this.m.getComponent(1), false);
        fp.a(this.m.getComponent(2), false);
      } 
    } 
  }
  
  private JPanel a(JRadioButton paramJRadioButton) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    paramJRadioButton.setPreferredSize(eJ.a(120, 25));
    jPanel.add("West", paramJRadioButton);
    return jPanel;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */