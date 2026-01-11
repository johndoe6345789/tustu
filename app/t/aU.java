package t;

import V.a;
import com.efiAnalytics.ui.bV;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import s.g;

class aU implements FocusListener {
  aU(aO paramaO) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    if (jTextField.getText().equals(""))
      return; 
    try {
      String str = jTextField.getText();
      this.a.c().p(str);
    } catch (a a) {
      bV.d(g.b("Valid Expressions or Numeric Values only.") + "\n" + a.getLocalizedMessage(), jTextField);
      jTextField.setText(this.a.p);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */