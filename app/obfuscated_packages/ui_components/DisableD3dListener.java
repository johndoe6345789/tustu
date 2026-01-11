package ao;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cN implements ActionListener {
  cN(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      i.c("forceOpenGL", Boolean.toString(false));
      i.c("disableD3d", Boolean.toString(true));
      cd.b(this.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */