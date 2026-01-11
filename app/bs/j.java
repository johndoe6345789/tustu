package bs;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class j implements KeyEventDispatcher {
  j(f paramf) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 27) {
      this.a.d();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */