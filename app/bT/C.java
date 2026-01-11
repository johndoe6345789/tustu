package bT;

import bH.D;
import bH.c;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import bU.a;
import bU.b;
import bU.c;
import bU.d;
import bU.e;
import bU.f;
import bU.g;
import bU.h;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C implements a {
  Map a = new HashMap<>();
  
  public C() {
    g g = new g();
    this.a.put(Integer.valueOf(g.a()), g);
    a a1 = new a();
    this.a.put(Integer.valueOf(a1.a()), a1);
    c c = new c();
    this.a.put(Integer.valueOf(c.a()), c);
    d d = new d();
    this.a.put(Integer.valueOf(d.a()), d);
    e e = new e();
    this.a.put(Integer.valueOf(e.a()), e);
    b b = new b();
    this.a.put(Integer.valueOf(b.a()), b);
    f f = new f();
    this.a.put(Integer.valueOf(f.a()), f);
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    try {
      int i = c.a(arrayOfByte[0]);
      h h = (h)this.a.get(Integer.valueOf(i));
      if (h == null) {
        l l = u.a().b();
        l.a(254);
        D.a("USER_COMMAND: No Sub handler for sub command code 0x" + Integer.toHexString(i).toUpperCase());
        paramo.a((t)l);
      } else {
        byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
        System.arraycopy(arrayOfByte, 1, arrayOfByte1, 0, arrayOfByte1.length);
        ((l)paramt).b(arrayOfByte1);
        ((l)paramt).a(i);
        h.a(paramo, paramt);
      } 
    } catch (o o1) {
      Logger.getLogger(z.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
  
  public int a() {
    return 241;
  }
  
  public h a(int paramInt) {
    return (h)this.a.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */