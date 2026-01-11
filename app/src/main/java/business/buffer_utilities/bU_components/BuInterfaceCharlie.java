package business.buffer_utilities.bU_components;

import G.R;
import G.BnInterfaceOscar;
import bH.D;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import bT.BtInterfaceCharlie;
import java.util.logging.Level;
import java.util.logging.Logger;

public BuInterfaceCharlielass BuInterfaceCharlie implements ExceptionInBsPackage {
  public int a() {
    return 163;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW valid packet data not found."); 
    if (arrayOfByte1.length < 1)
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW invalid packet data length, must have atleast 1 byte"); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    d d = a(paramo);
    int i = bH.c.a(arrayOfByte1, 0, 2, BnInterfaceKilo.g(), false);
    int j = bH.c.a(arrayOfByte1, 2, 4, BnInterfaceKilo.g(), true);
    d.c(j);
    int m = bH.c.a(arrayOfByte1, 6, 4, BnInterfaceKilo.g(), true);
    d.b(m);
    d.a(((arrayOfByte1[14] & 0x1) == 1));
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 15];
    System.arraycopy(arrayOfByte1, 15, arrayOfByte2, 0, arrayOfByte2.length);
    R r = paramo.f();
    try {
      if (!BnInterfaceKilo.BnInterfaceTango().a() && arrayOfByte2.length != i)
        throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW invalid packet data length, expected byte count: " + i + ", received: " + arrayOfByte2.length + '\001'); 
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
      if (i <= arrayOfByte2.length) {
        d d1 = a(paramo);
        BnInterfaceOscar o1 = d1.a(r, arrayOfByte2);
        if (o1.a() == 3) {
          TostringInBnPackage.a(254);
          String str = "WriteRaw Failed: " + o1.c();
          TostringInBnPackage.b(str.getBytes());
          paramo.a((BnInterfaceTango)TostringInBnPackage);
          D.c(str);
        } else {
          TostringInBnPackage.a(255);
          if (o1.e() != null) {
            byte[] arrayOfByte = bH.c.a(o1.e());
            TostringInBnPackage.b(arrayOfByte);
            paramo.a((BnInterfaceTango)TostringInBnPackage);
          } 
        } 
      } else {
        d d1 = a(paramo);
        d1.a(i - arrayOfByte2.length);
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte, 0, arrayOfByte2.length);
        d1.a(arrayOfByte);
        D.c("PID:USER_CMD_WRITE_RAW Downloaded: " + arrayOfByte2.length + ", expectedRemaining: " + d1.b());
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  private d a(BnInterfaceOscar paramo) {
    BtInterfaceCharlie c1 = (BtInterfaceCharlie)paramo.i().a(241);
    return (d)c1.a(164);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */