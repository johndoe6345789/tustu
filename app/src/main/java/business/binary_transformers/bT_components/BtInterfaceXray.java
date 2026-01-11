package business.binary_transformers.bT_components;

import G.R;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
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

public class BtInterfaceXray implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 222;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_DAQ_LIST Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.BsInterfaceDelta();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_DAQ_LIST valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage("PID:DAQ_START_STOP_DAQ_LIST invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      byte b = arrayOfByte[0];
      int i = c.BsInterfaceAlpha(arrayOfByte, 1, 2, BnInterfaceKilo.g(), false);
      BsInterfaceDelta BsInterfaceDelta = paramo.BnInterfaceKilo();
      if (b > 2 || b < 0) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha(paramt);
      } else if (i > BsInterfaceDelta.b()) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 34;
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha(paramt);
      } else {
        TostringInBnPackage.BsInterfaceAlpha(255);
        byte[] arrayOfByte1 = new byte[1];
        byte b1 = BsInterfaceDelta.g(i);
        arrayOfByte1[0] = b1;
        TostringInBnPackage.b(arrayOfByte1);
        if (b == 0) {
          BsInterfaceDelta.i(i);
          D.BsInterfaceDelta("Stopped DAQ " + i + " for client " + paramo.m());
        } else if (b == 1) {
          BsInterfaceDelta.ExceptionInBsPackage(i);
          D.BsInterfaceDelta("Started DAQ " + i + " for client " + paramo.m());
        } else {
          D.BsInterfaceDelta("Selecting DAQ " + i + " for client " + paramo.m());
          BsInterfaceDelta.j(i);
        } 
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */