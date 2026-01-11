package bT;

import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class i implements a {
  public int a() {
    return 234;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:PAG_GET_CAL_PAGE Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:PAG_GET_CAL_PAGE valid packet data not found."); 
    if (arrayOfByte.length != 2)
      throw new h("PID:PAG_GET_CAL_PAGE invalid packet data length, expected 3 bytes, found: " + (arrayOfByte.length + 1)); 
    byte b1 = arrayOfByte[0];
    byte b2 = arrayOfByte[1];
    try {
      if (b1 != 1 && b1 != 2) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        l.b(arrayOfByte1);
        paramo.c(39);
        paramo.a((t)l);
      } else {
        l l = u.a().b();
        l.a(255);
        byte[] arrayOfByte1 = new byte[3];
        arrayOfByte1[2] = (byte)paramo.g();
        l.b(arrayOfByte1);
        paramo.a((t)l);
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */