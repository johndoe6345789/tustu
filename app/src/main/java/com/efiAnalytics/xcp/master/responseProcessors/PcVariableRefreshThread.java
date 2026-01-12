package com.efiAnalytics.xcp.master.responseProcessors;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class PcVariableRefreshThread extends Thread {
  int a = 300;

  long b = 0L;

  final Object c = new Object();

  PcVariableRefreshThread(g paramg) {}

  public void run() {
    while (true) {
      synchronized (this.c) {
        try {
          this.c.wait(this.a);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(j.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
        if (System.currentTimeMillis() > this.b) {
          ArrayList arrayList = new ArrayList();
          synchronized (this.d.b) {
            arrayList.addAll(this.d.b);
            this.d.b.clear();
          }
          for (i i : arrayList) {
            if (i.b() == null) {
              g.a(this.d, i.a());
              continue;
            }
            g.a(this.d, i.a(), i.b());
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

  public void a(i parami) {
    a();
    this.d.b.add(parami);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
