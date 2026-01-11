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
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class h implements a {
  public int a() {
    return 237;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new bS.h("PID:CAL_SHORT_DOWNLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    try {
      k k = paramo.d();
      byte[] arrayOfByte = paramt.c();
      if (arrayOfByte == null)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD valid packet data not found."); 
      if (arrayOfByte.length < 7)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD invalid packet data length, expected minimum 8 bytes, found: " + (arrayOfByte.length + 1)); 
      int i = c.a(arrayOfByte, 3, 4, k.g(), false);
      paramo.d(i);
      byte b = arrayOfByte[0];
      R r = paramo.f();
      int j = paramo.g();
      int m = k.u() * b;
      i -= r.O().y(j);
      byte b1 = 7;
      if (arrayOfByte.length != m + b1)
        throw new bS.h("PID:CAL_SHORT_DOWNLOAD invalid packet data length, expected byte count: " + (m + b1 + 1) + ", received: " + (arrayOfByte.length + 1)); 
      if ((r.O().l()).length < j || j < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 38 };
        l.b(arrayOfByte1);
        paramo.c(38);
        paramo.a((t)l);
      } else if (i + m > r.O().f(j) || i < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 34 };
        l.b(arrayOfByte1);
        paramo.c(34);
        paramo.a((t)l);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b1];
          System.arraycopy(arrayOfByte, b1, arrayOfByte1, 0, arrayOfByte1.length);
          r.h().a(j, m, c.b(arrayOfByte1));
          l l = u.a().b();
          l.a(255);
          paramo.a((t)l);
        } catch (g g) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte1 = { 34 };
          l.b(arrayOfByte1);
          paramo.c(34);
          paramo.a((t)l);
          D.c("CAL_SHORT_DOWNLOAD: Error updating local data store from DownloadHandler");
          g.printStackTrace();
        } 
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new bS.h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */