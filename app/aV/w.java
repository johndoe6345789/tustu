package aV;

import A.f;
import A.i;
import A.q;
import B.a;
import B.b;
import B.i;
import B.l;
import B.o;
import aB.b;
import aC.a;
import aD.a;
import bH.J;
import bS.o;
import java.util.ArrayList;
import java.util.List;
import r.i;
import s.g;

public class w implements i {
  private static i a = null;
  
  private List b = new ArrayList();
  
  private q c = null;
  
  private w() {
    if (i.a().a("fdsp[pp[ds';'")) {
      q q1 = new q();
      q1.a(a.d);
      q1.b(g.b("JSSC RS232"));
      q1.a(a.class);
      this.b.add(q1);
      this.c = q1;
    } 
    if (i.a().a("LKFDS;LK;lkfs;lk") && (J.d() || J.b()))
      a.v = true; 
    if (i.a().a("GD;';LFDS-0DSL;")) {
      q q1 = new q();
      q1.a(a.e);
      q1.b(g.b("Direct Bluetooth Connection via Bluecove"));
      q1.a(a.class);
      this.b.add(q1);
    } 
    if (i.a().a(";'[PGS0P;'G0[F;") && !J.e()) {
      q q1 = new q();
      q1.a(b.c);
      q1.b(g.b("FTDI USB D2XX"));
      q1.a(b.class);
      this.b.add(q1);
      if (!J.d());
    } 
    if (i.a().a("98fg54lklk") || i.a().a("HF-05[P54;'FD") || i.a().a("HF-0[PEPHF0H;LJGPO0")) {
      q q1 = new q();
      q1.a(o.b);
      q1.b(g.b("UDP WiFi / Ethernet"));
      q1.a(o.class);
      this.b.add(q1);
      q1 = new q();
      q1.a(l.b);
      q1.b(g.b("TCP/IP - WiFi / Ethernet"));
      q1.a(l.class);
      this.b.add(q1);
      if (i.a().a("H;';'0FD;RE")) {
        q1 = new q();
        q1.a(a.c);
        q1.b(g.b(a.c));
        q1.a(a.class);
        q1.a((i)b.c());
        this.b.add(q1);
      } 
    } else if (i.a().a("LKFDS;LK;lkfs;lk")) {
      q q1 = new q();
      q1.a(l.b);
      q1.b(g.b("TCP/IP - WiFi / Ethernet"));
      q1.a(l.class);
      this.b.add(q1);
    } 
    if (this.c == null && !this.b.isEmpty())
      this.c = this.b.get(0); 
  }
  
  public static i c() {
    if (a == null)
      a = new w(); 
    return a;
  }
  
  public static void a(i parami) {
    a = parami;
  }
  
  public List a() {
    return this.b;
  }
  
  public f a(String paramString1, String paramString2) {
    for (q q1 : this.b) {
      if (q1.a().equals(paramString1))
        return q1.c(paramString2); 
    } 
    return null;
  }
  
  public f a(String paramString1, i parami, String paramString2) {
    if (a(paramString1, parami))
      return a(a.c, parami, paramString2); 
    for (q q1 : this.b) {
      if (q1.a().equals(paramString1)) {
        f f = q1.c(paramString2);
        if (f instanceof a) {
          a a = (a)f;
          a.a(parami, paramString2);
        } 
        return f;
      } 
    } 
    return null;
  }
  
  public boolean a(String paramString, i parami) {
    return (parami != null && parami.i() != null && parami.i().equals(o.a) && (paramString.equals(l.b) || paramString.equals(o.b)) && d());
  }
  
  public boolean d() {
    for (q q1 : this.b) {
      if (q1.a().equals(a.c))
        return true; 
    } 
    return false;
  }
  
  public q b() {
    return this.c;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aV/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */