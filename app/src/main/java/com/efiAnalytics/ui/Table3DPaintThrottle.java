package com.efiAnalytics.ui;

class Table3DPaintThrottle extends Thread {
  long a = 120L;
  
  boolean b = false;
  
  Table3DPaintThrottle(eM parameM) {
    super("3D Paint Throttle");
    Table3DPaintThrottle(true);
  }
  
  public void Table3DPaintThrottle() {
    if (!isAlive())
      Table3DPaintThrottle(); 
    this.b = true;
  }
  
  public void Table3DPaintThrottle() {
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