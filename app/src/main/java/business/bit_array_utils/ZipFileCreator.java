package business.bit_array_utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Z implements KeyListener {
  Z(Y paramY) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10)
      Y.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/Z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */