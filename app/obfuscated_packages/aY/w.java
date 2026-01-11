package aY;

import G.R;
import G.T;
import W.ag;
import aP.dd;
import aP.f;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import r.a;
import s.g;

class w implements ActionListener {
  w(s params) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    R r = T.a().c(this.a.f.a());
    ag ag = this.a.b.a();
    if (r == null || ag == null)
      bV.d(g.b("You must select a Restore Point and a Controller to restore."), this.a.b); 
    JFrame jFrame = dd.a().c();
    String str = g.b("Load Restore Point to replace current settings?") + "\n\n" + g.b("All current settings will be over written with the settings in the selected Restore Point.") + "\n\n" + g.b("Selected Restore Point") + ": " + ag.d(a.cw);
    if (bV.a(str, jFrame, true)) {
      f.a().d(r, "Before loading Restore Point " + ag.d(a.cw) + " to " + r.c());
      String str1 = ag.a().getAbsolutePath();
      f.a().a(jFrame, r, str1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */