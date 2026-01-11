package bN;

import G.J;
import J.j;
import bH.c;
import bR.a;
import bR.c;
import bR.d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class r {
  s a = null;
  
  k b;
  
  OutputStream c;
  
  List d = new ArrayList();
  
  List e = new ArrayList();
  
  private final Object g = new Object();
  
  private final Object h = new Object();
  
  private int i = 0;
  
  private int j = 0;
  
  private boolean k = false;
  
  String f = " Slave TX:\n";
  
  private boolean l = false;
  
  private j m = null;
  
  public r(OutputStream paramOutputStream, k paramk) {
    this.c = paramOutputStream;
    this.b = paramk;
  }
  
  public int a(List paramList) {
    int i = -1;
    for (t t : paramList) {
      c c = d.a().a(this.b);
      i = e();
      c.a().b(i);
      c.a(t.d());
      this.d.add(c);
    } 
    synchronized (this.g) {
      this.g.notifyAll();
    } 
    f();
    return i;
  }
  
  public int a(t paramt) {
    c c = d.a().a(this.b);
    int i = e();
    c.a().b(i);
    c.a(paramt.d());
    this.d.add(c);
    synchronized (this.g) {
      this.g.notifyAll();
    } 
    f();
    return i;
  }
  
  private int e() {
    return (int)(this.i++ % Math.pow(2.0D, (this.b.d() * 8)));
  }
  
  private void f() {
    if (this.a == null || !this.a.isAlive())
      a(); 
  }
  
  public void a() {
    if (this.a != null)
      this.a.a = false; 
    this.a = new s(this);
    this.a.start();
  }
  
  private void g() {
    while (!this.d.isEmpty()) {
      c c = this.d.remove(0);
      try {
        a(c);
        b(c);
      } catch (o o) {
        a(o, c);
      } 
      d.a().a(this.b, c);
    } 
  }
  
  private void a(c paramc) {
    paramc.i();
    paramc.e();
    paramc.f();
    try {
      this.c.write(paramc.h());
      this.c.flush();
      if (this.m != null)
        if (h.a(paramc)) {
          this.m.e();
        } else {
          this.m.j();
        }  
      if (h())
        a(paramc.h()); 
      if (this.k && h.a(paramc) && paramc.b().e())
        this.j++; 
    } catch (a a) {
      throw new o("Failed to get Message bytes, size mismatch: " + a.getMessage());
    } finally {}
  }
  
  private boolean h() {
    return (J.I() || this.l);
  }
  
  private void a(byte[] paramArrayOfbyte) {
    System.out.println(k.v() + this.f + c.d(paramArrayOfbyte));
  }
  
  public void a(g paramg) {
    this.e.add(paramg);
  }
  
  public void b(g paramg) {
    this.e.remove(paramg);
  }
  
  private void a(IOException paramIOException) {
    for (g g : this.e)
      g.b(paramIOException); 
  }
  
  private void a(o paramo, c paramc) {
    for (g g : this.e)
      g.a(paramo, paramc); 
  }
  
  private void b(c paramc) {
    for (g g : this.e)
      g.a(paramc); 
  }
  
  private void a(int paramInt) {
    try {
      synchronized (this.g) {
        this.g.wait(paramInt);
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
  }
  
  public void b() {
    this.j = 0;
    synchronized (this.h) {
      this.h.notifyAll();
    } 
  }
  
  public void c() {
    if (this.a != null)
      this.a.a = false; 
  }
  
  public void a(boolean paramBoolean) {
    this.k = paramBoolean;
    if (paramBoolean) {
      this.f = ": Master TX:\n";
    } else {
      this.f = ": Slave TX:\n";
    } 
  }
  
  public k d() {
    return this.b;
  }
  
  public void a(j paramj) {
    this.m = paramj;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */