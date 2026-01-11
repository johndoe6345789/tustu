package bF;

import java.awt.Color;
import javax.swing.UIManager;

class p extends v {
  p(d paramd) {
    super(paramd.a);
    a(false);
    setBackground(UIManager.getColor("Label.background"));
    setFont(UIManager.getFont("Menu.font"));
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(UIManager.getColor("Label.background"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */