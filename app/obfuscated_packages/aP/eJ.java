package aP;

import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.a;
import s.g;

class eJ implements ActionListener {
  eJ(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = a.a().c(a.cF, "");
    if (str.isEmpty()) {
      bV.d(g.b("Registration Key not found."), this.a.h);
    } else {
      aN.a("https://www.efianalytics.com/register/upgradeSoftware.jsp?regKey=" + str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/eJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */