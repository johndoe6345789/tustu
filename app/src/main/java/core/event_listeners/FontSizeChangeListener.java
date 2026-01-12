package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dY implements ItemListener {
  dY(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()) {
      String str = ((JCheckBoxMenuItem) paramItemEvent.getSource()).getActionCommand();
      IOProperties.c("prefFontSize", str);
      this.a.a.c(Integer.parseInt(str));
      b.a().b();
      cd.b(this.a);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
