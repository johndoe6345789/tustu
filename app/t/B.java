package t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class B implements ActionListener {
  B(w paramw) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.a(jCheckBoxMenuItem.getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */