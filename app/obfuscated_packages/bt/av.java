package bt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class av implements ActionListener {
  av(an paraman) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.z.a(an.f, jCheckBoxMenuItem.getState() + "");
    this.a.p.d(jCheckBoxMenuItem.getState());
    this.a.p.e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */