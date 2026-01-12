package business.binary_transformers.bT_components;

import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bN.TostringInBnPackage;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceOscar;
import bS.ExceptionInBsPackage;

public class BtInterfaceBravo implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 244;
  }

  public void BsInterfaceAlpha(BsInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage(
          "PID:STD_SHORT_UPLOAD Wrong handler! this handler is for 0x"
              + Integer.toHexString(BsInterfaceAlpha()).toUpperCase());
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    TostringInBnPackage.BsInterfaceAlpha(255);
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:STD_SHORT_UPLOAD valid packet data not found.");
    if (arrayOfByte.length != 7)
      throw new ExceptionInBsPackage(
          "PID:STD_SHORT_UPLOAD invalid packet data length, expected 8 bytes, found: "
              + (arrayOfByte.length + 1));
    int i = c.BsInterfaceAlpha(arrayOfByte, 3, 4, BnInterfaceKilo.g(), false);
    paramo.d(i);
    ((TostringInBnPackage) paramt).BsInterfaceAlpha(245);
    BsInterfaceAlpha a1 = paramo.i().BsInterfaceAlpha(245);
    a1.BsInterfaceAlpha(paramo, paramt);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
