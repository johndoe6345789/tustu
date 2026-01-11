package bU;

import G.R;
import bH.D;
import bH.c;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class e implements h {
  public static int a = 0;
  
  public int a() {
    return 165;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL valid packet data not found."); 
    if (arrayOfByte.length < 5)
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL invalid packet data length, must have atleast 5 bytes"); 
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
        l l = u.a().b();
        l.a(255);
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL Unknown Action: 0x" + Integer.toHexString(b).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */