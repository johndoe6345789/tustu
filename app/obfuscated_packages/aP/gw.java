package aP;

import bH.I;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class gw implements ActionListener {
  gw(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    double d = IOPropertiesUsingFile.IOPropertiesUsingFile().IOPropertiesUsingFile(IOPropertiesUsingFile.bH, IOPropertiesUsingFile.bI);
    String str;
    for (str = "z"; !I.IOPropertiesUsingFile(str) && str.length() > 0; str = bV.IOPropertiesUsingFile(this.IOPropertiesUsingFile.h, true, "Maximum MegaBytes for IOPropertiesUsingFile Projects Restore points.", "" + d));
    if (I.IOPropertiesUsingFile(str) && str.length() > 0) {
      if (paramActionEvent.getSource() instanceof gX) {
        gX gX = (gX)paramActionEvent.getSource();
        gX.setText(SComponentGolf.b("Maximum Disk Space in MB") + ": " + str);
      } 
      IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.bH, str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */