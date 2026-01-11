package bT;

import G.R;
import bH.D;
import bH.c;
import bN.k;
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

public class x implements a {
  public int a() {
    return 222;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_START_STOP_DAQ_LIST Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_START_STOP_DAQ_LIST valid packet data not found."); 
    if (arrayOfByte.length != 3)
      throw new h("PID:DAQ_START_STOP_DAQ_LIST invalid packet data length, expected 4 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      l l = u.a().b();
      byte b = arrayOfByte[0];
      int i = c.a(arrayOfByte, 1, 2, k.g(), false);
      d d = paramo.k();
      if (b > 2 || b < 0) {
        l.a(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 39;
        l.b(arrayOfByte1);
        paramo.a(paramt);
      } else if (i > d.b()) {
        l.a(254);
        byte[] arrayOfByte1 = new byte[1];
        arrayOfByte1[0] = 34;
        l.b(arrayOfByte1);
        paramo.a(paramt);
      } else {
        l.a(255);
        byte[] arrayOfByte1 = new byte[1];
        byte b1 = d.g(i);
        arrayOfByte1[0] = b1;
        l.b(arrayOfByte1);
        if (b == 0) {
          d.i(i);
          D.d("Stopped DAQ " + i + " for client " + paramo.m());
        } else if (b == 1) {
          d.h(i);
          D.d("Started DAQ " + i + " for client " + paramo.m());
        } else {
          D.d("Selecting DAQ " + i + " for client " + paramo.m());
          d.j(i);
        } 
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */