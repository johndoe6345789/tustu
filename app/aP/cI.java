package aP;

import com.efiAnalytics.ui.bV;
import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cI implements ActionListener {
  cI(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.getState()) {
      i.c("fieldSelectionStyle", "selectFromDash");
    } else {
      i.c("fieldSelectionStyle", "standardSelection");
    } 
    bV.d("The Changes will take effect after restarting.", bV.c());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */