package aP;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ApInterfaceCr implements ActionListener {
  ApInterfaceCr(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOProperties.c(IOProperties.ax, Boolean.toString(jCheckBoxMenuItem.getState()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */