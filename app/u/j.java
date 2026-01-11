package u;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

class j extends JComponent implements KeyListener {
  public j(h paramh) {
    setOpaque(false);
    addKeyListener(this);
    setFocusTraversalKeysEnabled(false);
  }
  
  public void a() {
    setVisible(true);
    requestFocusInWindow();
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    paramKeyEvent.consume();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/u/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */