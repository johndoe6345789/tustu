package aP;

import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.IOPropertiesUsingFile;
import s.SComponentGolf;

class ApInterfaceEj implements ActionListener {
  ApInterfaceEj(dB paramdB) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = IOPropertiesUsingFile.IOPropertiesUsingFile().c(IOPropertiesUsingFile.cF, "");
    if (str.isEmpty()) {
      bV.d(SComponentGolf.b("Registration Key not found."), this.IOPropertiesUsingFile.h);
    } else {
      aN.IOPropertiesUsingFile(
          "https://www.efianalytics.com/register/upgradeSoftware.jsp?regKey=" + str);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/eJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
