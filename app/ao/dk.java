package ao;

import com.efiAnalytics.ui.bV;
import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dk implements ActionListener {
  dk(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    jCheckBoxMenuItem.setSelected(true);
    i.c("lookAndFeelClass", paramActionEvent.getActionCommand());
    bV.d("The changes will take effect after the next restart.", this.a.i);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */