package br;

import java.awt.Graphics;
import javax.swing.JLabel;

class JLabelExtensionInBrPackage extends JLabel {
  G(s params) {}
  
  public void paint(Graphics paramGraphics) {
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    super.paint(paramGraphics);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */