package bb;

import java.awt.Color;
import javax.swing.UIManager;

class j extends Thread {
  boolean a = true;
  
  j(d paramd) {}
  
  public synchronized void run() {
    while (this.a) {
      try {
        wait(500L);
        this.b.d.setOpaque(true);
        this.b.d.setBackground(Color.yellow);
        this.b.d.setForeground(Color.black);
        this.b.d.repaint();
        if (this.a)
          wait(1000L); 
        this.b.d.setOpaque(false);
        this.b.d.setBackground(UIManager.getColor("Label.background"));
        this.b.d.setForeground(UIManager.getColor("Label.foreground"));
        this.b.d.repaint();
      } catch (InterruptedException interruptedException) {
        this.a = false;
      } 
    } 
  }
  
  public synchronized void a() {
    this.a = false;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bb/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */