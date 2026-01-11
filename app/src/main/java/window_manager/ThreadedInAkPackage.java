package aK;

class ThreadedInAkPackage extends Thread {
  boolean a = false;
  
  e(d paramd) {
    super("GPSPublisher");
    setDaemon(true);
  }
  
  public synchronized void run() {
    this.a = true;
    while (this.a) {
      try {
        wait();
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
      d.a(this.b);
    } 
  }
  
  public synchronized void a() {
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */