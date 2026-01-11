package t;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class FocuslostFocusgained implements FocusListener {
  bd(aO paramaO) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    jTextField.selectAll();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */