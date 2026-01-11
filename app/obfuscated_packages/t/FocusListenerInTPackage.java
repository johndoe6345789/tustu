package t;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class FocusListenerInTPackage implements FocusListener {
  aN(aK paramaK) {}
  
  public void focusLost(FocusEvent paramFocusEvent) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    jTextField.selectAll();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */