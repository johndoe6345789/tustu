package bN;

import bH.D;
import java.io.IOException;

class q extends Thread {
  boolean a = true;
  
  int b = 0;
  
  boolean c = false;
  
  q(p paramp) {
    if (paramp.j == p.h) {
      setName("XCP Reader_Slave_" + Math.random());
    } else if (paramp.j == p.i) {
      setName("XCP Reader_Master_" + Math.random());
    } else {
      setName("XCP Reader_" + Math.random());
    } 
    try {
      if (this.c)
        setPriority(10); 
    } catch (Exception exception) {
      D.a("Failed to set XCP Reader Thread Priority");
    } 
    D.d("Started Thread: " + getName());
  }
  
  public void run() {
    while (this.a) {
      try {
        if (this.d.l) {
          p.a(this.d);
          this.d.l = false;
          synchronized (this.d.o) {
            this.d.o.notifyAll();
          } 
        } else {
          p.b(this.d);
          this.b = 0;
        } 
        if (this.a && this.d.a.available() <= 0)
          p.a(this.d, 5, 0); 
      } catch (IOException iOException) {
        if (this.a)
          p.a(this.d, iOException); 
        if (this.b++ > 4) {
          this.a = false;
          iOException.printStackTrace();
          D.d("Read Thread exceeded 4 concecutive errors, stopping.");
        } 
        this.d.l = false;
        p.a(this.d, 40, 0);
      } catch (Exception exception) {
        D.b("Read Thread Exception: " + exception.getMessage());
        p.a(this.d, 20, 0);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */