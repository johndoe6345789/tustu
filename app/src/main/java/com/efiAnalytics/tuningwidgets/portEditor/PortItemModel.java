package com.efiAnalytics.tuningwidgets.portEditor;

import G.R;
import G.Manager;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.X;
import s.ExceptionPrintstacktrace;

class PortItemModel {
  private String d = "";
  
  R a = null;
  
  Manager b = null;
  
  private int e = 0;
  
  public PortItemModel(OutputPortEditor paramOutputPortEditor, R paramR, String paramString1, String paramString2, int paramInt) {
    this.d = paramString2;
    this.a = paramR;
    this.b = paramR.c(paramString1);
    this.e = paramInt;
  }
  
  public String a() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof String) ? a().equals(paramObject) : super.equals(paramObject);
  }
  
  public boolean b() {
    try {
      double d = this.b.i(this.a.h())[this.e][0];
      return (d != 0.0D);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      D.a("Failed to getValue for " + this.b.aL() + ", index = " + this.e, (Exception)ExceptionPrintstacktrace, null);
      return false;
    } 
  }
  
  public String toString() {
    return ExceptionPrintstacktrace.b(X.b(this.d, "\"", "")) + " ";
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tuningwidgets/portEditor/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */