package com.efiAnalytics.apps.ts.dashboard;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.io.Serializable;

public class DashboardLayoutManager implements LayoutManager2, Serializable {
  public void layoutContainer(Container paramContainer) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof s) {
        s s = (s)arrayOfComponent[b];
        int i = (int)Math.round(paramContainer.getWidth() * s.getRelativeX());
        int j = (int)Math.round(paramContainer.getHeight() * s.getRelativeY());
        int k = (int)Math.round(paramContainer.getWidth() * s.getRelativeWidth());
        int m = (int)Math.round(paramContainer.getHeight() * s.getRelativeHeight());
        s.setBounds(i, j, k, m);
        s.validate();
      } 
    } 
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return new Dimension(320, 260);
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return new Dimension(320, 240);
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public void addLayoutComponent(Component paramComponent, Object paramObject) {}
  
  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }
  
  public float getLayoutAlignmentX(Container paramContainer) {
    return 0.5F;
  }
  
  public float getLayoutAlignmentY(Container paramContainer) {
    return 0.5F;
  }
  
  public void invalidateLayout(Container paramContainer) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */