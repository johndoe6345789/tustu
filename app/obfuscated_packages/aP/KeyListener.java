package aP;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListener implements KeyListener {
  jr(jq paramjq, jc paramjc) {}
  
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/jr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */