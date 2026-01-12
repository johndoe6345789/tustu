package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class dg implements ActionListener {
  dg(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem) paramActionEvent.getSource();
    String str = jMenuItem.getActionCommand();
    IOProperties.d(str);
    JPopupMenu jPopupMenu = (JPopupMenu) jMenuItem.getParent();
    for (byte b = 0; b < jPopupMenu.getComponentCount(); b++) {
      if (jPopupMenu.getComponent(b) instanceof JCheckBoxMenuItem) {
        JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) jPopupMenu.getComponent(b);
        jCheckBoxMenuItem.setState(
            jCheckBoxMenuItem.getName().equals(IOProperties.c("DEFAULT_" + str)));
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
