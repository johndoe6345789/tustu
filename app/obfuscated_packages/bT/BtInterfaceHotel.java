package bT;

import G.R;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceHotel implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 237;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new bS.h("PID:CAL_SHORT_DOWNLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    try {
      BnInterfaceKilo BnInterfaceKilo = paramo.d();
      byte[] arrayOfByte = paramt.c();
      if (arrayOfByte == null)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD valid packet data not found."); 
      if (arrayOfByte.length < 7)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD invalid packet data length, expected minimum 8 bytes, found: " + (arrayOfByte.length + 1)); 
      int i = c.BsInterfaceAlpha(arrayOfByte, 3, 4, BnInterfaceKilo.ExceptionPrintstacktrace(), false);
      paramo.d(i);
      byte b = arrayOfByte[0];
      R r = paramo.f();
      int j = paramo.ExceptionPrintstacktrace();
      int m = BnInterfaceKilo.BnInterfaceUniform() * b;
      i -= r.O().y(j);
      byte b1 = 7;
      if (arrayOfByte.length != m + b1)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD invalid packet data length, expected byte count: " + (m + b1 + 1) + ", received: " + (arrayOfByte.length + 1)); 
      if ((r.O().TostringInBnPackage()).length < j || j < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 38 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(38);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else if (i + m > r.O().f(j) || i < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 34 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(34);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b1];
          System.arraycopy(arrayOfByte, b1, arrayOfByte1, 0, arrayOfByte1.length);
          r.h().BsInterfaceAlpha(j, m, c.b(arrayOfByte1));
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(255);
          paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte1 = { 34 };
          TostringInBnPackage.b(arrayOfByte1);
          paramo.c(34);
          paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
          D.c("CAL_SHORT_DOWNLOAD: Error updating local data store from DownloadHandler");
          ExceptionPrintstacktrace.printStackTrace();
        } 
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new bS.h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */