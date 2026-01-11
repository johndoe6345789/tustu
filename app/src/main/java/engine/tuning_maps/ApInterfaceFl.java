package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class ApInterfaceFl implements ActionListener {
  ApInterfaceFl(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bL, jCheckBoxMenuItem.getState() + "");
    bV.d(SComponentGolf.b("Changes will take effect next time you start TunerStudio."), jCheckBoxMenuItem);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */