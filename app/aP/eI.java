package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.a;
import s.g;

class eI implements ActionListener {
  eI(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = g.b("Are you sure you wish to remove the registration information?") + "\n\n" + g.b("This installation of " + a.b + " will run as the unregistered version.");
    if (bV.a(str, this.a.h, true))
      f.a().A(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/eI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */