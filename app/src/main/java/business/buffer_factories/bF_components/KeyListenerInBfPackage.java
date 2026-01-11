package business.buffer_factories.bF_components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerInBfPackage implements KeyListener {
  KeyListenerInBfPackage(L paramL, D paramD) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    a(paramKeyEvent);
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    a(paramKeyEvent);
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    a(paramKeyEvent);
  }
  
  private void a(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 27) {
      this.b.cancelCellEditing();
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/M.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */