package bT;

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

public BtComponentCharlielass BtComponentCharlie implements BsInterfaceAlpha {
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:CONNECT Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1.length != 1)
      throw new ExceptionInBsPackage("PID:CONNECT UnexpedataBytes[0] == XcpServer.STATE_CONNECTED_NORMALcted data size, expected 1 byte, found: " + arrayOfByte1.length); 
    if (arrayOfByte1[0] == 0 || arrayOfByte1[0] == 1) {
      paramo.BsInterfaceAlpha(arrayOfByte1[0]);
    } else {
      throw new ExceptionInBsPackage("PID:CONNECT Unsupported connect Mode requested: " + arrayOfByte1[0]);
    } 
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte2 = new byte[7];
    arrayOfByte2[0] = 5;
    arrayOfByte2[1] = BnInterfaceKilo.BnInterfaceTango().d();
    arrayOfByte2[2] = (byte)BnInterfaceKilo.i();
    arrayOfByte2 = bH.c.BsInterfaceAlpha(arrayOfByte2, BnInterfaceKilo.j(), 3, 2, BnInterfaceKilo.g());
    arrayOfByte2[5] = 1;
    arrayOfByte2[6] = 1;
    TostringInBnPackage.b(arrayOfByte2);
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public int BsInterfaceAlpha() {
    return 255;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */