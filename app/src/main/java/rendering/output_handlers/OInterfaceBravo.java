package O;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCx;
import bH.D;
import bH.c;

public class OInterfaceBravo implements GInterfaceCx {
  public boolean a(AeInterfaceMikeTostring parambT) {
    if (parambT != null
        && parambT.b() != null
        && (parambT.b().startsWith("BigStuff Gen4") || parambT.b().startsWith("BigStuff Rim")))
      return true;
    if (parambT != null && parambT.a() != null)
      D.d("Invalid BigStuff4 signature: " + c.d(parambT.a()));
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/O/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
