package business.binary_transformers.bT_components;

import G.ManagerUsingArrayList;
import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.TostringInBoPackage;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceDelta;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtComponentBravo implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 227;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:DAQ_SET_DAQ_PTR Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.BsInterfaceDelta();
    byte[] arrayOfByte = paramt.TostringInBoPackage();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_SET_DAQ_PTR valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage("PID:DAQ_SET_DAQ_PTR invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      BsInterfaceDelta BsInterfaceDelta = paramo.BnInterfaceKilo();
      int i = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte, 1, 2, BnInterfaceKilo.g(), false);
      TostringInBoPackage TostringInBoPackage = BsInterfaceDelta.b(i);
      if (TostringInBoPackage == null || i > BsInterfaceDelta.b()) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        TostringInBnPackage.b(arrayOfByte2);
        paramo.BsInterfaceAlpha(paramt);
        return;
      } 
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[0];
      ManagerUsingArrayList.BsInterfaceAlpha().BsInterfaceAlpha(TostringInBoPackage.n());
      BsInterfaceDelta.i(i);
      BsInterfaceDelta.BsInterfaceAlpha(i);
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */