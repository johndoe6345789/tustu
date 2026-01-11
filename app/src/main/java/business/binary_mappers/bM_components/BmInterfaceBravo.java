package business.binary_mappers.bM_components;

import G.R;
import java.util.ArrayList;
import java.util.List;

public class BmInterfaceBravo {
  R a;
  
  List b = new ArrayList();
  
  public BmInterfaceBravo(R paramR) {
    this.a = paramR;
  }
  
  public void a(a parama) {
    if (!parama.f()) {
      c c = d((int)Math.round(parama.e()));
      c.a(parama.d());
      c.c(parama.c());
      double d = parama.a() * parama.c() / parama.d() * parama.b() / 100.0D;
      c.b(d);
    } 
  }
  
  public double a(int paramInt) {
    if (paramInt >= b() && paramInt <= a())
      return c(paramInt).c(); 
    if (paramInt > a()) {
      double d1 = b(paramInt);
      return c(a()).c() + (paramInt - a()) * d1;
    } 
    double d = b(paramInt);
    d = (d > 0.0D) ? 0.0D : d;
    return c(b()).c() + (paramInt - b()) * d;
  }
  
  public double b(int paramInt) {
    if (this.b.size() < 2)
      return 0.0D; 
    int i = f(paramInt);
    int j = i;
    int k = 0;
    int m = 0;
    if (i != -1) {
      while (i > 0 && ((c)this.b.get(i - 1)).d() > paramInt - 5)
        i--; 
      while (j < this.b.size() - 1 && ((c)this.b.get(j + 1)).d() < paramInt + 5)
        j++; 
    } else if (paramInt < b()) {
      i = f(b());
      for (j = i; j < this.b.size() - 1 && ((c)this.b.get(j + 1)).d() < b() + 15; j++);
    } else if (paramInt > a()) {
      j = f(a());
      for (i = j; i > 0 && ((c)this.b.get(i - 1)).d() > a() - 15; i--);
    } 
    k = ((c)this.b.get(i)).d();
    m = ((c)this.b.get(j)).d();
    c c1 = c(k);
    c c2 = c(m);
    return (c2.c() - c1.c()) / (m - k);
  }
  
  public int a() {
    return (this.b.size() > 0) ? ((c)this.b.get(this.b.size() - 1)).d() : Integer.MIN_VALUE;
  }
  
  public int b() {
    return (this.b.size() > 0) ? ((c)this.b.get(0)).d() : Integer.MAX_VALUE;
  }
  
  public c c(int paramInt) {
    int i = f(paramInt);
    if (i < 0)
      return null; 
    byte b1 = 7;
    while (true) {
      if (i - b1 < 0 || i + b1 > this.b.size() - 1) {
        b1--;
        continue;
      } 
      c c1 = this.b.get(i);
      c c2 = new c(paramInt);
      c2.a(c1.b());
      double d1 = 0.0D;
      int j = 0;
      double d2 = 0.0D;
      for (int k = i - b1; k <= i + b1; k++) {
        int m = ((c)this.b.get(k)).a();
        j += m;
        d1 += ((c)this.b.get(k)).c() * m;
        d2 += ((c)this.b.get(k)).e() * m;
      } 
      c2.b = d1 / j;
      c2.a = j;
      c2.d(d2 / j);
      return c2;
    } 
  }
  
  public c d(int paramInt) {
    for (byte b1 = 0; b1 < this.b.size(); b1++) {
      c c1 = this.b.get(b1);
      if (c1.d() == paramInt)
        return c1; 
      if (c1.d() > paramInt) {
        c c2 = new c(paramInt);
        c2.a(paramInt);
        this.b.add(b1, c2);
        return c2;
      } 
    } 
    c c = new c(paramInt);
    this.b.add(c);
    return c;
  }
  
  public int e(int paramInt) {
    c c = d(paramInt);
    return c.a();
  }
  
  private int f(int paramInt) {
    if (this.b.size() > 0 && ((c)this.b.get(0)).d() <= paramInt)
      for (byte b1 = 0; b1 < this.b.size(); b1++) {
        c c = this.b.get(b1);
        if (c.d() >= paramInt)
          return b1; 
      }  
    return -1;
  }
  
  public void c() {
    this.b.clear();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bM/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */