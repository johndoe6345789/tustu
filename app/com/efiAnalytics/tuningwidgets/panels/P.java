package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.bM;
import G.bh;
import W.j;
import W.n;
import bF.d;
import bH.D;
import bt.T;
import bt.bP;
import i.a;
import i.c;

public class P implements bP, a {
  T a;
  
  d b;
  
  R c;
  
  bh d;
  
  String e = null;
  
  String f = null;
  
  int g = -1000;
  
  String h = "UNINITIALIZED";
  
  public P(R paramR, bh parambh, T paramT) {
    this.c = paramR;
    this.d = parambh;
    this.a = paramT;
    this.b = paramT.f();
    c();
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
    if (!this.a.isEnabled() || c.a().e() == null)
      return; 
    c();
    j j = c.a().e().b(this.e);
    if (j != null) {
      d1 = j.d(paramInt);
    } else {
      d1 = Double.NaN;
    } 
    this.b.a(d1);
    this.a.c();
  }
  
  public void a() {
    a(true);
  }
  
  public void b() {
    a(false);
  }
  
  private void c() {
    String str = this.d.d();
    if (str == null || str.isEmpty()) {
      this.e = null;
      return;
    } 
    n n = c.a().e();
    this.e = bM.j(this.c, str);
    if (n != null) {
      if (this.e == null || (this.e.isEmpty() && n.a(str) != null))
        this.e = str; 
      if (this.e == null && str.equals("Load")) {
        String str1 = this.c.g("Load").e();
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
      D.b("No Data Log field defined for X axis of table: " + this.d.aL()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */