package business.binary_transformers.bT_components;

import bN.BnInterfaceTango;
import bS.BsInterfaceAlpha;
import bS.BsInterfaceOscar;
import bS.ExceptionInBsPackage;

public class BtComponentDelta implements BsInterfaceAlpha {
  public void BsInterfaceAlpha(BsInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage(
          "PID:DISCONNEC Wrong handler! this handler is for 0x"
              + Integer.toHexString(BsInterfaceAlpha()).toUpperCase());
    paramo.BsInterfaceAlpha(-1);
  }

  public int BsInterfaceAlpha() {
    return 254;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
