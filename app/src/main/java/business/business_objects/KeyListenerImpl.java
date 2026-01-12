package business.business_objects;

import bH.D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerImpl implements KeyListener {
  KeyListenerImpl(b paramb) {}

  public void keyTyped(KeyEvent paramKeyEvent) {
    D.c("Typed");
  }

  public void keyPressed(KeyEvent paramKeyEvent) {
    D.c("Pressed");
  }

  public void keyReleased(KeyEvent paramKeyEvent) {
    D.c("Release");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bo/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
