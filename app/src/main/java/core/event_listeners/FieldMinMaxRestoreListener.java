package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

final class W implements ActionListener {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    String str1 = IOProperties.a("FIELD_MIN_MAX_" + jMenuItem.getName(), "");
    String str2 = str1.substring(0, str1.indexOf(";"));
    String str3 = str1.substring(str1.indexOf(";") + 1, str1.length());
    S.a(jMenuItem.getName(), str2, str3);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/W.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */