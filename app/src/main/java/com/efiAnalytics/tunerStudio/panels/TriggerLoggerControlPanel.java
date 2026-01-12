package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
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

class TriggerLoggerControlPanel extends JPanel {
  JScrollBar ExceptionInVPackage = new JScrollBar(0);

  JLabel b = new JLabel("  0", 0);

  JLabel c = new JLabel("  0", 0);

  cp d;

  Image e = null;

  Image f = null;

  public TriggerLoggerControlPanel(TriggerLoggerPanel paramTriggerLoggerPanel) {
    JPanel jPanel = new JPanel();
    jPanel.setBackground(Color.GRAY);
    setLayout(new BorderLayout());
    add(this.ExceptionInVPackage, "Center");
    this.ExceptionInVPackage.addAdjustmentListener(new ap(this, paramTriggerLoggerPanel));
    jPanel.setLayout(new GridLayout(1, 0));
    add(jPanel, "East");
    try {
      this.f = cO.ExceptionInVPackage().ExceptionInVPackage(cO.q, this, 16);
      this.e = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ac, this, 16);
      this.d = new cp(null, this.e, null, eJ.ExceptionInVPackage(16, 16));
      this.d.ExceptionInVPackage(new aq(this, paramTriggerLoggerPanel));
      jPanel.add((Component) this.d);
      this.d.setEnabled(false);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      bV.d(ExceptionInVPackage.getLocalizedMessage(), this);
    }
    JLabel jLabel = new JLabel(" ");
    jLabel.setMinimumSize(eJ.ExceptionInVPackage(16, 16));
    jLabel.setOpaque(true);
    jPanel.add(jLabel);
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomout.gif"));
    cp cp1 = new cp(null, image, null, eJ.ExceptionInVPackage(16, 16));
    cp1.ExceptionInVPackage(new ar(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoomin.gif"));
    cp1 = new cp(null, image);
    cp1.ExceptionInVPackage(new as(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
    jPanel.add(new JLabel(" "));
    jPanel.add(this.c);
    jPanel.add(new JLabel("of", 0));
    jPanel.add(this.b);
    jPanel.add(new JLabel(" "));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("home.gif"));
    cp1 = new cp(null, image);
    cp1.ExceptionInVPackage(new at(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("rewind.gif"));
    cp1 = new cp(null, image);
    cp1.ExceptionInVPackage(new au(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fastforward.gif"));
    cp1 = new cp(null, image);
    cp1.ExceptionInVPackage(new av(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("end.gif"));
    cp1 = new cp(null, image);
    cp1.ExceptionInVPackage(new aw(this, paramTriggerLoggerPanel));
    jPanel.add((Component) cp1);
  }

  private void b(boolean paramBoolean) {
    if (paramBoolean) {
      this.d.ExceptionInVPackage(this.e);
    } else {
      this.d.ExceptionInVPackage(this.f);
    }
    this.d.repaint();
  }

  protected void ExceptionInVPackage(boolean paramBoolean) {
    if (TriggerLoggerPanel.e(this.g).size() > 0
        && ((n) TriggerLoggerPanel.e(this.g).get(0)).ExceptionInVPackage("Time") != null) {
      this.d.setEnabled(paramBoolean);
      this.d.repaint();
    } else {
      this.d.setEnabled(false);
    }
  }

  public void ExceptionInVPackage() {
    int i = this.g.B - TriggerLoggerPanel.h(this.g);
    this.ExceptionInVPackage.setMaximum(i);
    this.ExceptionInVPackage.setMinimum(0);
  }

  public void ExceptionInVPackage(double paramDouble) {
    if (paramDouble >= 0.0D && paramDouble <= 1.0D) {
      double d =
          this.ExceptionInVPackage.getMinimum()
              + (this.ExceptionInVPackage.getMaximum()
                      + TriggerLoggerPanel.h(this.g)
                      - this.ExceptionInVPackage.getMinimum())
                  * paramDouble;
      this.ExceptionInVPackage.setValue((int) d);
    } else if (paramDouble < 0.0D) {
      this.ExceptionInVPackage.setValue(this.ExceptionInVPackage.getMinimum());
    } else {
      D.c("Invalid Percent:" + paramDouble);
    }
  }

  public double b() {
    return (this.ExceptionInVPackage.getValue() - this.ExceptionInVPackage.getMinimum())
        / (this.ExceptionInVPackage.getMaximum()
            + TriggerLoggerPanel.h(this.g)
            - this.ExceptionInVPackage.getMinimum());
  }

  public int c() {
    return this.ExceptionInVPackage.getValue();
  }

  public void ExceptionInVPackage(int paramInt) {
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
