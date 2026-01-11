package business.binary_transformers.bT_components;

import G.R;
import bH.c;
import bH.g;
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

public class BtComponentAlpha implements BsInterfaceAlpha {
  g BsInterfaceAlpha = new g();
  
  public int BsInterfaceAlpha() {
    return 243;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:STD_BUILD_CHECKSUM Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:STD_BUILD_CHECKSUM valid packet data not found."); 
    if (arrayOfByte.length != 7)
      throw new ExceptionInBsPackage("PID:STD_BUILD_CHECKSUM invalid packet data length, expected 8 bytes, found: " + (arrayOfByte.length + 1)); 
    R r = paramo.f();
    int i = paramo.g();
    int j = paramo.ExceptionInBsPackage();
    int m = j - r.O().y(i);
    int n = c.BsInterfaceAlpha(arrayOfByte, 3, 4, BnInterfaceKilo.g(), false) * paramo.d().BnInterfaceUniform();
    try {
      if (n > 4096) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[7];
        arrayOfByte1[0] = 34;
        byte[] arrayOfByte2 = c.BsInterfaceAlpha(4096, new byte[4], paramo.d().g());
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else if (m + n > r.O().f(i)) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = new byte[7];
        arrayOfByte1[0] = 34;
        byte[] arrayOfByte2 = c.BsInterfaceAlpha(r.O().f(i) - m, new byte[4], paramo.d().g());
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
        TostringInBnPackage.b(arrayOfByte1);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        int[] arrayOfInt = r.ExceptionInBsPackage().BsInterfaceAlpha(i, m, n);
        byte[] arrayOfByte1 = c.BsInterfaceAlpha(arrayOfInt);
        this.BsInterfaceAlpha.BsInterfaceAlpha();
        this.BsInterfaceAlpha.BsInterfaceAlpha(arrayOfByte1);
        byte[] arrayOfByte2 = new byte[4];
        arrayOfByte2 = c.BsInterfaceAlpha(this.BsInterfaceAlpha.b(), arrayOfByte2, BnInterfaceKilo.g());
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(255);
        byte[] arrayOfByte3 = new byte[7];
        arrayOfByte3[0] = 8;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 3, arrayOfByte2.length);
        TostringInBnPackage.b(arrayOfByte3);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/BsInterfaceAlpha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */