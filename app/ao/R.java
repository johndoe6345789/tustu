package ao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JMenuItem;

final class R implements ActionListener {
  R(List paramList) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    String str = jMenuItem.getName();
    O.a(this.a, str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/R.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */