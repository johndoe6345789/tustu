package aO;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class v implements KeyListener {
  v(q paramq, k paramk) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10) {
      this.b.a();
      this.b.c.selectAll();
    } 
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aO/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */