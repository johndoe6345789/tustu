package ao;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class hp extends KeyAdapter {
  hp(hj paramhj) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getKeyChar() == ' ') {
      hu hu = (hu)paramKeyEvent.getSource();
      hu.setSelectedItem(" ");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/hp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */