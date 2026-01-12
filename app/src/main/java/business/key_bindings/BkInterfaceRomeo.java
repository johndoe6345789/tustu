package business.key_bindings;

import java.util.logging.Level;
import java.util.logging.Logger;

class BkInterfaceRomeo extends Thread {
  boolean a = true;

  public void r(q paramq) {
    super("Toggle Blink");
    setDaemon(true);
  }

  public void run() {
    while (this.a) {
      this.b.setOpaque(!this.b.isOpaque());
      this.b.repaint();
      try {
        Thread.sleep(750L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(q.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
    this.b.setOpaque(false);
    this.b.repaint();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bk/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
