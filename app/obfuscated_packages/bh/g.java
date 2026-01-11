package bh;

import ao.hx;
import h.i;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class g extends Thread {
  g(b paramb, Runnable paramRunnable) {}
  
  public void run() {
    SwingUtilities.invokeLater(this.a);
    try {
      sleep(850L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    if (hx.a().r() != null) {
      hx.a().a(1.0D, false);
      hx.a().c(hx.a().r().d() - 1);
    } 
    if (i.a(i.U, i.V))
      b.a(this.b); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bh/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */