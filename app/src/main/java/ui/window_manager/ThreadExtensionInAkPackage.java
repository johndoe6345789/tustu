package aK;

import G.J;
import G.l;
import bH.D;
import bH.aa;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInAkPackage extends Thread {
  int a = 0;
  
  boolean b = true;
  
  h c = null;
  
  public ThreadExtensionInAkPackage(a parama) {
    if (a.h() != null)
      D.a("Attempting to create second connection!"); 
    setDaemon(true);
    a.a(this);
    setName("GPSThread:" + System.currentTimeMillis());
  }
  
  public synchronized void a() {
    this.a++;
    if (a.a(this.d).k() == 2) {
      D.d("Connecting to GPS Adapter, waiting...");
    } else if (a.a(this.d).k() == 0) {
      a.a(this.d).f();
      this.a = 0;
    } 
  }
  
  public void run() {
    try {
      this.b = true;
      try {
        String str = null;
        long l = 100L;
        byte b1 = 0;
        aa aa = new aa();
        aa.a();
        while (this.b) {
          if (a.a(this.d) != null && a.a(this.d).k() == 3) {
            try {
              if (this.c == null)
                this.c = new h(a.a(this.d).i()); 
              str = this.c.a();
              a.a(this.d, str);
              if (str != null && !str.isEmpty()) {
                a.b(this.d, str);
              } else {
                D.a("Resetting GPS Connection");
                c();
                a();
              } 
              if (a.b(this.d) == a.b) {
                l = 5L;
              } else {
                l = 20L;
              } 
              b1 = 0;
            } catch (IOException iOException) {
              if (b1++ > 3) {
                D.d("GPS Connection Error, resetting Connection.");
                D.a(iOException);
                c();
                l = 500L;
              } else {
                l = 30L;
              } 
            } catch (Exception exception) {
              if (J.I()) {
                D.a(exception);
                D.a("Failed Sentence: " + str);
              } 
              l = 500L;
            } 
          } else if (a.a(this.d) != null) {
            try {
              if (this.a == 0)
                try {
                  synchronized (this.d.e) {
                    this.d.e.wait((1000 + a.a(this.d).p()));
                  } 
                } catch (InterruptedException interruptedException) {} 
              this.c = null;
              a();
            } catch (l l1) {
              String str1 = "Failed to connect to GPS: " + l1.getMessage();
              D.d(str1);
              if (this.a <= 3) {
                l = 3000L;
              } else {
                l = 10000L;
              } 
            } 
          } else {
            l = 1000L;
          } 
          try {
            synchronized (this.d.e) {
              this.d.e.wait(l);
            } 
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        D.a(runtimeException);
        throw runtimeException;
      } 
    } finally {
      try {
        a.a(this.d).g();
        this.d.c();
      } catch (Exception exception) {}
      a.a((b)null);
      synchronized (this.d.e) {
        this.d.e.notify();
      } 
    } 
  }
  
  public void b() {
    this.b = false;
    synchronized (this.d.e) {
      this.d.e.notify();
    } 
    if (a.a(this.d) != null)
      a.a(this.d).g(); 
    try {
      synchronized (this.d.e) {
        this.d.e.wait(100L);
      } 
    } catch (InterruptedException interruptedException) {}
  }
  
  private void c() {
    try {
      a.a(this.d).g();
      this.c = null;
      this.d.c();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aK/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */