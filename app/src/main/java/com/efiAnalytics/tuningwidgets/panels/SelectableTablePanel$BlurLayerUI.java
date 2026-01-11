package com.efiAnalytics.tuningwidgets.panels;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import javax.swing.JComponent;
import javax.swing.plaf.LayerUI;

class SelectableTablePanel$BlurLayerUI extends LayerUI {
  private BufferedImage a;
  
  private BufferedImageOp b;
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent) {
    int i = paramJComponent.getWidth();
    int j = paramJComponent.getHeight();
    if (i == 0 || j == 0)
      return; 
    if (this.a == null || this.a.getWidth() != i || this.a.getHeight() != j)
      this.a = new BufferedImage(i, j, 1); 
    Graphics2D graphics2D1 = this.a.createGraphics();
    graphics2D1.setClip(paramGraphics.getClip());
    super.paint(graphics2D1, paramJComponent);
    graphics2D1.dispose();
    Graphics2D graphics2D2 = (Graphics2D)paramGraphics;
    graphics2D2.drawImage(this.a, this.b, 0, 0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/SelectableTablePanel$BlurLayerUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */