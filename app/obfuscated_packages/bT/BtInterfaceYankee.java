package bT;

import bH.D;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceDelta;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceYankee implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 221;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_SYNCH Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_SYNCH valid packet data not found."); 
    if (arrayOfByte.length != 1)
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_SYNCH invalid packet data length, expected 2 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      byte b = arrayOfByte[0];
      BsInterfaceDelta BsInterfaceDelta = paramo.k();
      if (b > 2 || b < 0) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha(paramt);
      } else {
        TostringInBnPackage.BsInterfaceAlpha(255);
        byte[] arrayOfByte1 = new byte[1];
        if (paramo.f().R()) {
          arrayOfByte1[0] = 1;
        } else {
          arrayOfByte1[0] = 0;
        } 
        TostringInBnPackage.b(arrayOfByte1);
        if (b == 0) {
          BsInterfaceDelta.i();
        } else if (b == 1) {
          BsInterfaceDelta.g();
        } else {
          BsInterfaceDelta.ExceptionInBsPackage();
        } 
        BsInterfaceDelta.f();
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
        return;
      } 
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
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */