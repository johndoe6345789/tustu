package bt;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

class aL extends JScrollPane {
  private int b = 380;
  
  public aL(an paraman, Component paramComponent) {
    super(paramComponent);
    setHorizontalScrollBarPolicy(31);
    setBorder(BorderFactory.createEmptyBorder());
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (dimension.getHeight() > this.b)
      dimension.height = this.b; 
    return dimension;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (dimension.getHeight() > this.b)
      dimension.height = this.b; 
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */