package business.bit_array_utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class U {
  int a = 8;
  
  int b = 0;
  
  int c = 0;
  
  int d = 380;
  
  public int a() {
    this.b = 0;
    this.c = 0;
    long l = System.currentTimeMillis();
    for (byte b = 0; b < this.a; b++) {
      V v = new V(this, this, l);
      v.start();
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(U.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    while (this.a > this.b) {
      if (System.currentTimeMillis() - l > (this.d + 500)) {
        D.c("Speed test timed out, exiting after:" + (System.currentTimeMillis() - l) + "\n" + this.b + " completed out of expected " + this.a);
        break;
      } 
      try {
        Thread.currentThread();
        Thread.sleep(50L);
      } catch (Exception exception) {}
    } 
    return this.c;
  }
  
  public synchronized void a(int paramInt) {
    this.c += paramInt;
    this.b++;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bH/U.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */