package A;

import G.J;
import G.l;
import bH.D;
import bH.J;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

class AInterfaceUniform extends Thread {
  long a = 0L;
  
  long b = 30L;
  
  int c = 0;
  
  int d = 0;
  
  int e = 60;
  
  private boolean l = false;
  
  boolean f = true;
  
  boolean g = !b();
  
  final Object h = new Object();
  
  String i = "";
  
  boolean j = false;
  
  public AInterfaceUniform(t paramt) {
    super("COMM Thread" + (Math.random() * 100000.0D));
    setDaemon(true);
    try {
      if (this.g)
        setPriority(10); 
    } catch (Exception exception) {
      D.a("Failed to set Comm Thread Priority");
    } 
    if (t.o++ > 1) {
      D.a("New Com Thread created: " + getName() + ", Multiple Comm Threads: " + t.o);
    } else {
      D.d("Com Thread created: " + getName());
    } 
  }
  
  public void run() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    t.m().put(this, this.k.a());
    D.d("Comm Manager for " + this.k.e().u() + " Started, thread ID: " + getName());
    if (this.k.e() != null)
      this.e = this.k.e().t(); 
    while (!this.l) {
      t.a(this.k, System.currentTimeMillis());
      try {
        boolean bool1 = false;
        if (!this.k.q() || !this.k.j()) {
          try {
            if (J.I() || !this.i.equals(t.a(this.k).n())) {
              this.i = t.a(this.k).n();
              D.d("Connecting to controller on: " + this.i);
            } 
            this.k.h();
            this.k.e().i(false);
            int i = 250 + this.k.a().o();
            i = (this.k.e().i() / 2 > i) ? (this.k.e().i() / 2) : i;
            t.a(this.k, i);
          } catch (l l) {
            String str = "Port not valid: " + l.getMessage();
            if (hashMap.get(str) == null) {
              D.c(str);
              hashMap.put(str, str);
            } 
            t.a(this.k, false);
          } catch (NullPointerException nullPointerException) {
            if (J.I()) {
              D.c("Error trying to go online, Connection seems bad, closing it: " + nullPointerException.getMessage());
              Logger.getLogger(t.class.getName()).log(Level.INFO, nullPointerException.toString(), nullPointerException);
            } 
            t.b(this.k, false);
            t.a(this.k).g();
          } catch (Exception exception) {
            if (J.I() && !(exception instanceof V.b))
              D.c("Error trying to go online: " + exception.getMessage()); 
            boolean bool = J.d();
            boolean bool3 = bool ? (!(exception instanceof G.cn) ? true : false) : ((!(exception instanceof V.b) && !(exception instanceof G.cn)) ? true : false);
            if (bool3)
              t.a(this.k).g(); 
            if (exception instanceof G.cn)
              bool1 = true; 
            t.c(this.k, false);
          } 
          if (!t.b(this.k)) {
            if (t.a(this.k) != null) {
              if (!bool1)
                t.a(this.k, t.a(this.k).n()); 
              Thread.sleep(t.a(this.k).p());
              continue;
            } 
            if (!this.l)
              synchronized (this.h) {
                this.h.wait(3000L);
              }  
          } 
          continue;
        } 
        hashMap.clear();
        boolean bool2 = false;
        try {
          Thread.yield();
          if (!this.l && this.k.w()) {
            bool2 = true;
            t.c(this.k);
            continue;
          } 
          if (!this.l && !this.k.N()) {
            try {
              if (J.I() && this.k.f) {
                t.c(false);
                t.d(this.k);
                t.d(true);
              } else {
                t.e(this.k);
              } 
              this.c = 0;
              this.d++;
            } catch (Exception exception) {
              this.d = 0;
              if (J.I()) {
                D.c("Comm Exception Caught: " + exception.getMessage());
                Logger.getLogger(t.class.getName()).log(Level.WARNING, "Comm Timeout Caught", exception);
              } 
              if (exception instanceof V.b || exception instanceof java.io.IOException) {
                t.a(this.k, this.k.e().u(), 1);
                if (!this.k.e().W() && !t.a(this.k).r()) {
                  this.c = 10;
                  D.d("Connection Check failed, forcing offline.");
                } 
              } else {
                t.b(this.k, this.k.e().u(), 2);
              } 
              if (!(exception instanceof V.d))
                Thread.sleep((this.k.e().i() / 2)); 
              t.f(this.k);
              this.c++;
              if (bool2 || this.c > 1) {
                t.g(this.k);
                t.d(this.k, false);
                t.h(this.k);
                t.i(this.k);
                this.k.e().E(this.k.e().aw());
                this.k.v();
                D.c("Went offline");
                t.e(this.k, false);
                this.c = 0;
                t.j(this.k);
                if (!this.l)
                  throw exception; 
                sleep(t.a(this.k).p());
              } 
            } 
            continue;
          } 
          t.b(this.k, 200L);
        } catch (Exception exception) {
          t.f(this.k, false);
          if (t.k(this.k).size() > 0) {
            D.c("Writing the last " + t.l(this.k) + " comm interactions with the controller to the log file here:");
            t.m(this.k);
          } 
          t.n(this.k);
          t.a(this.k).g();
          t.o(this.k);
          this.k.v();
          D.d("Went offline 2");
          t.g(this.k, false);
          if (t.o())
            Logger.getLogger(t.class.getName()).log(Level.INFO, "Inside read error", exception); 
          if (t.a(this.k) != null) {
            Thread.sleep(t.a(this.k).p());
            continue;
          } 
          if (!this.l)
            Thread.sleep(500L); 
        } 
      } catch (Exception exception) {
        if (!(exception instanceof V.b)) {
          D.c("CommThread Exception:");
          Logger.getLogger(t.class.getName()).log(Level.INFO, "Outside Read Error", exception);
        } 
      } 
    } 
    t.o--;
    t.m().remove(this);
    if (this.j && t.a(this.k) != null && !t.a(this.k, this.k.a()))
      t.a(this.k).g(); 
    D.d(this.k.e().u() + " ComThread stopped " + getName());
  }
  
  public boolean a() {
    return this.l;
  }
  
  public void a(boolean paramBoolean) {
    this.l = true;
    this.j = paramBoolean;
    synchronized (this.h) {
      this.h.notify();
    } 
  }
  
  public boolean b() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Android");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */