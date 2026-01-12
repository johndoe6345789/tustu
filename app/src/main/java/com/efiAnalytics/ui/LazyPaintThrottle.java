package com.efiAnalytics.ui;

import java.awt.Component;

public class dE extends Thread {
  private int b = 100;

  private Component c = null;

  private boolean d = true;

  long a = Long.MAX_VALUE;

  private long e = 50L;

  public dE(Component paramComponent) {
    super("LazyPaintThrottle");
    setDaemon(true);
    this.c = paramComponent;
  }

  public void a() {
    this.a = System.currentTimeMillis() + this.b;
    if (!b() || !isAlive()) start();
  }

  public void run() {
    while (this.d) {
      try {
        Thread.sleep(c());
      } catch (InterruptedException interruptedException) {
      }
      if (System.currentTimeMillis() >= this.a) {
        this.a = Long.MAX_VALUE;
        this.c.repaint();
      }
    }
  }

  public void a(int paramInt) {
    this.b = paramInt;
  }

  public boolean b() {
    return this.d;
  }

  public long c() {
    return this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
