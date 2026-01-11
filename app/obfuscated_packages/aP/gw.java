package aP;

import bH.I;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import r.a;
import s.g;

class gw implements ActionListener {
  gw(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    double d = a.a().a(a.bH, a.bI);
    String str;
    for (str = "z"; !I.a(str) && str.length() > 0; str = bV.a(this.a.h, true, "Maximum MegaBytes for a Projects Restore points.", "" + d));
    if (I.a(str) && str.length() > 0) {
      if (paramActionEvent.getSource() instanceof gX) {
        gX gX = (gX)paramActionEvent.getSource();
        gX.setText(g.b("Maximum Disk Space in MB") + ": " + str);
      } 
      a.a().b(a.bH, str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */