package aP;

import G.J;
import bA.JCheckBoxMenuItemExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceDs implements ActionListener {
  ApInterfaceDs(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)paramActionEvent.getSource();
    boolean bool = JCheckBoxMenuItemExtension.getState();
    J.e(bool);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */