package t;

import com.efiAnalytics.ui.bV;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class TInterfaceAv extends KeyAdapter {
  aV(aO paramaO) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    if (jTextField.getText().equals(""))
      return; 
    try {
      double d = aO.a(this.a, jTextField.getText());
      if (this.a.a(jTextField, SComponentGolf.b("Historical Peak Value")))
        this.a.c().b(d); 
    } catch (Exception exception) {
      bV.d(SComponentGolf.b("Numeric Values only"), jTextField);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */