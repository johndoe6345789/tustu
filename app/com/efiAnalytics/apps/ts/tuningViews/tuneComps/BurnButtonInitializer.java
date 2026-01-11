package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import V.ExceptionInVPackage;
import com.efiAnalytics.ui.cO;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import n.JPanelExtensionInNPackage;

class BurnButtonInitializer implements Runnable {
  c(BurnButtonTv paramBurnButtonTv) {}
  
  public void run() {
    int i = this.ExceptionInVPackage.c.getWidth();
    int j = this.ExceptionInVPackage.c.getHeight();
    int k = (j / 2 < i / 4) ? (j / 2) : (i / 4);
    Font font = this.ExceptionInVPackage.c.getFont();
    byte JPanelExtensionInNPackage = 0;
    do {
      font = new Font(font.getFamily(), font.getStyle(), ++JPanelExtensionInNPackage);
    } while (i / 2 - k > this.ExceptionInVPackage.c.getFontMetrics(font).stringWidth(this.ExceptionInVPackage.c.getText()) && JPanelExtensionInNPackage < j / 2);
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.W, this.ExceptionInVPackage.c, k);
      this.ExceptionInVPackage.f = new ImageIcon(image);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.Z, this.ExceptionInVPackage.c, k);
      this.ExceptionInVPackage.g = new ImageIcon(image);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(JPanelExtensionInNPackage.class.getName()).log(Level.INFO, "Unable to load burn button image.", (Throwable)ExceptionInVPackage);
    } 
    this.ExceptionInVPackage.enableBurn(this.ExceptionInVPackage.h);
    this.ExceptionInVPackage.c.setFont(font);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */