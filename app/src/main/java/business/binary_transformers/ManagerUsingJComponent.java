package business.binary_transformers;

import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComponent;

class ManagerUsingJComponent implements LayoutManager {
  private JComponent d = null;
  
  JButton a = null;
  
  JButton b = null;
  
  ManagerUsingJComponent(an paraman, JComponent paramJComponent, JButton paramJButton1, JButton paramJButton2) {
    this.d = paramJComponent;
    this.a = paramJButton1;
    this.b = paramJButton2;
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return paramContainer.getPreferredSize();
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return paramContainer.getMinimumSize();
  }
  
  public void layoutContainer(Container paramContainer) {
    int i = eJ.a(6);
    if (this.a != null) {
      Dimension dimension = this.a.getPreferredSize();
      this.a.setSize(dimension);
      this.a.setLocation(paramContainer.getWidth() - eJ.a(5) - dimension.width, eJ.a(3));
    } 
    if (this.b != null) {
      Dimension dimension = this.b.getPreferredSize();
      this.b.setSize(dimension);
      this.b.setLocation(eJ.a(5), eJ.a(3));
      i += this.b.getWidth();
    } 
    if (this.c.t != null) {
      Dimension dimension = this.c.t.getPreferredSize();
      this.c.t.setSize(dimension);
      this.c.t.setLocation(i, eJ.a(3));
    } 
    if (this.d != null)
      if (this.c.E) {
        Dimension dimension = this.d.getPreferredSize();
        this.d.setBounds(0, paramContainer.getHeight() - dimension.height, paramContainer.getWidth(), dimension.height);
      } else {
        Dimension dimension = this.d.getPreferredSize();
        int j = this.a.getY() + this.a.getHeight();
        int k = (dimension.height < paramContainer.getHeight() - j) ? dimension.height : (paramContainer.getHeight() - j);
        int m = (dimension.width < paramContainer.getWidth()) ? dimension.width : paramContainer.getWidth();
        int n = paramContainer.getWidth() - m - eJ.a(5);
        int i1 = eJ.a(20);
        this.d.setBounds(n, i1, m, k);
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */