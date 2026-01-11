package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dW implements ActionListener {
  dW(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOProperties.c("fieldNameNormaization", Boolean.toString(jCheckBoxMenuItem.isSelected()));
    this.a.j.setEnabled(jCheckBoxMenuItem.isSelected());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */