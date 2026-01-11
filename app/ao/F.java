package ao;

import java.awt.Component;
import javax.swing.SwingUtilities;

public class F extends Thread {
  Component a = null;
  
  long b = 0L;
  
  boolean c = true;
  
  boolean d = false;
  
  public F(Component paramComponent, long paramLong) {
    this.b = paramLong;
    this.a = paramComponent;
    start();
  }
  
  public void a() {
    this.c = true;
  }
  
  public boolean b() {
    return this.d;
  }
  
  public void run() {
    while (this.c) {
      this.c = false;
      try {
        Thread.currentThread();
        Thread.sleep(this.b);
      } catch (Exception exception) {}
      if (!this.c) {
        G g = new G(this);
        SwingUtilities.invokeLater(g);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */