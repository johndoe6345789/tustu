package bo;

import bH.X;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerInBoPackage implements KeyListener {
  h(b paramb) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    double d = this.a.k.e();
    if (Double.isNaN(d)) {
      this.a.l.setText("");
    } else {
      this.a.l.setText(X.b(d * 16.38706D, 0));
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */