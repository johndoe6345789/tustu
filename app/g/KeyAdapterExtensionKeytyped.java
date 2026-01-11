package g;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class KeyAdapterExtensionKeytyped extends KeyAdapter {
  h(g paramg) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == '\033')
      this.a.b(); 
    if (paramKeyEvent.getKeyChar() == '\n')
      g.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/g/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */