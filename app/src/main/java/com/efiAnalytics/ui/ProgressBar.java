package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class ProgressBar extends JComponent {
  long a = 0L;

  long b = 800L;

  double c = 0.0D;

  int d = 4;

  int e = 4;

  boolean f = false;

  Color g = Color.red;

  public ProgressBar() {
    dN dN = new dN(this);
    addMouseListener(dN);
    addMouseMotionListener(dN);
  }

  private int a() {
    return getWidth() - this.e - this.d;
  }

  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    paramGraphics.setColor(new Color(10, 120, 253));
    paramGraphics.fill3DRect(this.e, 5, (int) (a() * this.c) + 1, getHeight() - 10, true);
    paramGraphics.setColor(Color.gray);
    paramGraphics.draw3DRect(1, 2, getWidth() - 3, getHeight() - 5, false);
  }

  public void a(double paramDouble) {
    this.c = paramDouble;
    repaint();
  }

  public void b(double paramDouble) {
    if (System.currentTimeMillis() - this.a > this.b) {
      this.c = paramDouble;
      b();
    }
  }

  private void b() {
    repaint(30L);
  }

  private void a(int paramInt) {
    double d = (paramInt - this.e);
    int i = a();
    if (d / i < 0.0D || d / i <= 1.0D)
      ;
  }

  public Dimension getMinimumSize() {
    return new Dimension(50, 15);
  }

  public Dimension getPreferredSize() {
    return new Dimension(150, 20);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
