package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class fJ implements ActionListener {
  fJ(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    jCheckBoxMenuItem.setSelected(true);
    a.a().b("navigationStyle", jCheckBoxMenuItem.getActionCommand());
    this.a.c(jCheckBoxMenuItem.getActionCommand());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */