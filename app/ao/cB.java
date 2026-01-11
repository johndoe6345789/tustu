package ao;

import at.c;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class cB implements ActionListener {
  cB(cd paramcd, JMenu paramJMenu) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JMenuItem jMenuItem = (JMenuItem)paramActionEvent.getSource();
    if (bV.a("Are you sure you want to delete the Settings Profile: " + jMenuItem.getText(), jMenuItem, true) && c.a().b(jMenuItem.getText()))
      this.a.remove(jMenuItem); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */