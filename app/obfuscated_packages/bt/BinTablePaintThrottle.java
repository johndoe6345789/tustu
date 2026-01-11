package bt;

class BinTablePaintThrottle extends Thread {
  long a = Math.round(1000.0D / x.a());
  
  boolean b = false;
  
  public V(T paramT) {
    super("BinTablePaintThrottle");
    setDaemon(true);
    start();
  }
  
  public void a() {
    if (!isAlive())
      start(); 
    this.b = true;
  }
  
  public void run() {
    try {
      Thread.currentThread();
      Thread.sleep(2L * this.a);
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    } 
    while (this.c.isDisplayable()) {
      try {
        Thread.currentThread();
        Thread.sleep(this.a);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
      if (this.b) {
        this.c.repaint();
        this.b = false;
      } 
    } 
    this.c.e = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/V.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */