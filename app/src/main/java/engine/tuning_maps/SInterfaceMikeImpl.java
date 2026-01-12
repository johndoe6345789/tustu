package aP;

import G.R;
import G.T;
import S.SInterfaceMike;
import U.UInterfaceBravo;

class SInterfaceMikeImpl implements SInterfaceMike {
  SInterfaceMikeImpl(hO paramhO) {}

  public void a(String paramString) {
    R r = T.a().c(paramString);
    double d = UInterfaceBravo.a(r);
    if (d < 0.0D || d > 30.0D) {
      UInterfaceBravo.a(r, 30);
    } else {
      UInterfaceBravo.a(r, (int) d);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
