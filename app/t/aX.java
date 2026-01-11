package t;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import s.g;

class aX implements FocusListener {
  aX(aO paramaO) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    if (jTextField.getText().equals(""))
      return; 
    try {
      String str = jTextField.getText();
      this.a.c().k(str);
    } catch (a a) {
      bV.d(g.b("Invalid Expression or value."), jTextField);
      jTextField.setText(this.a.k);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */