package bT;

import G.R;
import bH.D;
import bH.c;
import bN.k;
import bN.o;
import bN.t;
import bN.u;
import bO.c;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class l implements a {
  public int a() {
    return 216;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_GET_DAQ_LIST_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_GET_DAQ_LIST_INFO valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new h("PID:DAQ_GET_DAQ_LIST_INFO invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      bN.l l1 = u.a().b();
      int i = c.a(arrayOfByte, 1, 2, k.g(), false);
      c c = paramo.k().b(i);
      if (c == null) {
        l1.a(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        l1.b(arrayOfByte2);
        paramo.a(paramt);
        return;
      } 
      l1.a(255);
      byte[] arrayOfByte1 = new byte[5];
      arrayOfByte1[0] = c.b().a();
      arrayOfByte1[1] = (byte)c.a();
      arrayOfByte1[2] = (byte)c.c();
      c.a(arrayOfByte1, c.d(), 3, 2, k.g());
      l1.b(arrayOfByte1);
      paramo.a((t)l1);
      return;
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      bN.l l1 = u.a().b();
      l1.a(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      l1.b(arrayOfByte1);
      try {
        paramo.a((t)l1);
      } catch (o o2) {
        D.a("Unable to send response packet.");
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      return;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */