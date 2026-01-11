package business.binary_transformers.bT_components;

import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceUniform implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 246;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:STD_SET_MTA Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new ExceptionInBsPackage("PID:STD_SET_MTA valid packet data not found."); 
    if (arrayOfByte1.length != 7)
      throw new ExceptionInBsPackage("PID:STD_SET_MTA invalid packet data length, expected 8 bytes, found: " + (arrayOfByte1.length + 1)); 
    int i = c.BsInterfaceAlpha(arrayOfByte1, 3, 4, BnInterfaceKilo.g(), false);
    paramo.d(i);
    TostringInBnPackage TostringInBnPackage = bN.u.BsInterfaceAlpha().b();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte2 = new byte[0];
    TostringInBnPackage.b(arrayOfByte2);
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(u.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */