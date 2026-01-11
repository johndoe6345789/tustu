package aP;

import ao.aw;
import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cw implements ActionListener {
  cw(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    i.c(i.ah, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    aw.g(jCheckBoxMenuItem.isSelected());
    int i = i.b("lineTraceSize", i.ae);
    if (jCheckBoxMenuItem.isSelected() && i < 2) {
      this.a.b.p().c(2);
      i.c("lineTraceSize", "2");
    } 
    if (jCheckBoxMenuItem.isSelected()) {
      this.a.b.p().b(true);
      i.c(i.af, Boolean.toString(true));
    } 
    this.a.b.p().i();
    this.a.b.p().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */