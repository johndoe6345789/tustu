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

public class q implements a {
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:GET_STATUS Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    l l = u.a().b();
    k k = paramo.d();
    l.a(255);
    byte[] arrayOfByte = new byte[5];
    arrayOfByte[0] = k.o().a();
    arrayOfByte[1] = k.p().a();
    if (k.g()) {
      arrayOfByte[3] = (byte)(0xFF & paramo.c() >> 8);
      arrayOfByte[4] = (byte)(0xFF & paramo.c());
    } else {
      arrayOfByte[3] = (byte)(0xFF & paramo.c());
      arrayOfByte[4] = (byte)(0xFF & paramo.c() >> 8);
    } 
    try {
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
  
  public int a() {
    return 253;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */