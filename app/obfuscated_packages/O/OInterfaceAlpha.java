package O;

import G.bT;
import G.cX;

public class OInterfaceAlpha implements cX {
  public boolean a(bT parambT) {
    return (parambT != null && parambT.b() != null && parambT.b().length() > 4 && !parambT.b().isEmpty() && !a(parambT.a()));
  }
  
  private boolean a(byte[] paramArrayOfbyte) {
    for (byte b : paramArrayOfbyte) {
      if (b == -1)
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/O/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */