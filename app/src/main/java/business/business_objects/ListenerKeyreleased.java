package business.business_objects;

import bH.X;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ListenerKeyreleased implements KeyListener {
  ListenerKeyreleased(b paramb) {}

  public void keyTyped(KeyEvent paramKeyEvent) {}

  public void keyPressed(KeyEvent paramKeyEvent) {}

  public void keyReleased(KeyEvent paramKeyEvent) {
    double d = this.a.l.e();
    if (Double.isNaN(d)) {
      this.a.k.setText("");
    } else {
      this.a.k.setText(X.b(d / 16.38706D, 0));
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
