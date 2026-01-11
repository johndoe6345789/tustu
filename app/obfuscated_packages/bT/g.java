package bT;

import G.R;
import bH.D;
import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bQ.l;
import bS.a;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class g implements a {
  private int a = 0;
  
  public int a() {
    return 239;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:CAL_DOWNLOAD_NEXT Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:CAL_DOWNLOAD_NEXT valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new h("PID:CAL_DOWNLOAD_NEXT invalid packet data length, must have atleast 1 byte"); 
    k k = paramo.d();
    int i = c.a(arrayOfByte[0]);
    R r = paramo.f();
    byte b = (k.u() > 2) ? 3 : 1;
    int j = paramo.g();
    int m = (arrayOfByte.length - b) * k.u();
    int n = k.u() * m;
    int i1 = paramo.h();
    i1 -= r.O().y(j);
    if (l.I())
      D.c("DOWNLOAD_NEXT: Got: " + n + ", expectedRemaining: " + b()); 
    try {
      if (i > this.a) {
        D.a("PID:CAL_DOWNLOAD_NEXT Element count not as expected: " + this.a + ", received: " + i);
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 41, (byte)this.a, (byte)i };
        l.b(arrayOfByte1);
        paramo.c(41);
        paramo.a((t)l);
      } else if ((r.O().l()).length < j || j < 0) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte1 = { 38 };
        l.b(arrayOfByte1);
        paramo.c(38);
        paramo.a((t)l);
      } else if (i1 + n > r.O().f(j) || i1 < 0) {
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
          r.h().a(j, i1, c.b(arrayOfByte1));
          paramo.d(paramo.h() + n);
          D.c("expectedRemainingElements = " + this.a + ", elementCount=" + i + ", packetElementCount=" + m + ", setting expectedRemainingElements to: " + (i - m));
          a(i - m);
          if (this.a == 0) {
            l l = u.a().b();
            l.a(255);
            paramo.a((t)l);
          } 
        } catch (V.g g1) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte1 = { 34 };
          l.b(arrayOfByte1);
          paramo.c(34);
          paramo.a((t)l);
          D.c("Error updating local data store from DownloadHandler");
          g1.printStackTrace();
        } 
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
  
  public int b() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */