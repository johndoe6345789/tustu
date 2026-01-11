package aW;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

class h extends Thread {
  boolean a = true;
  
  h(e parame) {
    super("IS Blink");
    setDaemon(true);
  }
  
  public synchronized void run() {
    while (this.a) {
      Color color = this.b.c.getBackground();
      this.b.c.setBackground(Color.YELLOW);
      try {
        wait(500L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      this.b.c.setBackground(color);
      try {
        if (this.a)
          wait(800L); 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    this.a = false;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aW/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */