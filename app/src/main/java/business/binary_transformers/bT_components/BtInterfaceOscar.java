package bT;

import G.R;
import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bO.BoInterfaceHotel;
import bS.BsInterfaceAlpha;
import bS.BoInterfaceHotel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceOscar implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 217;
  }
  
  public void BsInterfaceAlpha(bS.o paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new BoInterfaceHotel("PID:DAQ_GET_DAQ_RESOLUTION_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    R r = paramo.f();
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte = new byte[7];
      BoInterfaceHotel BoInterfaceHotel = paramo.BnInterfaceKilo().BsInterfaceAlpha().c();
      arrayOfByte[0] = (byte)BoInterfaceHotel.f();
      arrayOfByte[1] = (byte)BoInterfaceHotel.BsInterfaceAlpha();
      arrayOfByte[2] = (byte)BoInterfaceHotel.b();
      arrayOfByte[3] = (byte)BoInterfaceHotel.c();
      arrayOfByte[4] = (byte)BoInterfaceHotel.d().d();
      c.BsInterfaceAlpha(arrayOfByte, BoInterfaceHotel.e(), 5, 2, BnInterfaceKilo.g());
      TostringInBnPackage.b(arrayOfByte);
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (bN.o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */