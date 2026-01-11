package bU;

import G.R;
import G.aM;
import G.cE;
import V.VInterfaceIndia;
import bH.D;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuInterfaceAlpha implements ExceptionInBsPackage {
  public int a() {
    return 161;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    byte[] arrayOfByte = paramt.c();
    try {
      String str1 = new String(arrayOfByte);
      String str2 = "";
      byte b1 = 0;
      byte b2 = 0;
      for (String str : str1.split("~")) {
        b1++;
        if (str.contains("=")) {
          String str3 = str.substring(0, str.indexOf("="));
          String str4 = str.substring(str.indexOf("=") + 1);
          R r = paramo.f();
          aM aM = r.c(str3);
          if (aM != null)
            try {
              cE.a(r, aM, str4);
              b2++;
            } catch (VInterfaceIndia VInterfaceIndia) {
              str2 = str2 + VInterfaceIndia.getLocalizedMessage() + "\n";
            }  
        } else {
          String str3 = str + ", Invalid Format for USER_CMD:DOWNLOAD_PC_VARIABLE";
          D.a(str3);
          str2 = str2 + str3 + "\n";
        } 
      } 
      if (b2 == b1) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 0;
        TostringInBnPackage.b(arrayOfByte1);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } else if (b2 > 0) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(254);
        byte[] arrayOfByte1 = str2.getBytes();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
        arrayOfByte2[0] = 1;
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
        TostringInBnPackage.b(arrayOfByte2);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } else {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(254);
        byte[] arrayOfByte1 = str2.getBytes();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
        arrayOfByte2[0] = 2;
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
        TostringInBnPackage.b(arrayOfByte2);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */