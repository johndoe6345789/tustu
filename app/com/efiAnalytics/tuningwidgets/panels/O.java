package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.bM;
import G.bm;
import W.j;
import W.n;
import bH.D;
import bt.an;
import bt.bP;
import i.a;
import i.c;

public class O implements bP, a {
  an a;
  
  R b;
  
  bm c;
  
  String d = null;
  
  String e = null;
  
  int f = -1000;
  
  String g = "UNINITIALIZED";
  
  public O(R paramR, bm parambm, an paraman) {
    this.b = paramR;
    this.a = paraman;
    this.c = parambm;
    c();
    d();
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      c.a().a(this);
    } else {
      c.a().b(this);
    } 
  }
  
  public void a(int paramInt) {
    double d1;
    double d2;
    if (c.a().e() == null)
      return; 
    d();
    j j1 = c.a().e().b(this.d);
    if (j1 != null) {
      d1 = j1.d(paramInt);
    } else {
      d1 = Double.NaN;
    } 
    this.a.i().f(d1);
    c();
    j j2 = c.a().e().b(this.e);
    if (j2 != null) {
      d2 = j2.d(paramInt);
    } else {
      d2 = Double.NaN;
    } 
    this.a.i().k(d2);
    this.a.i().repaint();
    this.a.n();
    this.f = paramInt;
  }
  
  public void a() {
    a(true);
  }
  
  public void b() {
    a(false);
  }
  
  private void c() {
    String str = this.c.f();
    if (str == null || str.isEmpty()) {
      this.e = null;
      return;
    } 
    n n = c.a().e();
    this.e = bM.j(this.b, str);
    if (n != null) {
      if (this.e == null || (this.e.isEmpty() && n.a(str) != null))
        this.e = str; 
      if (this.e == null && str.equals("Load")) {
        String str1 = this.b.g("Load").e();
        if (str1.equalsIgnoreCase("kpa") && n.b("MAP") != null) {
          this.e = "MAP";
        } else if (str1.equalsIgnoreCase("TPS") && n.b("TPS") != null) {
          this.e = "TPS";
        } else if (str1.equalsIgnoreCase("TPS") && n.b("TPS_Pct") != null) {
          this.e = "TPS_Pct";
        } else if (str1.equalsIgnoreCase("psi") && n.b("Boost psi") != null) {
          this.e = "Boost psi";
        } else if (str1.equalsIgnoreCase("psi") && n.b("Boost") != null) {
          this.e = "Boost";
        } 
      } 
    } 
    if (this.e == null)
      D.b("No Data Log field defined for Y axis of table: " + this.c.aL()); 
  }
  
  private void d() {
    String str = this.c.l();
    n n = c.a().e();
    if (n == null || str == null || str.isEmpty()) {
      this.d = null;
      return;
    } 
    if (n.a(str) != null) {
      this.d = str;
    } else {
      this.d = bM.j(this.b, str);
    } 
    if (n != null) {
      if (this.d == null || (this.d.isEmpty() && n.a(str) != null))
        this.d = str; 
      if (this.d == null && str.equals("Load")) {
        String str1 = this.b.g("Load").e();
        if (str1.equalsIgnoreCase("kpa") && n.b("MAP") != null) {
          this.d = "MAP";
        } else if (str1.equalsIgnoreCase("TPS") && n.b("TPS") != null) {
          this.d = "TPS";
        } else if (str1.equalsIgnoreCase("TPS") && n.b("TPS_Pct") != null) {
          this.d = "TPS_Pct";
        } else if (str1.equalsIgnoreCase("psi") && n.b("Boost psi") != null) {
          this.d = "Boost psi";
        } else if (str1.equalsIgnoreCase("psi") && n.b("Boost") != null) {
          this.d = "Boost";
        } 
      } 
    } 
    if (this.d == null)
      D.b("No Data Log field defined for X axis of table: " + this.c.aL()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */