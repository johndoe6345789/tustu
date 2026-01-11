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

public class f implements a {
  public int a() {
    return 238;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:CAL_DOWNLOAD_MAX Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:CAL_DOWNLOAD_MAX valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new h("PID:CAL_DOWNLOAD_MAX invalid packet data length, must have atleast 1 byte"); 
    k k = paramo.d();
    int i = k.i() - k.u() - 1;
    R r = paramo.f();
    int j = paramo.g();
    int m = k.u() * i;
    int n = paramo.h();
    n -= r.O().y(j);
    byte b = (k.u() > 2) ? 3 : 1;
    try {
      if (arrayOfByte.length != m + b)
        throw new h("PID:CAL_DOWNLOAD_MAX invalid packet data length, expected byte count: " + (m + b + 1) + ", received: " + (arrayOfByte.length + 1)); 
      if ((r.O().l()).length < j || j < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 38 };
        l.b(arrayOfByte1);
        paramo.c(38);
        paramo.a(paramt);
      } else if (n + m > r.O().f(j) || n < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 34 };
        l.b(arrayOfByte1);
        paramo.c(34);
        paramo.a(paramt);
      } else {
        try {
          byte[] arrayOfByte1 = new byte[arrayOfByte.length - b];
          System.arraycopy(arrayOfByte, b, arrayOfByte1, 0, arrayOfByte1.length);
          r.h().a(j, m, c.b(arrayOfByte1));
          l l = u.a().b();
          l.a(255);
          paramo.a(paramt);
          paramo.d(paramo.h() + m);
        } catch (g g) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte1 = { 34 };
          l.b(arrayOfByte1);
          paramo.c(34);
          paramo.a(paramt);
          D.c("CAL_DOWNLOAD_MAX: Error updating local data store from DownloadMaxHandler");
          g.printStackTrace();
        } 
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */