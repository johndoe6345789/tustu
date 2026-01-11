package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

class fR extends FlowLayout {
  fR(fL paramfL) {}
  
  public void layoutContainer(Container paramContainer) {
    Component component = paramContainer.getComponent(0);
    if (component != null) {
      Dimension dimension1 = component.getPreferredSize();
      Dimension dimension2 = paramContainer.getSize();
      int i = (dimension2.width - dimension1.width) / 2;
      int j = (dimension2.height - dimension1.height) / 2;
      int k = (dimension2.width > dimension1.width) ? dimension1.width : dimension2.width;
      int m = (dimension2.height > dimension1.height) ? dimension1.height : dimension2.height;
      if (j < 1)
        j = 0; 
      if (i < 1)
        i = 0; 
      component.setBounds(i, j, k, m);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */