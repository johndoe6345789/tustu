package bt;

class u extends Thread {
  long a = 120L;
  
  boolean b = false;
  
  u(s params) {
    super("LiveGraph PaintThrottle");
    setDaemon(true);
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
    this.c.a = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */