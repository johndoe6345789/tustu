package aP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class ga implements ActionListener {
  ga(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.a().b(a.bf, jCheckBoxMenuItem.getState() + "");
    if (!jCheckBoxMenuItem.getState())
      a.a().b(a.bg, jCheckBoxMenuItem.getState() + ""); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/ga.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */