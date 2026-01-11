package aP;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class eI implements ActionListener {
  eI(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = SComponentGolf.b("Are you sure you wish to remove the registration information?") + "\n\n" + SComponentGolf.b("This installation of " + IOPropertiesUsingFile.b + " will run as the unregistered version.");
    if (bV.IOPropertiesUsingFile(str, this.IOPropertiesUsingFile.h, true))
      f.IOPropertiesUsingFile().A(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/eI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */