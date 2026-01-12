package ao;

import W.j;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

final class T implements ActionListener {
  T(j paramj) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      hx.a().a(this.a, this.a.s());
    } else {
      hx.a().a(this.a);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/T.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
