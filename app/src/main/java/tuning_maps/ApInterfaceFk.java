package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApInterfaceFk implements ActionListener {
  fK(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    boolean bool = jCheckBoxMenuItem.getState();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bh, bool + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */