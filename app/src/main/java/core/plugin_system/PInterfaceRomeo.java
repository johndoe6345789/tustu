package p;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PInterfaceRomeo implements ActionListener {
  PInterfaceRomeo(p paramp) {}

  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = p.a(this.a, "Are you sure your want to delete the selected Action Trigger?");
    if (bV.a(str, this.a.c, true)) p.b(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
