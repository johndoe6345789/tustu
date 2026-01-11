package com.efiAnalytics.tunerStudio.panels;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class b extends KeyAdapter {
  b(a parama) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    String str = " /\\'\"+-*/_)(&^%$#@!~`;<>,.:;?";
    if (this.a.a.getText().length() > 6 || str.indexOf(paramKeyEvent.getKeyChar()) >= 0)
      paramKeyEvent.consume(); 
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (this.a.a.getText().length() > 0) {
      a.a(this.a).a(this.a.a.getText());
      this.a.getParent().repaint();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */