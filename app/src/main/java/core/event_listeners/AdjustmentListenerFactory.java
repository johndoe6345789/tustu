package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dl implements ItemListener {
  dl(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()) this.a.a.p().q();
    boolean bool = ((JCheckBoxMenuItem) paramItemEvent.getSource()).getState();
    if (bool) {
      IOProperties.c(IOProperties.S, "top");
      this.a.a.p().IOProperties();
      this.a.a.p().repaint();
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
