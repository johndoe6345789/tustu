package aX;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerKeytyped implements KeyListener {
  KeyListenerKeytyped(c paramc) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    this.a.b.setEnabled(!this.a.c.getText().isEmpty());
    if (!this.a.c.getText().isEmpty());
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aX/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */