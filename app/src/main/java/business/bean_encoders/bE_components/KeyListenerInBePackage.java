package business.bean_encoders.bE_components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerInBePackage implements KeyListener {
  KeyListenerInBePackage(e parame) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\n')
      e.b(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bE/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */