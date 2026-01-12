package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dZ implements ActionListener {
  dZ(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    IOProperties.c(IOProperties.aa, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    cd.c(this.a);
    this.a.a.o();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
