package bF;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class s extends Thread {
  int a = 200;
  
  long b = System.currentTimeMillis() + this.a;
  
  int c = 50;
  
  boolean d = true;
  
  s(d paramd) {}
  
  public void run() {
    while (this.d) {
      if (System.currentTimeMillis() > this.b) {
        this.e.m = null;
        this.d = false;
        t t = new t(this);
        SwingUtilities.invokeLater(t);
        continue;
      } 
      try {
        Thread.sleep(this.c);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  private void a() {
    this.b = System.currentTimeMillis() + this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bF/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */