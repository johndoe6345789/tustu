package aV;

import A.i;
import A.q;
import B.i;
import B.l;
import aB.b;
import aC.a;
import aD.a;
import java.util.ArrayList;
import java.util.List;
import r.i;
import s.g;

public class f implements i {
  private static f b = null;
  
  private List c = new ArrayList();
  
  q a = null;
  
  private f() {
    q q1 = new q();
    q1.a(a.d);
    q1.b(g.b("RS232 Serial Communication or virtual communication using serial com port that are already setup on this computer."));
    q1.a(a.class);
    this.c.add(q1);
    this.a = q1;
    if (i.a().a("GD;';LFDS-0DSL;")) {
      q1 = new q();
      q1.a(a.e);
      q1.b(g.b("Direct Bluetooth connection."));
      q1.a(a.class);
      this.c.add(q1);
    } 
    if (i.a().a(";'[PGS0P;'G0[F;")) {
      q1 = new q();
      q1.a(b.c);
      q1.b(g.b("FTDI D2XX Direct USB."));
      q1.a(b.class);
      this.c.add(q1);
    } 
    if (i.a().a("LKFDS;LK;lkfs;lk")) {
      q1 = new q();
      q1.a(l.b);
      q1.b(g.b("TCP/IP - WiFi / Ethernet"));
      q1.a(l.class);
      this.c.add(q1);
    } 
  }
  
  public static f c() {
    if (b == null)
      b = new f(); 
    return b;
  }
  
  public List a() {
    return this.c;
  }
  
  public A.f a(String paramString1, String paramString2) {
    for (q q1 : this.c) {
      if (q1.a().equals(paramString1))
        return q1.c(paramString2); 
    } 
    return null;
  }
  
  public A.f a(String paramString1, i parami, String paramString2) {
    return a(paramString1, paramString2);
  }
  
  public q b() {
    return this.a;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */