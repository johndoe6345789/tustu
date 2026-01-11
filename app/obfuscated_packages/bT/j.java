package bT;

import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bQ.l;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class j implements a {
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:GET_COMM_MODE_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1.length != 0)
      throw new h("PID:GET_COMM_MODE_INFO Packet size. Expected 1, found: " + (arrayOfByte1.length + 1)); 
    l l = u.a().b();
    k k = paramo.d();
    l.a(255);
    byte[] arrayOfByte2 = new byte[7];
    arrayOfByte2[0] = 0;
    arrayOfByte2[1] = 0;
    arrayOfByte2[2] = 0;
    arrayOfByte2[3] = 20;
    arrayOfByte2[4] = (byte)k.k();
    arrayOfByte2[5] = (byte)k.n();
    arrayOfByte2[6] = (byte)l.al;
    l.b(arrayOfByte2);
    try {
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public int a() {
    return 251;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */