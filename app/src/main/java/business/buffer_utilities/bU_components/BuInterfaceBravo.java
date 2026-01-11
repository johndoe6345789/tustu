package business.buffer_utilities.bU_components;

import G.R;
import bH.D;
import bH.c;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuInterfaceBravo implements ExceptionInBsPackage {
  public static int a = 0;
  
  public static int b = 1;
  
  public static int c = 2;
  
  public int a() {
    return 166;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL valid packet data not found."); 
    if (arrayOfByte.length < 5)
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL invalid packet data length, must have atleast 5 bytes"); 
    byte b1 = arrayOfByte[0];
    if (b1 == a) {
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        R r = paramo.f();
        String str = r.P();
        if (str != null && str.getBytes() != null) {
          TostringInBnPackage.b(str.getBytes());
        } else {
          D.b("No Firmware Infor to give client?");
        } 
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b1 == b) {
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        R r = paramo.f();
        arrayOfByte = new byte[4];
        c.a(arrayOfByte, r.O().G(0), 0, 2, true);
        c.a(arrayOfByte, r.O().ay(), 2, 2, true);
        TostringInBnPackage.b(arrayOfByte);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b1 == c) {
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        R r = paramo.f();
        arrayOfByte = new byte[1];
        arrayOfByte[0] = (byte)r.O().P();
        TostringInBnPackage.b(arrayOfByte);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL Unknown Action: 0x" + Integer.toHexString(b1).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */