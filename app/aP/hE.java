package aP;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;

class hE extends JScrollPane {
  public hE(hC paramhC, Component paramComponent) {
    super(paramComponent);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    dimension.width += 25;
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */