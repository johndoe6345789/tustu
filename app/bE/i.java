package bE;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class i implements KeyListener {
  i(e parame) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\n')
      e.c(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */