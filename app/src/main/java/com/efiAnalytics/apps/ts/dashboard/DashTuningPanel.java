package com.efiAnalytics.apps.ts.dashboard;

import G.ArrayListExceptionprintstacktraceInGPackage;
import G.R;
import G.T;
import bt.ExceptionEqualsinaipackage;
import bt.Q;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import s.SComponentGolf;

public class DashTuningPanel extends s implements t, Serializable {
  JPanel a = new JPanel();

  JLabel b = new JLabel();

  ExceptionEqualsinaipackage c = null;

  JScrollPane d = new JScrollPane();

  public DashTuningPanel() {
    setLayout(new BorderLayout());
    this.a.setLayout(new BorderLayout());
    this.a.add("Center", this.b);
    JButton jButton = new JButton("#");
    jButton.setPreferredSize(new Dimension(15, 15));
    jButton.setToolTipText(SComponentGolf.b("Click to select Settings"));
    jButton.addActionListener(new p(this));
    jButton.setFocusable(false);
    this.a.add("East", jButton);
    add("North", this.a);
    add("Center", this.d);
  }

  private void showSelectPopup(int paramInt1, int paramInt2) {
    R r = getEcuConfiguration();
    Q q = new Q(r, -1);
    q q1 = new q(this);
    q.a(q1);
    this.a.add((Component) q);
    q.show(this, paramInt1, paramInt2);
  }

  private R getEcuConfiguration() {
    String str = getEcuConfigurationName();
    if (str == null || str.isEmpty()) str = T.a().c().c();
    return T.a().c(str);
  }

  private void menuClicked(String paramString) {
    R r = getEcuConfiguration();
    ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage =
        r.e().c(paramString);
    closeSettingsPanel();
    if (ArrayListExceptionprintstacktraceInGPackage != null) {
      this.c = new ExceptionEqualsinaipackage(r, ArrayListExceptionprintstacktraceInGPackage);
      this.d.setViewportView((Component) this.c);
    }
  }

  public boolean isComponentPaintedAt(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < getWidth() && paramInt2 >= 0 && paramInt2 < getHeight());
  }

  private void closeSettingsPanel() {
    if (this.c != null) this.c.close();
  }

  public void setRunDemo(boolean paramBoolean) {}

  public boolean isRunDemo() {
    return false;
  }

  public void goDead() {}

  public void invalidatePainter() {}

  public boolean isMustPaint() {
    return false;
  }

  public void subscribeToOutput() {}

  public void unsubscribeToOutput() {}

  public void paintBackground(Graphics paramGraphics) {
    paint(paramGraphics);
  }

  public boolean requiresBackgroundRepaint() {
    return false;
  }

  public void updateGauge(Graphics paramGraphics) {}

  public Area areaPainted() {
    Rectangle2D.Double double_ = new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight());
    return new Area(double_);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/DashTuningPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
