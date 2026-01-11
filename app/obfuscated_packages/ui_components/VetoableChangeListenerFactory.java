package ao;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dp implements ActionListener {
  dp(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    i.c(i.af, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    this.a.a.p().b(jCheckBoxMenuItem.isSelected());
    this.a.a.p().i();
    this.a.a.p().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */