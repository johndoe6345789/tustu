package business.buffer_zones;

import bH.D;
import com.efiAnalytics.apps.ts.dashboard.x;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

public class ManagerPreferredlayoutsize implements LayoutManager {
  private x a(Container paramContainer) {
    if (paramContainer.getComponentCount() > 0 && paramContainer.getComponent(0) instanceof x)
      return (x) paramContainer.getComponent(0);
    x x = null;
    for (Component component : paramContainer.getComponents()) {
      if (component instanceof x) {
        x = (x) component;
        break;
      }
    }
    return x;
  }

  public void addLayoutComponent(String paramString, Component paramComponent) {}

  public void removeLayoutComponent(Component paramComponent) {}

  public Dimension preferredLayoutSize(Container paramContainer) {
    x x = a(paramContainer);
    return (x == null) ? new Dimension(1, 1) : x.getPreferredSize();
  }

  public Dimension minimumLayoutSize(Container paramContainer) {
    x x = a(paramContainer);
    return (x == null) ? new Dimension(1, 1) : x.getMinimumSize();
  }

  public void layoutContainer(Container paramContainer) {
    Insets insets = paramContainer.getInsets();
    int i = insets.left;
    int j = insets.top;
    int k = paramContainer.getWidth() - insets.left - insets.right;
    int m = paramContainer.getHeight() - insets.top - insets.bottom;
    x x = a(paramContainer);
    if (x == null) {
      if (paramContainer.getComponentCount() > 0)
        D.b("The Parent of a Container using ClusterHolderLayout must only have a GaugeCluster.");
      return;
    }
    if (x.G() && x.I() > 0.0D && x.H() > 0.0D) {
      double d1 = k / m;
      double d2 = x.H() / x.I();
      if (d1 > d2) {
        k = (int) Math.round(d2 * m);
        i = (paramContainer.getWidth() - k) / 2;
      } else {
        m = (int) Math.round(k / d2);
        j = (paramContainer.getHeight() - m) / 2;
      }
    }
    x.setBounds(i, j, k, m);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bz/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
