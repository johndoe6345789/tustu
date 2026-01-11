package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class gu implements ActionListener {
  gu(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.a().b(a.bF, jCheckBoxMenuItem.getState() + "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */