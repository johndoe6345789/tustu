package bt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class aw implements ActionListener {
  aw(an paraman) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    this.a.z.a(an.l, jCheckBoxMenuItem.getState() + "");
    this.a.p.f(jCheckBoxMenuItem.getState());
    this.a.p.o();
    this.a.p.repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */