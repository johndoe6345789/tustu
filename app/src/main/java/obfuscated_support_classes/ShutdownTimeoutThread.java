import java.util.logging.Level;
import java.util.logging.Logger;

final class h extends Thread {
  public void run() {
    i i = new i(this);
    i.start();
    long l = System.currentTimeMillis();
    while (System.currentTimeMillis() - l < 60000L) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    Runtime.getRuntime().halt(0);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */