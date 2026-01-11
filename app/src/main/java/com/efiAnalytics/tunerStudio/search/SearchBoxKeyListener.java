package com.efiAnalytics.tunerStudio.search;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class SearchBoxKeyListener implements KeyListener {
  SearchBoxKeyListener(m paramm) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 40) {
      this.a.c.c();
    } else if (paramKeyEvent.getKeyCode() == 38) {
      this.a.c.d();
    } else if (paramKeyEvent.getKeyCode() == 10) {
      this.a.c.f();
    } else {
      m.d(this.a).a();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */