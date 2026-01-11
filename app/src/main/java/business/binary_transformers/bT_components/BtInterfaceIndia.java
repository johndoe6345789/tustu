package business.binary_transformers.bT_components;

import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceIndia implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 234;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:PAG_GET_CAL_PAGE Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:PAG_GET_CAL_PAGE valid packet data not found."); 
    if (arrayOfByte.length != 2)
      throw new ExceptionInBsPackage("PID:PAG_GET_CAL_PAGE invalid packet data length, expected 3 bytes, found: " + (arrayOfByte.length + 1)); 
    byte b1 = arrayOfByte[0];
    byte b2 = arrayOfByte[1];
    try {
      if (b1 != 1 && b1 != 2) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(39);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(255);
        byte[] arrayOfByte1 = new byte[3];
        arrayOfByte1[2] = (byte)paramo.g();
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */