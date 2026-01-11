package com.efiAnalytics.xcp.master.responseProcessors;

import G.cx;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class k extends Thread {
  int a = 300;
  
  long b = 0L;
  
  final Object c = new Object();
  
  k(j paramj) {}
  
  public void run() {
    while (true) {
      synchronized (this.c) {
        try {
          this.c.wait(this.a);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
        if (System.currentTimeMillis() > this.b) {
          ArrayList arrayList = new ArrayList();
          synchronized (this.d.b) {
            arrayList.addAll(this.d.b);
            this.d.b.clear();
          } 
          for (l l : arrayList) {
            if (l.a(l)) {
              cx.a(l.a(), l.b());
              continue;
            } 
            cx.a(l.a(), l.b(), l.c(), l.d());
          } 
        } 
      } 
    } 
  }
  
  public void a() {
    this.b = System.currentTimeMillis() + this.a;
    synchronized (this.c) {
      this.c.notify();
    } 
  }
  
  public void a(l paraml) {
    a();
    this.d.b.add(paraml);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */