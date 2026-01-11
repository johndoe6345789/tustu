package aP;

import G.R;
import G.S;
import G.bU;
import I.ThreadedInIPackage;
import bh.BhInterfaceLima;
import y.IOInYPackage;

class hZ implements S {
  R a = null;
  
  hZ(hO paramhO) {}
  
  public void a(R paramR) {
    this.a = paramR;
    BhInterfaceLima.b().a(this.a);
  }
  
  public void b(R paramR) {
    boolean bool = (this.a != null && this.a.equals(paramR)) ? true : false;
    ThreadedInIPackage.a().a(paramR.IOInYPackage(), bool);
    ThreadedInIPackage.a().b();
  }
  
  public void IOInYPackage(R paramR) {
    paramR.a((bU)new IOInYPackage(paramR));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */