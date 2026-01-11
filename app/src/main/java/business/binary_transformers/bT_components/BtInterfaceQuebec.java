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

public class BtInterfaceQuebec implements BsInterfaceAlpha {
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:GET_STATUS Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte = new byte[5];
    arrayOfByte[0] = BnInterfaceKilo.BnInterfaceOscar().BsInterfaceAlpha();
    arrayOfByte[1] = BnInterfaceKilo.p().BsInterfaceAlpha();
    if (BnInterfaceKilo.g()) {
      arrayOfByte[3] = (byte)(0xFF & paramo.c() >> 8);
      arrayOfByte[4] = (byte)(0xFF & paramo.c());
    } else {
      arrayOfByte[3] = (byte)(0xFF & paramo.c());
      arrayOfByte[4] = (byte)(0xFF & paramo.c() >> 8);
    } 
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
  
  public int BsInterfaceAlpha() {
    return 253;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */