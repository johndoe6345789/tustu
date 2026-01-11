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
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceFoxtrot implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 238;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_MAX Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_MAX valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_MAX invalid packet data length, must have atleast 1 byte"); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    int i = BnInterfaceKilo.i() - BnInterfaceKilo.BnInterfaceUniform() - 1;
    R r = paramo.f();
    int j = paramo.ExceptionPrintstacktrace();
    int m = BnInterfaceKilo.BnInterfaceUniform() * i;
    int n = paramo.ExceptionInBsPackage();
    n -= r.O().y(j);
    byte b = (BnInterfaceKilo.BnInterfaceUniform() > 2) ? 3 : 1;
    try {
      if (arrayOfByte.length != m + b)
        throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_MAX invalid packet data length, expected byte count: " + (m + b + 1) + ", received: " + (arrayOfByte.length + 1)); 
      if ((r.O().TostringInBnPackage()).length < j || j < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 38 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(38);
        paramo.BsInterfaceAlpha(paramt);
      } else if (n + m > r.O().f(j) || n < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 34 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(34);
        paramo.BsInterfaceAlpha(paramt);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b];
          System.arraycopy(arrayOfByte, b, arrayOfByte1, 0, arrayOfByte1.length);
          r.ExceptionInBsPackage().BsInterfaceAlpha(j, m, c.b(arrayOfByte1));
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(255);
          paramo.BsInterfaceAlpha(paramt);
          paramo.d(paramo.ExceptionInBsPackage() + m);
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte1 = { 34 };
          TostringInBnPackage.b(arrayOfByte1);
          paramo.c(34);
          paramo.BsInterfaceAlpha(paramt);
          D.c("CAL_DOWNLOAD_MAX: Error updating local data store from DownloadMaxHandler");
          ExceptionPrintstacktrace.printStackTrace();
        } 
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */