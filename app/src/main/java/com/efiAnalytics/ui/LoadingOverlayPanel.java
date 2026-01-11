package com.efiAnalytics.ui;

import V.ExceptionInVPackage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class LoadingOverlayPanel extends JPanel {
  private Image b = null;
  
  private String c = "";
  
  fK ExceptionInVPackage = null;
  
  protected Image ExceptionInVPackage() {
    if (this.b == null)
      try {
        this.b = cO.ExceptionInVPackage().ExceptionInVPackage(cO.v);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(fJ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
      }  
    return this.b;
  }
  
  public void paintChildren(Graphics paramGraphics) {
    super.paintChildren(paramGraphics);
    if (this.ExceptionInVPackage != null && this.ExceptionInVPackage.ExceptionInVPackage) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Image image = ExceptionInVPackage();
      if (image != null) {
        int j = image.getWidth(null) / 2;
        int k = image.getHeight(null) / 2;
        int m = (getWidth() - j) / 2;
        int n = (getHeight() - k) / 2;
        paramGraphics.drawImage(image, m, n, j, k, null);
      } 
      paramGraphics.setFont(UIManager.getFont("Label.font"));
      int i = (getWidth() - getFontMetrics(paramGraphics.getFont()).stringWidth(this.c)) / 2;
      paramGraphics.drawString(this.c, i, getHeight() - paramGraphics.getFont().getSize());
    } 
  }
  
  public void b() {
    c();
    this.ExceptionInVPackage = new fK(this);
    this.ExceptionInVPackage.start();
  }
  
  public void c() {
    if (this.ExceptionInVPackage != null) {
      this.ExceptionInVPackage.ExceptionInVPackage();
      this.ExceptionInVPackage = null;
    } 
    repaint();
  }
  
  public void ExceptionInVPackage(String paramString) {
    this.c = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */