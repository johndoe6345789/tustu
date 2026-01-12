package G;

import V.ExceptionPrintstacktrace;
import bH.D;
import bH.ac;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExceptionPrintstacktraceImpl
    implements aG, ab, ad, bd, ExceptionPrintstacktrace, Serializable {
  R a = null;

  boolean b = false;

  List c = Collections.synchronizedList(new ArrayList());

  List d = Collections.synchronizedList(new ArrayList());

  List e = Collections.synchronizedList(new ArrayList());

  List f = Collections.synchronizedList(new ArrayList());

  final List ExceptionPrintstacktrace = Collections.synchronizedList(new ArrayList());

  private long m = -1L;

  private final long n = 20000L;

  boolean h = false;

  boolean i = false;

  int j = 0;

  int k = 15;

  private boolean o = true;

  private final ArrayList p = new ArrayList();

  private av q = null;

  boolean l = false;

  public ExceptionPrintstacktraceImpl(R paramR) {
    this.a = paramR;
    this.q = new av(this);
    this.q.start();
  }

  public boolean a(String paramString, bT parambT) {
    if (this.a != null
        && this.a.c().equals(paramString)
        && !this.a.i().equals(parambT.b())
        && !a(paramString, this.a.i(), parambT)) return false;
    if (this.a.c().equals(paramString) && (System.currentTimeMillis() - this.m > 20000L || this.o))
      h();
    return true;
  }

  private void ExceptionPrintstacktrace() {
    ao ao = new ao(this, "delayed full read");
    ao.start();
  }

  private void h() {
    i();
    m m = m.ExceptionPrintstacktrace(this.a.O());
    m.b(new ap(this));
    Iterator<n> iterator = this.c.iterator();
    while (iterator.hasNext()) m.b(iterator.next());
    a(m);
    k();
    this.j++;
  }

  private void i() {
    J j = this.a.C();
    Y y = this.a.h();
    for (byte b = 0; b < y.e(); b++) {
      int[] arrayOfInt1 = y.b(b);
      int[] arrayOfInt2 = j.a(this.a.c(), b);
      for (byte b1 = 0; b1 < arrayOfInt1.length; b1++) {
        if (arrayOfInt1[b1] <= 255 && arrayOfInt1[b1] >= -128) arrayOfInt2[b1] = arrayOfInt1[b1];
      }
    }
  }

  public void a(String paramString) {
    this.ExceptionPrintstacktrace.clear();
    this.m = System.currentTimeMillis();
  }

  public void a(o paramo) {
    if (paramo.a() == 1) {
      int[][] arrayOfInt = paramo.d();
      aB.a().a("Validating Data", 0.92D);
      long l = System.currentTimeMillis();
      if (!this.a.h().h()) {
        D.c("isBlank Time: " + (System.currentTimeMillis() - l) + " ms.");
        if (arrayOfInt.length == 0) {
          aB.a().b(this.a.c(), "Error trying to read data from Controller.");
          this.a.C().c();
        }
        aB.a().a("Performing Difference Report", 0.94D);
        Y y = new Y(this.a, arrayOfInt);
        y.a(this.a.p().b());
        y.b(true);
        z z = new z(ac.a().b());
        ArrayList arrayList = null;
        try {
          arrayList = z.a(this.a, this.a.h(), y);
        } catch (Exception exception) {
          aB.a()
              .b(
                  this.a.c(),
                  "Error trying to compare data from Controller:\n" + exception.getMessage());
          exception.printStackTrace();
          this.a.C().c();
        }
        D.c("DiffTime: " + (System.currentTimeMillis() - l) + " ms.");
        if (arrayList.size() > 0) {
          aB.a().a("Generating Difference Report, Please Wait.", 95.0D);
          boolean bool = a(arrayList, this.a, y, "The Controller");
          aB.a().c();
          if (bool) h();
        } else {
          aB.a().c();
          for (byte b = 0; b < arrayOfInt.length; b++) {
            try {
              this.a.h().b(b, 0, arrayOfInt[b]);
            } catch (ExceptionPrintstacktrace g1) {
              g1.printStackTrace();
            }
          }
          this.o = false;
        }
      } else {
        aB.a().c();
        this.a.h().b(this);
        for (byte b = 0; b < arrayOfInt.length; b++) {
          try {
            this.a.h().a(b, 0, arrayOfInt[b], false);
            this.a.h().ExceptionPrintstacktrace();
          } catch (ExceptionPrintstacktrace g1) {
            g1.printStackTrace();
            String str =
                "Data size from Controller does not match configuration!\n"
                    + "Can not continue in this condition.\n"
                    + "Going offline.";
            aB.a().b(this.a.c(), str);
            this.a.C().c();
            return;
          }
        }
        this.a.h().ExceptionPrintstacktrace();
        this.o = false;
      }
      this.j = 0;
      this.a.h().a(this);
      a(true);
      aL.a(this.a);
    } else if (paramo.a() == 3) {
      a(false);
      aB.a().c();
      if (this.j < 3) {
        D.c("result.FAILED: " + this.j + " tryCount");
        ExceptionPrintstacktrace();
      } else {
        String str =
            "Error reading data from "
                + paramo.f()
                + " after "
                + this.j
                + " attempts\nError message returned:\n"
                + paramo.c()
                + "\n\n"
                + "Application will now go offline. To attempt going back online\n"
                + "check the Project menu when connection problems are resolved.";
        aB.a().b(this.a.c(), str);
        this.a.C().c();
        this.j = 0;
      }
    }
  }

  public void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramInt1 < 0) return;
    this.o = true;
    if (!c(Thread.currentThread()) && !this.h && this.a.C() != null && this.a.C().q())
      a(paramInt1, paramInt2, paramArrayOfint.length);
  }

  private boolean c(Thread paramThread) {
    return this.p.contains(paramThread);
  }

  private boolean a(int paramInt) {
    for (aw aw : this.ExceptionPrintstacktrace) {
      if (aw.a() == paramInt) return true;
    }
    return false;
  }

  private void a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.q != null) this.q.b();
    ck ck1 = this.a.a(paramInt1, paramInt2);
    ck ck2 = this.a.b(paramInt1, paramInt2);
    if (this.k > 1 && this.a.O().aD() == null) this.k = 1;
    int i = paramInt2;
    int j = i + paramInt3;
    if (ck1 != null && paramInt2 + paramInt3 > ck1.a()) {
      int k = ck1.a() - paramInt2;
      if (k > 0) a(paramInt1, paramInt2, k);
      a(paramInt1, ck1.a(), paramInt3 - k);
    } else if (ck2 != null && ck2.a() + ck2.b() - 1 > paramInt2) {
      int k = ck2.a() + ck2.b() - paramInt2;
      k = Math.min(k, paramInt3);
      aw aw = b(paramInt1, ck2.a(), ck2.b());
      D.c(
          "In Protected DirtyData. page: "
              + paramInt1
              + ", start: "
              + paramInt2
              + ", end: "
              + paramInt3);
      if (aw != null) {
        aw.b(Math.min(paramInt2, aw.b()));
        aw.c(Math.max(paramInt2 + k - 1, aw.c()));
        D.c("updating a protected region range");
      } else {
        c(paramInt1, paramInt2, k);
        D.c("Writing to protected region: " + paramInt2 + ":" + paramInt3);
      }
      if (paramInt3 > k) {
        a(paramInt1, ck2.a() + ck2.b(), paramInt3 - k);
        D.c("Writing to unprotected region above protected");
      }
    } else {
      int k = (ck1 == null) ? Integer.MAX_VALUE : ck1.a();
      byte b = (ck2 == null) ? -1 : (ck2.a() + ck2.b() - 1);
      synchronized (this.ExceptionPrintstacktrace) {
        for (aw aw : this.ExceptionPrintstacktrace) {
          if (aw.a() == paramInt1
              && paramInt2 > b
              && paramInt2 + paramInt3 - 1 < k
              && a(aw, paramInt2, paramInt3) < this.k) {
            aw.b(Math.min(aw.b(), i));
            aw.c(Math.max(aw.c(), j));
            for (aw aw1 : this.ExceptionPrintstacktrace) {
              if (!aw1.equals(aw)
                  && aw1.a() == aw.a()
                  && k > aw.c()
                  && k > aw1.c()
                  && b < aw.b()
                  && b < aw1.b()
                  && (aw1.c() - aw.b() < this.k || aw.c() - aw1.b() < this.k)) {
                aw.b(Math.min(aw.b(), aw1.b()));
                aw.c(Math.max(aw.c(), aw1.c()));
                this.ExceptionPrintstacktrace.remove(aw1);
                break;
              }
            }
            j();
            return;
          }
        }
      }
      c(paramInt1, paramInt2, paramInt3);
    }
  }

  private aw b(int paramInt1, int paramInt2, int paramInt3) {
    for (aw aw : this.ExceptionPrintstacktrace) {
      if (aw.a() == paramInt1 && aw.b() <= paramInt2 && aw.c() >= paramInt2 + paramInt3 - 1)
        return aw;
    }
    return null;
  }

  private void j() {
    for (byte b = 0; b < this.ExceptionPrintstacktrace.size(); b++) {
      aw aw = this.ExceptionPrintstacktrace.get(b);
      for (byte b1 = 0; b1 < this.ExceptionPrintstacktrace.size(); b1++) {
        aw aw1 = this.ExceptionPrintstacktrace.get(b1);
        if (aw.a() == aw1.a() && !aw.equals(aw1) && a(aw, aw1)) {
          aw.b(Math.min(aw.b(), aw1.b()));
          aw.c(Math.max(aw.c(), aw1.c()));
          this.ExceptionPrintstacktrace.remove(b1);
          b1--;
        }
      }
    }
  }

  private int a(aw paramaw, int paramInt1, int paramInt2) {
    int i = paramInt1 + paramInt2 - 1;
    int j = paramaw.b() - i - 1;
    int k = paramInt1 - paramaw.c() - 1;
    return (k < 0 && j < 0) ? 0 : Math.max(j, k);
  }

  private boolean a(aw paramaw1, aw paramaw2) {
    int i = paramaw1.b() - paramaw2.c() - 1;
    int j = paramaw2.b() - paramaw1.c() - 1;
    return (j < 0 && i < 0);
  }

  private void c(int paramInt1, int paramInt2, int paramInt3) {
    aw aw = new aw(this);
    aw.a(paramInt1);
    this.ExceptionPrintstacktrace.add(aw);
    aw.b(paramInt2);
    aw.c(paramInt2 + paramInt3);
  }

  public void a(m paramm) {
    this.a.C().b(paramm);
  }

  public void a(n paramn) {
    this.c.add(paramn);
  }

  public void b(n paramn) {
    this.c.remove(paramn);
  }

  public void a(cW paramcW) {
    this.d.add(paramcW);
  }

  public void b(cW paramcW) {
    this.d.remove(paramcW);
  }

  private boolean a(String paramString1, String paramString2, bT parambT) {
    Iterator<cW> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      if (!((cW) iterator.next()).a(paramString1, paramString2, parambT)) return false;
    }
    return true;
  }

  private aw[] a(aw[] paramArrayOfaw) {
    for (byte b = 0; b < paramArrayOfaw.length; b++) {
      for (int i = b + 1; i < paramArrayOfaw.length; i++) {
        aw aw1 = paramArrayOfaw[b];
        aw aw2 = paramArrayOfaw[i];
        if (a(aw1) > a(aw2)) {
          paramArrayOfaw[b] = aw2;
          paramArrayOfaw[i] = aw1;
        }
      }
    }
    return paramArrayOfaw;
  }

  private int a(aw paramaw) {
    return paramaw.a() * 16777216 + paramaw.b();
  }

  protected synchronized void c() {
    if (this.ExceptionPrintstacktrace.isEmpty() || this.l) return;
    aw[] arrayOfAw = null;
    synchronized (this.ExceptionPrintstacktrace) {
      arrayOfAw =
          (aw[])
              this.ExceptionPrintstacktrace.toArray(
                  (Object[]) new aw[this.ExceptionPrintstacktrace.size()]);
      this.ExceptionPrintstacktrace.clear();
    }
    a(arrayOfAw);
    for (byte b = 0; b < arrayOfAw.length; b++) {
      int i = this.a.O().G(arrayOfAw[b].a()) - this.a.O().am();
      if (i > 0 && arrayOfAw[b].c() - arrayOfAw[b].b() > i) {
        while (arrayOfAw[b].c() - arrayOfAw[b].b() > 0) {
          int j = arrayOfAw[b].b();
          int k = (arrayOfAw[b].c() - j > i) ? (j + i) : arrayOfAw[b].c();
          aw aw = new aw(this);
          aw.a(arrayOfAw[b].a());
          aw.b(j);
          aw.c(k);
          b(aw);
          arrayOfAw[b].b(k);
        }
      } else {
        b(arrayOfAw[b]);
      }
    }
    if (this.i) {
      this.a.I();
      this.i = false;
    }
  }

  private void b(aw paramaw) {
    int[] arrayOfInt = this.a.p().a(paramaw.a(), paramaw.b(), paramaw.c() - paramaw.b());
    Object object = null;
    ArrayList<aw> arrayList = new ArrayList();
    byte b;
    for (b = 0; b < arrayOfInt.length; b = b1) {
      while (b < arrayOfInt.length && arrayOfInt[b] == Integer.MIN_VALUE) b++;
      byte b1;
      for (b1 = b; b1 < arrayOfInt.length && arrayOfInt[b1] != Integer.MIN_VALUE; b1++)
        ;
      if (b1 > b) {
        aw aw1 = new aw(this);
        aw1.a(paramaw.a());
        aw1.b(b + paramaw.b());
        aw1.c(b1 + paramaw.b());
        arrayList.add(aw1);
      }
    }
    if (arrayList.isEmpty()) return;
    for (aw aw1 : arrayList) {
      int[] arrayOfInt1 = new int[aw1.c() - aw1.b()];
      System.arraycopy(arrayOfInt, aw1.b() - paramaw.b(), arrayOfInt1, 0, aw1.c() - aw1.b());
      if (this.a.O().j(aw1.a()) != null) {
        m m = m.a(this.a.O(), aw1.a(), aw1.b(), arrayOfInt1);
        if (arrayOfInt1.length > 25) {
          if (!b(m)) aB.a().a(this.a.c(), "Large Write");
          m.b(new aq(this));
        } else if (arrayOfInt1.length > 0) {
          if (!b(m)) aB.a().a(this.a.c(), "Writing to Controller");
          m.b(new ar(this));
        }
        a(m);
        continue;
      }
      if (this.a.O().i(aw1.a()) != null)
        for (byte b1 = 0; b1 < arrayOfInt1.length; b1++) {
          m m = m.a(this.a.O(), aw1.a(), aw1.b() + b1, arrayOfInt1[b1]);
          if (b1 == 0) {
            if (!b(m)) aB.a().a(this.a.c(), "Writing to Controller");
            if (arrayOfInt1.length > 20) m.b(new as(this));
          }
          if (b1 == arrayOfInt1.length - 1) m.b(new at(this));
          a(m);
        }
    }
  }

  private boolean b(o paramo) {
    if (paramo.b() == null) return false;
    if (paramo.b().v() == null) return false;
    m m = paramo.b();
    return b(m);
  }

  private boolean b(m paramm) {
    try {
      F f = paramm.v();
      if (f.aa() == null) return false;
      R r = T.a().c(f.u());
      aM aM = r.c(f.aa());
      if (paramm.n() != 5 && paramm.n() != 4) return false;
      if (paramm.o() != aM.d()) return false;
      if (paramm.q() >= aM.ExceptionPrintstacktrace() && paramm.r() <= aM.z()) return true;
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return false;
  }

  public void d() {
    c();
  }

  public void e() {
    long l = System.currentTimeMillis();
    if (this.q != null && this.q.isAlive()) this.q.a();
    D.c("Flush lasted: " + (System.currentTimeMillis() - l) + "ms.");
  }

  public void b(String paramString, int paramInt) {
    if (this.a.O().v()
        && !this.a.C().c(this.a.O(), paramInt)
        && paramString.equals(this.a.c())
        && !this.a.C().c(paramInt)) {
      m m = m.d(this.a.O(), paramInt);
      m.b(new au(this));
      a(m);
    }
  }

  private boolean a(ArrayList paramArrayList, R paramR, Y paramY, String paramString) {
    Iterator<cB> iterator = this.e.iterator();
    while (iterator.hasNext()) {
      if (((cB) iterator.next()).a(paramArrayList, paramR, paramY, paramString)) return true;
    }
    return false;
  }

  private void k() {
    Iterator<bU> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      try {
        ((bU) iterator.next()).a();
      } catch (Exception exception) {
        D.d("Caught Exception notifying of fullread, continued.");
        exception.printStackTrace();
      }
    }
  }

  private void a(boolean paramBoolean) {
    Iterator<bU> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      try {
        ((bU) iterator.next()).a(paramBoolean);
      } catch (Exception exception) {
        D.d("Caught Exception notifying of fullread, continued.");
        exception.printStackTrace();
      }
    }
  }

  public void a(cB paramcB) {
    this.e.add(paramcB);
  }

  public void b(cB paramcB) {
    this.e.remove(paramcB);
  }

  public void a(bU parambU) {
    this.f.add(parambU);
  }

  public void b(bU parambU) {
    this.f.remove(parambU);
  }

  public void a() {
    this.o = true;
  }

  public void b() {
    this.o = true;
  }

  void a(Thread paramThread) {
    this.p.add(paramThread);
  }

  void b(Thread paramThread) {
    this.p.remove(paramThread);
  }

  public void a(String paramString, boolean paramBoolean) {}

  void f() {
    this.q.c();
  }

  public void a(String paramString, int paramInt) {}
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
