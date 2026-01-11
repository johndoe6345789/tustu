package com.efiAnalytics.ui;

import bH.A;
import bH.C;
import bH.X;
import bH.f;
import java.awt.Component;
import java.awt.Frame;

public class RegistrationManager extends A {
  private static cS d = null;
  
  private cT e = null;
  
  private int f = 0;
  
  public static cS a() {
    return a((C)null);
  }
  
  public static cS a(C paramC) {
    if (d == null)
      d = new cS(); 
    if (paramC != null) {
      d.a = paramC;
      A.b(paramC);
    } 
    return d;
  }
  
  public boolean b() {
    return !(this.c - 1926 != 40);
  }
  
  public int c() {
    return this.c;
  }
  
  public void a(Component paramComponent) {
    if ((this.a == null || !a(this.a.f())) && this.f > 0)
      b(paramComponent); 
  }
  
  public void b(Component paramComponent) {
    this.e = new cT(this, c(paramComponent));
    this.e.a();
  }
  
  private Frame c(Component paramComponent) {
    while (paramComponent != null && !(paramComponent instanceof Frame))
      paramComponent = paramComponent.getParent(); 
    return (Frame)paramComponent;
  }
  
  public boolean a(String paramString) {
    return a(paramString, -1);
  }
  
  public boolean a(String paramString, int paramInt) {
    if (paramString == null || paramString.trim().equals(""))
      return false; 
    if (this.a.a() == null || this.a.a().trim().equals(""))
      return false; 
    if (this.a.e() == null)
      return false; 
    if (this.a.b() == null || this.a.b().trim().equals(""))
      return false; 
    if (this.a.c() == null || this.a.c().trim().equals(""))
      return false; 
    String str = this.a.d();
    if (str == null || str.trim().equals("") || str.indexOf("@") < 1 || str.indexOf(".") < 0 || str.lastIndexOf(".") < str.indexOf("@"))
      return false; 
    if (paramInt == 1) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.d());
      return !(str1 == null || !str1.equals(paramString));
    } 
    boolean bool = false;
    if (a(this.a.l(), 2)) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.e(), this.a.d());
      if (str1 != null && str1.equals(paramString))
        bool = true; 
    } 
    if (!bool && a(this.a.l(), 3)) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.e(), this.a.d(), X.a("1", '0', 2), X.a("2015", '0', 4));
      if (str1 != null && str1.equals(paramString))
        bool = true; 
    } 
    if (!bool && a(this.a.l(), 4)) {
      String str1 = f.a(this.a.b(), this.a.c(), this.a.a(), this.a.e(), this.a.d(), X.a("1", '0', 2), X.a("2015", '0', 4), this.a.h());
      if (str1 != null && str1.equals(paramString))
        bool = true; 
    } 
    return bool;
  }
  
  private boolean a(int[] paramArrayOfint, int paramInt) {
    for (int i : paramArrayOfint) {
      if (i == paramInt)
        return true; 
    } 
    return false;
  }
  
  public void d() {
    aN.a(this.a.j());
  }
  
  public void e() {
    if (this.a != null)
      this.a.i(); 
    if (this.e != null && this.f > 0) {
      this.e.a = true;
    } else {
      g();
    } 
  }
  
  public void f() {
    g();
  }
  
  void g() {
    if (this.e != null)
      this.e.dispose(); 
  }
  
  public boolean h() {
    return (super.h() || A.i().h());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/cS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */