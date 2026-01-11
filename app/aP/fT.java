package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class fT implements ActionListener {
  fT(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.a().b(a.F, Boolean.toString(jCheckBoxMenuItem.getState()));
    a.a().b(a.H, Boolean.toString(!jCheckBoxMenuItem.getState()));
    dB.b(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */