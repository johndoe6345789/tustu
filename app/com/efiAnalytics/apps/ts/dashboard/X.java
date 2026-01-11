package com.efiAnalytics.apps.ts.dashboard;

import bH.D;
import java.awt.Image;

class X extends Thread {
  long a = 0L;
  
  long b = 50L;
  
  boolean c = false;
  
  boolean d = true;
  
  long e = -1L;
  
  public X(x paramx) {
    setName("GaugeCluster PaintThrottle");
    setDaemon(true);
  }
  
  public void a() {
    if (!this.f.L() && this.b > 10L)
      if (this.b > 150L) {
        this.b -= 30L;
      } else if (this.b < 16L) {
        this.b = 10L;
      } else if (this.b < 20L) {
        this.b = 15L;
      } else if (this.b < 23L) {
        this.b = 19L;
      } else {
        this.b -= 8L;
      }  
  }
  
  public void b() {
    if (this.b < 250L)
      this.b += 3L; 
  }
  
  public void c() {
    this.c = true;
  }
  
  private void d() {
    if (!this.f.z() || !this.f.isShowing())
      return; 
    this.f.repaint();
    this.c = false;
    this.a = System.currentTimeMillis();
  }
  
  public void run() {
    while (this.d) {
      try {
        synchronized (this) {
          if (x.f(this.f) != null) {
            wait(this.b / 2L);
          } else {
            wait(this.b);
          } 
        } 
        if (this.d && this.c) {
          d();
          continue;
        } 
        if (this.e > 0L && this.e < System.currentTimeMillis()) {
          D.c("Calling followup Paint");
          this.e = -1L;
          x.a(this.f, (Image)null);
          x.b(this.f, (Image)null);
          d();
        } 
      } catch (Exception exception) {
        System.out.println("PaintThrottle Thread died");
      } 
    } 
  }
  
  private void e() {
    this.d = false;
  }
  
  private void a(long paramLong) {
    this.e = paramLong;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */