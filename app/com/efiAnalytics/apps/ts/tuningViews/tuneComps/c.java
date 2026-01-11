package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import V.a;
import com.efiAnalytics.ui.cO;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import n.b;

class c implements Runnable {
  c(BurnButtonTv paramBurnButtonTv) {}
  
  public void run() {
    int i = this.a.c.getWidth();
    int j = this.a.c.getHeight();
    int k = (j / 2 < i / 4) ? (j / 2) : (i / 4);
    Font font = this.a.c.getFont();
    byte b = 0;
    do {
      font = new Font(font.getFamily(), font.getStyle(), ++b);
    } while (i / 2 - k > this.a.c.getFontMetrics(font).stringWidth(this.a.c.getText()) && b < j / 2);
    try {
      Image image = cO.a().a(cO.W, this.a.c, k);
      this.a.f = new ImageIcon(image);
      image = cO.a().a(cO.Z, this.a.c, k);
      this.a.g = new ImageIcon(image);
    } catch (a a) {
      Logger.getLogger(b.class.getName()).log(Level.INFO, "Unable to load burn button image.", (Throwable)a);
    } 
    this.a.enableBurn(this.a.h);
    this.a.c.setFont(font);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */