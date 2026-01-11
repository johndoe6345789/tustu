package business.binary_transformers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyAdapterExtensionInBtPackage extends KeyAdapter {
  KeyAdapterExtensionInBtPackage(aV paramaV) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 38 || paramKeyEvent.getKeyCode() == 61 || paramKeyEvent.getKeyCode() == 521) {
      if (paramKeyEvent.isShiftDown()) {
        this.a.l();
        this.a.l();
        this.a.l();
        this.a.l();
        this.a.l();
      } else {
        this.a.l();
      } 
      paramKeyEvent.consume();
    } 
    if (paramKeyEvent.getKeyCode() == 40 || paramKeyEvent.getKeyCode() == 68) {
      if (paramKeyEvent.isShiftDown()) {
        this.a.m();
        this.a.m();
        this.a.m();
        this.a.m();
        this.a.m();
      } else {
        this.a.m();
      } 
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */