package com.efiAnalytics.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class ParameterDialogKeyAdapter extends KeyAdapter {
  ParameterDialogKeyAdapter(fs paramfs) {}

  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\033') this.a.b();
    if (paramKeyEvent.getKeyChar() == '\n') this.a.c();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/ft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
