package ao;

import com.efiAnalytics.ui.aN;
import h.IOProperties;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cH implements ActionListener {
  cH(cd paramcd) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = IOProperties.a("onlineHelpUrl", IOProperties.m);
    aN.a(str);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
