package af;

import ae.d;
import ae.k;
import ae.o;
import ae.p;
import ae.s;
import ae.u;
import ae.v;
import bH.D;
import bH.c;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class m implements s, a {
  List d = new ArrayList();
  
  n e;
  
  public m(n paramn) {
    this.e = paramn;
  }
  
  public List a(k paramk) {
    return this.d;
  }
  
  public List b(k paramk) {
    return this.d;
  }
  
  public void a(String paramString, Object paramObject) {}
  
  public d a(k paramk, p paramp, u paramu) {
    null = new d();
    int i = a(paramp);
    if (i == 0) {
      null.a(d.b);
      null.a("No MegaSquirt Found.");
      return null;
    } 
    if (!a(i)) {
      null.a(d.b);
      null.a("Warning!! Wrong ECU TYPE found. MS3 expected, found MS2");
      return null;
    } 
    if (!j.b(paramp))
      try {
        boolean bool = this.e.j();
        this.e.i();
        null = j.a(paramp, j.a(paramp, this.e));
      } catch (v v) {
        null.a(d.b);
        null.a("Protocol Exception, likely a bug in the firmware loader.");
        return null;
      }  
    return j.a(paramp);
  }
  
  public d a(p paramp, u paramu) {
    d d = new d();
    d.a(d.a);
    j.e(paramp);
    return d;
  }
  
  public int a(p paramp) {
    int i = 0;
    i = c(paramp);
    if (i == 0 || i == 4) {
      int j = d(paramp);
      ae.m m1 = o.a(j);
      i = m1.b();
    } else {
      i |= b(paramp);
    } 
    return i;
  }
  
  public int b(p paramp) {
    int i = 0;
    byte[] arrayOfByte1 = { 77 };
    boolean bool = this.e.j();
    this.e.h();
    byte[] arrayOfByte2 = null;
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 2);
    } catch (v v) {
      D.c("protocol error for M command: " + v.getLocalizedMessage());
      return 0;
    } finally {
      if (bool)
        this.e.i(); 
    } 
    if (arrayOfByte2 == null || arrayOfByte2.length < 2) {
      D.c("No Response to M command");
      return 0;
    } 
    int j = arrayOfByte2[0] + 256 * arrayOfByte2[1];
    i |= j;
    D.c("M command returned: " + Integer.toHexString(j));
    return i;
  }
  
  public int c(p paramp) {
    byte[] arrayOfByte1 = { 81 };
    byte[] arrayOfByte2 = null;
    try {
      arrayOfByte2 = paramp.a(arrayOfByte1, 20, 600);
    } catch (v v) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error querying signature", (Throwable)v);
    } 
    if (arrayOfByte2 == null || arrayOfByte2.length == 0)
      return 0; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 51)
      return 2; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 50 && arrayOfByte2[3] == 69 && arrayOfByte2[4] == 120)
      return 1; 
    if (arrayOfByte2[0] == 84 && arrayOfByte2[1] == 114 && arrayOfByte2[2] == 97 && arrayOfByte2[3] == 110 && arrayOfByte2[4] == 115)
      return 1; 
    if (arrayOfByte2[0] == 77 && arrayOfByte2[1] == 83 && arrayOfByte2[2] == 73 && arrayOfByte2[3] == 73)
      return 8; 
    if (arrayOfByte2[0] == 71 && arrayOfByte2[1] == 80 && arrayOfByte2[2] == 73 && arrayOfByte2[3] == 79)
      return 8; 
    if (arrayOfByte2[0] == 81)
      return 0; 
    if ((arrayOfByte2[0] & 0xF0) == 224 && (arrayOfByte2[1] & 0xF0) == 0 && arrayOfByte2[2] == 62)
      return 4; 
    D.c(" ..Garbled reply.. ");
    return 0;
  }
  
  private int d(p paramp) {
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = -73;
    try {
      byte[] arrayOfByte1 = paramp.a(arrayOfByte, 6, 200);
      return (arrayOfByte1 == null || arrayOfByte1.length == 0 || arrayOfByte1[0] != -36) ? -1 : c.a(arrayOfByte1, 1, 2, true, false);
    } catch (v v) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Protocol Error probing for monitor", (Throwable)v);
      return -1;
    } 
  }
  
  private boolean a(int paramInt) {
    return ((o.x | paramInt) == paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/af/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */