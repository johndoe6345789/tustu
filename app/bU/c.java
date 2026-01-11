package bU;

import G.R;
import G.o;
import bH.D;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import bT.C;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements h {
  public int a() {
    return 163;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD_WRITE_RAW Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte1 = paramt.c();
    if (arrayOfByte1 == null)
      throw new h("PID:USER_CMD_WRITE_RAW valid packet data not found."); 
    if (arrayOfByte1.length < 1)
      throw new h("PID:USER_CMD_WRITE_RAW invalid packet data length, must have atleast 1 byte"); 
    k k = paramo.d();
    d d = a(paramo);
    int i = bH.c.a(arrayOfByte1, 0, 2, k.g(), false);
    int j = bH.c.a(arrayOfByte1, 2, 4, k.g(), true);
    d.c(j);
    int m = bH.c.a(arrayOfByte1, 6, 4, k.g(), true);
    d.b(m);
    d.a(((arrayOfByte1[14] & 0x1) == 1));
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 15];
    System.arraycopy(arrayOfByte1, 15, arrayOfByte2, 0, arrayOfByte2.length);
    R r = paramo.f();
    try {
      if (!k.t().a() && arrayOfByte2.length != i)
        throw new h("PID:USER_CMD_WRITE_RAW invalid packet data length, expected byte count: " + i + ", received: " + arrayOfByte2.length + '\001'); 
      l l = u.a().b();
      if (i <= arrayOfByte2.length) {
        d d1 = a(paramo);
        o o1 = d1.a(r, arrayOfByte2);
        if (o1.a() == 3) {
          l.a(254);
          String str = "WriteRaw Failed: " + o1.c();
          l.b(str.getBytes());
          paramo.a((t)l);
          D.c(str);
        } else {
          l.a(255);
          if (o1.e() != null) {
            byte[] arrayOfByte = bH.c.a(o1.e());
            l.b(arrayOfByte);
            paramo.a((t)l);
          } 
        } 
      } else {
        d d1 = a(paramo);
        d1.a(i - arrayOfByte2.length);
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(arrayOfByte2, 0, arrayOfByte, 0, arrayOfByte2.length);
        d1.a(arrayOfByte);
        D.c("PID:USER_CMD_WRITE_RAW Downloaded: " + arrayOfByte2.length + ", expectedRemaining: " + d1.b());
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  private d a(o paramo) {
    C c1 = (C)paramo.i().a(241);
    return (d)c1.a(164);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */