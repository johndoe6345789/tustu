package ao;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ct implements ActionListener {
  ct(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    i.c(i.az, Boolean.toString(jCheckBoxMenuItem.getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */