package bT;

import G.R;
import bH.c;
import bH.g;
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

public class a implements a {
  g a = new g();
  
  public int a() {
    return 243;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:STD_BUILD_CHECKSUM Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:STD_BUILD_CHECKSUM valid packet data not found."); 
    if (arrayOfByte.length != 7)
      throw new h("PID:STD_BUILD_CHECKSUM invalid packet data length, expected 8 bytes, found: " + (arrayOfByte.length + 1)); 
    R r = paramo.f();
    int i = paramo.g();
    int j = paramo.h();
    int m = j - r.O().y(i);
    int n = c.a(arrayOfByte, 3, 4, k.g(), false) * paramo.d().u();
    try {
      if (n > 4096) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = new byte[7];
        arrayOfByte1[0] = 34;
        byte[] arrayOfByte2 = c.a(4096, new byte[4], paramo.d().g());
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
        l.b(arrayOfByte1);
        paramo.a((t)l);
      } else if (m + n > r.O().f(i)) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = new byte[7];
        arrayOfByte1[0] = 34;
        byte[] arrayOfByte2 = c.a(r.O().f(i) - m, new byte[4], paramo.d().g());
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 3, arrayOfByte2.length);
        l.b(arrayOfByte1);
        paramo.a((t)l);
      } else {
        int[] arrayOfInt = r.h().a(i, m, n);
        byte[] arrayOfByte1 = c.a(arrayOfInt);
        this.a.a();
        this.a.a(arrayOfByte1);
        byte[] arrayOfByte2 = new byte[4];
        arrayOfByte2 = c.a(this.a.b(), arrayOfByte2, k.g());
        l l = u.a().b();
        l.a(255);
        byte[] arrayOfByte3 = new byte[7];
        arrayOfByte3[0] = 8;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 3, arrayOfByte2.length);
        l.b(arrayOfByte3);
        paramo.a((t)l);
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */