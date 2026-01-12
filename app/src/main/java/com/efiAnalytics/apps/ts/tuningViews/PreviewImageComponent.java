package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.UIManager;

class PreviewImageComponent extends JComponent {
  private Image b = null;

  PreviewImageComponent(b paramb) {}

  public void paint(Graphics paramGraphics) {
    if (this.b != null) {
      paramGraphics.drawImage(this.b, 0, 0, getWidth(), getHeight(), null);
    } else {
      paramGraphics.setColor(UIManager.getColor("Label.foreground"));
      paramGraphics.drawString("No Image", 10, 20);
    }
  }

  public void a(Image paramImage) {
    this.b = paramImage;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
