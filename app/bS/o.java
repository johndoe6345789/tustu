package bS;

import G.R;
import G.aR;
import G.cI;
import G.cu;
import bN.f;
import bN.g;
import bN.i;
import bN.k;
import bN.p;
import bN.r;
import bN.t;
import bO.c;
import bO.f;
import bP.b;
import java.util.ArrayList;
import java.util.List;

public class o {
  public static String a = "Dash Echo Server";
  
  public static int b = -1;
  
  public static int c = -2;
  
  private R h;
  
  r d;
  
  private k i;
  
  j e;
  
  p f;
  
  private r j;
  
  p g = new p(this);
  
  private int k = -1;
  
  private int l = -1;
  
  private i m = new i(-128);
  
  private int n = b;
  
  private byte[] o = null;
  
  private int p = -1;
  
  private int q = 255;
  
  private static final k r = new k();
  
  private final List s = new ArrayList();
  
  private d t;
  
  private b u = new b(this);
  
  public o(R paramR, r paramr) {
    this.h = paramR;
    this.d = paramr;
    o();
    this.f = new p(paramr.i(), this.i);
    this.j = new r(paramr.j(), this.i);
    this.e = new j(this);
    n();
    this.f.a(p.h);
    a(paramR);
  }
  
  private void a(R paramR) {
    this.t = new d(paramR, this.j);
    f f = this.t.a().b();
    f.b(paramR.r());
    f.a(1);
    f.c(0);
    this.t.a().c().a(32);
    this.t.a().c().e(1);
    c c = new c();
    c.b().a((byte)4);
    this.t.a(c, 0);
    c = new c();
    c.b().a((byte)4);
    this.t.a(c, 1);
  }
  
  public void a() {
    for (b b1 : this.t.a)
      cu.a().a(b1.a().n()); 
    this.f.c();
    this.j.c();
    this.f.b(this.g);
    b(this.e);
    b(this.e);
    for (e e : this.s) {
      e.a.h().b(e);
      e.a();
    } 
    this.s.clear();
    aR.a().b((cI)this.u);
  }
  
  private void n() {
    this.f.a(this.g);
    a(this.e);
    a(this.e);
  }
  
  public synchronized int a(List paramList) {
    return this.j.a(paramList);
  }
  
  public synchronized void a(t paramt) {
    this.j.a(paramt);
  }
  
  private void o() {
    this.i = new k();
    this.i.b(this.d.s());
    this.i.f(255);
    e e = new e(this, this.h);
    this.s.add(e);
    this.h.h().a(e);
    aR.a().a((cI)this.u);
  }
  
  public void b() {
    a(-1);
    this.d.g();
  }
  
  public int c() {
    return this.k;
  }
  
  public void a(int paramInt) {
    this.k = paramInt;
  }
  
  public k d() {
    return this.i;
  }
  
  public void a(f paramf) {
    this.f.a(paramf);
  }
  
  public void b(f paramf) {
    this.f.b(paramf);
  }
  
  public void a(g paramg) {
    this.j.a(paramg);
  }
  
  public void b(g paramg) {
    this.j.b(paramg);
  }
  
  protected r e() {
    return this.j;
  }
  
  public R f() {
    return this.h;
  }
  
  public int g() {
    return this.l;
  }
  
  public void b(int paramInt) {
    this.l = paramInt;
  }
  
  public void c(int paramInt) {
    this.q = paramInt;
  }
  
  public void d(int paramInt) {
    this.n = paramInt;
  }
  
  public int h() {
    return this.n;
  }
  
  public k i() {
    return r;
  }
  
  public i j() {
    return this.m;
  }
  
  public d k() {
    return this.t;
  }
  
  public byte[] l() {
    return this.o;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    this.o = paramArrayOfbyte;
  }
  
  public String m() {
    return this.d.n();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */