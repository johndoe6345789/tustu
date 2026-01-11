package bT;

import bH.c;
import bN.k;
import bN.l;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;

public class B implements a {
  public int a() {
    return 244;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:STD_SHORT_UPLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    l l = u.a().b();
    k k = paramo.d();
    l.a(255);
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:STD_SHORT_UPLOAD valid packet data not found."); 
    if (arrayOfByte.length != 7)
      throw new h("PID:STD_SHORT_UPLOAD invalid packet data length, expected 8 bytes, found: " + (arrayOfByte.length + 1)); 
    int i = c.a(arrayOfByte, 3, 4, k.g(), false);
    paramo.d(i);
    ((l)paramt).a(245);
    a a1 = paramo.i().a(245);
    a1.a(paramo, paramt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/B.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */