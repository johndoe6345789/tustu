package aP;

import G.R;
import G.T;
import S.m;
import U.b;

class hY implements m {
  hY(hO paramhO) {}
  
  public void a(String paramString) {
    R r = T.a().c(paramString);
    double d = b.a(r);
    if (d < 0.0D || d > 30.0D) {
      b.a(r, 30);
    } else {
      b.a(r, (int)d);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */