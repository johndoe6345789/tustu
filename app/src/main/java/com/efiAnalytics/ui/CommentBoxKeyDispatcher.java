package com.efiAnalytics.ui;

import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

class CommentBoxKeyDispatcher implements KeyEventDispatcher {
  Component a = null;

  public CommentBoxKeyDispatcher(bi parambi, Component paramComponent) {
    this.a = paramComponent;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    if (!a(paramKeyEvent)) return false;
    if (paramKeyEvent.getID() == 401 && paramKeyEvent.getKeyCode() == 27) {
      this.b.b();
      return true;
    }
    return false;
  }

  private boolean a(KeyEvent paramKeyEvent) {
    for (Component component = paramKeyEvent.getComponent();
        component != null;
        component = component.getParent()) {
      if (component.equals(this.a)) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
