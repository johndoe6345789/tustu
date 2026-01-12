package aP;

import G.R;
import G.T;
import aE.PropertiesExtension;
import bA.JCheckBoxMenuItemExtension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceDq implements ActionListener {
  ApInterfaceDq(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    PropertiesExtension PropertiesExtension = PropertiesExtension.A();
    if (PropertiesExtension != null) {
      JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension =
          (JCheckBoxMenuItemExtension) paramActionEvent.getSource();
      PropertiesExtension.PropertiesExtension(JCheckBoxMenuItemExtension.getState());
      R r = T.PropertiesExtension().JCheckBoxMenuItemExtension();
      if (r != null) r.O().b(JCheckBoxMenuItemExtension.getState());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
