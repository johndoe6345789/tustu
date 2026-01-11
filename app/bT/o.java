package bT;

import G.R;
import bH.c;
import bN.k;
import bN.l;
import bN.t;
import bN.u;
import bO.h;
import bS.a;
import bS.h;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o implements a {
  public int a() {
    return 217;
  }
  
  public void a(bS.o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_GET_DAQ_RESOLUTION_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    R r = paramo.f();
    try {
      l l = u.a().b();
      l.a(255);
      byte[] arrayOfByte = new byte[7];
      h h = paramo.k().a().c();
      arrayOfByte[0] = (byte)h.f();
      arrayOfByte[1] = (byte)h.a();
      arrayOfByte[2] = (byte)h.b();
      arrayOfByte[3] = (byte)h.c();
      arrayOfByte[4] = (byte)h.d().d();
      c.a(arrayOfByte, h.e(), 5, 2, k.g());
      l.b(arrayOfByte);
      paramo.a((t)l);
    } catch (bN.o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */