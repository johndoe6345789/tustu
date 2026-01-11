package business.binary_transformers.bT_components;

import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.BoInterfaceFoxtrot;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceNovember implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 218;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:GET_DAQ_PROCESSOR_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte = new byte[7];
      BoInterfaceFoxtrot BoInterfaceFoxtrot = paramo.BnInterfaceKilo().BsInterfaceAlpha().b();
      arrayOfByte[0] = BoInterfaceFoxtrot.BsInterfaceAlpha().BsInterfaceAlpha();
      c.BsInterfaceAlpha(arrayOfByte, BoInterfaceFoxtrot.b(), 1, 2, BnInterfaceKilo.g());
      c.BsInterfaceAlpha(arrayOfByte, BoInterfaceFoxtrot.c(), 3, 2, BnInterfaceKilo.g());
      arrayOfByte[5] = (byte)BoInterfaceFoxtrot.d();
      arrayOfByte[6] = BoInterfaceFoxtrot.e().b();
      TostringInBnPackage.b(arrayOfByte);
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */