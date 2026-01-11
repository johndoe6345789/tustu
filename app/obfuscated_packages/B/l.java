package B;

import A.a;
import A.b;
import A.s;
import bH.D;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TcpWifiConnection extends a {
  public static String b = "TCP/IP - WiFi driver";
  
  private int l = 0;
  
  private Socket m = null;
  
  String c = A.l.a();
  
  protected int d = A.l.b();
  
  int e = 2000;
  
  int f = 2000;
  
  InputStream g = null;
  
  OutputStream h = null;
  
  List i = null;
  
  public static String j = "IP Address";
  
  public static String k = "Port";
  
  public void f() {
    if (k() == 3)
      throw new G.l("TCP Device already connected:" + v()); 
    if (k() == 2)
      throw new G.l("TCP Device already connecting:" + v()); 
    if (this.c == null || this.c.equals(""))
      throw new G.l("IP Address or host name not set! Can not open Connection "); 
    if (this.d <= 0)
      throw new G.l("Invalid Port:" + this.d + " Can not open WiFi "); 
    b(2);
    c();
    try {
      D.c("Opening Connection to TCP Device: " + v());
      this.m = new Socket();
      this.m.setTcpNoDelay(true);
      this.m.setKeepAlive(true);
      this.m.setSoTimeout(this.e);
      this.m.setTrafficClass(20);
      this.m.connect(new InetSocketAddress(this.c, this.d), this.f);
      D.d("Connected to: " + this.m.toString());
      this.g = this.m.getInputStream();
      this.h = this.m.getOutputStream();
      b(3);
      a();
    } catch (UnknownHostException unknownHostException) {
      b(0);
      b();
      throw new G.l("host not found:" + this.c + ":" + this.d + " Can not connect TCP Device");
    } catch (IOException iOException) {
      b(0);
      b();
      throw new G.l("Unable to connect to: " + this.c + ":" + this.d + ". Time out.");
    } catch (Exception exception) {
      b(0);
      b();
      Logger.getLogger(TcpWifiConnection.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new G.l("Unable to open device: " + exception.getLocalizedMessage() + ", " + v());
    } 
  }
  
  public boolean r() {
    D.d("Re-establishing connection to: " + n());
    boolean bool = false;
    if (k() == 3)
      try {
        if (this.m != null)
          try {
            this.m.close();
          } catch (IOException iOException) {
            D.c("Error closing socket.");
          }  
        D.c("Refresh socket to TCP Device: " + v());
        this.m = new Socket();
        this.m.connect(new InetSocketAddress(this.c, this.d), this.f);
        this.m.setSoTimeout(this.e);
        this.m.setTcpNoDelay(true);
        this.g = this.m.getInputStream();
        this.h = this.m.getOutputStream();
        bool = true;
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return bool;
  }
  
  protected void t() {
    if (this.g != null)
      try {
        this.g.close();
      } catch (Exception exception) {} 
    if (this.h != null)
      try {
        this.h.close();
      } catch (Exception exception) {} 
    this.g = null;
    this.h = null;
    this.m = null;
  }
  
  public void g() {
    try {
      if (this.m != null) {
        b(4);
        e();
        try {
          this.m.close();
          d();
          this.m = null;
        } catch (Exception exception) {
          D.c("Error closing TCP Connection");
          Logger.getLogger(TcpWifiConnection.class.getName()).log(Level.SEVERE, (String)null, exception);
        } 
      } 
    } finally {
      b(0);
    } 
  }
  
  public String h() {
    return b;
  }
  
  public InputStream i() {
    return this.g;
  }
  
  protected void a(InputStream paramInputStream) {
    this.g = paramInputStream;
  }
  
  public OutputStream j() {
    return this.h;
  }
  
  protected void a(OutputStream paramOutputStream) {
    this.h = paramOutputStream;
  }
  
  protected void a(Socket paramSocket) {
    this.m = paramSocket;
    this.c = paramSocket.getInetAddress().getHostAddress();
  }
  
  public int k() {
    return this.l;
  }
  
  public List l() {
    if (this.i == null) {
      this.i = new ArrayList();
      b b1 = new b();
      b1.a(k);
      b1.b("TCP IP Port");
      b1.a(3);
      b1.b(0.0D);
      b1.a(20000.0D);
      this.i.add(b1);
      b b2 = new b();
      b2.a(j);
      b2.b("IP Address or host name of ECU Adapter");
      b2.a(1);
      this.i.add(b2);
    } 
    return this.i;
  }
  
  public void a(String paramString, Object paramObject) {
    try {
      if (paramString.equals(k)) {
        this.d = Integer.parseInt(paramObject.toString());
      } else if (paramString.equals(j)) {
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
    if (paramString.equals(k))
      return Integer.valueOf(this.d); 
    if (paramString.equals(j))
      return this.c; 
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }
  
  public void b(int paramInt) {
    this.l = paramInt;
    if (paramInt == 0)
      t(); 
  }
  
  private String v() {
    return (this.m == null || this.m.getInetAddress() == null) ? n() : ("Connected IP Address:" + this.m.getInetAddress().getHostAddress() + ":" + this.m.getPort());
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
  
  public int u() {
    return this.d;
  }
  
  public int s() {
    return 2;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */