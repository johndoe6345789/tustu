package bT;

import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.TostringInBoPackage;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceBravo;
import bS.BsInterfaceDelta;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceMike implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 223;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_LIST_MODE Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.BsInterfaceDelta();
    byte[] arrayOfByte = paramt.TostringInBoPackage();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_LIST_MODE valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_LIST_MODE invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().BsInterfaceBravo();
      BsInterfaceDelta BsInterfaceDelta = paramo.BnInterfaceKilo();
      int i = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte, 1, 2, BnInterfaceKilo.g(), false);
      BsInterfaceBravo BsInterfaceBravo = BsInterfaceDelta.TostringInBoPackage(i);
      if (BsInterfaceBravo == null || i > BsInterfaceDelta.BsInterfaceBravo()) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        TostringInBnPackage.BsInterfaceBravo(arrayOfByte2);
        paramo.BsInterfaceAlpha(paramt);
        return;
      } 
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[7];
      BsInterfaceDelta.BsInterfaceDelta(i);
      TostringInBoPackage TostringInBoPackage = BsInterfaceBravo.BsInterfaceAlpha();
      arrayOfByte1[0] = TostringInBoPackage.ExceptionInBsPackage();
      TostringInBoPackage.BsInterfaceAlpha(arrayOfByte1, TostringInBoPackage.g(), 3, 2, BnInterfaceKilo.g());
      arrayOfByte1[5] = (byte)TostringInBoPackage.i();
      arrayOfByte1[6] = (byte)TostringInBoPackage.j();
      TostringInBnPackage.BsInterfaceBravo(arrayOfByte1);
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      return;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().BsInterfaceBravo();
      TostringInBnPackage.BsInterfaceAlpha(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      TostringInBnPackage.BsInterfaceBravo(arrayOfByte1);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */