package bQ;

import G.f;
import bN.k;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class o extends Thread {
  final List a = new ArrayList();
  
  boolean b = false;
  
  f c = new f();
  
  double d = System.currentTimeMillis() / 1000.0D;
  
  public o(l paraml) {
    super("DAQ Publisher");
  }
  
  public synchronized void run() {
    while (!this.b && l.s(this.e)) {
      try {
        wait(50L);
        if (k.v() - this.e.ao > 3.0F);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      while (this.a.size() > 0) {
        r r = this.a.remove(0);
        if (r != null) {
          if (this.e.c.a() > 0) {
            this.e.n = r.b();
          } else {
            if (this.e.n < 0.0D)
              this.d = System.currentTimeMillis() / 1000.0D; 
            this.e.n = System.currentTimeMillis() / 1000.0D - this.d;
          } 
          l.a(this.e, this.e.e().u(), r.a());
          this.c.a(r.a());
        } 
        try {
          Thread.sleep(1L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
  }
  
  public void a() {
    this.b = true;
  }
  
  private synchronized void a(byte[] paramArrayOfbyte, double paramDouble) {
    byte[] arrayOfByte = this.c.b(paramArrayOfbyte.length);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    this.a.add(new r(this.e, arrayOfByte, paramDouble));
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */