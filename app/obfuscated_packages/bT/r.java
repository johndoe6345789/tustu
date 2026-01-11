package bT;

import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class r implements a {
  public int a() {
    return 235;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:PAG_SET_CAL_PAGE Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:PAG_SET_CAL_PAGE valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new h("PID:PAG_SET_CAL_PAGE invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    byte b1 = arrayOfByte[0];
    byte b2 = arrayOfByte[1];
    byte b3 = arrayOfByte[2];
    if (b3 < 0 || b3 >= paramo.f().O().g()) {
      l l = u.a().b();
      l.a(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 38;
      l.b(arrayOfByte1);
      paramo.c(38);
      l.b(arrayOfByte1);
      try {
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new h(o1.getLocalizedMessage());
      } 
    } else {
      paramo.j().a(b1);
      paramo.b(b3);
      l l = u.a().b();
      l.a(255);
      byte[] arrayOfByte1 = new byte[0];
      l.b(arrayOfByte1);
      try {
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
        throw new h(o1.getLocalizedMessage());
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */