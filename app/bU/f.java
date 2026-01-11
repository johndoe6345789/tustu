package bU;

import G.R;
import G.dh;
import V.g;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class f implements h {
  public static int a = 0;
  
  public static int b = 1;
  
  public int a() {
    return 167;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD_TURBO_BAUD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:USER_CMD_TURBO_BAUD valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new h("PID:USER_CMD_TURBO_BAUD invalid packet data length, must have atleast 1 byte"); 
    byte b = arrayOfByte[0];
    if (b == a) {
      R r = paramo.f();
      try {
        dh.a(r);
      } catch (g g) {
        Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to activate Turbo baud", (Throwable)g);
      } 
      try {
        l l = u.a().b();
        l.a(255);
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b == b) {
      R r = paramo.f();
      try {
        dh.b(r);
      } catch (g g) {
        Logger.getLogger(f.class.getName()).log(Level.WARNING, "Failed to deactivate Turbo baud", (Throwable)g);
      } 
      try {
        l l = u.a().b();
        l.a(255);
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new h("PID:USER_CMD_TURBO_BAUD Unknown Action: 0x" + Integer.toHexString(b).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */