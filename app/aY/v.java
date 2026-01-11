package aY;

import G.R;
import G.T;
import W.ag;
import aP.f;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.g;

class v implements ActionListener {
  v(s params) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    R r = T.a().c(this.a.f.a());
    ag ag = this.a.b.a();
    if (r == null || ag == null)
      bV.d(g.b("You must select a Restore Point and a Controller to restore."), this.a.b); 
    String str = ag.a().getAbsolutePath();
    f.a().b(r, str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */