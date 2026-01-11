package aP;

import h.i;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class cv implements ActionListener {
  cv(cc paramcc) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    i.c(i.af, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    this.a.b.p().b(jCheckBoxMenuItem.isSelected());
    this.a.b.p().i();
    this.a.b.p().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */