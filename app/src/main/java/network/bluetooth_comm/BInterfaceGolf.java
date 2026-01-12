package B;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BInterfaceGolf implements k {
  private final List f = new ArrayList();

  private static g g = null;

  h a = null;

  List b = new ArrayList();

  Map c = new HashMap<>();

  Map d = new HashMap<>();

  Map e = new HashMap<>();

  public static g a() {
    if (g == null) g = new g();
    return g;
  }

  public void a(k paramk) {
    this.b.add(paramk);
    if (b()) {
      Iterator<Integer> iterator = this.f.iterator();
      while (iterator.hasNext()) {
        int i = ((Integer) iterator.next()).intValue();
        e e = e.a(i);
        e.a(paramk);
      }
    }
  }

  public void b(k paramk) {
    this.b.remove(paramk);
    if (b()) {
      Iterator<Integer> iterator = this.f.iterator();
      while (iterator.hasNext()) {
        int i = ((Integer) iterator.next()).intValue();
        e e = e.a(i);
        e.b(paramk);
      }
    }
  }

  public void a(int paramInt) {
    this.f.add(Integer.valueOf(paramInt));
  }

  public boolean b() {
    return (this.a != null && this.a.isAlive());
  }

  public void c() {
    Iterator<Integer> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer) iterator.next()).intValue();
      e e = e.a(i);
      for (k k1 : this.b) e.b(k1);
      e.b(this);
    }
    if (this.a != null && this.a.isAlive()) this.a.a();
  }

  public void d() {
    c();
    this.a = new h(this);
    Iterator<Integer> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer) iterator.next()).intValue();
      e e = e.a(i);
      for (k k1 : this.b) e.a(k1);
      e.a(this);
    }
    this.a.start();
  }

  private void g() {
    Iterator<Integer> iterator = this.f.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer) iterator.next()).intValue();
      e.a(i).a();
    }
  }

  public void a(i parami) {
    if (parami.e() != null && !parami.e().isEmpty()) {
      i i1 = (i) this.d.get(parami.e());
      if (i1 == null || !i1.equals(parami)) {
        a(parami.e(), parami);
        this.d.put(parami.e(), parami);
      }
    }
    this.e.put(parami.c(), parami);
  }

  public void a(String paramString, j paramj) {
    List<j> list = (List) this.c.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.c.put(paramString, list);
    }
    list.add(paramj);
  }

  public void b(String paramString, j paramj) {
    List list = (List) this.c.get(paramString);
    if (list != null) list.remove(paramj);
  }

  private void a(String paramString, i parami) {
    for (j j : c(paramString)) j.a(paramString, parami);
  }

  private List c(String paramString) {
    List list = (List) this.c.get(paramString);
    if (list == null) {
      list = new ArrayList();
      this.c.put(paramString, list);
    }
    return list;
  }

  public i a(String paramString) {
    return (i) this.e.get(paramString);
  }

  public i b(String paramString) {
    return (i) this.d.get(paramString);
  }

  public Collection e() {
    return this.d.values();
  }

  public void f() {
    this.c.clear();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
