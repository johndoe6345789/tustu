package bS;

import G.F;
import G.R;
import bH.D;
import bN.r;
import bO.a;
import bO.c;
import bO.j;
import bO.k;
import bO.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {
  private final a e = new a();
  
  private int f = -1;
  
  private int g = -1;
  
  private int h = -1;
  
  List a = new ArrayList();
  
  private r i;
  
  List b = new ArrayList();
  
  F c;
  
  R d;
  
  public d(R paramR, r paramr) {
    this.d = paramR;
    this.c = paramR.O();
    this.i = paramr;
  }
  
  public a a() {
    return this.e;
  }
  
  public void a(c paramc, int paramInt) {
    while (this.a.size() <= paramInt) {
      b b = new b(this.c, this.i, this.e);
      b.a(new c());
      this.d.C().a(b);
      this.a.add(b);
    } 
    paramc.i(paramInt);
    ((b)this.a.get(paramInt)).a(paramc);
  }
  
  public void a(int paramInt) {
    c c = b(paramInt);
    if (this.e.a().c()) {
      c.l();
    } else {
      c.l();
    } 
  }
  
  public int b() {
    return this.a.size();
  }
  
  public c b(int paramInt) {
    if (paramInt < 0) {
      D.c("Invalid DAQ List number: " + paramInt);
      return null;
    } 
    if (paramInt >= this.e.b().b())
      return null; 
    if (paramInt >= this.a.size()) {
      D.a("request for DAQ List: " + paramInt + " but that list is no initialized.");
      return null;
    } 
    b b = this.a.get(paramInt);
    return (b != null) ? b.a() : null;
  }
  
  public b c(int paramInt) {
    try {
      return this.a.get(paramInt);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      return null;
    } 
  }
  
  public int c() {
    return this.f;
  }
  
  public void d(int paramInt) {
    this.f = paramInt;
  }
  
  public int d() {
    return this.g;
  }
  
  public void e(int paramInt) {
    this.g = paramInt;
  }
  
  public int e() {
    return this.h;
  }
  
  public void f(int paramInt) {
    this.h = paramInt;
  }
  
  public l a(int paramInt1, int paramInt2, int paramInt3) {
    c c = b(paramInt1);
    k k = c.c(paramInt2);
    if (paramInt3 < 0 || paramInt3 >= c.c())
      throw new j("Invalid ODT Entry Number: " + paramInt3 + " ,max ODT Entries: " + c.c()); 
    while (paramInt3 >= k.size())
      k.add(new l()); 
    return (l)k.get(paramInt3);
  }
  
  public byte g(int paramInt) {
    int i = 0;
    for (byte b = 0; b < paramInt; b++) {
      c c = b(b);
      c.h(i);
      i += c.f();
    } 
    return (byte)i;
  }
  
  public void h(int paramInt) {
    ((b)this.a.get(paramInt)).c();
  }
  
  public void i(int paramInt) {
    ((b)this.a.get(paramInt)).b();
  }
  
  public void j(int paramInt) {
    if (!this.b.contains(Integer.valueOf(paramInt)))
      this.b.add(Integer.valueOf(paramInt)); 
  }
  
  public void f() {
    this.b.clear();
  }
  
  public void g() {
    Iterator<Integer> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      h(i);
    } 
  }
  
  public void h() {
    Iterator<Integer> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      i(i);
    } 
  }
  
  public void i() {
    for (b b : this.a)
      b.b(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */