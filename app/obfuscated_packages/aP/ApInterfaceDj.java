package aP;

import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.SComponentGolf;

class ApInterfaceDj implements ActionListener {
  dJ(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    gX gX = (gX)paramActionEvent.getSource();
    String str = SComponentGolf.b("This COM Port is currently disabled from Detect Scans because it has caused issues on past attempts to access it.") + "\n\n" + SComponentGolf.b("Are you sure you want to reactivate com port:") + gX.getName();
    if (bV.a(str, (Component)gX, true)) {
      R.a().b(gX.getName());
      gX.getParent().remove((Component)gX);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */