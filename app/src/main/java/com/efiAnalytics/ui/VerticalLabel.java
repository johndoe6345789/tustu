package com.efiAnalytics.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JLabel;

public class VerticalLabel extends JLabel {
  String a = "";

  private Dimension b = null;

  public VerticalLabel() {}

  public VerticalLabel(String paramString) {
    setText(paramString);
    repaint();
  }

  public void setText(String paramString) {
    this.a = paramString;
    setToolTipText(paramString);
    repaint();
  }

  public String getText() {
    return this.a;
  }

  public void paint(Graphics paramGraphics) {
    int i = getFontMetrics(getFont()).getHeight();
    int j = (getSize()).height;
    int k = (getSize()).width;
    int m = this.a.length() * i;
    if (isOpaque() && getBackground() != null) {
      paramGraphics.setColor(getBackground());
      paramGraphics.fillRect(0, 0, k, j);
    }
    if (isEnabled()) {
      paramGraphics.setColor(getForeground());
    } else {
      paramGraphics.setColor(Color.GRAY);
    }
    for (byte b = 0; b < this.a.length(); b++) {
      int n = (i - 1) * (b + 1);
      int i1 = (j - m > 0) ? ((j - m) / 2 + n) : n;
      int i2 = (k - getFontMetrics(getFont()).charWidth(this.a.charAt(b))) / 2;
      if (i1 > j - 2 * getFont().getSize() && this.a.length() - b > 2) {
        paramGraphics.drawString(".", i2, i1);
        paramGraphics.drawString(".", i2, i1 + i / 2);
      } else if (i1 < j) {
        paramGraphics.drawString("" + this.a.charAt(b), i2, i1);
      }
    }
  }

  public Dimension getPreferredSize() {
    int i = getFontMetrics(getFont()).getHeight();
    return new Dimension(i, getFont().getSize());
  }

  public Dimension getMinimumSize() {
    return (this.b != null) ? this.b : super.getMinimumSize();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
