package p;

import com.efiAnalytics.ui.bV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class L implements ActionListener {
  L(J paramJ) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    String str = J.a(this.a, "Are you sure your want to delete the selected User Action?");
    if (bV.a(str, this.a.c, true))
      J.b(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */