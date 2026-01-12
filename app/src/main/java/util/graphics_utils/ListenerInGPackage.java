package g;

import com.efiAnalytics.ui.de;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerInGPackage implements ActionListener {
  de a;

  j b;

  public void i(g paramg, de paramde, j paramj) {
    this.a = paramde;
    this.b = paramj;
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    this.b.c((String) this.a.getSelectedItem());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
