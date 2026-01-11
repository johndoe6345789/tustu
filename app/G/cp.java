package G;

import bH.D;
import bH.aa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;

public class cp {
  int a = 50;
  
  R b = null;
  
  final List c = Collections.synchronizedList(new ArrayList());
  
  final List d = Collections.synchronizedList(new ArrayList());
  
  ArrayList e = new ArrayList();
  
  ArrayList f = new ArrayList();
  
  boolean g = true;
  
  public cp(R paramR) {
    this.b = paramR;
    this.a = paramR.O().M();
  }
  
  public void a(co paramco) {
    this.e.add(paramco);
  }
  
  public void b(co paramco) {
    this.f.add(paramco);
  }
  
  private void c() {
    for (co co : this.e) {
      if (this.c.isEmpty()) {
        co.a(null);
        continue;
      } 
      co.a(this.c);
    } 
    for (co co : this.f) {
      if (this.d.isEmpty()) {
        if (co != null)
          co.a(null); 
        continue;
      } 
      co.a(this.d);
    } 
  }
  
  public List a(Set paramSet) {
    if (this.g || this.c.isEmpty())
      synchronized (this.c) {
        b(paramSet);
      }  
    return this.c;
  }
  
  public void a() {
    synchronized (this.c) {
      this.c.clear();
    } 
    synchronized (this.d) {
      this.d.clear();
    } 
    c();
  }
  
  private void b(Set paramSet) {
    this.g = false;
    aa aa = new aa();
    aa.a();
    try {
      for (String str : paramSet) {
        aH aH = this.b.g(str);
        a(aH);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      a();
    } 
    aa.b();
    int i = 0;
    for (w w : this.c) {
      if (J.I())
        D.d(w.toString()); 
      i += w.c();
    } 
    a(this.d);
    c();
  }
  
  private List a(List<w> paramList) {
    long l = System.currentTimeMillis();
    for (byte b = 0; b < paramList.size(); b++) {
      for (int i = b + 1; i < paramList.size(); i++) {
        w w1 = paramList.get(b);
        w w2 = paramList.get(i);
        if (w1.a() > w2.a()) {
          paramList.set(b, w2);
          paramList.set(i, w1);
        } 
      } 
    } 
    return paramList;
  }
  
  private void a(aH paramaH) {
    if (paramaH.b().equals("formula")) {
      ArrayList arrayList = i.a(this.b, paramaH);
      for (aH aH1 : arrayList) {
        if (!aH1.equals(paramaH))
          a(aH1); 
      } 
    } else {
      int i = paramaH.a();
      int j = paramaH.a() + paramaH.l() - 1;
      w w = new w();
      w.a(i);
      w.b(j);
      if (!this.d.contains(w))
        this.d.add(w); 
      boolean bool = false;
      byte b;
      for (b = 0; b < this.c.size(); b++) {
        w w1 = this.c.get(b);
        if ((w1.b() <= j && w1.b() > i - this.a) || (w1.a() >= j && w1.a() < j + this.a)) {
          if (j > w1.b())
            w1.b(j); 
          if (i < w1.a())
            w1.a(i); 
          bool = true;
          break;
        } 
      } 
      if (!bool) {
        w w1 = new w();
        w1.a(i);
        w1.b(j);
        this.c.add(w1);
      } 
      while (true) {
        b = 1;
        byte b1;
        for (b1 = 1; b1 < this.c.size(); b1++) {
          w w1 = this.c.get(b1 - 1);
          w w2 = this.c.get(b1);
          if (w1.a() > w2.a()) {
            this.c.set(b1 - 1, w2);
            this.c.set(b1, w1);
            b1--;
            b = 0;
          } 
        } 
        if (b != 0) {
          for (b1 = 1; b1 < this.c.size(); b1++) {
            w w1 = this.c.get(b1 - 1);
            w w2 = this.c.get(b1);
            if (w1.b() > w2.a() - this.a || Math.abs(w1.a() - w2.a()) < this.a) {
              w1.a(Math.min(w1.a(), w2.a()));
              w1.b(Math.max(w1.b(), w2.b()));
              this.c.remove(b1);
              b1--;
            } 
          } 
          return;
        } 
      } 
    } 
  }
  
  public void b() {
    a();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */