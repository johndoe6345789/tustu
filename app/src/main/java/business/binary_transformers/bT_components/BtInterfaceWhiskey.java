package business.binary_transformers.bT_components;

import bN.BnInterfaceKilo;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bN.TostringInBnPackage;
import bS.BnInterfaceOscar;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceWhiskey implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 230;
  }

  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage(
          "PID:STD_SET_SETMENT_MODE Wrong handler! this handler is for 0x"
              + Integer.toHexString(BsInterfaceAlpha()).toUpperCase());
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new ExceptionInBsPackage("PID:STD_SET_SETMENT_MODE valid packet data not found.");
    if (arrayOfByte1.length != 2)
      throw new ExceptionInBsPackage(
          "PID:STD_SET_SETMENT_MODE invalid packet data length, expected 3 bytes, found: "
              + (arrayOfByte1.length + 1));
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte2 = new byte[0];
    TostringInBnPackage.b(arrayOfByte2);
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango) TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(BnInterfaceUniform.class.getName())
          .log(Level.SEVERE, (String) null, (Throwable) o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
