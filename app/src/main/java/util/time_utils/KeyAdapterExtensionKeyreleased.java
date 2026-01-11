package t;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class KeyAdapterExtensionKeyreleased extends KeyAdapter {
  KeyAdapterExtensionKeyreleased(aK paramaK) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField)paramKeyEvent.getSource();
    if (this.a.a(jTextField, SComponentGolf.b("Gauge Title")))
      this.a.c().i(jTextField.getText()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */