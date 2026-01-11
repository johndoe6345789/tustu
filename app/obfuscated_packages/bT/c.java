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

public class c implements a {
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:CONNECT Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1.length != 1)
      throw new h("PID:CONNECT UnexpedataBytes[0] == XcpServer.STATE_CONNECTED_NORMALcted data size, expected 1 byte, found: " + arrayOfByte1.length); 
    if (arrayOfByte1[0] == 0 || arrayOfByte1[0] == 1) {
      paramo.a(arrayOfByte1[0]);
    } else {
      throw new h("PID:CONNECT Unsupported connect Mode requested: " + arrayOfByte1[0]);
    } 
    l l = u.a().b();
    k k = paramo.d();
    l.a(255);
    byte[] arrayOfByte2 = new byte[7];
    arrayOfByte2[0] = 5;
    arrayOfByte2[1] = k.t().d();
    arrayOfByte2[2] = (byte)k.i();
    arrayOfByte2 = bH.c.a(arrayOfByte2, k.j(), 3, 2, k.g());
    arrayOfByte2[5] = 1;
    arrayOfByte2[6] = 1;
    l.b(arrayOfByte2);
    try {
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public int a() {
    return 255;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */