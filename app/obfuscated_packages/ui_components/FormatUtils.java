package ao;

import com.efiAnalytics.ui.bV;
import h.IOProperties;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;

class dr implements ItemListener {
  dr(cd paramcd) {}
  
  public void itemStateChanged(ItemEvent paramItemEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramItemEvent.getSource();
    if (jCheckBoxMenuItem.getState()) {
      IOProperties.c("fieldSelectionStyle", "selectFromDash");
    } else {
      IOProperties.c("fieldSelectionStyle", "standardSelection");
    } 
    bV.d("The Changes will take effect after restarting.", bq.a().b());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */