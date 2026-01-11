package business.binary_transformers;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keypressed extends KeyAdapter {
  public Keypressed(bK parambK) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyCode() == 10)
      bK.a(this.a); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */