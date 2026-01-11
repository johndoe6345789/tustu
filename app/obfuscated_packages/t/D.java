package t;

import com.efiAnalytics.apps.ts.dashboard.Gauge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;

class D implements ActionListener {
  D(w paramw) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    if (jCheckBoxMenuItem.getState())
      this.a.a.d(Gauge.G); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */