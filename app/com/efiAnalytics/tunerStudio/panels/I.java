package com.efiAnalytics.tunerStudio.panels;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class I implements ActionListener {
  I(H paramH) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (Component component = (Component)paramActionEvent.getSource(); component != null; component = component.getParent()) {
      if (component instanceof JDialog)
        ((JDialog)component).dispose(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */