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

public class BtInterfaceVictor implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 249;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:STD_SET_REQUEST Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new ExceptionInBsPackage("PID:STD_SET_REQUEST valid packet data not found."); 
    if (arrayOfByte1.length != 3)
      throw new ExceptionInBsPackage("PID:STD_SET_REQUEST invalid packet data length, expected 4 bytes, found: " + (arrayOfByte1.length + 1)); 
    byte b = arrayOfByte1[0];
    if ((b & 0x1) != 0)
      paramo.f().I(); 
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte2 = new byte[0];
    TostringInBnPackage.b(arrayOfByte2);
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(BnInterfaceUniform.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */