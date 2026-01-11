package ao;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dq implements ActionListener {
  dq(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    i.c(i.ah, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    aw.g(jCheckBoxMenuItem.isSelected());
    int i = i.b("lineTraceSize", i.ae);
    if (jCheckBoxMenuItem.isSelected() && i < 2) {
      this.a.a.p().c(2);
      i.c("lineTraceSize", "2");
    } 
    if (jCheckBoxMenuItem.isSelected()) {
      this.a.a.p().b(true);
      i.c(i.af, Boolean.toString(true));
    } 
    this.a.a.p().i();
    this.a.a.p().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */