package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cu implements ActionListener {
  cu(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    IOProperties.c(IOProperties.ax, Boolean.toString(jCheckBoxMenuItem.getState()));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
