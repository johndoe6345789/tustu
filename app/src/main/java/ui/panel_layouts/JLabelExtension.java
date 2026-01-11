package aW;

import java.awt.Dimension;
import javax.swing.JLabel;

class JLabelExtension extends JLabel {
  int a = 80;
  
  JLabelExtension(e parame, String paramString) {
    super(paramString, 4);
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (dimension.width < this.a)
      dimension.width = this.a; 
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (dimension.width < this.a)
      dimension.width = this.a; 
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */