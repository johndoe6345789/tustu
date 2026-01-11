package aP;

import aE.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class fY implements ActionListener {
  fY(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.A().b(jCheckBoxMenuItem.getState());
    if (jCheckBoxMenuItem.getState()) {
      f.a().J();
    } else {
      f.a().K();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */