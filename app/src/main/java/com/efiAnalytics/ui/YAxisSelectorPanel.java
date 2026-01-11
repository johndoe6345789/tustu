package com.efiAnalytics.ui;

import bz.ManagerRemovelayoutcomponent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class YAxisSelectorPanel extends JPanel {
  ManagerRemovelayoutcomponent ManagerRemovelayoutcomponent = new ManagerRemovelayoutcomponent(0, 5, eJ.ManagerRemovelayoutcomponent(6), eJ.ManagerRemovelayoutcomponent(6));
  
  int b = 160;
  
  int c = -1;
  
  public YAxisSelectorPanel() {
    setLayout((LayoutManager)this.ManagerRemovelayoutcomponent);
    this.ManagerRemovelayoutcomponent.ManagerRemovelayoutcomponent(false);
    String str = "Y Axis Selectors";
    if (bV.ManagerRemovelayoutcomponent() != null)
      str = bV.ManagerRemovelayoutcomponent().ManagerRemovelayoutcomponent(str); 
    setBorder(BorderFactory.createTitledBorder(str));
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    ManagerRemovelayoutcomponent(paramInt1);
    super.setSize(paramInt1, paramInt2);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ManagerRemovelayoutcomponent(paramInt3);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private int ManagerRemovelayoutcomponent() {
    int i = 30;
    Component[] arrayOfComponent = getComponents();
    for (byte b = 0; b < arrayOfComponent.length; b++) {
      if (arrayOfComponent[b] instanceof fn) {
        fn fn = (fn)arrayOfComponent[b];
        int j = (fn.getMinimumSize()).width;
        if (i < j)
          i = j; 
      } 
    } 
    i += (i > eJ.ManagerRemovelayoutcomponent(120)) ? 0 : eJ.ManagerRemovelayoutcomponent(20);
    return i;
  }
  
  public void ManagerRemovelayoutcomponent(int paramInt) {
    if (getComponentCount() > 0) {
      byte b = 2;
      int i = paramInt / ManagerRemovelayoutcomponent();
      if (i < b)
        i = b; 
      this.ManagerRemovelayoutcomponent.b(i);
      this.ManagerRemovelayoutcomponent.ManagerRemovelayoutcomponent(0);
      if (i != this.c && getParent() != null) {
        fm fm = new fm(this);
        SwingUtilities.invokeLater(fm);
      } 
      this.c = i;
    } 
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    dimension.width = 200;
    return dimension;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */