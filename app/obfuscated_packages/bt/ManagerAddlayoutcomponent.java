package bt;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

class ManagerAddlayoutcomponent implements LayoutManager {
  bJ(bI parambI) {}
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return paramContainer.getPreferredSize();
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return paramContainer.getMinimumSize();
  }
  
  public void layoutContainer(Container paramContainer) {
    if (paramContainer.getComponentCount() > 0 && paramContainer.getComponent(0) instanceof Gauge) {
      Gauge gauge = (Gauge)paramContainer.getComponent(0);
      double d = 1.3333333730697632D * gauge.getRelativeWidth() / gauge.getRelativeHeight();
      if (gauge.isShapeLockedToAspect()) {
        int i = Math.min(paramContainer.getHeight(), paramContainer.getWidth());
        gauge.setBounds((paramContainer.getWidth() - i) / 2, (paramContainer.getHeight() - i) / 2, i, i);
      } else if (d > 1.0D) {
        int i = (int)Math.round(paramContainer.getHeight() / d);
        int j = (paramContainer.getHeight() - i) / 2;
        gauge.setBounds(0, j, paramContainer.getWidth(), i);
      } else {
        int i = (int)Math.round(paramContainer.getHeight() * d);
        int j = (paramContainer.getWidth() - i) / 2;
        gauge.setBounds(j, 0, i, paramContainer.getHeight());
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */