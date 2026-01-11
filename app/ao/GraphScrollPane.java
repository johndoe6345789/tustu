package ao;

import com.efiAnalytics.ui.eJ;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JScrollPane;

class hv extends JScrollPane {
  JComponent a;
  
  hv(hj paramhj, JComponent paramJComponent) {
    super(paramJComponent);
    this.a = paramJComponent;
    setHorizontalScrollBarPolicy(31);
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (getVerticalScrollBar() != null) {
      (this.a.getMinimumSize()).width += getVerticalScrollBar().getWidth();
    } else {
      (this.a.getMinimumSize()).width += eJ.a(17);
    } 
    return dimension;
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (getVerticalScrollBar() != null) {
      (this.a.getPreferredSize()).width += getVerticalScrollBar().getWidth();
    } else {
      (this.a.getPreferredSize()).width += eJ.a(17);
    } 
    (this.a.getPreferredSize()).height += 2;
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */