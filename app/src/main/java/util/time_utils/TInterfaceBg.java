package t;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import s.SComponentGolf;

class TInterfaceBg extends KeyAdapter {
  bg(be parambe) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    JTextField jTextField = (JTextField) paramKeyEvent.getSource();
    if (this.a.a(jTextField, SComponentGolf.b("Indicator Off Text")))
      this.a.c().r(jTextField.getText());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
