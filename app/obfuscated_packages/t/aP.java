package t;

import com.efiAnalytics.ui.bV;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class aP extends KeyAdapter {
  aP(aO paramaO) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    if (jTextField.getText().equals(""))
      return; 
    try {
      double d = aO.a(this.a, jTextField.getText());
      if (this.a.a(jTextField, SComponentGolf.b("Current Value")))
        this.a.c().a(d); 
    } catch (Exception exception) {
      bV.d(SComponentGolf.b("Numeric Values only"), jTextField);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */