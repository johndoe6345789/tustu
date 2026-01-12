package com.efiAnalytics.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

public class ImagePreviewPanel extends ck {
  Image a = null;

  public ImagePreviewPanel() {
    Dimension dimension = new Dimension(150, 200);
    setPreferredSize(dimension);
    setMinimumSize(dimension);
  }

  public void paint(Graphics paramGraphics) {
    double d = 0.75D;
    paramGraphics.clearRect(0, 0, getWidth(), getHeight());
    if (this.a != null) {
      if (this.a.getHeight(null) > 0) d = this.a.getWidth(null) / this.a.getHeight(null);
      int i = getWidth() - 6;
      paramGraphics.drawImage(this.a, 6, 3, i, (int) (i * d), this);
    }
  }

  public boolean imageUpdate(
      Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    repaint();
    return true;
  }

  public void a(File paramFile) {
    if (paramFile != null) {
      this.a = Toolkit.getDefaultToolkit().getImage(paramFile.getAbsolutePath());
      repaint();
    } else {
      this.a = null;
    }
  }

  public void b(File paramFile) {
    this.a = null;
    repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
