package bS;

import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class l {
  private boolean d = false;
  
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  List c = new ArrayList();
  
  private static int e = 0;
  
  private int f = 0;
  
  public void a(r paramr) {
    if (!this.b.contains(paramr)) {
      this.b.add(paramr);
      if (c())
        b(paramr); 
    } 
  }
  
  public synchronized void a() {
    this.d = true;
    for (r r : this.b)
      b(r); 
  }
  
  public synchronized void b() {
    this.d = false;
    ArrayList arrayList = new ArrayList();
    arrayList.addAll(this.b);
    for (r r : arrayList)
      r.w(); 
    g();
  }
  
  private void b(r paramr) {
    n n = new n(this, paramr);
    this.c.add(n);
    n.start();
  }
  
  public void a(q paramq) {
    if (!this.a.contains(paramq))
      this.a.add(paramq); 
  }
  
  private void g() {
    ArrayList arrayList = new ArrayList(this.c);
    for (n n : arrayList) {
      try {
        n.a();
        n.b().g();
      } catch (Exception exception) {
        Logger.getLogger(l.class.getName()).log(Level.INFO, "Error closing connection", exception);
      } 
    } 
    this.c.clear();
  }
  
  private void c(r paramr) {
    for (q q : this.a)
      q.a(paramr); 
    paramr.a(new m(this, paramr));
  }
  
  private void d(r paramr) {
    this.b.remove(paramr);
    if (c() && a(paramr.h()) < paramr.x())
      b(paramr); 
  }
  
  private int a(String paramString) {
    byte b = 0;
    for (n n : this.c) {
      if (n.b().h().equals(paramString))
        b++; 
    } 
    return b;
  }
  
  private void a(r paramr, Exception paramException) {
    D.a("Failed to start connection: " + paramException.getLocalizedMessage());
    a(100);
  }
  
  public void a(int paramInt) {
    try {
      Thread.sleep(paramInt);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public boolean c() {
    return this.d;
  }
  
  public int d() {
    return this.b.size();
  }
  
  public int e() {
    return this.f;
  }
  
  public int f() {
    return e;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */