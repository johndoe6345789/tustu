package bT;

import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bO.f;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class n implements a {
  public int a() {
    return 218;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:GET_DAQ_PROCESSOR_INFO Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    try {
      l l = u.a().b();
      l.a(255);
      byte[] arrayOfByte = new byte[7];
      f f = paramo.k().a().b();
      arrayOfByte[0] = f.a().a();
      c.a(arrayOfByte, f.b(), 1, 2, k.g());
      c.a(arrayOfByte, f.c(), 3, 2, k.g());
      arrayOfByte[5] = (byte)f.d();
      arrayOfByte[6] = f.e().b();
      l.b(arrayOfByte);
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */