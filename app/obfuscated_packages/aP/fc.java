package aP;

import G.R;
import G.T;
import aE.a;
import bA.c;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fc implements ActionListener {
  fc(dB paramdB) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    R r = T.a().c();
    c c = (c)paramActionEvent.getSource();
    boolean bool = c.getState();
    if (r != null)
      if (!bool) {
        if (a.A().J()) {
          String str = "In read only mode!\nYou are currently using a Temporary Project that is intended for view only.\nPlease use a project you created specifically for your controller to connect.";
          bV.d(str, dd.a().c());
          return;
        } 
        f.a().a(r);
      } else {
        r.I();
        r.C().c();
      }  
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/fc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */