package aP;

import G.R;
import G.i;
import V.ExceptionPrintstacktrace;
import bH.p;
import c.CInterfaceEcho;

class ApInterfaceGs implements CInterfaceEcho {
  String a = null;

  R b = null;

  ApInterfaceGs(dB paramdB, String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR;
    if (paramString != null && !paramString.isEmpty()) i.a(paramR.c(), paramString, paramdB.n);
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

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
