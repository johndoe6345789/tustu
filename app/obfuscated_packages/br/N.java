package br;

import G.R;
import bH.D;
import bH.p;
import c.e;

class N implements e {
  String a = "";
  
  R b = null;
  
  public N(K paramK, R paramR, String paramString) {
    this.a = paramString;
    this.b = paramR;
  }
  
  public boolean a() {
    try {
      return p.a(this.a, this.b);
    } catch (Exception exception) {
      D.c(exception.getMessage());
      return true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/N.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */