package bw;

import com.efiAnalytics.ui.NumericTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerInBwPackage implements KeyListener {
  c(b paramb) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    ((NumericTextField)paramKeyEvent.getSource()).d();
    this.a.a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bw/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */