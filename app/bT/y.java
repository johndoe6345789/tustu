package bT;

import bH.D;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.d;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class y implements a {
  public int a() {
    return 221;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_START_STOP_SYNCH Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_START_STOP_SYNCH valid packet data not found."); 
    if (arrayOfByte.length != 1)
      throw new h("PID:DAQ_START_STOP_SYNCH invalid packet data length, expected 2 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      l l = u.a().b();
      byte b = arrayOfByte[0];
      d d = paramo.k();
      if (b > 2 || b < 0) {
        l.a(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        l.b(arrayOfByte1);
        paramo.a(paramt);
      } else {
        l.a(255);
        byte[] arrayOfByte1 = new byte[1];
        if (paramo.f().R()) {
          arrayOfByte1[0] = 1;
        } else {
          arrayOfByte1[0] = 0;
        } 
        l.b(arrayOfByte1);
        if (b == 0) {
          d.i();
        } else if (b == 1) {
          d.g();
        } else {
          d.h();
        } 
        d.f();
        paramo.a((t)l);
        return;
      } 
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
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */