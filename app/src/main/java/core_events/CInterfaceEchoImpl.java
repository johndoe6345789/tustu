package G;

import V.ExceptionPrintstacktrace;
import bH.p;
import c.CInterfaceEcho;

public class CInterfaceEchoImpl implements CInterfaceEcho {
  String a = null;
  
  R b = null;
  
  public CInterfaceEchoImpl(R paramR, String paramString) {
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */