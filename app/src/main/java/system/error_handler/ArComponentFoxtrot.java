package ar;

import ao.bq;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArComponentFoxtrot {
  List a = new ArrayList();

  List b = new CopyOnWriteArrayList();

  private l d = new a();

  List c = new ArrayList();

  private static f e = null;

  private String f = null;

  private boolean g = false;

  public static f a() {
    if (e == null) e = new f();
    return e;
  }

  public List b() {
    if (this.a.isEmpty()) this.a = f().a();
    return this.a;
  }

  public boolean a(String paramString) {
    long l1 = System.currentTimeMillis();
    for (c c : b()) {
      if (c.b().equals(paramString)) {
        if (i(c)) {
          if (!paramString.equals("Default"))
            ;
          this.f = c.b();
          h(c);
          bq.a().c().k();
          return true;
        }
        return false;
      }
    }
    D.c("Invalid QuickView name.");
    return false;
  }

  public void a(e parame) {
    this.c.add(parame);
  }

  public void a(c paramc) {
    if (this.g) return;
    if (c(paramc.b()) == null) {
      d(paramc);
    } else {
      for (byte b = 0; b < this.a.size(); b++) {
        if (((c) this.a.get(b)).b().equals(paramc.b()) && !((c) this.a.get(b)).a(paramc)) {
          this.a.set(b, paramc);
          e(paramc);
          h(paramc.b());
          break;
        }
      }
    }
  }

  private void e(c paramc) {
    if (this.g) return;
    for (byte b = 0; b < this.b.size(); b++) {
      if (((c) this.b.get(b)).b().equals(paramc.b())) {
        this.b.remove(b);
        break;
      }
    }
    this.b.add(paramc);
    f(paramc);
  }

  public List c() {
    return this.b;
  }

  public boolean d() {
    return !this.b.isEmpty();
  }

  public void b(c paramc) {
    if (this.g) return;
    f().a(paramc, e(paramc.b()));
    c(paramc);
  }

  private int e(String paramString) {
    for (byte b = 0; b < this.a.size(); b++) {
      if (((c) this.a.get(b)).b().equals(paramString)) return b;
    }
    return -1;
  }

  public void e() {
    if (this.g) return;
    for (c c : this.b) b(c);
    this.b.clear();
  }

  public void c(c paramc) {
    for (byte b = 0; b < this.b.size(); b++) {
      if (((c) this.b.get(b)).b().equals(paramc.b())) {
        this.b.remove(b);
        break;
      }
    }
    g(paramc);
  }

  public void b(String paramString) {
    if (this.g) return;
    String str = g();
    c c = c(paramString);
    int i = c.e();
    f().b(paramString);
    this.b.remove(c);
    if (!c.f()) {
      if (c != null && c.b().equals(str) && str != null && c.b().equals(str))
        a(((c) this.a.get(0)).b());
      for (byte b = 0; b < this.a.size(); b++) {
        if (((c) this.a.get(b)).b().equals(paramString)) {
          this.a.remove(b);
          break;
        }
      }
      g(paramString);
    } else {
      c c1 = this.d.a(paramString);
      if (i >= 0) {
        c1.a(i);
        this.a.set(i, c1);
      }
      h(c1);
    }
  }

  protected l f() {
    return this.d;
  }

  public void a(l paraml) {
    this.d = paraml;
  }

  public c c(String paramString) {
    for (c c : b()) {
      if (c.b().equals(paramString)) return c;
    }
    return null;
  }

  public String g() {
    return this.f;
  }

  public void d(String paramString) {
    c c1 = new c(paramString);
    c c2 = c(g());
    if (c2 != null) for (d d : c2.c()) c1.a(d);
    d(c1);
  }

  public void d(c paramc) {
    this.a.add(paramc);
    f().a(paramc, this.a.size() - 1);
    f(paramc.b());
  }

  private void f(c paramc) {
    for (e e : this.c) e.b(paramc);
  }

  private void g(c paramc) {
    for (e e : this.c) e.c(paramc);
  }

  private void h(c paramc) {
    for (e e : this.c) e.a(paramc);
  }

  private boolean i(c paramc) {
    for (e e : this.c) {
      if (!e.a(this.f, paramc.b())) return false;
    }
    return true;
  }

  private void f(String paramString) {
    for (e e : this.c) e.a(paramString);
  }

  private void g(String paramString) {
    for (e e : this.c) e.b(paramString);
  }

  private void h(String paramString) {
    for (e e : this.c) e.c(paramString);
  }

  public void a(boolean paramBoolean) {
    if (paramBoolean) this.b.clear();
    this.g = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ar/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
