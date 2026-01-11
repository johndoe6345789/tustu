package com.efiAnalytics.tunerStudio.panels;

import V.a;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.cp;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

class ao extends JPanel {
  JScrollBar a = new JScrollBar(0);
  
  JLabel b = new JLabel("  0", 0);
  
  JLabel c = new JLabel("  0", 0);
  
  cp d;
  
  Image e = null;
  
  Image f = null;
  
  public ao(TriggerLoggerPanel paramTriggerLoggerPanel) {
    JPanel jPanel = new JPanel();
    jPanel.setBackground(Color.GRAY);
    setLayout(new BorderLayout());
    add(this.a, "Center");
    this.a.addAdjustmentListener(new ap(this, paramTriggerLoggerPanel));
    jPanel.setLayout(new GridLayout(1, 0));
    add(jPanel, "East");
    try {
      this.f = cO.a().a(cO.q, this, 16);
      this.e = cO.a().a(cO.ac, this, 16);
      this.d = new cp(null, this.e, null, eJ.a(16, 16));
      this.d.a(new aq(this, paramTriggerLoggerPanel));
      jPanel.add((Component)this.d);
      this.d.setEnabled(false);
    } catch (a a) {
      bV.d(a.getLocalizedMessage(), this);
    } 
    JLabel jLabel = new JLabel(" ");
    jLabel.setMinimumSize(eJ.a(16, 16));
    jLabel.setOpaque(true);
    jPanel.add(jLabel);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomout.gif"));
    cp cp1 = new cp(null, image, null, eJ.a(16, 16));
    cp1.a(new ar(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomin.gif"));
    cp1 = new cp(null, image);
    cp1.a(new as(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
    jPanel.add(new JLabel(" "));
    jPanel.add(this.c);
    jPanel.add(new JLabel("of", 0));
    jPanel.add(this.b);
    jPanel.add(new JLabel(" "));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("home.gif"));
    cp1 = new cp(null, image);
    cp1.a(new at(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("rewind.gif"));
    cp1 = new cp(null, image);
    cp1.a(new au(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fastforward.gif"));
    cp1 = new cp(null, image);
    cp1.a(new av(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("end.gif"));
    cp1 = new cp(null, image);
    cp1.a(new aw(this, paramTriggerLoggerPanel));
    jPanel.add((Component)cp1);
  }
  
  private void b(boolean paramBoolean) {
    if (paramBoolean) {
      this.d.a(this.e);
    } else {
      this.d.a(this.f);
    } 
    this.d.repaint();
  }
  
  protected void a(boolean paramBoolean) {
    if (TriggerLoggerPanel.e(this.g).size() > 0 && ((n)TriggerLoggerPanel.e(this.g).get(0)).a("Time") != null) {
      this.d.setEnabled(paramBoolean);
      this.d.repaint();
    } else {
      this.d.setEnabled(false);
    } 
  }
  
  public void a() {
    int i = this.g.B - TriggerLoggerPanel.h(this.g);
    this.a.setMaximum(i);
    this.a.setMinimum(0);
  }
  
  public void a(double paramDouble) {
    if (paramDouble >= 0.0D && paramDouble <= 1.0D) {
      double d = this.a.getMinimum() + (this.a.getMaximum() + TriggerLoggerPanel.h(this.g) - this.a.getMinimum()) * paramDouble;
      this.a.setValue((int)d);
    } else if (paramDouble < 0.0D) {
      this.a.setValue(this.a.getMinimum());
    } else {
      D.c("Invalid Percent:" + paramDouble);
    } 
  }
  
  public double b() {
    return (this.a.getValue() - this.a.getMinimum()) / (this.a.getMaximum() + TriggerLoggerPanel.h(this.g) - this.a.getMinimum());
  }
  
  public int c() {
    return this.a.getValue();
  }
  
  public void a(int paramInt) {
    this.b.setText("" + paramInt);
  }
  
  public void b(int paramInt) {
    this.c.setText("" + paramInt);
  }
  
  public int d() {
    return Integer.parseInt(this.c.getText());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */