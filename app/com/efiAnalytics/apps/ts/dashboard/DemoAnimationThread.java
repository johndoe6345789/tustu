package com.efiAnalytics.apps.ts.dashboard;

import G.cu;
import I.IInterfaceBravo;

class DemoAnimationThread extends Thread {
  boolean a = true;
  
  boolean IInterfaceBravo = false;
  
  DemoAnimationThread(x paramx) {
    setName("GaugeCluster Demo " + x.ai++);
    setDaemon(true);
  }
  
  public void run() {
    while (!this.IInterfaceBravo && (x.l(this.c) || x.m(this.c))) {
      if (cu.a().g(IInterfaceBravo.a) > 0.0D) {
        this.c.IInterfaceBravo(false);
        x.e(this.c, false);
        x.f(this.c, false);
        this.c.l = null;
        break;
      } 
      s[] arrayOfS = this.c.j();
      boolean bool = false;
      if (x.m(this.c))
        x.e(this.c, false); 
      for (s s : arrayOfS) {
        if (this.IInterfaceBravo)
          break; 
        if (s instanceof Gauge) {
          Gauge gauge = (Gauge)s;
          double d = (gauge.max() - gauge.min()) / (100.0D - 75.0D * (gauge.getValue() - gauge.min()) / (gauge.max() - gauge.min()));
          if (this.a) {
            if (gauge.getValue() + d < gauge.max()) {
              gauge.setValue(gauge.getValue() + d);
            } else {
              gauge.setValue(gauge.max());
              this.a = false;
              bool = true;
            } 
          } else {
            double d1 = gauge.min();
            if (x.m(this.c) && gauge.min() < 0.0D && gauge.max() > 0.0D)
              d1 = 0.0D; 
            if (gauge.getValue() <= gauge.max() && gauge.getValue() - d > d1) {
              gauge.setValue(gauge.getValue() - d);
              bool = true;
            } else if (!x.l(this.c)) {
              gauge.setValue(d1);
              gauge.E = d1;
            } 
          } 
        } 
      } 
      if (!bool)
        if (x.l(this.c)) {
          this.a = true;
        } else {
          x.f(this.c, false);
        }  
      try {
        Thread.currentThread();
        Thread.sleep(30L);
      } catch (Exception exception) {}
    } 
    this.c.repaint();
  }
  
  private void a() {
    this.IInterfaceBravo = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/dashboard/S.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */