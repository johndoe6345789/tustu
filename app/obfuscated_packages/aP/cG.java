package aP;

import com.efiAnalytics.ui.bV;
import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import s.g;

class cG implements ActionListener {
  cG(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      int i = Integer.parseInt(jCheckBoxMenuItem.getActionCommand());
      i.c("numberOfOverlays", i + "");
      bV.d(g.b("The changes will take effect after a restart."), jCheckBoxMenuItem);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */