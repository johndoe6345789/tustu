package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ApInterfaceFg implements ActionListener {
  ApInterfaceFg(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    jCheckBoxMenuItem.setSelected(true);
    this.a.c.a(this.a.h, paramActionEvent.getActionCommand());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */