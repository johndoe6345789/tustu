package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApInterfaceFu implements ActionListener {
  ApInterfaceFu(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.F, Boolean.toString(!jCheckBoxMenuItem.getState()));
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.H, Boolean.toString(jCheckBoxMenuItem.getState()));
    dB.b(this.IOPropertiesUsingFile);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */