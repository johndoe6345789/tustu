package aO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class ActionListenerImplInAoPackage implements ActionListener {
  ActionListenerImplInAoPackage(a parama) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    this.a.k.a(jCheckBoxMenuItem.getState());
    this.a.k.e();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
