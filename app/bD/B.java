package bD;

import com.efiAnalytics.ui.eJ;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JToolBar;

class B extends JToolBar {
  String a = "";
  
  Font b = new Font("Arial Unicode MS", 1, eJ.a(12));
  
  public B(r paramr, String paramString) {
    super(paramString);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.setFont(this.b);
    paramGraphics.drawString(this.a, 6, 12);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */