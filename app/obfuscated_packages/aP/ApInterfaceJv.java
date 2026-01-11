package aP;

import com.efiAnalytics.ui.aN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ApInterfaceJv implements ActionListener {
  String a;
  
  jv(ju paramju, String paramString) {
    this.a = paramString;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    aN.a(this.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */