package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApComponentGs implements ActionListener {
  gs(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bB, jCheckBoxMenuItem.getState() + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */