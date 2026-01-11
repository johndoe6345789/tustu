package aP;

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class KeyEventDispatcherImpl implements KeyEventDispatcher {
  Component a = null;
  
  public KeyEventDispatcherImpl(hg paramhg, Component paramComponent) {
    this.a = paramComponent;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return !a(paramKeyEvent) ? false : ((paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 112 && (this.b.b.O().size() > 0 || this.b.f.size() > 0)) ? this.b.c() : false);
  }
  
  private boolean a(KeyEvent paramKeyEvent) {
    for (Component component = paramKeyEvent.getComponent(); component != null; component = component.getParent()) {
      if (component.equals(this.a))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */