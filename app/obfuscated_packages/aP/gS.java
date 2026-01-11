package aP;

import G.R;
import G.i;
import V.g;
import bH.p;
import c.e;

class gS implements e {
  String a = null;
  
  R b = null;
  
  gS(dB paramdB, String paramString, R paramR) {
    this.a = paramString;
    this.b = paramR;
    if (paramString != null && !paramString.isEmpty())
      i.a(paramR.c(), paramString, paramdB.n); 
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/gS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */