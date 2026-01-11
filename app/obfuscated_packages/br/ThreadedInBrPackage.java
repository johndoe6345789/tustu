package br;

import bH.D;

class ThreadedInBrPackage extends Thread {
  int a = -1;
  
  boolean b = true;
  
  public ThreadedInBrPackage(s params, int paramInt) {
    super("VE ApplyThread");
    this.a = paramInt;
    setDaemon(true);
  }
  
  public void run() {
    while (this.b) {
      try {
        Thread.sleep((this.a * 1000));
        this.c.b();
      } catch (Exception exception) {
        D.c("Exception in the apply Thread, handled but here is the stack:");
        exception.printStackTrace();
      } 
    } 
    while (this.c.h.b())
      this.c.b(); 
  }
  
  public void a() {
    this.b = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */