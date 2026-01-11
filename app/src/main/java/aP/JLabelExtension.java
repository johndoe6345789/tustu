package aP;

import java.awt.Graphics;
import javax.swing.JLabel;

class JLabelExtension extends JLabel {
  public JLabelExtension(ir paramir, String paramString) {
    super(paramString);
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    paramGraphics.drawLine(3, 13, getWidth() - 3, 13);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/is.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */