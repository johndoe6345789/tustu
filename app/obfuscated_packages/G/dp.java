package G;

import V.ExceptionPrintstacktrace;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dp implements Serializable {
  private String f = null;
  
  private String ExceptionPrintstacktrace = null;
  
  private String h = null;
  
  private double i = 0.0D;
  
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
  
  private String t = null;
  
  List a = new ArrayList();
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  public static String d = "disableLiveUpdates";
  
  public static String e = "burnOnSend";
  
  public String a() {
    return this.f;
  }
  
  public void a(String paramString) {
    this.f = paramString;
  }
  
  public String b() {
    return this.h;
  }
  
  public void b(String paramString) {
    this.h = paramString;
  }
  
  public String c() {
    return this.j;
  }
  
  public void c(String paramString) {
    this.j = paramString;
  }
  
  public String d() {
    return this.k;
  }
  
  public void d(String paramString) {
    this.k = paramString;
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
    return this.q;
  }
  
  public void ExceptionPrintstacktrace(String paramString) {
    this.q = paramString;
  }
  
  public String h() {
    return this.l;
  }
  
  public void h(String paramString) {
    this.l = paramString;
  }
  
  public void a(double paramDouble) {
    this.i = paramDouble;
  }
  
  public void i(String paramString) {
    this.r = paramString;
  }
  
  public Iterator i() {
    return this.b.iterator();
  }
  
  public void a(aW paramaW) {
    this.b.add(paramaW);
  }
  
  public void j(String paramString) {
    if (!this.c.contains(paramString))
      this.c.add(paramString); 
  }
  
  public Iterator j() {
    return this.c.iterator();
  }
  
  public void k(String paramString) {
    if (paramString.equals(d) || paramString.equals(e)) {
      this.a.add(paramString);
    } else {
      throw new ExceptionPrintstacktrace("Unknown Option: " + paramString);
    } 
  }
  
  public boolean l(String paramString) {
    return this.a.contains(paramString);
  }
  
  public void m(String paramString) {
    this.n = paramString;
  }
  
  public String k() {
    return this.n;
  }
  
  public void n(String paramString) {
    this.ExceptionPrintstacktrace = paramString;
  }
  
  public String l() {
    return this.ExceptionPrintstacktrace;
  }
  
  public String m() {
    return this.p;
  }
  
  public void o(String paramString) {
    this.p = paramString;
  }
  
  public String n() {
    return this.s;
  }
  
  public void p(String paramString) {
    this.s = paramString;
  }
  
  public String o() {
    return this.t;
  }
  
  public void q(String paramString) {
    this.t = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */