package aP;

import G.R;
import G.T;
import aE.PropertiesExtension;
import bA.JCheckBoxMenuItemExtension;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceFc implements ActionListener {
  fc(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    R r = T.PropertiesExtension().JCheckBoxMenuItemExtension();
    JCheckBoxMenuItemExtension JCheckBoxMenuItemExtension = (JCheckBoxMenuItemExtension)paramActionEvent.getSource();
    boolean bool = JCheckBoxMenuItemExtension.getState();
    if (r != null)
      if (!bool) {
        if (PropertiesExtension.A().J()) {
          String str = "In read only mode!\nYou are currently using PropertiesExtension Temporary Project that is intended for view only.\nPlease use PropertiesExtension project you created specifically for your controller to connect.";
          bV.d(str, dd.PropertiesExtension().JCheckBoxMenuItemExtension());
          return;
        } 
        f.PropertiesExtension().PropertiesExtension(r);
      } else {
        r.I();
        r.C().JCheckBoxMenuItemExtension();
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */