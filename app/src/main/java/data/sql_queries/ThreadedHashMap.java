package aI;

import G.GComponentCq;
import G.ManagerUsingArrayList;
import G.R;
import G.S;
import G.T;
import V.ExceptionInVPackage;
import bH.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadedHashMap implements S, GComponentCq {
  private static HashMap b = new HashMap<>();

  private R c = null;

  private List d = new ArrayList();

  private boolean e = true;

  boolean ExceptionInVPackage = false;

  private ThreadedHashMap(R paramR) {
    this.c = paramR;
    b();
  }

  private void b() {
    try {
      ManagerUsingArrayList.ExceptionInVPackage()
          .ExceptionInVPackage(this.c.c(), d.ExceptionInVPackage, this);
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      Logger.getLogger(t.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
    }
    T.ExceptionInVPackage().ExceptionInVPackage(this);
    long l = System.currentTimeMillis();
    while (this.c.R() && !this.ExceptionInVPackage) {
      if (System.currentTimeMillis() - l > 500L) {
        D.b("SdCardInMonitor::Init timeout waiting for channel publish");
        break;
      }
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(t.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  private void c() {
    ManagerUsingArrayList.ExceptionInVPackage().ExceptionInVPackage(this);
    b.remove(this.c.c());
  }

  public static t d(R paramR) {
    t t1 = (t) b.get(paramR.c());
    if (t1 == null) {
      t1 = new t(paramR);
      b.put(paramR.c(), t1);
    }
    return t1;
  }

  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    boolean bool = (((int) paramDouble & d.b) == d.b);
    if (this.e != bool)
      if (bool) {
        e();
      } else {
        d();
      }
    this.e = bool;
    this.ExceptionInVPackage = true;
  }

  public synchronized void ExceptionInVPackage(s params) {
    this.d.add(params);
    if (this.e) {
      params.d();
    } else {
      params.e();
    }
  }

  public void b(s params) {
    this.d.add(params);
  }

  private void d() {
    Iterator<s> iterator = this.d.iterator();
    while (iterator.hasNext()) ((s) iterator.next()).e();
  }

  private void e() {
    Iterator<s> iterator = this.d.iterator();
    while (iterator.hasNext()) ((s) iterator.next()).d();
  }

  public void ExceptionInVPackage(R paramR) {}

  public void b(R paramR) {
    c();
  }

  public void c(R paramR) {}

  public boolean ExceptionInVPackage() {
    return this.e;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
