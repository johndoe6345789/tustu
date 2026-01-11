package aP;

import com.efiAnalytics.ui.dI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import r.a;

class gA implements ActionListener {
  gA(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)paramActionEvent.getSource();
    a.a().b(a.aa, Boolean.toString(jCheckBoxMenuItem.getState()));
    if (jCheckBoxMenuItem.getState()) {
      dI.a().b();
    } else {
      dI.a().c();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */