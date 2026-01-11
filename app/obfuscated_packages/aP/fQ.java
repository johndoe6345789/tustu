package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;
import s.g;

class fQ implements ActionListener {
  fQ(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.a().b(a.bl, jCheckBoxMenuItem.getState() + "");
    if (bV.a(g.b("The Project must be re-loaded for changes to take effect.") + "\n" + g.b("Would you like to reload the project now?"), jCheckBoxMenuItem, true))
      f.a().z(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */