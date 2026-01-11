package bT;

import G.R;
import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.BsInterfaceAlpha;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BtInterfaceAlpha implements BsInterfaceAlpha {
  public int BsInterfaceAlpha() {
    return 245;
  }
  
  public void BsInterfaceAlpha(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.BsInterfaceAlpha() != BsInterfaceAlpha())
      throw new ExceptionInBsPackage("PID:STD_UPLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(BsInterfaceAlpha()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:STD_UPLOAD valid packet data not found."); 
    if (arrayOfByte.length != 1 && arrayOfByte.length != 7)
      throw new ExceptionInBsPackage("PID:STD_UPLOAD invalid packet data length, expected 2 bytes, found: " + (arrayOfByte.length + 1)); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    int i = c.BsInterfaceAlpha(arrayOfByte[0]);
    R r = paramo.f();
    int j = paramo.g();
    int m = BnInterfaceKilo.BnInterfaceUniform() * i;
    int n = paramo.ExceptionInBsPackage();
    if (n >= 0)
      n -= r.O().y(j); 
    try {
      byte[] arrayOfByte1;
      if (n == BnInterfaceOscar.c) {
        arrayOfByte1 = paramo.TostringInBnPackage();
        if (arrayOfByte1 == null) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte2 = { 34 };
          TostringInBnPackage.b(arrayOfByte2);
          paramo.c(34);
          paramo.BsInterfaceAlpha(paramt);
          return;
        } 
      } else {
        if ((r.O().TostringInBnPackage()).length < j || j < 0) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte2 = { 38 };
          TostringInBnPackage.b(arrayOfByte2);
          paramo.c(38);
          paramo.BsInterfaceAlpha(paramt);
          return;
        } 
        if (n + m > r.O().f(j) || n < 0) {
          TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
          TostringInBnPackage.BsInterfaceAlpha(254);
          byte[] arrayOfByte2 = { 34 };
          TostringInBnPackage.b(arrayOfByte2);
          paramo.c(34);
          paramo.BsInterfaceAlpha(paramt);
          return;
        } 
        int[] arrayOfInt = r.ExceptionInBsPackage().BsInterfaceAlpha(j, n, m);
        arrayOfByte1 = c.BsInterfaceAlpha(arrayOfInt);
      } 
      if (arrayOfByte1.length > BnInterfaceKilo.i() - 1 && !BnInterfaceKilo.BnInterfaceTango().BsInterfaceAlpha()) {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(254);
        byte[] arrayOfByte2 = { 48 };
        TostringInBnPackage.b(arrayOfByte2);
        paramo.c(48);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } else {
        if (arrayOfByte1.length > BnInterfaceKilo.i() - 1) {
          ArrayList<TostringInBnPackage> arrayList = new ArrayList();
          int i1 = 0;
          while (true) {
            int i2 = (m - i1 > BnInterfaceKilo.i() - 1) ? (BnInterfaceKilo.i() - 1) : (m - i1);
            byte[] arrayOfByte2 = new byte[i2];
            System.arraycopy(arrayOfByte1, i1, arrayOfByte2, 0, arrayOfByte2.length);
            i1 += i2;
            TostringInBnPackage l1 = BnInterfaceUniform.BsInterfaceAlpha().b();
            l1.BsInterfaceAlpha(255);
            l1.b(arrayOfByte2);
            arrayList.add(l1);
            if (i1 >= m) {
              paramo.d(paramo.ExceptionInBsPackage() + m);
              paramo.BsInterfaceAlpha(arrayList);
              return;
            } 
          } 
        } 
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.BsInterfaceAlpha().b();
        TostringInBnPackage.BsInterfaceAlpha(255);
        TostringInBnPackage.b(arrayOfByte1);
        paramo.d(paramo.ExceptionInBsPackage() + m);
        paramo.BsInterfaceAlpha((BnInterfaceTango)TostringInBnPackage);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new ExceptionInBsPackage(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */