package com.efiAnalytics.apps.ts.tuningViews;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;

public class TuneViewComponentLayout implements LayoutManager2 {
  TuneViewComponent a;
  
  g b;
  
  Component c = null;
  
  public h(TuneViewComponent paramTuneViewComponent) {
    this.a = paramTuneViewComponent;
    this.b = new g(paramTuneViewComponent);
    this.a.add(this.b);
  }
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = insets.top;
      int j = paramContainer.getHeight() - insets.bottom;
      int k = insets.left;
      int m = paramContainer.getWidth() - insets.right;
      if (this.c != null)
        this.c.setBounds(k, i, m - k, j - i); 
      if (this.a.isEditMode() && this.a.isShieldedDuringEdit()) {
        this.b.setBounds(k, i, m - k, j - i);
        if (this.a.getBtnSelectEcuConfig() != null) {
          Dimension dimension = this.a.getBtnSelectEcuConfig().getPreferredSize();
          this.a.getBtnSelectEcuConfig().setBounds(this.a.getWidth() - dimension.width, 0, dimension.width, dimension.height);
        } 
      } else {
        this.b.setBounds(0, 0, 0, 0);
      } 
    } 
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return this.a.getPreferredSize();
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return this.a.getMinimumSize();
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {
    if (this.a.getBtnSelectEcuConfig() == null || !this.a.getBtnSelectEcuConfig().equals(paramComponent))
      this.c = paramComponent; 
  }
  
  public void removeLayoutComponent(Component paramComponent) {
    if (this.c != null && this.c.equals(paramComponent))
      this.c = null; 
  }
  
  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    if (this.a.getBtnSelectEcuConfig() == null || !this.a.getBtnSelectEcuConfig().equals(paramComponent))
      this.c = paramComponent; 
  }
  
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */