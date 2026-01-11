package bs;

import bH.D;

class BsInterfaceYankee extends Thread {
  int a = -1;
  
  boolean b = true;
  
  public BsInterfaceYankee(k paramk, int paramInt) {
    super("WUE ApplyThread");
    this.a = paramInt;
    setDaemon(true);
  }
  
  public void run() {
    while (this.b) {
      try {
        Thread.sleep((this.a * 1000));
        k.a(this.c);
      } catch (Exception exception) {
        D.c("Exception in the apply Thread, handled but here is the stack:");
        exception.printStackTrace();
      } 
    } 
    while (this.c.b.a())
      k.a(this.c); 
  }
  
  public void a() {
    this.b = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bs/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */