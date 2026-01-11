package aP;

import G.R;
import G.S;
import G.bU;
import I.k;
import bh.l;
import y.c;

class hZ implements S {
  R a = null;
  
  hZ(hO paramhO) {}
  
  public void a(R paramR) {
    this.a = paramR;
    l.b().a(this.a);
  }
  
  public void b(R paramR) {
    boolean bool = (this.a != null && this.a.equals(paramR)) ? true : false;
    k.a().a(paramR.c(), bool);
    k.a().b();
  }
  
  public void c(R paramR) {
    paramR.a((bU)new c(paramR));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */