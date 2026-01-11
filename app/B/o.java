package B;

import A.a;
import A.b;
import A.l;
import A.s;
import G.l;
import bH.D;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o extends a {
  public static String b = "UDP - User Datagram Protocol";
  
  private int k = 0;
  
  private DatagramSocket l = null;
  
  String c = l.a();
  
  protected int d = l.b();
  
  private int m = 500;
  
  int e = 2000;
  
  p f = null;
  
  r g = null;
  
  List h = null;
  
  public static String i = "IP Address";
  
  public static String j = "Port";
  
  private boolean n = false;
  
  public void f() {
    if (k() == 3)
      throw new l("UDP Device already connected:" + y()); 
    if (k() == 2)
      throw new l("UDP Device already connecting:" + y()); 
    if (this.c == null || this.c.equals(""))
      throw new l("IP Address or host name not set! Can not open connection "); 
    if (this.d <= 0)
      throw new l("Invalid Port:" + this.d + " Can not open WiFi "); 
    b(2);
    c();
    try {
      D.c("Opening Connection to UDP Device: " + y());
      this.l = t();
      this.l.setSoTimeout(A());
      this.l.setTrafficClass(20);
      this.g = new r(this.l);
      this.f = new p(this.l, this.g);
      b(3);
      a();
    } catch (UnknownHostException unknownHostException) {
      b(0);
      b();
      throw new l("host not found:" + this.c + ":" + this.d + " Can not connect UDP Device");
    } catch (IOException iOException) {
      b(0);
      b();
      throw new l("Unable to connect to: " + this.c + ":" + this.d + ". Time out.");
    } catch (Exception exception) {
      b(0);
      b();
      Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new l("Unable to open device: " + exception.getLocalizedMessage() + ", " + y());
    } 
  }
  
  protected DatagramSocket t() {
    if (this.l == null || this.l.isClosed()) {
      this.l = new DatagramSocket(null);
      this.l.setBroadcast(true);
      if (this.n) {
        this.l.bind(new InetSocketAddress(InetAddress.getLocalHost(), this.d));
      } else {
        this.l.connect(new InetSocketAddress(InetAddress.getByName(this.c), this.d));
      } 
      System.out.println("Listen on " + this.l.getLocalAddress() + " from " + this.l.getInetAddress() + " port " + this.l.getPort());
    } 
    return this.l;
  }
  
  public boolean r() {
    D.d("Re-establishing connection to: " + n());
    boolean bool = false;
    if (k() == 3)
      try {
        if (this.l != null)
          try {
            this.l.close();
          } catch (Exception exception) {
            D.c("Error closing socket.");
          }  
        D.c("Refresh socket to UDP Device: " + y());
        this.l = t();
        this.g = new r(this.l);
        this.f = new p(this.l, this.g);
        bool = true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return bool;
  }
  
  protected void u() {
    if (this.f != null)
      try {
        this.f.close();
      } catch (Exception exception) {} 
    if (this.g != null)
      try {
        this.g.close();
      } catch (Exception exception) {} 
    this.f = null;
    this.g = null;
    this.l = null;
  }
  
  public void g() {
    try {
      if (this.l != null) {
        b(4);
        u();
        e();
        try {
          this.l.close();
          this.l = null;
        } catch (Exception exception) {
          D.c("Error closing UDP Connection");
        } 
      } 
    } finally {
      d();
      b(0);
    } 
  }
  
  public String h() {
    return b;
  }
  
  public InputStream i() {
    return this.f;
  }
  
  public OutputStream j() {
    return this.g;
  }
  
  public int k() {
    return this.k;
  }
  
  public List l() {
    if (this.h == null) {
      this.h = new ArrayList();
      b b1 = new b();
      b1.a(j);
      b1.b("UDP Port");
      b1.a(3);
      b1.b(0.0D);
      b1.a(20000.0D);
      this.h.add(b1);
      b b2 = new b();
      b2.a(i);
      b2.b("IP Address or host name of the target device");
      b2.a(1);
      this.h.add(b2);
    } 
    return this.h;
  }
  
  public void a(String paramString, Object paramObject) {
    try {
      if (paramString.equals(j)) {
        this.d = Integer.parseInt(paramObject.toString());
      } else if (paramString.equals(i)) {
        this.c = paramObject.toString();
      } else {
        D.c("Unknown Setting Name: " + paramString);
        throw new s("Unknown Setting Name: " + paramString);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new s(paramObject.toString() + "not a valid value for Setting: " + paramString);
    } 
  }
  
  public Object a(String paramString) {
    if (paramString.equals(j))
      return Integer.valueOf(this.d); 
    if (paramString.equals(i))
      return this.c; 
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }
  
  public void b(int paramInt) {
    this.k = paramInt;
    if (paramInt == 0)
      u(); 
  }
  
  protected String y() {
    return (this.l == null || this.l.getInetAddress() == null) ? n() : ("Connected IP Address:" + this.l.getInetAddress().getHostAddress() + ":" + this.l.getPort());
  }
  
  public boolean m() {
    return false;
  }
  
  public boolean a(int paramInt) {
    return false;
  }
  
  public String n() {
    return this.c + ":" + this.d;
  }
  
  public int o() {
    return 1500;
  }
  
  public int p() {
    return 1500;
  }
  
  public boolean q() {
    return true;
  }
  
  public int z() {
    if (this.l != null && !this.l.isClosed())
      try {
        this.l.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.d;
  }
  
  public int s() {
    return 2;
  }
  
  public int A() {
    return this.m;
  }
  
  public void c(int paramInt) {
    this.m = paramInt;
  }
  
  public void a(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  protected void a(DatagramSocket paramDatagramSocket) {
    this.l = paramDatagramSocket;
    if (this.g != null) {
      this.g.a(paramDatagramSocket);
      this.f.a(paramDatagramSocket);
      this.f.a(this.g);
    } 
    this.g = new r(paramDatagramSocket);
    this.f = new p(paramDatagramSocket, this.g);
    this.c = paramDatagramSocket.getInetAddress().getHostAddress();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */