package ao;

import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class dq implements ActionListener {
  dq(cd paramcd) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    IOProperties.c(IOProperties.ah, Boolean.toString(jCheckBoxMenuItem.isSelected()));
    aw.g(jCheckBoxMenuItem.isSelected());
    int IOProperties = IOProperties.b("lineTraceSize", IOProperties.ae);
    if (jCheckBoxMenuItem.isSelected() && IOProperties < 2) {
      this.a.a.p().c(2);
      IOProperties.c("lineTraceSize", "2");
    } 
    if (jCheckBoxMenuItem.isSelected()) {
      this.a.a.p().b(true);
      IOProperties.c(IOProperties.af, Boolean.toString(true));
    } 
    this.a.a.p().IOProperties();
    this.a.a.p().repaint();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */