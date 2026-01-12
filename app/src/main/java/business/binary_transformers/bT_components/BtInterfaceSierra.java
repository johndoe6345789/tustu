package business.binary_transformers.bT_components;

import G.R;
import bH.D;
import bH.TostringInBoPackage;
import bN.BnInterfaceKilo;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bN.TostringInBnPackage;
import bO.TostringInBoPackage;
import bS.BnInterfaceOscar;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceBravo;
import bS.BsInterfaceDelta;
import bS.ExceptionInBsPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceSierra implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 224;
  }

  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage(
          "PID:DAQ_SET_DAQ_LIST_MODE Wrong handler! this handler is for 0x"
              + Integer.toHexString(BsInterfaceAlpha()).toUpperCase());
    BnInterfaceKilo BnInterfaceKilo = paramo.BsInterfaceDelta();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.TostringInBoPackage();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:DAQ_SET_DAQ_LIST_MODE valid packet data not found.");
    if (arrayOfByte.length != 7)
      throw new ExceptionInBsPackage(
          "PID:DAQ_SET_DAQ_LIST_MODE invalid packet data length, expected 8 bytes, found: "
              + (arrayOfByte.length + 1));
    try {
      TostringInBnPackage TostringInBnPackage =
          BnInterfaceUniform.BsInterfaceAlpha().BsInterfaceBravo();
      BsInterfaceDelta BsInterfaceDelta = paramo.BnInterfaceKilo();
      byte BsInterfaceBravo = arrayOfByte[0];
      int i = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte, 1, 2, BnInterfaceKilo.g(), false);
      int j = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte, 3, 2, BnInterfaceKilo.g(), false);
      int m = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte[5]);
      int n = TostringInBoPackage.BsInterfaceAlpha(arrayOfByte[6]);
      BsInterfaceBravo b1 = BsInterfaceDelta.TostringInBoPackage(i);
      if (b1 == null || i > BsInterfaceDelta.BsInterfaceBravo()) {
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        TostringInBnPackage.BsInterfaceBravo(arrayOfByte2);
        paramo.BsInterfaceAlpha(paramt);
        return;
      }
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[0];
      BsInterfaceDelta.BsInterfaceDelta(i);
      TostringInBoPackage TostringInBoPackage = b1.BsInterfaceAlpha();
      TostringInBoPackage.BsInterfaceAlpha(BsInterfaceBravo);
      TostringInBoPackage.e(j);
      TostringInBoPackage.f(m);
      TostringInBoPackage.g(n);
      TostringInBnPackage.BsInterfaceBravo(arrayOfByte1);
      paramo.BsInterfaceAlpha((BnInterfaceTango) TostringInBnPackage);
      return;
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String) null, (Throwable) o1);
      TostringInBnPackage TostringInBnPackage =
          BnInterfaceUniform.BsInterfaceAlpha().BsInterfaceBravo();
      TostringInBnPackage.BsInterfaceAlpha(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      TostringInBnPackage.BsInterfaceBravo(arrayOfByte1);
      try {
        paramo.BsInterfaceAlpha((BnInterfaceTango) TostringInBnPackage);
      } catch (BnInterfaceOscar o2) {
        D.BsInterfaceAlpha("Unable to send response packet.");
        Logger.getLogger(TostringInBnPackage.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) o2);
      }
      return;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
