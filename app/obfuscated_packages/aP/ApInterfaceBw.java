package aP;

import G.R;
import V.ExceptionPrintstacktrace;
import bH.p;
import c.CInterfaceEcho;

class ApInterfaceBw implements CInterfaceEcho {
  String a = null;
  
  R b = null;
  
  bw(bl parambl, String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR;
  }
  
  public boolean a() {
    try {
      return p.a(this.a, this.b);
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      ExceptionPrintstacktrace.printStackTrace();
      return true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */