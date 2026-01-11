package B;

import A.b;
import A.e;
import A.f;
import A.s;
import A.y;
import bH.D;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a implements f, j {
  l a = new l();
  
  o b = new o();
  
  public static String c = "Auto TCP / UDP by Serial Number";
  
  boolean d = true;
  
  private String h;
  
  List e = null;
  
  public static String f = "Serial Number";
  
  String g = null;
  
  public void b(String paramString) {
    if (this.h != null && !this.h.isEmpty())
      g.a().b(this.h, this); 
    D.d("Setting AutoIpControllerInterface to serial number: " + paramString);
    i i = g.a().b(paramString);
    this.h = paramString;
    a(paramString, i);
    g.a().a(paramString, this);
  }
  
  public void a(i parami, String paramString) {
    if (this.h != null && !this.h.isEmpty())
      g.a().b(this.h, this); 
    this.h = parami.e();
    this.g = paramString;
    D.d("Setting AutoIpControllerInterface to serial number: " + this.h + ", controller: " + paramString);
    a(this.h, parami);
    g.a().a(this.h, this);
  }
  
  public void f() {
    if (this.d) {
      this.b.f();
    } else {
      this.a.f();
    } 
  }
  
  public void g() {
    if (this.d) {
      this.b.g();
    } else {
      this.a.g();
    } 
  }
  
  public String h() {
    return c;
  }
  
  public InputStream i() {
    return this.d ? this.b.i() : this.a.i();
  }
  
  public OutputStream j() {
    return this.d ? this.b.j() : this.a.j();
  }
  
  public int k() {
    return this.d ? this.b.k() : this.a.k();
  }
  
  public void a(e parame) {
    this.b.a(parame);
    this.a.a(parame);
  }
  
  public void b(e parame) {
    this.b.b(parame);
    this.a.b(parame);
  }
  
  public List l() {
    this.e = new ArrayList();
    b b = new b();
    b.a(f);
    b.b("The Serial Number of your ECU. When on the network, it will appear in the dropdown.");
    b.a(0);
    Collection collection = g.a().e();
    boolean bool = false;
    for (i i : collection) {
      if (i.e() != null && !i.e().isEmpty()) {
        b.a(i.e());
        if (this.h != null && this.h.equals(i.e()))
          bool = true; 
      } 
    } 
    if (!bool && this.h != null && !this.h.isEmpty())
      b.a(this.h); 
    this.e.add(b);
    return this.e;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramObject != null && paramString.equals(f)) {
      b(paramObject.toString());
    } else {
      D.c("Unknown Setting Name: " + paramString);
    } 
  }
  
  public Object a(String paramString) {
    return (paramString != null && paramString.equals(f)) ? this.h : (this.d ? this.b.a(paramString) : this.a.a(paramString));
  }
  
  public boolean m() {
    return this.d ? this.b.m() : this.a.m();
  }
  
  public boolean a(int paramInt) {
    return this.d ? this.b.a(paramInt) : this.a.a(paramInt);
  }
  
  public String n() {
    return this.d ? this.b.n() : this.a.n();
  }
  
  public int o() {
    return this.d ? this.b.o() : this.a.o();
  }
  
  public int p() {
    return this.d ? this.b.p() : this.a.p();
  }
  
  public boolean q() {
    return this.d ? this.b.q() : this.a.q();
  }
  
  public boolean r() {
    return this.d ? this.b.r() : this.a.r();
  }
  
  public int s() {
    return this.d ? this.b.s() : this.a.s();
  }
  
  public void a(String paramString, i parami) {
    b.c().a(parami);
    try {
      i i1 = a(parami);
      if (i1 == null) {
        this.b.a(o.i, "");
        this.a.a(l.j, "");
      } else {
        this.b.a(o.i, i1.c());
        this.a.a(l.j, i1.c());
        this.b.a(o.j, Integer.valueOf(i1.g()));
        this.a.a(l.k, Integer.valueOf(i1.g()));
        this.d = parami.d().equalsIgnoreCase("UDP");
      } 
    } catch (s s) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, "Failed to set IP Setting", (Throwable)s);
    } 
  }
  
  private i a(i parami) {
    if (parami == null)
      return null; 
    if (parami.m().size() == 0)
      return parami; 
    if (this.g != null) {
      for (i i1 : parami.m()) {
        if (i1.j().equals(this.g))
          return i1; 
      } 
      return parami;
    } 
    return parami;
  }
  
  public String a() {
    return this.h;
  }
  
  public void a(y paramy) {}
  
  public void b(y paramy) {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */