package business.byte_serializers;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class KeyEventDispatcherImplDispatchkeyevent implements KeyEventDispatcher {
  KeyEventDispatcherImplDispatchkeyevent(f paramf) {}
  
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