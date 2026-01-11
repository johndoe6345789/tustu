package com.efiAnalytics.apps.ts.tuningViews;

import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;

public class l implements LayoutManager2 {
  public void layoutContainer(Container paramContainer) {
    Component[] arrayOfComponent = paramContainer.getComponents();
    Insets insets = paramContainer.getInsets();
    double d1 = (paramContainer.getWidth() - insets.left - insets.right);
    double d2 = (paramContainer.getHeight() - insets.top - insets.bottom);
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof TuneViewComponent) {
        TuneViewComponent tuneViewComponent = (TuneViewComponent)arrayOfComponent[b];
        int i = insets.left + (int)Math.round(d1 * tuneViewComponent.getRelativeX());
        int j = insets.top + (int)Math.round(d2 * tuneViewComponent.getRelativeY());
        int k = (int)Math.round(d1 * tuneViewComponent.getRelativeWidth());
        int m = (int)Math.round(d2 * tuneViewComponent.getRelativeHeight());
        tuneViewComponent.setBounds(i, j, k, m);
        tuneViewComponent.validate();
      } 
    } 
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return new Dimension(eJ.a(320), eJ.a(260));
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return new Dimension(eJ.a(320), eJ.a(240));
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */