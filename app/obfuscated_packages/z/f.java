package z;

import G.J;
import G.l;
import V.b;
import V.d;
import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class f extends Thread {
  long a = 0L;
  
  long b = 30L;
  
  int c = 0;
  
  int d = 0;
  
  int e = 60;
  
  private boolean g = false;
  
  public f(e parame) {
    super("COMM Thread" + (Math.random() * 100000.0D));
    try {
      setPriority(10);
    } catch (Exception exception) {
      D.a("Failed to set Comm Thread Priority");
    } 
  }
  
  public void run() {
    D.d("Comm Manager for " + this.f.e().u() + " Started");
    if (this.f.e() != null)
      this.e = this.f.e().t(); 
    while (!this.g) {
      e.a(this.f, System.currentTimeMillis());
      try {
        if (!this.f.g) {
          boolean bool1 = false;
          if (!this.f.q() || this.f.b == null) {
            this.f.a(this.f.e().r() + "");
            this.f.e().i(false);
            long l = System.currentTimeMillis();
            char c = Character.MIN_VALUE;
            try {
              this.f.o();
              if (e.a(this.f, 600))
                setPriority(10); 
            } catch (l l1) {
              D.c("Port not valid: " + l1.getMessage());
              e.a(this.f, false);
              e.a(this.f);
              c = 'ஸ';
            } catch (IOException iOException) {
              D.c("Port turned not valid: " + iOException.getMessage());
              e.b(this.f, false);
              e.a(this.f);
              c = 'ஸ';
              this.f.h();
            } catch (b b) {
              if (bool1 || J.I())
                D.c("Timeout trying to go online: " + b.getMessage()); 
              e.c(this.f, false);
              c = 'Ϩ';
            } catch (Exception exception) {
              if (bool1 || J.I())
                D.c("Error trying to go online: " + exception.getMessage()); 
              e.d(this.f, false);
              c = 'ஸ';
            } 
            if (!e.b(this.f) && c > '\000') {
              long l1 = c - System.currentTimeMillis() - l;
              if (l1 > 0L)
                Thread.sleep(l1); 
            } 
            continue;
          } 
          boolean bool2 = false;
          try {
            yield();
            if (this.f.w()) {
              bool2 = true;
              e.c(this.f);
              continue;
            } 
            try {
              if (J.I() && this.f.n) {
                e.c(false);
                e.d(this.f);
                e.d(true);
              } else {
                e.e(this.f);
              } 
              this.c = 0;
              this.d++;
            } catch (Exception exception) {
              D.c("Exception Caught during comms, type:" + exception.getClass().getName() + ", message: " + exception.getMessage());
              Thread.sleep((this.f.e().i() / 2));
              this.d = 0;
              e.f(this.f);
              this.c++;
              boolean bool = false;
              if (exception instanceof d && this.f.e().D() != null)
                bool = !this.f.e().D().a(((d)exception).a()) ? true : false; 
              if (bool2 || this.c > 3 || this.f.g || bool) {
                e.g(this.f);
                this.f.h();
                e.e(this.f, false);
                e.h(this.f);
                e.i(this.f);
                this.f.e().E(this.f.e().aw());
                this.f.v();
                D.c("Went offline");
                e.f(this.f, false);
                this.c = 0;
                D.c("Writing the last " + e.j(this.f) + " comm interactions with the controller to the log file here:");
                e.k(this.f);
                if (!this.g)
                  throw exception; 
                sleep(1000L);
              } 
            } 
          } catch (Exception exception) {
            e.g(this.f, false);
            if (e.l(this.f).size() > 0) {
              D.c("Writing the last " + e.m(this.f) + " comm interactions with the controller to the log file here:");
              e.n(this.f);
            } 
            e.o(this.f);
            e.p(this.f);
            this.f.v();
            D.d("Went offline 2");
            e.h(this.f, false);
            if (e.s())
              Logger.getLogger(e.class.getName()).log(Level.INFO, (String)null, exception); 
            if (exception instanceof b) {
              sleep(500L);
              continue;
            } 
            sleep(3000L);
          } 
        } 
      } catch (Exception exception) {
        D.c("CommThread Exception:");
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, exception);
      } 
    } 
    D.c(this.f.e().u() + " ComThread stopped");
  }
  
  public boolean a() {
    return this.g;
  }
  
  public void b() {
    this.g = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */