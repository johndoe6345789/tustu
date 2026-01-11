package ao;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class ec implements KeyEventDispatcher {
  ec(cd paramcd) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 112) {
      this.a.u();
      return true;
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/ec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */