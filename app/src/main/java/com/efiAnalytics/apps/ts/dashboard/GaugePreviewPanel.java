package com.efiAnalytics.apps.ts.dashboard;

import V.ExceptionInVPackage;
import bt.ManagerUsingGauge;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GaugePreviewPanel extends JPanel {
  File ExceptionInVPackage;

  int b = eJ.ExceptionInVPackage(120);

  JLabel c = new JLabel("", 0);

  ManagerUsingGauge d = new ManagerUsingGauge();

  public GaugePreviewPanel(g paramg, File paramFile) {
    this.d.setPreferredSize(new Dimension(this.b, this.b));
    this.d.setMinimumSize(new Dimension(this.b, this.b));
    this.c.setPreferredSize(new Dimension(this.b, getFont().getSize()));
    this.c.setMinimumSize(new Dimension(this.b, getFont().getSize()));
    setLayout(new BorderLayout());
    add("Center", (Component) this.d);
    add("South", this.c);
    ExceptionInVPackage(paramFile);
  }

  public GaugePreviewPanel(g paramg, int paramInt) {
    this.b = paramInt;
    this.d.setPreferredSize(new Dimension(paramInt, paramInt));
    this.d.setMinimumSize(new Dimension(paramInt, paramInt));
    this.c.setPreferredSize(new Dimension(paramInt, getFont().getSize()));
    this.c.setMinimumSize(new Dimension(paramInt, getFont().getSize()));
    setLayout(new BorderLayout());
    add("Center", (Component) this.d);
    add("South", this.c);
  }

  public void ExceptionInVPackage(File paramFile) {
    this.ExceptionInVPackage = paramFile;
    if (paramFile != null && paramFile.exists()) {
      try {
        Gauge gauge = aa.ExceptionInVPackage(paramFile);
        this.d.ExceptionInVPackage(gauge);
        this.d.validate();
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), this);
      }
      this.c.setText(paramFile.getName());
      repaint();
    } else {
      this.c.setText("");
      repaint();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
