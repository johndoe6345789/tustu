package ao;

import bH.D;
import java.awt.Component;

class gW extends Thread {
  private int c = 100;
  
  private Component d = null;
  
  private boolean e = true;
  
  long a = Long.MAX_VALUE;
  
  private long f = 30L;
  
  public gW(go paramgo, Component paramComponent) {
    super("LazyPaintThrottle");
    setDaemon(true);
    this.d = paramComponent;
  }
  
  public void a() {
    this.a = System.currentTimeMillis() + this.c;
    if (!b() || !isAlive())
      start(); 
  }
  
  public void run() {
    while (this.e) {
      try {
        Thread.sleep(c());
      } catch (InterruptedException interruptedException) {}
      if (System.currentTimeMillis() >= this.a) {
        this.a = Long.MAX_VALUE;
        try {
          go.n(this.b);
        } catch (Exception exception) {
          D.a(exception);
        } 
      } 
    } 
  }
  
  public void a(int paramInt) {
    this.c = paramInt;
  }
  
  public boolean b() {
    return this.e;
  }
  
  public long c() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/gW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */