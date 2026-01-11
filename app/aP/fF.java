package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class fF implements ActionListener {
  fF(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    jCheckBoxMenuItem.setSelected(true);
    this.a.c.b(this.a.h, paramActionEvent.getActionCommand());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */