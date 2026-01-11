package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CloneableImplInGPackage extends bv implements Serializable, Cloneable {
  private dj a = new B(0.0D);
  
  private dj f = new B(100.0D);
  
  private int g = 10;
  
  private ArrayList h = new ArrayList();
  
  private ArrayList i = new ArrayList();
  
  private ArrayList j = new ArrayList();
  
  private String k = null;
  
  private ArrayList l = new ArrayList();
  
  private dj m = new B(0.0D);
  
  private dj n = new B(100.0D);
  
  private int o = 10;
  
  private double[] p = null;
  
  private ArrayList q = new ArrayList();
  
  private String r = null;
  
  private ArrayList s = new ArrayList();
  
  private String[] t = null;
  
  private boolean u = false;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private boolean x = false;
  
  private A y = null;
  
  private boolean z = false;
  
  private boolean A = false;
  
  private String B = null;
  
  private String C = null;
  
  private String D = null;
  
  private int E = 5;
  
  private dj F = null;
  
  public int a() {
    return this.E;
  }
  
  public double b() {
    return this.a.a();
  }
  
  public void a(double paramDouble) {
    this.a = new B(paramDouble);
  }
  
  public void a(dj paramdj) {
    this.a = paramdj;
  }
  
  public double c() {
    return this.f.a();
  }
  
  public void b(dj paramdj) {
    this.f = paramdj;
  }
  
  public void b(double paramDouble) {
    this.f = new B(paramDouble);
  }
  
  public int d() {
    return this.h.size();
  }
  
  public String a(int paramInt) {
    return (paramInt >= this.i.size()) ? "1" : this.i.get(paramInt);
  }
  
  public String b(int paramInt) {
    return this.h.get(paramInt);
  }
  
  public void a(String paramString) {
    this.h.add(paramString);
    this.i.add("1");
  }
  
  public void a(String paramString1, String paramString2) {
    this.h.add(paramString1);
    this.i.add(paramString2);
  }
  
  public String f() {
    return this.k;
  }
  
  public void b(String paramString) {
    this.k = paramString;
  }
  
  public db c(int paramInt) {
    return (this.l.size() > paramInt) ? this.l.get(paramInt) : null;
  }
  
  public int g() {
    return this.l.size();
  }
  
  public void a(db paramdb) {
    this.l.add(paramdb);
  }
  
  public double h() {
    return this.m.a();
  }
  
  public void c(double paramDouble) {
    c(new B(paramDouble));
  }
  
  public void c(dj paramdj) {
    this.m = paramdj;
  }
  
  public double i() {
    return this.n.a();
  }
  
  public void d(dj paramdj) {
    this.n = paramdj;
  }
  
  public void d(double paramDouble) {
    d(new B(paramDouble));
  }
  
  public int j() {
    return this.q.size();
  }
  
  public String d(int paramInt) {
    return this.q.get(paramInt);
  }
  
  public void c(String paramString) {
    this.q.add(paramString);
  }
  
  public void b(db paramdb) {
    this.j.add(paramdb);
  }
  
  public db e(int paramInt) {
    return this.j.get(paramInt);
  }
  
  public int k() {
    return this.j.size();
  }
  
  public String l() {
    return this.r;
  }
  
  public void d(String paramString) {
    this.r = paramString;
  }
  
  public int m() {
    return this.s.size();
  }
  
  public db f(int paramInt) {
    return (this.s.size() > paramInt) ? this.s.get(paramInt) : null;
  }
  
  public void c(db paramdb) {
    this.s.add(paramdb);
  }
  
  public int o() {
    return this.g;
  }
  
  public void g(int paramInt) {
    this.g = paramInt;
  }
  
  public int p() {
    return this.o;
  }
  
  public void h(int paramInt) {
    this.o = paramInt;
  }
  
  public String q() {
    return (r() == null || (r()).length == 0) ? null : r()[0];
  }
  
  public void e(String paramString) {
    if (r() == null || (r()).length == 0)
      a(new String[1]); 
    r()[0] = paramString;
  }
  
  public String[] r() {
    return this.t;
  }
  
  public void a(String[] paramArrayOfString) {
    this.t = paramArrayOfString;
  }
  
  public double[] s() {
    return this.p;
  }
  
  public void a(double[] paramArrayOfdouble) {
    this.p = paramArrayOfdouble;
  }
  
  public bm t() {
    bm bm1 = new bm();
    bm1.a = this.a;
    bm1.f = this.f;
    bm1.g = this.g;
    bm1.h = this.h;
    bm1.i = this.i;
    bm1.k = this.k;
    bm1.l = this.l;
    bm1.m = this.m;
    bm1.n = this.n;
    bm1.o = this.o;
    bm1.p = this.p;
    bm1.q = this.q;
    bm1.r = this.r;
    bm1.s = this.s;
    bm1.t = this.t;
    bm1.j = this.j;
    bm1.z = this.z;
    bm1.v(aL());
    bm1.c(this.v);
    bm1.a(this.u);
    bm1.b(this.w);
    bm1.h(this.D);
    bm1.f(this.B);
    bm1.g(this.C);
    bm1.f(this.A);
    bm1.z(aa());
    bm1.s(M());
    return bm1;
  }
  
  public boolean u() {
    return this.u;
  }
  
  public void a(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public boolean v() {
    return this.w;
  }
  
  public void b(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public boolean w() {
    return this.v;
  }
  
  public void c(boolean paramBoolean) {
    this.v = paramBoolean;
  }
  
  public List e() {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = this.h.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    iterator = this.q.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return arrayList;
  }
  
  public boolean x() {
    return this.x;
  }
  
  public void d(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public A y() {
    return this.y;
  }
  
  public void a(A paramA) {
    this.y = paramA;
  }
  
  public String i(String paramString) {
    return (this.h.contains(paramString) || this.q.contains(paramString)) ? aJ() : null;
  }
  
  public void e(boolean paramBoolean) {
    this.z = paramBoolean;
  }
  
  public boolean z() {
    return this.z;
  }
  
  public boolean A() {
    return this.A;
  }
  
  public void f(boolean paramBoolean) {
    this.A = paramBoolean;
  }
  
  public String B() {
    return this.B;
  }
  
  public void f(String paramString) {
    this.B = paramString;
  }
  
  public String C() {
    return this.C;
  }
  
  public void g(String paramString) {
    this.C = paramString;
  }
  
  public String D() {
    return this.D;
  }
  
  public void h(String paramString) {
    this.D = paramString;
  }
  
  public boolean E() {
    return (this.F == null) ? false : ((this.F.a() != 0.0D));
  }
  
  public void e(dj paramdj) {
    this.F = paramdj;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/bm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */