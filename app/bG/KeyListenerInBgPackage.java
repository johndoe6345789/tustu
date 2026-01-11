package bG;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerInBgPackage implements KeyListener {
  D(q paramq) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    switch (paramKeyEvent.getKeyCode()) {
      case 127:
        q.e(this.a);
        break;
      case 39:
        q.f(this.a);
        break;
      case 37:
        q.g(this.a);
        break;
    } 
    if (paramKeyEvent.isControlDown())
      switch (paramKeyEvent.getKeyCode()) {
        case 65:
          this.a.a.j();
          break;
      }  
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bG/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */