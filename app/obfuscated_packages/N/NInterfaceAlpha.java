package N;

import G.R;
import G.T;
import bH.D;
import bS.BsInterfaceLima;
import bS.BsInterfaceOscar;
import bS.BsInterfaceRomeo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NInterfaceAlpha {
  R a;
  
  BsInterfaceLima b = new BsInterfaceLima();
  
  List c = new ArrayList();
  
  c d = new c(this);
  
  private static final Map e = new HashMap<>();
  
  private boolean f = false;
  
  private static d g = null;
  
  private NInterfaceAlpha(R paramR) {
    this.a = paramR;
    g();
    this.b.a(this.d);
    if (g == null) {
      g = new d(this);
      T.a().a(g);
    } 
  }
  
  public synchronized void a() {
    this.b.a();
    D.d("Slave Server Activated for: " + this.a.c());
  }
  
  public int b() {
    return this.b.d();
  }
  
  public static void c() {
    for (a a1 : e.values())
      a1.d(); 
  }
  
  public synchronized void d() {
    this.b.b();
    for (b b : (b[])this.c.toArray((Object[])new b[this.c.size()])) {
      b.f().b();
      b.g().g();
    } 
    this.c.clear();
    D.d("Slave Server Deactivated for: " + this.a.c());
  }
  
  public static a a(R paramR) {
    a a1 = (a)e.get(paramR.c());
    if (a1 == null) {
      a1 = new a(paramR);
      e.put(paramR.c(), a1);
    } 
    return a1;
  }
  
  private void g() {}
  
  public void a(BsInterfaceRomeo paramr) {
    this.b.a(paramr);
  }
  
  private void b(BsInterfaceRomeo paramr) {
    BsInterfaceOscar BsInterfaceOscar;
    D.d("New Client Connection for Config: " + this.a.c() + ", connection info: " + paramr.n());
    try {
      BsInterfaceOscar = new BsInterfaceOscar(this.a, paramr);
    } catch (IOException iOException) {
      try {
        paramr.g();
      } catch (Exception exception) {
        Logger.getLogger(a.class.getName()).log(Level.WARNING, "Error Closing bad connection", iOException);
      } 
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to create server for connection. Closing Conneciton.", iOException);
      return;
    } 
    b b = new b(this, BsInterfaceOscar, paramr);
    paramr.a(b);
    this.c.add(b);
  }
  
  private void a(b paramb) {
    paramb.g().b(paramb);
    this.c.remove(paramb);
  }
  
  public boolean e() {
    return this.f;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/N/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */