package bT;

import G.R;
import V.g;
import bH.D;
import bH.c;
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

public class e implements a {
  public int a() {
    return 240;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:CAL_DOWNLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:CAL_DOWNLOAD valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new h("PID:CAL_DOWNLOAD invalid packet data length, must have atleast 1 byte"); 
    k k = paramo.d();
    int i = c.a(arrayOfByte[0]);
    R r = paramo.f();
    int j = paramo.g();
    int m = k.u() * i;
    int n = paramo.h();
    n -= r.O().y(j);
    byte b = (k.u() > 2) ? 3 : 1;
    try {
      if (!k.t().a() && arrayOfByte.length != m + b)
        throw new h("PID:CAL_DOWNLOAD invalid packet data length, expected byte count: " + (m + b + 1) + ", received: " + (arrayOfByte.length + 1)); 
      if ((r.O().l()).length < j || j < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 38 };
        l.b(arrayOfByte1);
        paramo.c(38);
        paramo.a((t)l);
      } else if (n + m > r.O().f(j) || n < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 34 };
        l.b(arrayOfByte1);
        paramo.c(34);
        paramo.a((t)l);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b];
          System.arraycopy(arrayOfByte, b, arrayOfByte1, 0, arrayOfByte1.length);
          r.h().a(j, n, c.b(arrayOfByte1));
          paramo.d(paramo.h() + arrayOfByte1.length);
          if (m <= arrayOfByte1.length) {
            l l = u.a().b();
            l.a(255);
            paramo.a((t)l);
          } else {
            g g = (g)paramo.i().a(239);
            g.a(i - arrayOfByte1.length / k.u());
            D.c("DOWNLOAD: Downloaded: " + i + ", expectedRemaining: " + g.b());
          } 
        } catch (g g) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte1 = { 34 };
          l.b(arrayOfByte1);
          paramo.c(34);
          paramo.a((t)l);
          D.c("Error updating local data store from DownloadHandler");
          g.printStackTrace();
        } 
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */