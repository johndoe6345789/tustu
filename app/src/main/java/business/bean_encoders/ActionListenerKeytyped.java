package business.bean_encoders;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ActionListenerKeytyped implements ActionListener, KeyListener {
  boolean a = false;
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    this.a = true;
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    this.a = true;
  }
  
  public boolean a() {
    return this.a;
  }
  
  public void b() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/be/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */