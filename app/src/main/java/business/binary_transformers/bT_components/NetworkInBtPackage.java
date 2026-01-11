package business.binary_transformers.bT_components;

import bH.c;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkInBtPackage implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 250;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:GET_ID Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte.length != 1)
      throw new ExceptionInBsPackage("PID:GET_ID Unexpected data size, expected 1 byte, found: " + arrayOfByte.length); 
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
    if (arrayOfByte[0] == 0) {
      TostringInBnPackage.BsInterfaceAlpha(255);
      String str = (paramo.f() == null) ? "" : paramo.f().i();
      byte[] arrayOfByte1 = new byte[7 + str.length()];
      arrayOfByte1[0] = 1;
      byte[] arrayOfByte2 = str.getBytes();
      byte[] arrayOfByte3 = c.BsInterfaceAlpha(arrayOfByte2.length, new byte[4], false);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, 3, arrayOfByte3.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 7, arrayOfByte2.length);
      TostringInBnPackage.b(arrayOfByte1);
    } else if (arrayOfByte[0] == 1) {
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[7];
      arrayOfByte1[0] = 1;
      byte[] arrayOfByte2 = c.BsInterfaceAlpha(0, arrayOfByte1, false);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
      TostringInBnPackage.b(arrayOfByte1);
    } else if (arrayOfByte[0] == 2) {
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[7];
      arrayOfByte1[0] = 1;
      byte[] arrayOfByte2 = c.BsInterfaceAlpha(0, arrayOfByte1, false);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
      TostringInBnPackage.b(arrayOfByte1);
    } else if (arrayOfByte[0] == 3) {
      TostringInBnPackage.BsInterfaceAlpha(255);
      String str1 = paramo.f().i();
      String str2 = "";
      try {
        str2 = "https://www.shadowtuner.com/ShadowTuner/FindEcuDefinitionBySignature?signature=" + URLEncoder.encode(str1, "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String)null, unsupportedEncodingException);
      } 
      byte[] arrayOfByte1 = new byte[7 + str2.length()];
      arrayOfByte1[0] = 1;
      byte[] arrayOfByte2 = str2.getBytes();
      byte[] arrayOfByte3 = c.BsInterfaceAlpha(arrayOfByte2.length, arrayOfByte1, false);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, 3, arrayOfByte3.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 7, arrayOfByte2.length);
      TostringInBnPackage.b(arrayOfByte1);
    } else if (arrayOfByte[0] == 4) {
      TostringInBnPackage.BsInterfaceAlpha(255);
      byte[] arrayOfByte1 = new byte[7];
      arrayOfByte1[0] = 1;
      byte[] arrayOfByte2 = c.BsInterfaceAlpha(0, arrayOfByte1, false);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
      TostringInBnPackage.b(arrayOfByte1);
    } else {
      throw new ExceptionInBsPackage("PID:CONNECT Unsupported connect Mode requested: " + arrayOfByte[0]);
    } 
    try {
      paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */