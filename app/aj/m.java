package aj;

import bH.D;

class m extends Thread {
  boolean a = true;
  
  m(k paramk) {
    super("UDP_LoggerReceiveThread_" + Math.random());
  }
  
  public void run() {
    while (this.a) {
      try {
        k.b(this.b);
      } catch (Exception exception) {
        D.c("UDP Read Thread Stopping: " + exception.getLocalizedMessage());
        this.a = false;
      } 
    } 
    this.b.r = null;
  }
  
  public void a() {
    this.a = false;
    k.c(this.b).clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */