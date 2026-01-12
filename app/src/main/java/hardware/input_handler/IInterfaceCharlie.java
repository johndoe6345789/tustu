package hardware.input_handler;

import W.n;
import bH.D;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IInterfaceCharlie {
  List a = new CopyOnWriteArrayList();

  List b = new CopyOnWriteArrayList();

  List c = new CopyOnWriteArrayList();

  List d = new CopyOnWriteArrayList();

  private e e = null;

  private static c f = null;

  public static c a() {
    if (f == null) f = new c();
    return f;
  }

  public void a(d paramd) {
    this.d.add(paramd);
  }

  public void a(String paramString1, String paramString2) {
    for (d d : this.d) d.a(paramString1, paramString2);
  }

  public void a(j paramj) {
    this.b.add(paramj);
  }

  public void b(j paramj) {
    this.b.remove(paramj);
  }

  public void b() {
    for (j j : this.b) j.a();
  }

  public void c() {
    for (j j : this.b) j.b();
  }

  public void a(a parama) {
    if (!this.a.contains(parama)) this.a.add(parama);
  }

  public void b(a parama) {
    this.a.remove(parama);
  }

  public void a(int paramInt) {
    for (a a : this.a) {
      try {
        if (a != null) a.a(paramInt);
      } catch (Exception exception) {
        D.a(exception);
      }
    }
  }

  public void a(n paramn) {
    for (b b : this.c) b.a(paramn);
  }

  public void b(n paramn) {
    for (b b : this.c) b.b(paramn);
  }

  public boolean d() {
    return (this.e == null) ? false : this.e.a();
  }

  public void a(e parame) {
    this.e = parame;
  }

  public n e() {
    return (this.e == null) ? null : this.e.b();
  }

  public int f() {
    return (this.e == null) ? -1 : this.e.c();
  }

  public void a(b paramb) {
    this.c.add(paramb);
  }

  public Iterator g() {
    return this.c.iterator();
  }

  public void b(b paramb) {
    this.c.remove(paramb);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/i/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
