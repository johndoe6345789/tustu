package ao;

import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dA implements ItemListener {
  dA(cd paramcd) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    if (((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()) this.a.a.p().q();
    boolean bool = ((JCheckBoxMenuItem) paramItemEvent.getSource()).getState();
    IOProperties.c("holdGraphCentered", "" + bool);
    bq.a().c().e(bool);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
