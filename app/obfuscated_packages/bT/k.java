package bT;

import G.R;
import G.aH;
import bH.D;
import bH.c;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class k implements a {
  public int a() {
    return 215;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_GET_DAQ_EVENT_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    bN.k k1 = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_GET_DAQ_EVENT_INFO valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new h("PID:DAQ_GET_DAQ_EVENT_INFO invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      l l = u.a().b();
      int i = c.a(arrayOfByte, 1, 2, k1.g(), false);
      aH aH = r.b(i);
      if (aH == null) {
        l.a(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        l.b(arrayOfByte2);
        paramo.a(paramt);
        return;
      } 
      l.a(255);
      byte[] arrayOfByte1 = new byte[6];
      arrayOfByte1[0] = 4;
      arrayOfByte1[1] = -1;
      arrayOfByte1[2] = (byte)aH.aL().length();
      arrayOfByte1[3] = 0;
      arrayOfByte1[4] = 0;
      arrayOfByte1[5] = 15;
      paramo.d(o.c);
      paramo.a(aH.aL().getBytes());
      l.b(arrayOfByte1);
      paramo.a((t)l);
      return;
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      l l = u.a().b();
      l.a(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      l.b(arrayOfByte1);
      try {
        paramo.a((t)l);
      } catch (o o2) {
        D.a("Unable to send response packet.");
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      return;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */