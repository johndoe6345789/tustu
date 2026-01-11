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

public class ThreadedInBuPackage implements ExceptionInBsPackage {
  public static int a = 0;
  
  public int a() {
    return 165;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL valid packet data not found."); 
    if (arrayOfByte.length < 5)
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL invalid packet data length, must have atleast 5 bytes"); 
    byte b = arrayOfByte[0];
    if (b == a) {
      int i = c.a(arrayOfByte, 1, 4, paramo.d().g(), false);
      D.c("Pause runtime reads for: " + i + ", packet: " + c.d(arrayOfByte));
      R r = paramo.f();
      r.C().d(System.currentTimeMillis() + i);
      D.c("---   Ignore runtimeReads for " + i);
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      try {
        TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(255);
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } catch (BnInterfaceOscar o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new ExceptionInBsPackage("PID:USER_CMD_RUNTIME_READ_CONTROL Unknown Action: 0x" + Integer.toHexString(b).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */