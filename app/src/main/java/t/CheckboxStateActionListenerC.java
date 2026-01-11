package t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class CheckboxStateActionListenerC implements ActionListener {
  CheckboxStateActionListenerC(w paramw) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.c(jCheckBoxMenuItem.getState());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */