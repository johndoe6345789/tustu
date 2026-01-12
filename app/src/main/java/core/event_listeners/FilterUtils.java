package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dw implements ActionListener {
  dw(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      int i = Integer.parseInt(jCheckBoxMenuItem.getActionCommand());
      this.a.a("numberOfGraphs", i);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
