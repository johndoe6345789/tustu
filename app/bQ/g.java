package bQ;

import G.J;
import bH.D;
import bH.c;
import bN.f;
import bN.l;
import bN.t;
import bN.u;
import bS.h;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class g implements f {
  long a = 0L;
  
  g(f paramf) {}
  
  public void a(t paramt) {
    if (paramt instanceof l) {
      i i = (i)this.b.j.get(Integer.valueOf(paramt.a()));
      if (i != null) {
        try {
          i.a(f.a(this.b), this.b.c, paramt);
        } catch (h h) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)h);
        } 
      } else {
        synchronized (f.b(this.b)) {
          f.b(this.b).add(paramt);
        } 
        synchronized (this.b.i) {
          this.b.i.notifyAll();
        } 
      } 
      if (f.c(this.b) != null)
        f.c(this.b).f(); 
    } else {
      if (f.d(this.b) != null && f.d(this.b).a(this.b.c, paramt)) {
        try {
          f.d(this.b).a(f.a(this.b), this.b.c, paramt);
        } catch (h h) {
          Logger.getLogger(f.class.getName()).log(Level.WARNING, "Unable to process DAQ Message", (Throwable)h);
        } 
      } else {
        if (J.I())
          D.b("Received DTO Type Packet that is unknown? DAQ Running before started?\n" + c.d(paramt.d())); 
        if (System.currentTimeMillis() - this.a > 3000L)
          this.a = System.currentTimeMillis(); 
      } 
      if (f.c(this.b) != null)
        f.c(this.b).k(); 
    } 
    if (this.b.a != null)
      this.b.a.b(); 
  }
  
  public void a(int paramInt, String paramString) {
    D.a("Message validation error: 0x" + Integer.toHexString(paramInt).toUpperCase() + ", message:" + paramString);
    l l = u.a().b();
    this.b.b.b();
    l.a(254);
    byte[] arrayOfByte = new byte[(paramString.getBytes()).length + 1];
    arrayOfByte[0] = (byte)paramInt;
    System.arraycopy(paramString.getBytes(), 0, arrayOfByte, 1, arrayOfByte.length - 1);
    synchronized (f.b(this.b)) {
      f.b(this.b).add(l);
    } 
    synchronized (this.b.i) {
      this.b.i.notifyAll();
    } 
  }
  
  public void a(IOException paramIOException) {}
  
  public void a() {
    f.a(this.b, (f.a(this.b) != null) ? f.a(this.b).u() : null);
  }
  
  public void b() {
    f.b(this.b, (f.a(this.b) != null) ? f.a(this.b).u() : null);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */