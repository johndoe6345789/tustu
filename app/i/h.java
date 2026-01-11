package i;

import java.util.logging.Level;
import java.util.logging.Logger;

class h extends Thread {
  boolean a = true;
  
  public h(g paramg) {
    super("MLV_PipeMonitor");
  }
  
  public synchronized void run() {
    while (this.a) {
      try {
        wait(g.a);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(g.class.getName()).log(Level.SEVERE, "Shouldn't happen.", interruptedException);
      } 
      if (!g.a(this.b))
        g.b(this.b); 
    } 
  }
  
  private void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/i/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */