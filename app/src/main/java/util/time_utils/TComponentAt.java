package t;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class TComponentAt extends KeyAdapter {
  at(as paramas) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField) paramKeyEvent.getSource();
    if (this.a.a(jTextField, SComponentGolf.b("Label Text"))) this.a.c().s(jTextField.getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
