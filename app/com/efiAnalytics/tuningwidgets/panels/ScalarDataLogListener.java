package com.efiAnalytics.tuningwidgets.panels;

import G.R;
import G.ExceptionprintstacktraceInGPackage;
import G.CloneableImplUsingArrayList;
import W.j;
import W.n;
import bF.TableModelListenerUsingArrayList;
import bH.D;
import bt.T;
import bt.BtInterfaceBp;
import i.IComponentAlpha;
import i.IInterfaceCharlie;

public class ScalarDataLogListener implements BtInterfaceBp, IComponentAlpha {
  T IComponentAlpha;
  
  TableModelListenerUsingArrayList b;
  
  R IInterfaceCharlie;
  
  CloneableImplUsingArrayList TableModelListenerUsingArrayList;
  
  String e = null;
  
  String f = null;
  
  int g = -1000;
  
  String h = "UNINITIALIZED";
  
  public P(R paramR, CloneableImplUsingArrayList parambh, T paramT) {
    this.IInterfaceCharlie = paramR;
    this.TableModelListenerUsingArrayList = parambh;
    this.IComponentAlpha = paramT;
    this.b = paramT.f();
    IInterfaceCharlie();
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
    if (!this.IComponentAlpha.isEnabled() || IInterfaceCharlie.IComponentAlpha().e() == null)
      return; 
    IInterfaceCharlie();
    j j = IInterfaceCharlie.IComponentAlpha().e().b(this.e);
    if (j != null) {
      d1 = j.TableModelListenerUsingArrayList(paramInt);
    } else {
      d1 = Double.NaN;
    } 
    this.b.IComponentAlpha(d1);
    this.IComponentAlpha.IInterfaceCharlie();
  }
  
  public void IComponentAlpha() {
    IComponentAlpha(true);
  }
  
  public void b() {
    IComponentAlpha(false);
  }
  
  private void IInterfaceCharlie() {
    String str = this.TableModelListenerUsingArrayList.TableModelListenerUsingArrayList();
    if (str == null || str.isEmpty()) {
      this.e = null;
      return;
    } 
    n n = IInterfaceCharlie.IComponentAlpha().e();
    this.e = ExceptionprintstacktraceInGPackage.j(this.IInterfaceCharlie, str);
    if (n != null) {
      if (this.e == null || (this.e.isEmpty() && n.IComponentAlpha(str) != null))
        this.e = str; 
      if (this.e == null && str.equals("Load")) {
        String str1 = this.IInterfaceCharlie.g("Load").e();
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
      D.b("No Data Log field defined for X axis of table: " + this.TableModelListenerUsingArrayList.aL()); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/panels/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */