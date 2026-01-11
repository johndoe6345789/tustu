package O;

import G.bT;
import G.cX;
import bH.D;
import bH.c;

public class b implements cX {
  public boolean a(bT parambT) {
    if (parambT != null && parambT.b() != null && (parambT.b().startsWith("BigStuff Gen4") || parambT.b().startsWith("BigStuff Rim")))
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