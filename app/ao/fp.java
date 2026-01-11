package ao;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class fp implements KeyEventDispatcher {
  fp(eK parameK) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 112) {
      this.a.c();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */