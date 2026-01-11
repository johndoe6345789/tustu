package bQ;

import bH.D;
import bN.k;
import bO.a;
import bO.c;
import bO.f;
import bO.h;
import bO.j;
import bO.k;
import java.util.ArrayList;
import java.util.List;

public class e {
  private final a a = new a();
  
  private final List b = new ArrayList();
  
  private final u c;
  
  private int d = -1;
  
  private int e = -1;
  
  private int f = -1;
  
  public e(String paramString, k paramk) {
    this.c = new u(paramString, paramk, this.a);
  }
  
  public String a() {
    return this.c.a();
  }
  
  public a b() {
    return this.a;
  }
  
  public f c() {
    return this.a.b();
  }
  
  public h d() {
    return this.a.c();
  }
  
  public List e() {
    return this.b;
  }
  
  public u f() {
    return this.c;
  }
  
  public void g() {
    this.c.c();
  }
  
  public void a(int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      if (this.b.size() <= b)
        this.b.add(new c()); 
    } 
    while (this.b.size() > paramInt)
      this.b.remove(paramInt - 1); 
    if (paramInt >= 0)
      this.c.a(b(0)); 
    if (paramInt >= 1)
      this.c.b(b(1)); 
  }
  
  public c b(int paramInt) {
    return (paramInt < 0 || paramInt < this.b.size()) ? this.b.get(paramInt) : null;
  }
  
  public c a(k paramk) {
    for (c c : this.b) {
      if (c.e().contains(paramk))
        return c; 
    } 
    return null;
  }
  
  public k c(int paramInt) {
    if (this.a.b().e().a() == 0) {
      for (c c : e()) {
        if (paramInt >= c.k() && paramInt <= c.k() + c.f())
          return c.c(paramInt - c.k()); 
      } 
      D.c("No ODT found for ID: " + paramInt);
      return null;
    } 
    throw new j("Only Absolute ODT Number currently supported.");
  }
  
  public int h() {
    return this.d;
  }
  
  public void d(int paramInt) {
    this.d = paramInt;
  }
  
  public int i() {
    return this.e;
  }
  
  public void e(int paramInt) {
    this.e = paramInt;
  }
  
  public int j() {
    return this.f;
  }
  
  public void f(int paramInt) {
    this.f = paramInt;
  }
  
  public void k() {
    this.c.b();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */