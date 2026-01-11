package z;

import G.J;
import bH.D;
import gnu.io.RXTXCommDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

class g extends Thread {
  J a = null;
  
  boolean b = true;
  
  private boolean d = false;
  
  public g(e parame, J paramJ) {
    super("COMM Watchdog");
    this.a = paramJ;
  }
  
  public void start() {
    this.b = true;
    super.start();
  }
  
  public void a() {
    this.b = false;
  }
  
  public void run() {
    boolean bool = false;
    while (this.b) {
      try {
        if (!this.d && (bool || (this.c.q() && System.currentTimeMillis() - e.q(this.c) > 2500L))) {
          D.b("Comm Thread not heard from in " + ((System.currentTimeMillis() - e.r(this.c)) / 1000.0D) + " seconds, Reporting Thread where about.");
          if (this.c.e != null) {
            D.c("Watchdog Report on Comm Thread. the following stack reports the current Location, not killing yet");
            a("comm", this.c.e);
          } 
        } 
        byte b = (this.c.e() != null) ? this.c.e().i() : 0;
        long l1 = System.currentTimeMillis() - e.s(this.c);
        long l2 = e.t(this.c) - System.currentTimeMillis();
        if (!this.d && (bool || (this.c.q() && l1 > (5000 + b)) || (this.c.q() && l2 < 0L))) {
          D.b("Comm Thread not heard from in " + ((System.currentTimeMillis() - e.u(this.c)) / 1000.0D) + " seconds, resetting. Expected to hear from Comm Thread in: " + l2 + "ms. , try again=" + bool);
          e.b(this.c, System.currentTimeMillis());
          long l = System.currentTimeMillis();
          D.c("Declaring Comm Thread stale, begining reinitialization");
          if (this.c.e != null) {
            D.c("Watchdog Report on Comm Thread. the following stack reports the current Location");
            a("comm", this.c.e);
          } 
          if (this.c.b != null)
            try {
              D.c("Watchdog closing port");
              this.c.c();
              D.c("Watchdog closed port, Time:" + (System.currentTimeMillis() - l));
            } catch (Exception exception) {
              D.d("Exception caught while trying to clean up port lock");
              Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, exception);
            }  
          D.c("New Driver instance, Time:" + (System.currentTimeMillis() - l));
          e.c = new RXTXCommDriver();
          D.c("Watchdog re-initializing driver, Time:" + (System.currentTimeMillis() - l));
          e.c.initialize();
          D.c("Watchdog calling goOffline(), Time:" + (System.currentTimeMillis() - l));
          this.a.c();
          Thread.sleep(500L);
          D.c("Watchdog calling goOnline(), Time:" + (System.currentTimeMillis() - l));
          this.a.d();
          D.c("Watchdog succeeded. Time:" + (System.currentTimeMillis() - l));
          bool = false;
          sleep(10000L);
          e.c(this.c, System.currentTimeMillis());
        } 
      } catch (Exception exception) {
        D.b("CommWatchDog failed to restart " + this.c.e().u() + " on port " + this.c.e().s() + ", will try again.");
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, exception);
        bool = true;
      } finally {
        try {
          Thread.sleep(2000L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
  }
  
  public boolean b() {
    return this.d;
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  void a(String paramString, Thread paramThread) {
    try {
      StackTraceElement[] arrayOfStackTraceElement = paramThread.getStackTrace();
      Exception exception = new Exception("Stack for " + paramString + " Thread:");
      exception.setStackTrace(arrayOfStackTraceElement);
      Logger.getLogger(e.class.getName()).log(Level.INFO, (String)null, exception);
    } catch (Exception exception) {
      D.b("Failed to dump stack of " + paramString + " thread.");
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */