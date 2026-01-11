package com.efiAnalytics.ui;

class eQ extends Thread {
  long a = 120L;
  
  boolean b = false;
  
  eQ(eM parameM) {
    super("3D Paint Throttle");
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
        eM.f(this.c);
        this.b = false;
      } 
    } 
    this.c.g = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/eQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */