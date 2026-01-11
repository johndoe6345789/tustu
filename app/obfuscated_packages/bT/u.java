package bT;

import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class u implements a {
  public int a() {
    return 246;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:STD_SET_MTA Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new h("PID:STD_SET_MTA valid packet data not found."); 
    if (arrayOfByte1.length != 7)
      throw new h("PID:STD_SET_MTA invalid packet data length, expected 8 bytes, found: " + (arrayOfByte1.length + 1)); 
    int i = c.a(arrayOfByte1, 3, 4, k.g(), false);
    paramo.d(i);
    l l = bN.u.a().b();
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */