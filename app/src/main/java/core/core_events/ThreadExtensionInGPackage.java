package G;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInGPackage extends Thread {
  ThreadExtensionInGPackage(an paraman, String paramString) {
    super(paramString);
  }

  public void run() {
    try {
      Thread.currentThread();
      Thread.sleep(1500L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    an.a(this.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
