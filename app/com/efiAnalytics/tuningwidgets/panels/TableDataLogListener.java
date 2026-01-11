package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.aM;
import G.aR;
import G.bM;
import G.be;
import V.ExceptionInVPackage;
import W.j;
import W.n;
import bH.D;
import bt.bP;
import bt.p;
import i.ExceptionInVPackage;
import i.IInterfaceCharlie;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TableDataLogListener implements bP, ExceptionInVPackage {
  p ExceptionInVPackage;
  
  R b;
  
  be IInterfaceCharlie;
  
  String d = null;
  
  String e = null;
  
  int f = -1000;
  
  String g = "UNINITIALIZED";
  
  private TableParameterChangeListener i = null;
  
  Runnable h = new TableDataLogRunnable(this);
  
  public TableDataLogListener(R paramR, be parambe, p paramp) {
    this.b = paramR;
    this.ExceptionInVPackage = paramp;
    this.IInterfaceCharlie = parambe;
    IInterfaceCharlie();
    this.d = bM.j(paramR, parambe.d());
    if (this.d == null && parambe.d() != null && parambe.d().equals("rpm") && paramR.g("RpmHiRes") != null)
      this.d = bM.j(paramR, "RpmHiRes"); 
    if (this.d == null && parambe.g() != null && paramR.g(parambe.g()) != null)
      this.d = parambe.g(); 
    if (this.d == null)
      D.b("No Data Log field defined for X axis of table: " + parambe.aL()); 
    if (paramR.IInterfaceCharlie("LKUP_PARAMETER") != null && paramR.IInterfaceCharlie("LOAD_AXIS_SCALE") != null) {
      this.i = new TableParameterChangeListener(this);
      try {
        aR.ExceptionInVPackage().ExceptionInVPackage(paramR.IInterfaceCharlie(), "LKUP_PARAMETER", this.i);
        aR.ExceptionInVPackage().ExceptionInVPackage(paramR.IInterfaceCharlie(), "LOAD_AXIS_SCALE", this.i);
      } catch (ExceptionInVPackage a1) {
        Logger.getLogger(TableDataLogListener.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    if (paramBoolean) {
      IInterfaceCharlie.ExceptionInVPackage().ExceptionInVPackage(this);
    } else {
      IInterfaceCharlie.ExceptionInVPackage().b(this);
    } 
  }
  
  public void ExceptionInVPackage(int paramInt) {
    if (paramInt - this.f == 1) {
      double d1;
      j j2;
      double d2;
      j j1 = IInterfaceCharlie.ExceptionInVPackage().e().b(this.d);
      if (j1 != null) {
        d1 = j1.d(paramInt);
      } else {
        d1 = Double.NaN;
      } 
      IInterfaceCharlie();
      if (IInterfaceCharlie.ExceptionInVPackage().e().b(this.e) != null) {
        j2 = IInterfaceCharlie.ExceptionInVPackage().e().b(this.e);
      } else if (IInterfaceCharlie.ExceptionInVPackage().e().b("MAP") != null) {
        j2 = IInterfaceCharlie.ExceptionInVPackage().e().b("MAP");
      } else {
        j2 = null;
      } 
      if (j2 != null) {
        d2 = j2.d(paramInt);
      } else {
        d2 = Double.NaN;
      } 
      this.ExceptionInVPackage.ExceptionInVPackage(d2, d1);
    } else {
      b(paramInt);
    } 
    this.f = paramInt;
  }
  
  public void b(int paramInt) {
    if (IInterfaceCharlie.ExceptionInVPackage().e() == null)
      return; 
    int i = paramInt - this.ExceptionInVPackage.IInterfaceCharlie();
    if (i < 0)
      i = 0; 
    IInterfaceCharlie();
    j j1 = IInterfaceCharlie.ExceptionInVPackage().e().b(this.d);
    j j2 = IInterfaceCharlie.ExceptionInVPackage().e().b(this.e);
    if (j2 == null && IInterfaceCharlie.ExceptionInVPackage().e().b("MAP") != null)
      j2 = IInterfaceCharlie.ExceptionInVPackage().e().b("MAP"); 
    if (IInterfaceCharlie.ExceptionInVPackage().e() != null && j1 != null && j2 != null && paramInt >= i) {
      float[] arrayOfFloat1 = new float[paramInt - i + 1];
      float[] arrayOfFloat2 = new float[paramInt - i + 1];
      for (int j = i; j <= paramInt; j++) {
        double d1 = j1.d(j);
        double d2 = j2.d(j);
        arrayOfFloat1[arrayOfFloat1.length - 1 - j - i] = (float)d1;
        arrayOfFloat2[arrayOfFloat2.length - 1 - j - i] = (float)d2;
      } 
      this.ExceptionInVPackage.ExceptionInVPackage(arrayOfFloat2, arrayOfFloat1);
    } 
  }
  
  public void ExceptionInVPackage() {
    ExceptionInVPackage(true);
  }
  
  public void b() {
    ExceptionInVPackage(false);
  }
  
  private void IInterfaceCharlie() {
    aM aM = this.b.IInterfaceCharlie(this.IInterfaceCharlie.b());
    n n = IInterfaceCharlie.ExceptionInVPackage().e();
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
    this.e = bM.j(this.b, this.IInterfaceCharlie.f());
    if (this.e == null && this.IInterfaceCharlie.h() != null && this.b.g(this.IInterfaceCharlie.h()) != null)
      this.e = this.IInterfaceCharlie.h(); 
    if (this.e == null)
      this.e = "MAP"; 
    if (n != null) {
      j j = n.ExceptionInVPackage(this.e);
      aM aM1 = this.b.IInterfaceCharlie("LKUP_PARAMETER");
      aM aM2 = this.b.IInterfaceCharlie("LOAD_AXIS_SCALE");
      if (aM1 != null && aM2 != null && this.IInterfaceCharlie.f() != null && this.IInterfaceCharlie.f().equals("Load")) {
        try {
          String str1 = aM1.f(this.b.h());
          String str2 = aM2.f(this.b.h());
          if (str1 != null && str1.contains("TPS") && n.ExceptionInVPackage("TPS") != null) {
            this.e = "TPS";
          } else if (str1 != null && str1.contains("MAP") && str2 != null) {
            if (str2.toLowerCase().contains("psi") && n.ExceptionInVPackage("PRESS_BOOST") != null) {
              this.e = "PRESS_BOOST";
            } else if (str2.toLowerCase().contains("psi") && n.ExceptionInVPackage("BOOST_PSI") != null) {
              this.e = "BOOST_PSI";
            } else if (str2.toLowerCase().contains("kpa") && n.ExceptionInVPackage("MAP") != null) {
              this.e = "MAP";
            } else {
              this.e = "Fuel Load";
            } 
          } else if (n.ExceptionInVPackage("Fuel Load") != null) {
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
      D.b("No Data Log field defined for Y axis of table: " + this.IInterfaceCharlie.aL()); 
    if ((this.d == null || !this.d.isEmpty()) && n != null && n.ExceptionInVPackage(this.d) == null)
      this.d = bM.j(this.b, this.IInterfaceCharlie.d()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/Q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */