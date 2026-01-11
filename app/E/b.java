package E;

import bW.e;
import bW.f;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
  private static final Logger a = Logger.getLogger("DHCPProcessor");
  
  private final h b;
  
  private InetAddress c = null;
  
  private String d;
  
  public b(h paramh, InetAddress paramInetAddress) {
    this.b = paramh;
    this.d = j.a();
    this.c = paramInetAddress;
  }
  
  public e a(e parame) {
    a.info("Receive Discover from " + parame.d() + " Request IP " + parame.e().toString());
    g g = this.b.a(parame.d());
    if (g == null)
      return null; 
    if (this.d != null && parame.i((byte)12) && parame.g((byte)12).equalsIgnoreCase(this.d))
      try {
        return d(parame, g);
      } catch (UnknownHostException unknownHostException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, unknownHostException);
        return null;
      }  
    return b(parame, g);
  }
  
  public e b(e parame) {
    System.out.println("Receive Request from " + parame.d() + " Request IP " + parame.e().toString() + " Serve host " + parame.p());
    g g = null;
    if (this.d != null && parame.i((byte)12) && parame.g((byte)12).equalsIgnoreCase(this.d)) {
      if (this.b instanceof F.a);
      g = a(j.a(parame.e()));
      if (g == null)
        return c(parame); 
      try {
        return c(parame, g);
      } catch (UnknownHostException unknownHostException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, unknownHostException);
        return null;
      } 
    } 
    boolean bool = true;
    if (!parame.p().equals(this.c) && this.b.e(parame.d())) {
      bool = this.b.d(parame.e().toString());
      this.b.c(parame.d());
    } 
    if (bool) {
      g = this.b.b(parame.d());
    } else {
      g = this.b.a(parame.d());
    } 
    return (g == null) ? c(parame) : a(parame, g);
  }
  
  public e c(e parame) {
    return f.a(parame, this.c, "");
  }
  
  private e a(e parame, g paramg) {
    a a = new a();
    a.a((byte)1, paramg.b());
    a.a((byte)3, paramg.c());
    InetAddress inetAddress = paramg.a();
    e e1 = f.b(parame, inetAddress, paramg.d(), this.c, "", a.a());
    e1.a(this.c);
    return e1;
  }
  
  private e b(e parame, g paramg) {
    a a = new a();
    a.a((byte)1, paramg.b());
    a.a((byte)51, paramg.d());
    InetAddress inetAddress = paramg.a();
    e e1 = f.a(parame, inetAddress, paramg.d(), this.c, "", a.a());
    e1.a(this.c);
    return e1;
  }
  
  private e c(e parame, g paramg) {
    a a = new a();
    a.a((byte)1, paramg.b());
    a.a((byte)3, paramg.c());
    byte[] arrayOfByte = { -64, -88, 99, 1 };
    InetAddress inetAddress = InetAddress.getByAddress(this.d, arrayOfByte);
    if (this.c != null)
      inetAddress = this.c; 
    e e1 = f.b(parame, inetAddress, paramg.d(), this.c, "", a.a());
    e1.a(inetAddress);
    return e1;
  }
  
  private e d(e parame, g paramg) {
    byte[] arrayOfByte = { -64, -88, 99, 1 };
    InetAddress inetAddress = InetAddress.getByAddress(this.d, arrayOfByte);
    if (this.c != null)
      inetAddress = this.c; 
    a a = new a();
    a.a((byte)1, paramg.b());
    a.a((byte)3, paramg.c());
    a.a((byte)51, paramg.d());
    a.a((byte)54, inetAddress);
    a.a((byte)54, InetAddress.getLoopbackAddress());
    e e1 = f.a(parame, inetAddress, paramg.d(), inetAddress, "", a.a());
    e1.a(inetAddress);
    e1.a(InetAddress.getLoopbackAddress());
    e1.a((byte)54, inetAddress);
    return e1;
  }
  
  private g a(String paramString) {
    g g = new g();
    g.d(this.b.d());
    g.c(this.b.b());
    g.a(paramString);
    g.b(this.b.a());
    g.a(this.b.c());
    return g;
  }
  
  public e d(e parame) {
    a.info("Receive Inform from " + parame.d());
    return null;
  }
  
  public e e(e parame) {
    a.info("Receive Decline from " + parame.d());
    return null;
  }
  
  public e f(e parame) {
    a.info("Receive Release from " + parame.d() + " Request IP " + parame.e().toString());
    this.b.c(parame.d());
    return null;
  }
  
  public InetAddress a() {
    return this.c;
  }
  
  public void a(InetAddress paramInetAddress) {
    this.c = paramInetAddress;
  }
  
  public h b() {
    return this.b;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */