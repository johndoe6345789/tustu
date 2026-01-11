package com.efiAnalytics.ui;

import bz.a;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class fl extends JPanel {
  a a = new a(0, 5, eJ.a(6), eJ.a(6));
  
  int b = 160;
  
  int c = -1;
  
  public fl() {
    setLayout((LayoutManager)this.a);
    this.a.a(false);
    String str = "Y Axis Selectors";
    if (bV.a() != null)
      str = bV.a().a(str); 
    setBorder(BorderFactory.createTitledBorder(str));
  }
  
  public void setSize(int paramInt1, int paramInt2) {
    a(paramInt1);
    super.setSize(paramInt1, paramInt2);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a(paramInt3);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private int a() {
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
    i += (i > eJ.a(120)) ? 0 : eJ.a(20);
    return i;
  }
  
  public void a(int paramInt) {
    if (getComponentCount() > 0) {
      byte b = 2;
      int i = paramInt / a();
      if (i < b)
        i = b; 
      this.a.b(i);
      this.a.a(0);
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