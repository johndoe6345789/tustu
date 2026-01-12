package aP;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ApInterfaceCi implements ActionListener {
  ApInterfaceCi(cc paramcc) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    if (jCheckBoxMenuItem.getState()) {
      IOProperties.c("fieldSelectionStyle", "selectFromDash");
    } else {
      IOProperties.c("fieldSelectionStyle", "standardSelection");
    }
    bV.d("The Changes will take effect after restarting.", bV.c());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
