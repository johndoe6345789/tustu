package ag;

import G.bT;
import ae.d;
import ae.k;
import ae.m;
import ae.o;
import ae.p;
import ae.s;
import ae.u;
import ae.v;
import af.a;
import af.j;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements s, a {
  List d = new ArrayList();
  
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
      null.a("No MegaSquirt 2 Found.");
      return null;
    } 
    if (!a(i)) {
      null.a(d.b);
      null.a("Warning!! Wrong ECU TYPE found. MS2 expected");
      return null;
    } 
    if (!j.b(paramp))
      do {
        if (!paramu.b("Turn off Megasquirt/Microsquirt.")) {
          null.a(d.b);
          null.a("Cancelled by user.");
          return null;
        } 
        if (!paramu.b("Install boot jumper shunt onto B/LD on the CPU card, or ground the bootload wire.")) {
          null.a(d.b);
          null.a("Cancelled by user.");
          return null;
        } 
        if (!paramu.b("Turn on Megasquirt/Microsquirt.")) {
          null.a(d.b);
          null.a("Cancelled by user.");
          return null;
        } 
      } while (!j.b(paramp)); 
    return j.a(paramp);
  }
  
  public d a(p paramp, u paramu) {
    d d = new d();
    d.a(d.a);
    j.e(paramp);
    if (!paramu.b("Turn off Megasquirt/Microsquirt.")) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    if (!paramu.b("Please remove the boot jumper or disconnect the boot wire from ground.")) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    if (!paramu.b("Turn on Megasquirt/Microsquirt.")) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    return d;
  }
  
  public int a(p paramp) {
    int i = 0;
    int j = b(paramp);
    m m1 = o.a(j);
    i = m1.b();
    if (i > 0)
      return i; 
    bT bT = j.f(paramp);
    m m2 = o.b(bT);
    if (m2 != null)
      i |= m2.b(); 
    return i;
  }
  
  private int b(p paramp) {
    j.a(paramp);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = -73;
    try {
      byte[] arrayOfByte1 = paramp.a(arrayOfByte, 6, 200);
      return (arrayOfByte1 == null || arrayOfByte1.length == 0 || arrayOfByte1[0] != -36) ? -1 : bH.c.a(arrayOfByte1, 1, 2, true, false);
    } catch (v v) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Protocol Error probing for monitor", (Throwable)v);
      return -1;
    } 
  }
  
  private boolean a(int paramInt) {
    return ((o.w | paramInt) == paramInt);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ag/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */