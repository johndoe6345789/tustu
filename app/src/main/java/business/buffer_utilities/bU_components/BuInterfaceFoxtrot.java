package business.buffer_utilities.bU_components;

import G.R;
import G.GInterfaceDh;
import V.ExceptionPrintstacktrace;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuInterfaceFoxtrot implements ExceptionInBsPackage {
  public static int a = 0;
  
  public static int b = 1;
  
  public int a() {
    return 167;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage("PID:USER_CMD_TURBO_BAUD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:USER_CMD_TURBO_BAUD valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new ExceptionInBsPackage("PID:USER_CMD_TURBO_BAUD invalid packet data length, must have atleast 1 byte"); 
    byte b = arrayOfByte[0];
    if (b == a) {
      R r = paramo.f();
      try {
        GInterfaceDh.a(r);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to activate Turbo baud", (Throwable)ExceptionPrintstacktrace);
      } 
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b == b) {
      R r = paramo.f();
      try {
        GInterfaceDh.b(r);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to deactivate Turbo baud", (Throwable)ExceptionPrintstacktrace);
      } 
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new ExceptionInBsPackage("PID:USER_CMD_TURBO_BAUD Unknown Action: 0x" + Integer.toHexString(b).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */