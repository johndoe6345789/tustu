package aP;

import G.R;
import aE.a;
import aE.e;
import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.g;

class hX implements e {
  hX(hO paramhO) {}
  
  public void a(a parama, R paramR) {
    try {
      g.a(parama);
    } catch (IOException iOException) {
      D.a("Failed to load User Aliases!");
      Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  public void e_() {}
  
  public void a(a parama) {
    try {
      g.b(parama);
    } catch (IOException iOException) {
      D.a("Failed to save User Aliases!");
      Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */