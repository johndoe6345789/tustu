package aP;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ApInterfaceCq implements ActionListener {
  cQ(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOProperties.c(IOProperties.az, Boolean.toString(jCheckBoxMenuItem.getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */