package aP;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

class FocusAdapterExtensionFocusgained extends FocusAdapter {
  aQ(aM paramaM) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    JTextField jTextField = (JTextField)paramFocusEvent.getSource();
    jTextField.selectAll();
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */