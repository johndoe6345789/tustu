package ao;

import W.j;
import bC.k;
import bH.D;
import h.g;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class fu extends Thread {
  hx a = null;
  
  j b = null;
  
  boolean c = true;
  
  private boolean g = false;
  
  long d = 0L;
  
  long e = 0L;
  
  double f = 1.0D;
  
  public fu(hx paramhx, double paramDouble) {
    this(paramhx);
    a(paramDouble);
  }
  
  public fu(hx paramhx) {
    super("LogPlayBackThread_" + Math.random());
    this.a = paramhx;
    a();
  }
  
  public void a() {
    if (this.a.r() != null)
      for (j j1 : this.a.r()) {
        String str = g.a().a("Time");
        if (j1.a().equalsIgnoreCase(str)) {
          this.b = j1;
          break;
        } 
      }  
  }
  
  public void a(double paramDouble) {
    this.f = paramDouble;
  }
  
  public void start() {
    this.g = false;
    if (this.b != null) {
      super.start();
      this.a.c();
    } else {
      cd cd = bq.a().b();
      eJ eJ = new eJ(cd, "No Time Column detected in log. This input is required for log playback.\nWould you like to add mapping now", true);
      if (eJ.a) {
        k k = b.a().a(cd, "Time");
        SwingUtilities.invokeLater(new fv(this, k));
      } 
      eJ.dispose();
    } 
  }
  
  public synchronized void b() {
    this.c = false;
    this.a.d();
  }
  
  public synchronized void c() {
    this.d = System.currentTimeMillis();
    this.e = (long)(1000.0F * this.b.c(this.a.p()));
  }
  
  public synchronized void d() {
    this.g = !this.g;
    b();
  }
  
  public synchronized void e() {
    this.d = System.currentTimeMillis();
    this.e = (long)(1000.0F * this.b.c(this.a.p()));
    this.g = false;
    this.a.c();
  }
  
  public void run() {
    this.d = System.currentTimeMillis();
    this.e = (long)(1000.0F * this.b.c(this.a.p()));
    long l1 = 20L;
    long l2 = System.currentTimeMillis();
    char c = 'ߐ';
    Object object = new Object();
    while (Float.isNaN(this.b.c(this.a.p()))) {
      if (System.currentTimeMillis() - this.d > c) {
        D.d("Time Column has NaN after timeout period, ending play.");
        this.a.d();
        return;
      } 
      try {
        synchronized (object) {
          object.wait(30L);
        } 
        if (this.b.i() - 1 > this.a.p())
          this.a.l(); 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(fu.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    while (System.currentTimeMillis() - l2 < c) {
      synchronized (object) {
        if (!this.c) {
          D.c("PlayBackThread break.");
          this.a.d();
          break;
        } 
        long l3 = (long)(1000.0F * this.b.c(this.a.p()));
        long l4 = (long)((l3 - this.e) / this.f);
        long l5 = (long)((System.currentTimeMillis() - this.d) * this.a.i());
        if (this.g) {
          this.d = System.currentTimeMillis();
          this.e = (long)(1000.0F * this.b.c(this.a.p()));
        } 
        while (l5 > l4 && this.a.p() < this.b.i() - 2 && this.c) {
          this.a.l();
          l2 = System.currentTimeMillis();
          l3 = (long)(1000.0F * this.b.c(this.a.p()));
          l4 = (long)((l3 - this.e) / this.f);
          l5 = (long)((System.currentTimeMillis() - this.d) * this.a.i());
        } 
        int i = this.a.p();
        if (this.b.i() > i + 1) {
          l1 = ((int)((1000.0F * (this.b.c(i + 1) - this.b.c(i))) / this.a.i()) - 2);
        } else {
          l1 = 2L;
        } 
        try {
          if (l1 > 0L)
            object.wait(l1); 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    } 
    this.a.d();
    D.c("PlayBackThread ended. System.currentTimeMillis() - lastIncrementTime = " + (System.currentTimeMillis() - l2) + ", timeoutPeriod=" + c);
  }
  
  public boolean f() {
    return this.g;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */