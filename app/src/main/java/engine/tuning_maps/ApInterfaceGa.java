package aP;

import com.efiAnalytics.ui.dI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApInterfaceGa implements ActionListener {
  ApInterfaceGa(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile()
        .b(IOPropertiesUsingFile.aa, Boolean.toString(jCheckBoxMenuItem.getState()));
    if (jCheckBoxMenuItem.getState()) {
      dI.IOPropertiesUsingFile().b();
    } else {
      dI.IOPropertiesUsingFile().c();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
