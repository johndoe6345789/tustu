package G;

import V.ExceptionPrintstacktrace;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dm implements Serializable {
  private String a = null;
  
  private String i = null;
  
  private String j = null;
  
  private String k = null;
  
  private String l = null;
  
  private String m = null;
  
  private String n = null;
  
  private String o = null;
  
  private String p = null;
  
  private String q = null;
  
  private String r = null;
  
  private String s = null;
  
  private float t = 0.0F;
  
  List b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  ArrayList d = new ArrayList();
  
  ArrayList e = new ArrayList();
  
  ArrayList f = new ArrayList();
  
  ArrayList ExceptionPrintstacktrace = new ArrayList();
  
  ArrayList h = new ArrayList();
  
  public String b() {
    return this.a;
  }
  
  public void b(String paramString) {
    this.a = paramString;
  }
  
  public String c() {
    return this.i;
  }
  
  public void c(String paramString) {
    this.i = paramString;
    i(paramString);
  }
  
  public String d() {
    return this.l;
  }
  
  public void d(String paramString) {
    this.l = paramString;
  }
  
  public String e() {
    return this.m;
  }
  
  public void e(String paramString) {
    this.m = paramString;
  }
  
  public String f() {
    return this.o;
  }
  
  public void f(String paramString) {
    this.o = paramString;
  }
  
  public String ExceptionPrintstacktrace() {
    return this.p;
  }
  
  public void ExceptionPrintstacktrace(String paramString) {
    this.p = paramString;
  }
  
  public String h() {
    return this.q;
  }
  
  public void h(String paramString) {
    this.q = paramString;
  }
  
  public void a(aW paramaW) {
    this.c.add(paramaW);
  }
  
  public Iterator i() {
    return this.c.iterator();
  }
  
  public void i(String paramString) {
    if (!this.d.contains(paramString))
      this.d.add(paramString); 
  }
  
  public Iterator j() {
    return this.d.iterator();
  }
  
  public void j(String paramString) {
    if (!this.e.contains(paramString))
      this.e.add(paramString); 
  }
  
  public Iterator k() {
    return this.e.iterator();
  }
  
  public void k(String paramString) {
    if (!this.ExceptionPrintstacktrace.contains(paramString))
      this.ExceptionPrintstacktrace.add(paramString); 
  }
  
  public Iterator l() {
    return this.ExceptionPrintstacktrace.iterator();
  }
  
  public void l(String paramString) {
    if (!this.f.contains(paramString))
      this.f.add(paramString); 
  }
  
  public Iterator m() {
    return this.f.iterator();
  }
  
  public String n() {
    return this.j;
  }
  
  public void m(String paramString) {
    this.j = paramString;
  }
  
  public float o() {
    return this.t;
  }
  
  public void a(float paramFloat) {
    this.t = paramFloat;
  }
  
  public void n(String paramString) {
    if (paramString.equals("disableMaxPercentLimit")) {
      this.b.add(paramString);
    } else {
      throw new ExceptionPrintstacktrace("Unknown Option: " + paramString);
    } 
  }
  
  public boolean o(String paramString) {
    return this.b.contains(paramString);
  }
  
  public String p() {
    return (this.r != null) ? this.r : ExceptionPrintstacktrace();
  }
  
  public void p(String paramString) {
    this.r = paramString;
  }
  
  public String q() {
    return (this.s != null) ? this.s : h();
  }
  
  public void q(String paramString) {
    this.s = paramString;
  }
  
  public String r() {
    return this.n;
  }
  
  public void r(String paramString) {
    this.n = paramString;
  }
  
  public String s() {
    return (this.n == null) ? this.i : this.n;
  }
  
  public String t() {
    return this.k;
  }
  
  public void s(String paramString) {
    this.k = paramString;
  }
  
  public void t(String paramString) {
    this.h.add(paramString);
  }
  
  public Iterator u() {
    return this.h.iterator();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */