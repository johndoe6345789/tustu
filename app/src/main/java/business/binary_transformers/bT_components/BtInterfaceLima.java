package business.binary_transformers.bT_components;

import G.R;
import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.TostringInBoPackage;
import bS.BnInterfaceOscar;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceLima implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 216;
  }

  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage(
          "PID:DAQ_GET_DAQ_LIST_INFO Wrong handler! this handler is for 0x"
              + Integer.toHexString(BsInterfaceAlpha()).toUpperCase());
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.TostringInBoPackage();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_GET_DAQ_LIST_INFO valid packet data not found.");
    if (arrayOfByte.length != 3)
      throw new ExceptionInBsPackage(
          "PID:DAQ_GET_DAQ_LIST_INFO invalid packet data length, expected 4 bytes, found: "
              + (arrayOfByte.length + 1));
    try {
      bN.l l1 = BnInterfaceUniform.BsInterfaceAlpha().b();
      int i = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte, 1, 2, BnInterfaceKilo.g(), false);
      TostringInBoPackage TostringInBoPackage = paramo.BnInterfaceKilo().b(i);
      if (TostringInBoPackage == null) {
        l1.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        l1.b(arrayOfByte2);
        paramo.BsInterfaceAlpha(paramt);
        return;
      }
      l1.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[5];
      arrayOfByte1[0] = TostringInBoPackage.b().BsInterfaceAlpha();
      arrayOfByte1[1] = (byte) TostringInBoPackage.BsInterfaceAlpha();
      arrayOfByte1[2] = (byte) TostringInBoPackage.TostringInBoPackage();
      TostringInBoPackage.BsInterfaceAlpha(
          arrayOfByte1, TostringInBoPackage.d(), 3, 2, BnInterfaceKilo.g());
      l1.b(arrayOfByte1);
      paramo.BsInterfaceAlpha((BnInterfaceTango) l1);
      return;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String) null, (Throwable) o1);
      bN.l l1 = BnInterfaceUniform.BsInterfaceAlpha().b();
      l1.BsInterfaceAlpha(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      l1.b(arrayOfByte1);
      try {
        paramo.BsInterfaceAlpha((BnInterfaceTango) l1);
      } catch (BnInterfaceOscar o2) {
        D.BsInterfaceAlpha("Unable to send response packet.");
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, (Throwable) o2);
      }
      return;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
