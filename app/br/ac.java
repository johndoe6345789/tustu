package br;

import bH.D;

class ac extends Thread {
  int a = -1;
  
  boolean b = true;
  
  public ac(P paramP, int paramInt) {
    super("VE ApplyThread");
    this.a = paramInt;
    setDaemon(true);
  }
  
  public void run() {
    while (this.b) {
      try {
        Thread.sleep((this.a * 1000));
        this.c.a();
      } catch (Exception exception) {
        D.c("Exception in the apply Thread, handled but here is the stack:");
        exception.printStackTrace();
      } 
    } 
    while (((ag)this.c.p.get(0)).a.b())
      this.c.a(); 
  }
  
  public void a() {
    this.b = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */