package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cM implements ActionListener {
  cM(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      IOProperties.c("forceOpenGL", Boolean.toString(true));
      IOProperties.c("disableD3d", Boolean.toString(false));
      cd.b(this.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */