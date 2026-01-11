package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class fQ implements ActionListener {
  fQ(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bl, jCheckBoxMenuItem.getState() + "");
    if (bV.IOPropertiesUsingFile(SComponentGolf.b("The Project must be re-loaded for changes to take effect.") + "\n" + SComponentGolf.b("Would you like to reload the project now?"), jCheckBoxMenuItem, true))
      f.IOPropertiesUsingFile().z(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */