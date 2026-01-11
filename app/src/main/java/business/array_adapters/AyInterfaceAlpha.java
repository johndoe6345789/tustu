package business.array_adapters;

import java.util.ArrayList;
import java.util.List;

public class AyInterfaceAlpha implements e {
  private static a h = null;
  
  f a = f.a();
  
  List b = new ArrayList();
  
  List c = new ArrayList();
  
  List d = new ArrayList();
  
  List e = new ArrayList();
  
  b f = null;
  
  final Object g = new Object();
  
  public static a c() {
    if (h == null)
      h = new a(); 
    return h;
  }
  
  public void a(e parame) {
    this.b.add(parame);
  }
  
  public void a(p paramp) {
    this.c.add(paramp);
    synchronized (this.g) {
      for (c c : this.d)
        paramp.d(c); 
    } 
  }
  
  public void b(p paramp) {
    this.c.remove(paramp);
  }
  
  public List d() {
    return this.d;
  }
  
  private void h() {
    this.e.clear();
    for (e e1 : this.b)
      e1.a(); 
  }
  
  private void i() {
    j();
    for (e e1 : this.b)
      e1.b(); 
  }
  
  private void j() {
    synchronized (this.g) {
      List list1 = this.d;
      List list2 = this.e;
      this.d = this.e;
      this.e = list1;
      for (c c : list1) {
        if (!a(list2, c))
          c(c); 
      } 
      for (c c : list2) {
        if (!a(list1, c))
          b(c); 
      } 
    } 
  }
  
  private void b(c paramc) {
    for (p p : this.c)
      p.d(paramc); 
  }
  
  private void c(c paramc) {
    for (p p : this.c)
      p.c(paramc); 
  }
  
  private boolean a(List paramList, c paramc) {
    for (c c1 : paramList) {
      if (c1.a().equals(paramc.a()) && c1.c().equals(paramc.c()))
        return true; 
    } 
    return false;
  }
  
  private void d(c paramc) {
    this.e.add(paramc);
    for (e e1 : this.b)
      e1.a(paramc); 
  }
  
  public void a(c paramc) {
    d(paramc);
  }
  
  public void a() {
    h();
  }
  
  public void b() {
    i();
  }
  
  public boolean e() {
    return (this.f != null && this.f.isAlive());
  }
  
  public void f() {
    if (this.f != null && this.f.isAlive())
      this.f.a(); 
  }
  
  public void g() {
    f();
    this.f = new b(this);
    this.a.a(this);
    this.f.start();
  }
  
  private void k() {
    this.a.b();
  }
  
  public boolean a(String paramString) {
    for (c c : this.d) {
      if (c.a().equals(paramString))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ay/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */