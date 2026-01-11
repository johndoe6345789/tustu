package aP;

import G.R;
import V.g;
import bH.p;
import c.e;

class bw implements e {
  String a = null;
  
  R b = null;
  
  bw(bl parambl, String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR;
  }
  
  public boolean a() {
    try {
      return p.a(this.a, this.b);
    } catch (g g) {
      g.printStackTrace();
      return true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */