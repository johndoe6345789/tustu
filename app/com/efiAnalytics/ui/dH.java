package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class dH implements KeyEventDispatcher {
  Component a = null;
  
  dH(dF paramdF, Component paramComponent) {
    this.a = paramComponent;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (!b(paramKeyEvent))
      return false; 
    if (paramKeyEvent.getID() == 401)
      switch (paramKeyEvent.getKeyCode()) {
        case 27:
          if (!a(paramKeyEvent)) {
            this.b.k();
            this.b.close();
            return true;
          } 
          break;
      }  
    return false;
  }
  
  private boolean a(KeyEvent paramKeyEvent) {
    return (paramKeyEvent.getSource() instanceof do && ((Component)paramKeyEvent.getSource()).getParent() instanceof BinTableView);
  }
  
  private boolean b(KeyEvent paramKeyEvent) {
    for (Component component = paramKeyEvent.getComponent(); component != null; component = component.getParent()) {
      if (component.equals(this.a))
        return true; 
      if (component instanceof java.awt.Window)
        return false; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */