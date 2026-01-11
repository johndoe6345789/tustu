package bQ;

import A.f;
import G.l;
import V.b;
import bH.D;
import bN.k;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

class n extends Thread {
  boolean a = !a();
  
  private boolean g = false;
  
  boolean b = false;
  
  int c = 0;
  
  int d = 1000;
  
  boolean e = false;
  
  n(l paraml) {
    super("XCP CommDriverConnect " + Math.random());
    setDaemon(true);
    try {
      if (this.a)
        setPriority(10); 
    } catch (Exception exception) {
      D.a("Failed to set Comm Thread Priority");
    } 
    if (l.an++ > 1) {
      D.a("New Com Thread created: " + getName() + ", Multiple Comm Threads: " + l.an);
    } else {
      D.d("Com Thread created: " + getName());
    } 
  }
  
  public void run() {
    long l1 = 0L;
    HashMap<Object, Object> hashMap = new HashMap<>();
    while (!this.g) {
      f f = this.f.a();
      if (f == null) {
        l.a(this.f, "No ControllerInterface Set! Cannot go online.");
      } else if (f.k() == 0) {
        try {
          f.f();
        } catch (l l2) {
          String str1 = "##################  Unable to connect to: " + f.n() + " Will continue trying.";
          if (hashMap.get(str1) == null) {
            D.c(str1);
            hashMap.put(str1, str1);
          } 
          l.a(this.f, f.p());
        } 
      } 
      if (l.a(this.f)) {
        hashMap.clear();
        try {
          if (this.e) {
            this.f.f();
            this.e = false;
          } else if (!this.g && this.f.w()) {
            this.f.b("processing Instructions");
            l.b(this.f);
            D.c("Processing, skip sync");
            this.f.ao = k.v();
          } else if (!this.g) {
            try {
              long l2 = System.currentTimeMillis();
              this.f.b("Sending Sync");
              if (k.v() - this.f.ao > 2.0F)
                D.c("WARNING!!!!! No Sync sent for: " + (k.v() - this.f.ao) + "s."); 
              this.f.ao = k.v();
              this.f.g();
              long l3 = System.currentTimeMillis() - l2;
              if (l3 > 2000L)
                D.b("WARNING!!!!!!!! Time to sync in ms: " + l3); 
            } catch (Exception exception) {
              if (System.currentTimeMillis() - this.f.d.k() > (this.d * 4)) {
                this.f.b("Warning: Sync Error, raising exception: " + exception.getLocalizedMessage());
                D.d("Connection Check failed, forcing offline.");
                this.c = 10;
                throw exception;
              } 
              int i = (int)(System.currentTimeMillis() - this.f.d.k());
              this.f.b("Sync Error, Ignoring received data " + i + "ms ago. Error: " + exception.getLocalizedMessage());
              D.c("Exception: " + exception.getMessage());
            } 
          } 
          this.c = 0;
          if (!this.f.w()) {
            int i = this.d - (int)(System.currentTimeMillis() - l1);
            if (i > this.d)
              i = this.d; 
            if (i > 0) {
              l.b(this.f, this.d);
            } else {
              D.c("Skipping Nap.");
            } 
            l1 = System.currentTimeMillis();
          } 
        } catch (Exception exception) {
          this.c = 0;
          l.a(this.f, false);
          l.b(this.f, true);
          if (l.c(this.f).size() > 0) {
            D.c("Writing the last " + l.d(this.f) + " comm interactions with the controller to the log file here:");
            l.e(this.f);
          } 
          l.f(this.f);
          l.g(this.f).g();
          l.h(this.f);
          this.f.v();
          D.d("Went offline 2");
          l.c(this.f, false);
          if (l.R())
            Logger.getLogger(l.class.getName()).log(Level.INFO, "Inside read error", exception); 
          if (l.g(this.f) != null) {
            l.c(this.f, l.g(this.f).p());
            continue;
          } 
          if (!this.g)
            l.d(this.f, 500L); 
        } 
        continue;
      } 
      if (f.k() == 3) {
        try {
          if (this.f.d(200));
        } catch (b b) {
          if (f.k() == 3) {
            D.d("Connected, but timing out. Box on? " + b.getLocalizedMessage());
            f.g();
          } 
        } catch (IOException iOException) {
          D.d("IO Exception, closing connection.");
          try {
            f.g();
          } catch (Exception exception) {}
        } 
        l.e(this.f, f.p());
        continue;
      } 
      String str = "###############    Not Connected, not going online.";
      if (hashMap.get(str) == null) {
        D.d(str);
        hashMap.put(str, str);
      } 
      l.f(this.f, f.p());
    } 
    l.an--;
    l.S().remove(this);
    if (this.b && this.f.a() != null && !l.a(this.f, this.f.a()))
      l.g(this.f).g(); 
    D.d(this.f.e().u() + " ComThread stopped " + getName());
  }
  
  public boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Android");
  }
  
  public void a(boolean paramBoolean) {
    long l1 = System.currentTimeMillis() + 1000L;
    while (this.e && System.currentTimeMillis() < l1 && l.g(this.f) != null && l.g(this.f).k() == 3) {
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.g = true;
    this.b = paramBoolean;
  }
  
  private void b() {
    this.e = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */