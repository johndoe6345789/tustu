package bT;

import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class z implements a {
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:SYNC Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    try {
      l l = u.a().b();
      l.a(254);
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = 0;
      l.b(arrayOfByte);
      paramo.a((t)l);
    } catch (o o1) {
      Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
  
  public int a() {
    return 252;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */