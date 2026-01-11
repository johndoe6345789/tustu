package bD;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class M implements KeyListener {
  M(I paramI) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10) {
      I.b(this.a);
    } else if (paramKeyEvent.getKeyCode() == 27) {
      I.a(this.a);
    } 
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.e.isSelected())
      I.c(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */