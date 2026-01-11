package com.efiAnalytics.ui;

import bH.D;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class dD extends Thread {
  private int d = 100;
  
  private int e = 0;
  
  boolean a = false;
  
  private Component f = null;
  
  private boolean g = true;
  
  List b = new ArrayList();
  
  Object c = new Object();
  
  public dD(Component paramComponent) {
    super("Generic Paint Throttle");
    setDaemon(true);
    this.f = paramComponent;
  }
  
  public void a(dC paramdC) {
    this.b.add(paramdC);
  }
  
  private void c() {
    for (dC dC : this.b)
      dC.a(); 
  }
  
  public void a() {
    if (!this.a) {
      this.a = true;
      if (!b() || !isAlive())
        try {
          start();
        } catch (Exception exception) {
          D.a("Failed to start PaintThrottle Thread: " + exception.getLocalizedMessage());
        }  
    } 
  }
  
  public void a(int paramInt) {
    this.e = paramInt;
    a();
  }
  
  public void run() {
    while (this.g) {
      try {
        synchronized (this.c) {
          this.c.wait(this.d);
          if (this.e > 0) {
            this.c.wait(this.e);
            this.e = 0;
          } 
        } 
      } catch (InterruptedException interruptedException) {}
      if (this.a) {
        c();
        this.a = false;
        this.f.repaint();
      } 
    } 
  }
  
  public void b(int paramInt) {
    this.d = paramInt;
  }
  
  public boolean b() {
    return this.g;
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */