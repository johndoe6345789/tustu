package ao;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class gv extends KeyAdapter {
  gv(go paramgo) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10)
      go.i(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */