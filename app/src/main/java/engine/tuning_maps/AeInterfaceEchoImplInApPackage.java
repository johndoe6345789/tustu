package aP;

import G.R;
import aE.AeInterfaceEcho;
import aE.PropertiesExtension;
import bH.D;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.SComponentGolf;

class AeInterfaceEchoImplInApPackage implements AeInterfaceEcho {
  AeInterfaceEchoImplInApPackage(hO paramhO) {}

  public void PropertiesExtension(PropertiesExtension parama, R paramR) {
    try {
      SComponentGolf.PropertiesExtension(parama);
    } catch (IOException iOException) {
      D.PropertiesExtension("Failed to load User Aliases!");
      Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String) null, iOException);
    }
  }

  public void e_() {}

  public void PropertiesExtension(PropertiesExtension parama) {
    try {
      SComponentGolf.b(parama);
    } catch (IOException iOException) {
      D.PropertiesExtension("Failed to save User Aliases!");
      Logger.getLogger(hO.class.getName()).log(Level.SEVERE, (String) null, iOException);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/hX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
