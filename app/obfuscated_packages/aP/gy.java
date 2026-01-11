package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class gy implements ActionListener {
  gy(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bp, jCheckBoxMenuItem.getState() + "");
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bn, jCheckBoxMenuItem.getState() + "");
    if (jCheckBoxMenuItem.getState()) {
      bV.d("Warning!!\n\nThe VE Analyze and Diagnostics tabs are not accessible in Lite Mode.\n\nYou must restart for the changes to take effect.", jCheckBoxMenuItem);
    } else {
      bV.d("You must restart for the changes to take effect.", jCheckBoxMenuItem);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */