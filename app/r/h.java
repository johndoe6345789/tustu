package r;

import aE.a;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import s.g;

class h implements ActionListener {
  h(b paramb) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String[] arrayOfString = { "dash" };
    String str = bV.b((Component)paramActionEvent.getSource(), g.b("Select Other Dashboard Layout"), arrayOfString, "", "./" + a.l);
    if (str != null) {
      this.a.d.setText(str);
      this.a.a = new File(str);
      this.a.b(this.a.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */