package bS;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInBsPackage extends Thread {
  boolean a = true;
  
  c(b paramb) {
    super("DAQ List Slave Processor");
  }
  
  public synchronized void run() {
    while (this.a) {
      try {
        wait();
        b.a(this.b);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    notify();
  }
  
  public synchronized void b() {
    this.a = false;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */