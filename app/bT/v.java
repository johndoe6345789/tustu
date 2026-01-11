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

public class v implements a {
  public int a() {
    return 249;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:STD_SET_REQUEST Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new h("PID:STD_SET_REQUEST valid packet data not found."); 
    if (arrayOfByte1.length != 3)
      throw new h("PID:STD_SET_REQUEST invalid packet data length, expected 4 bytes, found: " + (arrayOfByte1.length + 1)); 
    byte b = arrayOfByte1[0];
    if ((b & 0x1) != 0)
      paramo.f().I(); 
    l l = u.a().b();
    l.a(255);
    byte[] arrayOfByte2 = new byte[0];
    l.b(arrayOfByte2);
    try {
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(u.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */