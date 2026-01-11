package business.binary_transformers.bT_components;

import G.R;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bQ.TostringInBnPackage;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceGolf implements BsInterfaceAlpha {
  private int BsInterfaceAlpha = 0;
  
  public int BsInterfaceAlpha() {
    return 239;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_NEXT Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_NEXT valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new ExceptionInBsPackage("PID:CAL_DOWNLOAD_NEXT invalid packet data length, must have atleast 1 byte"); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    int i = c.BsInterfaceAlpha(arrayOfByte[0]);
    R r = paramo.f();
    byte b = (BnInterfaceKilo.BnInterfaceUniform() > 2) ? 3 : 1;
    int j = paramo.g();
    int m = (arrayOfByte.length - b) * BnInterfaceKilo.BnInterfaceUniform();
    int n = BnInterfaceKilo.BnInterfaceUniform() * m;
    int i1 = paramo.ExceptionInBsPackage();
    i1 -= r.O().y(j);
    if (TostringInBnPackage.I())
      D.c("DOWNLOAD_NEXT: Got: " + n + ", expectedRemaining: " + b()); 
    try {
      if (i > this.BsInterfaceAlpha) {
        D.BsInterfaceAlpha("PID:CAL_DOWNLOAD_NEXT Element count not as expected: " + this.BsInterfaceAlpha + ", received: " + i);
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 41, (byte)this.BsInterfaceAlpha, (byte)i };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(41);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else if ((r.O().TostringInBnPackage()).length < j || j < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 38 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(38);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else if (i1 + n > r.O().f(j) || i1 < 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte1 = { 34 };
        TostringInBnPackage.b(arrayOfByte1);
        paramo.c(34);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b];
          System.arraycopy(arrayOfByte, b, arrayOfByte1, 0, arrayOfByte1.length);
          r.ExceptionInBsPackage().BsInterfaceAlpha(j, i1, c.b(arrayOfByte1));
          paramo.d(paramo.ExceptionInBsPackage() + n);
          D.c("expectedRemainingElements = " + this.BsInterfaceAlpha + ", elementCount=" + i + ", packetElementCount=" + m + ", setting expectedRemainingElements to: " + (i - m));
          BsInterfaceAlpha(i - m);
          if (this.BsInterfaceAlpha == 0) {
            TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
            TostringInBnPackage.BsInterfaceAlpha(255);
            paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
          } 
        } catch (V.g g1) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte1 = { 34 };
          TostringInBnPackage.b(arrayOfByte1);
          paramo.c(34);
          paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
          D.c("Error updating local data store from DownloadHandler");
          g1.printStackTrace();
        } 
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
  
  public int b() {
    return this.BsInterfaceAlpha;
  }
  
  public void BsInterfaceAlpha(int paramInt) {
    this.BsInterfaceAlpha = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */