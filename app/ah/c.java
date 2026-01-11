package ah;

import A.f;
import A.r;
import A.s;
import B.l;
import G.l;
import ae.d;
import ae.k;
import ae.p;
import ae.s;
import ae.u;
import ae.v;
import bH.D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c implements s {
  List a = new ArrayList();
  
  private static final byte[] c = new byte[] { 2, 0, 0, 0, -1, 0 };
  
  private static final byte[] d = new byte[] { 1, 0, 1, 0, -2 };
  
  File b = null;
  
  public List a(k paramk) {
    return this.a;
  }
  
  public List b(k paramk) {
    return this.a;
  }
  
  public void a(String paramString, Object paramObject) {}
  
  public d a(k paramk, p paramp, u paramu) {
    d d = new d();
    c(paramp);
    byte b = 0;
    while (!a(paramp)) {
      paramu.b("Power On BigStuff3 Gen4");
      if (b++ > 3) {
        String str = "BigStuff3 Gen4 box not found, firmware load cancelled.";
        paramu.a(str);
        d.a(d.b);
        d.a(str);
        return d;
      } 
    } 
    String str1 = b(paramp);
    if (str1 == null) {
      d.a(d.b);
      d.a("Failed to get IP Address for Controller.");
      return d;
    } 
    a a = new a(str1, 21);
    a.a("sdcard");
    a.b("sdcard");
    paramu.a("Sending Firmware to Controller.");
    this.b = paramk.g();
    d = a.a(this.b, paramu);
    if (d.a() != d.a)
      return d; 
    String str2 = "Power off your BigStuff3 Gen4";
    if (!paramu.b(str2)) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    str2 = "Connect 12 volts to Pin Y2 on Hdr2 Connector (on the opposite side of the Engine Connector)";
    if (!paramu.b(str2)) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    str2 = "Power On the BigStuff3 Gen4";
    if (!paramu.b(str2)) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    d.a(d.a);
    return d;
  }
  
  private String b(p paramp) {
    f f = paramp.a();
    return (String)f.a(l.j);
  }
  
  public d a(p paramp, u paramu) {
    d d = new d();
    byte b = 0;
    String str = "Power Off the BigStuff3 Gen4";
    if (!paramu.b(str)) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    str = "Disconnect the 12 volts to Pin Y2 on Hdr2 Connector";
    if (!paramu.b(str)) {
      d.a(d.b);
      d.a("Cancelled by user.");
      return d;
    } 
    while (true) {
      str = "Power On the BigStuff3 Gen4";
      if (!paramu.b(str)) {
        d.a(d.b);
        d.a("Cancelled by user.");
        return d;
      } 
      if (b++ > 2) {
        d.a(d.b);
        d.a("Cannot connect.");
        return d;
      } 
      if (a(paramp)) {
        a a = new a("192.168.4.7", 21);
        a.a("sdcard");
        a.b("sdcard");
        a.a(this.b);
        return d;
      } 
    } 
  }
  
  public boolean a(p paramp) {
    try {
      paramp.a().g();
      paramp.a().f();
      byte[] arrayOfByte = paramp.a(c, 12);
      if (arrayOfByte != null && arrayOfByte.length == 12 && arrayOfByte[4] == -1) {
        D.c("Connect! " + bH.c.d(arrayOfByte));
        paramp.a(d, 0);
        return true;
      } 
      if (arrayOfByte == null) {
        D.a("null response received on connect");
        return false;
      } 
      if (arrayOfByte.length != 12) {
        D.a("wrong len response received on connect: " + arrayOfByte.length);
        return false;
      } 
      if (arrayOfByte[4] != -1) {
        D.a("Negative response received on connect");
        return false;
      } 
      D.a("Unknown failure on connect");
      return false;
    } catch (IOException iOException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unable to send connect", iOException);
      return false;
    } catch (v v) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Shouldn't get a protocol exception", (Throwable)v);
      return false;
    } catch (l l) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Unable to connect", (Throwable)l);
      return false;
    } 
  }
  
  private p c(p paramp) {
    try {
      f f1 = paramp.a();
      f1.g();
      f f2 = f1.getClass().newInstance();
      for (r r : f1.l()) {
        try {
          f2.a(r.c(), f1.a(r.c()));
        } catch (s s1) {
          Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to set: " + r.c(), (Throwable)s1);
        } 
      } 
      paramp.a(f2);
      f2.f();
    } catch (InstantiationException instantiationException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to copy ControllerInterface", instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to copy ControllerInterface 2", illegalAccessException);
    } catch (l l) {
      Logger.getLogger(c.class.getName()).log(Level.SEVERE, "Failed to connect.", (Throwable)l);
    } 
    return paramp;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ah/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */