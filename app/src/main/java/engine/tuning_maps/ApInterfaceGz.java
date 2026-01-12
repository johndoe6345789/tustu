package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.IOPropertiesUsingFile;

class ApInterfaceGz implements ActionListener {
  gz(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    IOPropertiesUsingFile.IOPropertiesUsingFile()
        .b(IOPropertiesUsingFile.bs, jCheckBoxMenuItem.getState() + "");
    dB.b(this.IOPropertiesUsingFile);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
