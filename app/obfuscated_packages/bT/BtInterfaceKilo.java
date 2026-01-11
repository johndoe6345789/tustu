package bT;

import G.R;
import G.aH;
import bH.D;
import bH.c;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceKilo implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 215;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_EVENT_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    bN.k k1 = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_EVENT_INFO valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_EVENT_INFO invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      int i = c.BsInterfaceAlpha(arrayOfByte, 1, 2, k1.g(), false);
      aH aH = r.b(i);
      if (aH == null) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        TostringInBnPackage.b(arrayOfByte2);
        paramo.BsInterfaceAlpha(paramt);
        return;
      } 
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[6];
      arrayOfByte1[0] = 4;
      arrayOfByte1[1] = -1;
      arrayOfByte1[2] = (byte)aH.aL().length();
      arrayOfByte1[3] = 0;
      arrayOfByte1[4] = 0;
      arrayOfByte1[5] = 15;
      paramo.d(BnInterfaceOscar.c);
      paramo.BsInterfaceAlpha(aH.aL().getBytes());
      TostringInBnPackage.b(arrayOfByte1);
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      return;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      TostringInBnPackage.BsInterfaceAlpha(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      TostringInBnPackage.b(arrayOfByte1);
      try {
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o2) {
        D.BsInterfaceAlpha("Unable to send response packet.");
        Logger.getLogger(TostringInBnPackage.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      return;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */