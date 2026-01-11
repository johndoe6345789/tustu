package bF;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

class ManagerAddlayoutcomponent implements LayoutManager {
  private int b = 0;
  
  u(d paramd) {}
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return this.a.g.getPreferredSize();
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return this.a.g.getMinimumSize();
  }
  
  public void layoutContainer(Container paramContainer) {
    Dimension dimension = this.a.g.getPreferredSize();
    this.a.g.setBounds(0, this.b, dimension.width, dimension.height);
  }
  
  public void a(int paramInt) {
    this.b = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */