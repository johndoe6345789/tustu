package bw;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

class FocusListenerInBwPackage implements FocusListener {
  e(b paramb) {}
  
  public void focusGained(FocusEvent paramFocusEvent) {
    if (paramFocusEvent.getSource() instanceof JTextField)
      ((JTextField)paramFocusEvent.getSource()).selectAll(); 
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */