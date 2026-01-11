package com.efiAnalytics.tunerStudio.panels;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

class DialogCloseListener implements ActionListener {
  DialogCloseListener(ProtocolStatsPanel paramF) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    for (Component component = (Component)paramActionEvent.getSource(); component != null; component = component.getParent()) {
      if (component instanceof JDialog)
        ((JDialog)component).dispose(); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */