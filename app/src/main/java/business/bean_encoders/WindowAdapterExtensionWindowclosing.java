package business.bean_encoders;

import com.efiAnalytics.ui.bV;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import s.SComponentGolf;

class WindowAdapterExtensionWindowclosing extends WindowAdapter {
  WindowAdapterExtensionWindowclosing(C paramC, JDialog paramJDialog) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    if (this.b.c != null && this.b.c.c() && bV.a(SComponentGolf.b("There are unsaved changes, Save them Now?"), this.a, true))
      C.d(this.b); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/I.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */