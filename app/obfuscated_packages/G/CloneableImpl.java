package G;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CloneableImpl extends bv implements Serializable, Cloneable {
  private String a = "";
  
  private String f = null;
  
  private String g = null;
  
  private String h = null;
  
  private String i = null;
  
  private String j = null;
  
  private String k = null;
  
  private String l = null;
  
  private String m = null;
  
  private String n = null;
  
  private String[] o = new String[2];
  
  private db p = null;
  
  private db q = null;
  
  private int r = -1;
  
  private boolean s = false;
  
  private boolean t = false;
  
  private boolean u = false;
  
  public String a() {
    return this.f;
  }
  
  public void a(String paramString) {
    this.f = paramString;
  }
  
  public String b() {
    return this.g;
  }
  
  public void b(String paramString) {
    this.g = paramString;
  }
  
  public String c() {
    return this.h;
  }
  
  public void c(String paramString) {
    this.h = paramString;
  }
  
  public String d() {
    return this.i;
  }
  
  public void d(String paramString) {
    this.i = paramString;
  }
  
  public String f() {
    return this.j;
  }
  
  public void e(String paramString) {
    this.j = paramString;
  }
  
  public String g() {
    return this.l;
  }
  
  public void f(String paramString) {
    this.l = paramString;
  }
  
  public String h() {
    return this.m;
  }
  
  public void g(String paramString) {
    this.m = paramString;
  }
  
  public void a(String[] paramArrayOfString) {
    this.o = paramArrayOfString;
  }
  
  public int i() {
    return this.r;
  }
  
  public void a(int paramInt) {
    this.r = paramInt;
  }
  
  public be j() {
    be be1 = new be();
    be1.a = this.a;
    be1.f = this.f;
    be1.g = this.g;
    be1.h = this.h;
    be1.i = this.i;
    be1.j = this.j;
    be1.k = this.k;
    be1.l = this.l;
    be1.m = this.m;
    be1.n = this.n;
    be1.o = this.o;
    be1.r = this.r;
    be1.z(aa());
    be1.v(aL());
    be1.s(M());
    return be1;
  }
  
  public boolean k() {
    return this.s;
  }
  
  public void a(boolean paramBoolean) {
    this.s = paramBoolean;
  }
  
  public String l() {
    return this.a;
  }
  
  public void h(String paramString) {
    this.a = paramString;
  }
  
  public List e() {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(this.f);
    arrayList.add(this.g);
    arrayList.add(this.h);
    return arrayList;
  }
  
  public String i(String paramString) {
    return (b().equals(paramString) || a().equals(paramString) || c().equals(paramString)) ? aJ() : null;
  }
  
  public void b(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public void c(boolean paramBoolean) {
    this.u = paramBoolean;
  }
  
  public boolean m() {
    return this.t;
  }
  
  public boolean o() {
    return this.u;
  }
  
  public db p() {
    return this.p;
  }
  
  public void a(db paramdb) {
    this.p = paramdb;
  }
  
  public db q() {
    return this.q;
  }
  
  public void b(db paramdb) {
    this.q = paramdb;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */