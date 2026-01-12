package ao;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class cV implements ItemListener {
  cV(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem) paramItemEvent.getSource();
    String str1 = jCheckBoxMenuItem.getName();
    String str2 = jCheckBoxMenuItem.getActionCommand();
    if (!cd.a(this.a, str1, str2, (paramItemEvent.getStateChange() == 1)))
      jCheckBoxMenuItem.setState(false);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
