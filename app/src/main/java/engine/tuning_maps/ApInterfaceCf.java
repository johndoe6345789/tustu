package aP;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import s.SComponentGolf;

class ApInterfaceCf implements ActionListener {
  ApInterfaceCf(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      int IOProperties = Integer.parseInt(jCheckBoxMenuItem.getActionCommand());
      IOProperties.c("numberOfGraphs", IOProperties + "");
      bV.d(SComponentGolf.b("The changes will take effect after a restart."), jCheckBoxMenuItem);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */