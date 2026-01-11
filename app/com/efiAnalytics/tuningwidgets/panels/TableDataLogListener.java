package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.aM;
import G.aR;
import G.bM;
import G.be;
import V.a;
import W.j;
import W.n;
import bH.D;
import bt.bP;
import bt.p;
import i.a;
import i.c;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableDataLogListener implements bP, a {
  p a;
  
  R b;
  
  be c;
  
  String d = null;
  
  String e = null;
  
  int f = -1000;
  
  String g = "UNINITIALIZED";
  
  private TableParameterChangeListener i = null;
  
  Runnable h = new TableDataLogRunnable(this);
  
  public TableDataLogListener(R paramR, be parambe, p paramp) {
    this.b = paramR;
    this.a = paramp;
    this.c = parambe;
    c();
    this.d = bM.j(paramR, parambe.d());
    if (this.d == null && parambe.d() != null && parambe.d().equals("rpm") && paramR.g("RpmHiRes") != null)
      this.d = bM.j(paramR, "RpmHiRes"); 
    if (this.d == null && parambe.g() != null && paramR.g(parambe.g()) != null)
      this.d = parambe.g(); 
    if (this.d == null)
      D.b("No Data Log field defined for X axis of table: " + parambe.aL()); 
    if (paramR.c("LKUP_PARAMETER") != null && paramR.c("LOAD_AXIS_SCALE") != null) {
      this.i = new TableParameterChangeListener(this);
      try {
        aR.a().a(paramR.c(), "LKUP_PARAMETER", this.i);
        aR.a().a(paramR.c(), "LOAD_AXIS_SCALE", this.i);
      } catch (a a1) {
        Logger.getLogger(TableDataLogListener.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      c.a().a(this);
    } else {
      c.a().b(this);
    } 
  }
  
  public void a(int paramInt) {
    if (paramInt - this.f == 1) {
      double d1;
      j j2;
      double d2;
      j j1 = c.a().e().b(this.d);
      if (j1 != null) {
        d1 = j1.d(paramInt);
      } else {
        d1 = Double.NaN;
      } 
      c();
      if (c.a().e().b(this.e) != null) {
        j2 = c.a().e().b(this.e);
      } else if (c.a().e().b("MAP") != null) {
        j2 = c.a().e().b("MAP");
      } else {
        j2 = null;
      } 
      if (j2 != null) {
        d2 = j2.d(paramInt);
      } else {
        d2 = Double.NaN;
      } 
      this.a.a(d2, d1);
    } else {
      b(paramInt);
    } 
    this.f = paramInt;
  }
  
  public void b(int paramInt) {
    if (c.a().e() == null)
      return; 
    int i = paramInt - this.a.c();
    if (i < 0)
      i = 0; 
    c();
    j j1 = c.a().e().b(this.d);
    j j2 = c.a().e().b(this.e);
    if (j2 == null && c.a().e().b("MAP") != null)
      j2 = c.a().e().b("MAP"); 
    if (c.a().e() != null && j1 != null && j2 != null && paramInt >= i) {
      float[] arrayOfFloat1 = new float[paramInt - i + 1];
      float[] arrayOfFloat2 = new float[paramInt - i + 1];
      for (int j = i; j <= paramInt; j++) {
        double d1 = j1.d(j);
        double d2 = j2.d(j);
        arrayOfFloat1[arrayOfFloat1.length - 1 - j - i] = (float)d1;
        arrayOfFloat2[arrayOfFloat2.length - 1 - j - i] = (float)d2;
      } 
      this.a.a(arrayOfFloat2, arrayOfFloat1);
    } 
  }
  
  public void a() {
    a(true);
  }
  
  public void b() {
    a(false);
  }
  
  private void c() {
    aM aM = this.b.c(this.c.b());
    n n = c.a().e();
    if (n == null) {
      this.g = "UNINITIALIZED";
    } else {
      if (this.g != null && !this.g.equals("UNINITIALIZED") && aM.p() != null && this.g != null && this.g.equals(aM.p()) && this.i == null)
        return; 
      if (aM != null) {
        this.g = aM.p();
      } else {
        this.g = null;
      } 
    } 
    this.e = bM.j(this.b, this.c.f());
    if (this.e == null && this.c.h() != null && this.b.g(this.c.h()) != null)
      this.e = this.c.h(); 
    if (this.e == null)
      this.e = "MAP"; 
    if (n != null) {
      j j = n.a(this.e);
      aM aM1 = this.b.c("LKUP_PARAMETER");
      aM aM2 = this.b.c("LOAD_AXIS_SCALE");
      if (aM1 != null && aM2 != null && this.c.f() != null && this.c.f().equals("Load")) {
        try {
          String str1 = aM1.f(this.b.h());
          String str2 = aM2.f(this.b.h());
          if (str1 != null && str1.contains("TPS") && n.a("TPS") != null) {
            this.e = "TPS";
          } else if (str1 != null && str1.contains("MAP") && str2 != null) {
            if (str2.toLowerCase().contains("psi") && n.a("PRESS_BOOST") != null) {
              this.e = "PRESS_BOOST";
            } else if (str2.toLowerCase().contains("psi") && n.a("BOOST_PSI") != null) {
              this.e = "BOOST_PSI";
            } else if (str2.toLowerCase().contains("kpa") && n.a("MAP") != null) {
              this.e = "MAP";
            } else {
              this.e = "Fuel Load";
            } 
          } else if (n.a("Fuel Load") != null) {
            this.e = "Fuel Load";
          } else {
            this.e = "MAP";
          } 
        } catch (Exception exception) {
          Logger.getLogger(TableDataLogListener.class.getName()).log(Level.SEVERE, (String)null, exception);
          this.e = "Fuel Load";
        } 
      } else if (j == null || (this.e.equals("Load") && j.e() == j.f()) || (aM != null && aM.p() != null && !aM.p().isEmpty() && j.n() != null && !j.n().isEmpty() && !j.n().equalsIgnoreCase(aM.p()))) {
        if (aM.p().equalsIgnoreCase("kpa") && n.b("MAP") != null) {
          this.e = "MAP";
        } else if (aM.p().equalsIgnoreCase("TPS") && n.b("TPS") != null) {
          this.e = "TPS";
        } else if (aM.p().equalsIgnoreCase("TPS") && n.b("TPS_Pct") != null) {
          this.e = "TPS_Pct";
        } else if (aM.p().equalsIgnoreCase("psi") && n.b("Boost psi") != null) {
          this.e = "Boost psi";
        } else if (aM.p().equalsIgnoreCase("psi") && n.b("Boost") != null) {
          this.e = "Boost";
        } else if (aM.p().equalsIgnoreCase("psig") && n.b("PRESS_BOOST") != null) {
          this.e = "PRESS_BOOST";
        } else if (aM.p().equalsIgnoreCase("psig") && n.b("BOOST_PSI") != null) {
          this.e = "BOOST_PSI";
        } 
      } 
    } 
    if (this.e == null)
      D.b("No Data Log field defined for Y axis of table: " + this.c.aL()); 
    if ((this.d == null || !this.d.isEmpty()) && n != null && n.a(this.d) == null)
      this.d = bM.j(this.b, this.c.d()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */