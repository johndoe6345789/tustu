package com.efiAnalytics.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ParameterDialogEscapeKeyAdapter extends KeyAdapter {
  ParameterDialogEscapeKeyAdapter(fs paramfs) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\033')
      this.a.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */