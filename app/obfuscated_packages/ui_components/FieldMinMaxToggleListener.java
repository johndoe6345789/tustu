package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

final class V implements ActionListener {
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.isSelected()) {
      S.a(jCheckBoxMenuItem.getName());
    } else {
      String str = IOProperties.c("FIELD_MIN_MAX_" + jCheckBoxMenuItem.getName());
      if (str != null && str.indexOf(";") != -1) {
        String str1 = str.substring(0, str.indexOf(";"));
        String str2 = str.substring(str.indexOf(";") + 1, str.length());
        S.a(jCheckBoxMenuItem.getName(), str1, str2);
      } else {
        S.a(jCheckBoxMenuItem.getName(), "", "");
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */