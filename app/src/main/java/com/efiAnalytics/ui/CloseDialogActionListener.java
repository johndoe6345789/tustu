package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class CloseDialogActionListener implements ActionListener {
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (Component component = (Component)paramActionEvent.getSource(); component != null; component = component.getParent()) {
      if (component instanceof JDialog) {
        ((JDialog)component).dispose();
        return;
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */