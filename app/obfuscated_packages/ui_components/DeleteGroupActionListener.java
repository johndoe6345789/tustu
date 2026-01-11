package ao;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

final class Q implements ActionListener {
  Q(Component paramComponent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    String str = jMenuItem.getName();
    if (bV.a("Are you sure you want to delete the field group: " + str, this.a, true))
      IOProperties.d("GRAPH_FIELD_GROUP_NAME_" + str); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */