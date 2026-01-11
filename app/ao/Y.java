package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

final class Y implements ActionListener {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    String str1 = jMenuItem.getName();
    String str2 = jMenuItem.getActionCommand();
    bq.a().b().a(str1, str2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/Y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */