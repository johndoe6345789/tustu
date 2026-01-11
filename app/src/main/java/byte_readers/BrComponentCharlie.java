package br;

import G.GInterfaceAi;
import G.i;
import V.ExceptionPrintstacktrace;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.fy;
import java.awt.Component;

class BrComponentCharlie implements fy {
  Component a = null;
  
  public BrComponentCharlie(a parama, Component paramComponent) {
    this.a = paramComponent;
  }
  
  public boolean a(String paramString) {
    if (paramString.equals(""))
      return true; 
    try {
      double d = i.a((GInterfaceAi)this.b.a, " " + paramString + " ");
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.d("Error:" + ExceptionPrintstacktrace.getMessage(), this.a);
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */