package aP;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyAdapterExtensionKeytyped extends KeyAdapter {
  KeyAdapterExtensionKeytyped(aO paramaO, aM paramaM) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    try {
      String str = this.b.a.getText() + paramKeyEvent.getKeyChar();
      double d = Double.parseDouble(str);
    } catch (NumberFormatException numberFormatException) {
      paramKeyEvent.consume();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */