package G;

import V.g;
import bH.p;
import c.e;

public class af implements e {
  String a = null;
  
  R b = null;
  
  public af(R paramR, String paramString) {
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */