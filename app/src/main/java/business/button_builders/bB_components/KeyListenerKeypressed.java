package business.button_builders.bB_components;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class KeyListenerKeypressed implements KeyListener {
  long a = 0L;
  
  StringBuilder b = new StringBuilder();
  
  long c = 2000L;
  
  KeyListenerKeypressed(h paramh) {}
  
  public void keyTyped(KeyEvent paramKeyEvent) {
    if (System.currentTimeMillis() - this.a > this.c && this.b.length() > 0)
      this.b.delete(0, this.b.length()); 
    this.a = System.currentTimeMillis();
    if (paramKeyEvent.getKeyChar() == '\b' && this.b.length() > 0) {
      this.b.setLength(this.b.length() - 1);
    } else {
      this.b.append(paramKeyEvent.getKeyChar());
    } 
    String str = this.b.toString().toLowerCase();
    if (str.length() > 0) {
      boolean bool = false;
      byte b;
      for (b = 0; b < this.d.b.getRowCount(); b++) {
        if (this.d.b.getValueAt(b, 0).toString().toLowerCase().startsWith(str)) {
          this.d.getSelectionModel().setSelectionInterval(b, b);
          this.d.scrollRectToVisible(new Rectangle(this.d.getCellRect(b, 0, true)));
          bool = true;
          break;
        } 
      } 
      if (!bool)
        for (b = 0; b < this.d.b.getRowCount(); b++) {
          if (this.d.b.getValueAt(b, 0).toString().toLowerCase().contains(str)) {
            this.d.getSelectionModel().setSelectionInterval(b, b);
            this.d.scrollRectToVisible(new Rectangle(this.d.getCellRect(b, 0, true)));
            bool = true;
            break;
          } 
        }  
    } 
  }
  
  public void keyPressed(KeyEvent paramKeyEvent) {}
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bB/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */