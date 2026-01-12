package aP;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class ItemListenerImplItemstatechanged implements ItemListener {
  ItemListenerImplItemstatechanged(cc paramcc) {}

  public void itemStateChanged(ItemEvent paramItemEvent) {
    IOProperties.c(
        IOProperties.aJ,
        Boolean.toString(((JCheckBoxMenuItem) paramItemEvent.getSource()).getState()));
    bV.d("The Changes will take effect after restarting.", bV.c());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
