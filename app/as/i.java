package as;

import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JTabbedPane;

class i extends JTabbedPane {
  i(g paramg) {}
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    if (getTabCount() == 0) {
      String str1 = "No log Servers found on the network.";
      String str2 = "Make sure the log server is running and connected to the same network.";
      int j = getHeight() / 2;
      FontMetrics fontMetrics = paramGraphics.getFontMetrics();
      paramGraphics.drawString(str1, (getWidth() - fontMetrics.stringWidth(str1)) / 2, j);
      j += paramGraphics.getFont().getSize();
      paramGraphics.drawString(str2, (getWidth() - fontMetrics.stringWidth(str2)) / 2, j);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */