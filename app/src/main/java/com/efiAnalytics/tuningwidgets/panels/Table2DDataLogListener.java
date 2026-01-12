package com.efiAnalytics.tuningwidgets.panels;

import G.CloneableImplInGPackage;
import G.ExceptionprintstacktraceInGPackage;
import G.R;
import W.j;
import W.n;
import bH.D;
import bt.BtInterfaceBp;
import bt.ManagerIinterfacecharlie;
import i.IComponentAlpha;
import i.IInterfaceCharlie;

public class Table2DDataLogListener implements BtInterfaceBp, IComponentAlpha {
  ManagerIinterfacecharlie IComponentAlpha;

  R b;

  CloneableImplInGPackage IInterfaceCharlie;

  String d = null;

  String e = null;

  int f = -1000;

  String g = "UNINITIALIZED";

  public O(R paramR, CloneableImplInGPackage parambm, ManagerIinterfacecharlie paraman) {
    this.b = paramR;
    this.IComponentAlpha = paraman;
    this.IInterfaceCharlie = parambm;
    IInterfaceCharlie();
    Table2DDataLogListener();
  }

  public void IComponentAlpha(boolean paramBoolean) {
    if (paramBoolean) {
      IInterfaceCharlie.IComponentAlpha().IComponentAlpha(this);
    } else {
      IInterfaceCharlie.IComponentAlpha().b(this);
    }
  }

  public void IComponentAlpha(int paramInt) {
    double d1;
    double d2;
    if (IInterfaceCharlie.IComponentAlpha().e() == null) return;
    Table2DDataLogListener();
    j j1 = IInterfaceCharlie.IComponentAlpha().e().b(this.d);
    if (j1 != null) {
      d1 = j1.d(paramInt);
    } else {
      d1 = Double.NaN;
    }
    this.IComponentAlpha.i().f(d1);
    IInterfaceCharlie();
    j j2 = IInterfaceCharlie.IComponentAlpha().e().b(this.e);
    if (j2 != null) {
      d2 = j2.d(paramInt);
    } else {
      d2 = Double.NaN;
    }
    this.IComponentAlpha.i().k(d2);
    this.IComponentAlpha.i().repaint();
    this.IComponentAlpha.n();
    this.f = paramInt;
  }

  public void IComponentAlpha() {
    IComponentAlpha(true);
  }

  public void Table2DDataLogListener() {
    IComponentAlpha(false);
  }

  private void IInterfaceCharlie() {
    String str = this.IInterfaceCharlie.f();
    if (str == null || str.isEmpty()) {
      this.e = null;
      return;
    }
    n n = IInterfaceCharlie.IComponentAlpha().e();
    this.e = ExceptionprintstacktraceInGPackage.j(this.b, str);
    if (n != null) {
      if (this.e == null || (this.e.isEmpty() && n.IComponentAlpha(str) != null)) this.e = str;
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
      D.b("No Data Log field defined for Y axis of table: " + this.IInterfaceCharlie.aL());
  }

  private void Table2DDataLogListener() {
    String str = this.IInterfaceCharlie.l();
    n n = IInterfaceCharlie.IComponentAlpha().e();
    if (n == null || str == null || str.isEmpty()) {
      this.d = null;
      return;
    }
    if (n.IComponentAlpha(str) != null) {
      this.d = str;
    } else {
      this.d = ExceptionprintstacktraceInGPackage.j(this.b, str);
    }
    if (n != null) {
      if (this.d == null || (this.d.isEmpty() && n.IComponentAlpha(str) != null)) this.d = str;
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
      D.b("No Data Log field defined for X axis of table: " + this.IInterfaceCharlie.aL());
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/O.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
