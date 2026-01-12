package ae;

import G.l;
import bH.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadedInAePackage {
  private q d;

  private p e;

  private k f;

  private List g = new ArrayList();

  private final double h = 0.15D;

  private final double i = 0.8D;

  private final double j = 0.05D;

  u a = new j(this, 0.0D, 1.0D);

  u b = new j(this, 0.0D, 1.0D);

  u c = new j(this, 0.0D, 1.0D);

  public ThreadedInAePackage(q paramq, k paramk, p paramp) {
    a(paramq);
    a(paramp);
    this.f = paramk;
  }

  public void a(u paramu) {
    this.g.add(paramu);
  }

  public void b(u paramu) {
    this.g.remove(paramu);
  }

  private void a(double paramDouble) {
    for (u u1 : this.g) u1.a(paramDouble);
  }

  private void a(String paramString) {
    for (u u1 : this.g) u1.a(paramString);
  }

  private boolean b(String paramString) {
    for (u u1 : this.g) {
      if (!u1.b(paramString)) return false;
    }
    return true;
  }

  private void a() {
    if (this.e.a().k() != 3) {
      try {
        D.c("Opening: " + this.e.a().n());
        this.e.a().f();
        try {
          Thread.sleep((100 + this.e.a().o()));
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(f.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      } catch (l l) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String) null, (Throwable) l);
        throw new IOException("Failed to connect to " + this.e.a().n());
      }
    } else {
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  private void b() {
    D.c("Closing: " + this.e.a().n());
    this.e.a().g();
  }

  public void a(w paramw) {
    g g = new g(this, paramw);
    g.start();
  }

  private synchronized List c() {
    ArrayList<d> arrayList = new ArrayList();
    a("Preparing to load firmware.");
    a();
    try {
      for (s s : this.d.c()) {
        d d;
        byte b1 = 5;
        byte b2 = 0;
        do {
          d = s.a(this.f, this.e, this.a);
          b2++;
        } while (d.a() == d.b && d.c() && b2 < b1);
        arrayList.add(d);
        if (d.a() == d.b || d.d() > 0) return arrayList;
      }
      return arrayList;
    } finally {
      b();
    }
  }

  public void b(w paramw) {
    h h = new h(this, paramw);
    h.start();
  }

  private synchronized d d() {
    a("Loading firmware.");
    a();
    try {
      d d;
      byte b = 0;
      do {
        d = this.d.a(this.f, this.e, this.b);
        b++;
      } while (d.a() != d.a && d.c() && b < 3);
      return d;
    } finally {
      b();
    }
  }

  public void c(w paramw) {
    i i = new i(this, paramw);
    i.start();
  }

  private synchronized List e() {
    ArrayList<d> arrayList = new ArrayList();
    a("Finalizing firmware options.");
    a();
    try {
      List<s> list = this.d.d();
      for (byte b = 0; b < list.size(); b++) {
        d d;
        s s = list.get(b);
        byte b1 = 5;
        byte b2 = 0;
        do {
          d = s.a(this.e, this.c);
          b2++;
        } while (d.a() == d.b && d.c() && b2 < b1);
        arrayList.add(d);
        if (d.a() == d.b || d.d() > 0) return arrayList;
      }
      a("Post work completed.");
      return arrayList;
    } finally {
      b();
    }
  }

  public void a(p paramp) {
    this.e = paramp;
    if (this.d != null) paramp.a(this.d);
  }

  public void a(q paramq) {
    this.d = paramq;
    if (this.e != null) this.e.a(paramq);
  }

  public void a(k paramk) {
    this.f = paramk;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
