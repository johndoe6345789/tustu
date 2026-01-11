package bT;

import bH.D;
import bH.BuInterfaceCharlie;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import bU.BsInterfaceAlpha;
import bU.BuInterfaceBravo;
import bU.BuInterfaceCharlie;
import bU.BuInterfaceDelta;
import bU.ThreadedInBuPackage;
import bU.BuInterfaceFoxtrot;
import bU.BuInterfaceGolf;
import bU.ExceptionInBsPackage;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceCharlie implements BsInterfaceAlpha {
  Map BsInterfaceAlpha = new HashMap<>();
  
  public BtInterfaceCharlie() {
    BuInterfaceGolf BuInterfaceGolf = new BuInterfaceGolf();
    this.BsInterfaceAlpha.put(Integer.valueOf(BuInterfaceGolf.BsInterfaceAlpha()), BuInterfaceGolf);
    BsInterfaceAlpha a1 = new BsInterfaceAlpha();
    this.BsInterfaceAlpha.put(Integer.valueOf(a1.BsInterfaceAlpha()), a1);
    BuInterfaceCharlie BuInterfaceCharlie = new BuInterfaceCharlie();
    this.BsInterfaceAlpha.put(Integer.valueOf(BuInterfaceCharlie.BsInterfaceAlpha()), BuInterfaceCharlie);
    BuInterfaceDelta BuInterfaceDelta = new BuInterfaceDelta();
    this.BsInterfaceAlpha.put(Integer.valueOf(BuInterfaceDelta.BsInterfaceAlpha()), BuInterfaceDelta);
    ThreadedInBuPackage ThreadedInBuPackage = new ThreadedInBuPackage();
    this.BsInterfaceAlpha.put(Integer.valueOf(ThreadedInBuPackage.BsInterfaceAlpha()), ThreadedInBuPackage);
    BuInterfaceBravo BuInterfaceBravo = new BuInterfaceBravo();
    this.BsInterfaceAlpha.put(Integer.valueOf(BuInterfaceBravo.BsInterfaceAlpha()), BuInterfaceBravo);
    BuInterfaceFoxtrot BuInterfaceFoxtrot = new BuInterfaceFoxtrot();
    this.BsInterfaceAlpha.put(Integer.valueOf(BuInterfaceFoxtrot.BsInterfaceAlpha()), BuInterfaceFoxtrot);
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:USER_CMD Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.BuInterfaceCharlie();
    try {
      int i = BuInterfaceCharlie.BsInterfaceAlpha(arrayOfByte[0]);
      ExceptionInBsPackage ExceptionInBsPackage = (ExceptionInBsPackage)this.BsInterfaceAlpha.get(Integer.valueOf(i));
      if (ExceptionInBsPackage == null) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().BuInterfaceBravo();
        TostringInBnPackage.BsInterfaceAlpha(254);
        D.BsInterfaceAlpha("USER_COMMAND: No Sub handler for sub command code 0x" + Integer.toHexString(i).toUpperCase());
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
        System.arraycopy(arrayOfByte, 1, arrayOfByte1, 0, arrayOfByte1.length);
        ((TostringInBnPackage)paramt).BuInterfaceBravo(arrayOfByte1);
        ((TostringInBnPackage)paramt).BsInterfaceAlpha(i);
        ExceptionInBsPackage.BsInterfaceAlpha(paramo, paramt);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
  
  public int BsInterfaceAlpha() {
    return 241;
  }
  
  public ExceptionInBsPackage BsInterfaceAlpha(int paramInt) {
    return (ExceptionInBsPackage)this.BsInterfaceAlpha.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */