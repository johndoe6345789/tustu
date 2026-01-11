package aY;

import G.R;
import G.T;
import W.FileInWPackage;
import aP.NetworkHashMap;
import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import s.SComponentGolf;

class AyInterfaceVictor implements ActionListener {
  AyInterfaceVictor(s params) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    R r = T.a().c(this.a.NetworkHashMap.a());
    FileInWPackage FileInWPackage = this.a.b.a();
    if (r == null || FileInWPackage == null)
      bV.d(SComponentGolf.b("You must select a Restore Point and a Controller to restore."), this.a.b); 
    String str = FileInWPackage.a().getAbsolutePath();
    NetworkHashMap.a().b(r, str);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */