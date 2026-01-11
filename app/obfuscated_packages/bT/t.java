package bT;

import G.R;
import bH.D;
import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.u;
import bO.c;
import bS.a;
import bS.d;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class t implements a {
  public int a() {
    return 226;
  }
  
  public void a(o paramo, bN.t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_SET_DAQ_PTR Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_SET_DAQ_PTR valid packet data not found."); 
    if (arrayOfByte.length != 5)
      throw new h("PID:DAQ_SET_DAQ_PTR invalid packet data length, expected 6 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      l l = u.a().b();
      d d = paramo.k();
      int i = c.a(arrayOfByte, 1, 2, k.g(), false);
      int j = c.a(arrayOfByte[3]);
      int m = c.a(arrayOfByte[4]);
      c c = d.b(i);
      if (c == null || i > d.b() || j > c.a() || m > c.c()) {
        l.a(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        l.b(arrayOfByte2);
        paramo.a(paramt);
        return;
      } 
      l.a(255);
      byte[] arrayOfByte1 = new byte[0];
      d.d(i);
      d.e(j);
      d.f(m);
      l.b(arrayOfByte1);
      paramo.a((bN.t)l);
      return;
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      l l = u.a().b();
      l.a(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      l.b(arrayOfByte1);
      try {
        paramo.a((bN.t)l);
      } catch (o o2) {
        D.a("Unable to send response packet.");
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o2);
      } 
      return;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */