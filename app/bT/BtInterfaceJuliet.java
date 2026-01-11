package bT;

import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bQ.TostringInBnPackage;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceJuliet implements BsInterfaceAlpha {
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:GET_COMM_MODE_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1.length != 0)
      throw new ExceptionInBsPackage("PID:GET_COMM_MODE_INFO Packet size. Expected 1, found: " + (arrayOfByte1.length + 1)); 
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte2 = new byte[7];
    arrayOfByte2[0] = 0;
    arrayOfByte2[1] = 0;
    arrayOfByte2[2] = 0;
    arrayOfByte2[3] = 20;
    arrayOfByte2[4] = (byte)BnInterfaceKilo.BnInterfaceKilo();
    arrayOfByte2[5] = (byte)BnInterfaceKilo.n();
    arrayOfByte2[6] = (byte)TostringInBnPackage.al;
    TostringInBnPackage.b(arrayOfByte2);
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public int BsInterfaceAlpha() {
    return 251;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */