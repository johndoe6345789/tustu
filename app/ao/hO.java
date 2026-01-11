package ao;

import com.efiAnalytics.ui.w;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Scrollable;

class hO extends JPanel implements Scrollable {
  hO(hE paramhE) {}
  
  public Dimension getPreferredScrollableViewportSize() {
    Dimension dimension = getPreferredSize();
    int i = a();
    if (i > 0) {
      dimension.height += i;
    } else if (i < 0) {
      dimension.width += Math.abs(i);
    } 
    return dimension;
  }
  
  public int getScrollableUnitIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return 10;
  }
  
  public int getScrollableBlockIncrement(Rectangle paramRectangle, int paramInt1, int paramInt2) {
    return ((paramInt1 == 1) ? paramRectangle.height : paramRectangle.width) - 10;
  }
  
  public boolean getScrollableTracksViewportWidth() {
    return true;
  }
  
  private int a() {
    List list = hE.b(this.a);
    int i = 0;
    for (w w : list)
      i += w.n(); 
    return i;
  }
  
  public boolean getScrollableTracksViewportHeight() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */