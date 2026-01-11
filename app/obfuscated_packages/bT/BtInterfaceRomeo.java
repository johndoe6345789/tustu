package bT;

import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceRomeo implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 235;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:PAG_SET_CAL_PAGE Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:PAG_SET_CAL_PAGE valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage("PID:PAG_SET_CAL_PAGE invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    byte b1 = arrayOfByte[0];
    byte b2 = arrayOfByte[1];
    byte b3 = arrayOfByte[2];
    if (b3 < 0 || b3 >= paramo.f().O().g()) {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      TostringInBnPackage.BsInterfaceAlpha(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 38;
      TostringInBnPackage.b(arrayOfByte1);
      paramo.c(38);
      TostringInBnPackage.b(arrayOfByte1);
      try {
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new ExceptionInBsPackage(o1.getLocalizedMessage());
      } 
    } else {
      paramo.j().BsInterfaceAlpha(b1);
      paramo.b(b3);
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[0];
      TostringInBnPackage.b(arrayOfByte1);
      try {
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new ExceptionInBsPackage(o1.getLocalizedMessage());
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */