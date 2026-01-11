package rendering.output_handlers;

import G.AeInterfaceMikeTostring;
import G.GInterfaceCx;
import bH.D;

public class OInterfaceFoxtrot implements GInterfaceCx {
  boolean a = false;
  
  public boolean a(AeInterfaceMikeTostring parambT) {
    if (parambT != null && parambT.b() != null && parambT.b().length() < 8) {
      if (!this.a) {
        D.c("Other than specific legacy devices, signature len should be at least 8 characters, rejecting: " + parambT.b());
        this.a = true;
      } 
      return false;
    } 
    if (parambT != null && parambT.b() != null && parambT.b().length() > 40) {
      D.c("Signature too long, rejecting: " + parambT.b());
      return false;
    } 
    if (parambT != null && parambT.a() != null && (parambT.a()).length > 0 && parambT.a()[0] == 0) {
      D.c("Signature starts with a null call 0, rejecting.");
      return false;
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/O/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */