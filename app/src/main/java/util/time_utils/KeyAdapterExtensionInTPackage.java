package t;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class KeyAdapterExtensionInTPackage extends KeyAdapter {
  KeyAdapterExtensionInTPackage(aK paramaK) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField) paramKeyEvent.getSource();
    if (this.a.a(jTextField, SComponentGolf.b("Gauge Units"))) this.a.c().j(jTextField.getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/aM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
