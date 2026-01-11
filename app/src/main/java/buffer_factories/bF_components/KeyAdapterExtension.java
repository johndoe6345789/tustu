package bF;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyAdapterExtension extends KeyAdapter {
  KeyAdapterExtension(D paramD) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    D.a(this.a, paramKeyEvent);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */