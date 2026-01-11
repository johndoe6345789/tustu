package ao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class bd extends Thread {
  bd(aX paramaX) {}
  
  public void run() {
    try {
      Thread.sleep(400L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(aX.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    be be = new be(this);
    SwingUtilities.invokeLater(be);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */