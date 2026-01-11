package business.binary_transformers;

class ThreadExtensionInBtPackage extends Thread {
  long a = Math.round(1000.0D / x.a());
  
  boolean b = false;
  
  aP(an paraman) {
    super("CurvePaint");
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
        this.c.p.repaint();
        this.b = false;
      } 
    } 
    this.c.A = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/aP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */