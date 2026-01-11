package bS;

import G.F;
import G.aF;
import bH.D;
import bH.c;
import bN.k;
import bN.m;
import bN.o;
import bN.r;
import bN.u;
import bO.a;
import bO.c;
import bO.k;
import bO.l;
import bR.a;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements aF {
  private c g;
  
  F a;
  
  private r h;
  
  a b;
  
  k c;
  
  c d = null;
  
  byte[] e = null;
  
  long f = 0L;
  
  public b(F paramF, r paramr, a parama) {
    this.a = paramF;
    this.h = paramr;
    this.b = parama;
    this.c = paramr.d();
  }
  
  public c a() {
    return this.g;
  }
  
  public void a(c paramc) {
    this.g = paramc;
  }
  
  public void b() {
    if (this.d != null)
      this.d.b(); 
  }
  
  public void c() {
    b();
    this.e = null;
    this.d = new c(this);
    this.d.start();
  }
  
  private void e() {
    ArrayList<m> arrayList = new ArrayList();
    boolean bool = false;
    for (k k1 : this.g.e()) {
      m m = u.a().a(this.c);
      try {
        if (!bool && this.b.c().d().a() > 0) {
          byte[] arrayOfByte1 = d();
          m.d(arrayOfByte1);
          bool = true;
        } else {
          m.d(new byte[0]);
        } 
      } catch (a a1) {
        D.a((Exception)a1);
        return;
      } 
      int i = 0;
      for (l l : k1)
        i += l.b(); 
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      if (this.e != null)
        for (l l : k1) {
          System.arraycopy(this.e, (int)l.a(), arrayOfByte, j, l.b());
          j += l.b();
        }  
      m.b(arrayOfByte);
      arrayList.add(m);
    } 
    try {
      this.h.a(arrayList);
    } catch (o o) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, "Unable to publish DAQ List", (Throwable)o);
    } 
  }
  
  public void a(String paramString, byte[] paramArrayOfbyte) {
    if (paramString.equals(this.a.u())) {
      if (this.e == null || paramArrayOfbyte.length != this.e.length)
        this.e = new byte[paramArrayOfbyte.length]; 
      System.arraycopy(paramArrayOfbyte, 0, this.e, 0, paramArrayOfbyte.length);
      if (this.d != null)
        this.d.a(); 
    } 
  }
  
  public byte[] d() {
    byte[] arrayOfByte = new byte[this.b.c().d().a()];
    long l1 = this.c.w();
    if (this.f <= 0L)
      this.f = l1; 
    long l2 = l1 - this.f;
    this.f = l1;
    long l3 = (long)(l2 * Math.pow(10.0D, (this.b.c().d().c() - 9)));
    return c.a(l3, arrayOfByte, true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bS/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */