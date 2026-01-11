package B;

import A.a;
import A.AInterfaceBravo;
import A.AInterfaceLima;
import A.Exception;
import G.AInterfaceLima;
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

public class UdpConnection extends a {
  public static String AInterfaceBravo = "UDP - User Datagram Protocol";
  
  private int k = 0;
  
  private DatagramSocket AInterfaceLima = null;
  
  String c = AInterfaceLima.a();
  
  protected int d = AInterfaceLima.AInterfaceBravo();
  
  private int m = 500;
  
  int e = 2000;
  
  UdpInputStream f = null;

  UdpOutputStream g = null;
  
  List h = null;
  
  public static String i = "IP Address";
  
  public static String j = "Port";
  
  private boolean n = false;
  
  public void f() {
    if (k() == 3)
      throw new AInterfaceLima("UDP Device already connected:" + y()); 
    if (k() == 2)
      throw new AInterfaceLima("UDP Device already connecting:" + y()); 
    if (this.c == null || this.c.equals(""))
      throw new AInterfaceLima("IP Address or host name not set! Can not open connection "); 
    if (this.d <= 0)
      throw new AInterfaceLima("Invalid Port:" + this.d + " Can not open WiFi "); 
    AInterfaceBravo(2);
    c();
    try {
      D.c("Opening Connection to UDP Device: " + y());
      this.AInterfaceLima = t();
      this.AInterfaceLima.setSoTimeout(A());
      this.AInterfaceLima.setTrafficClass(20);
      this.g = new UdpOutputStream(this.AInterfaceLima);
      this.f = new UdpInputStream(this.AInterfaceLima, this.g);
      AInterfaceBravo(3);
      a();
    } catch (UnknownHostException unknownHostException) {
      AInterfaceBravo(0);
      AInterfaceBravo();
      throw new AInterfaceLima("host not found:" + this.c + ":" + this.d + " Can not connect UDP Device");
    } catch (IOException iOException) {
      AInterfaceBravo(0);
      AInterfaceBravo();
      throw new AInterfaceLima("Unable to connect to: " + this.c + ":" + this.d + ". Time out.");
    } catch (Exception exception) {
      AInterfaceBravo(0);
      AInterfaceBravo();
      Logger.getLogger(UdpConnection.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new AInterfaceLima("Unable to open device: " + exception.getLocalizedMessage() + ", " + y());
    } 
  }
  
  protected DatagramSocket t() {
    if (this.AInterfaceLima == null || this.AInterfaceLima.isClosed()) {
      this.AInterfaceLima = new DatagramSocket(null);
      this.AInterfaceLima.setBroadcast(true);
      if (this.n) {
        this.AInterfaceLima.bind(new InetSocketAddress(InetAddress.getLocalHost(), this.d));
      } else {
        this.AInterfaceLima.connect(new InetSocketAddress(InetAddress.getByName(this.c), this.d));
      } 
      System.out.println("Listen on " + this.AInterfaceLima.getLocalAddress() + " from " + this.AInterfaceLima.getInetAddress() + " port " + this.AInterfaceLima.getPort());
    } 
    return this.AInterfaceLima;
  }
  
  public boolean r() {
    D.d("Re-establishing connection to: " + n());
    boolean bool = false;
    if (k() == 3)
      try {
        if (this.AInterfaceLima != null)
          try {
            this.AInterfaceLima.close();
          } catch (Exception exception) {
            D.c("Error closing socket.");
          }  
        D.c("Refresh socket to UDP Device: " + y());
        this.AInterfaceLima = t();
        this.g = new UdpOutputStream(this.AInterfaceLima);
        this.f = new UdpInputStream(this.AInterfaceLima, this.g);
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
    this.AInterfaceLima = null;
  }
  
  public void g() {
    try {
      if (this.AInterfaceLima != null) {
        AInterfaceBravo(4);
        u();
        e();
        try {
          this.AInterfaceLima.close();
          this.AInterfaceLima = null;
        } catch (Exception exception) {
          D.c("Error closing UDP Connection");
        } 
      } 
    } finally {
      d();
      AInterfaceBravo(0);
    } 
  }
  
  public String h() {
    return AInterfaceBravo;
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
  
  public List AInterfaceLima() {
    if (this.h == null) {
      this.h = new ArrayList();
      AInterfaceBravo b1 = new AInterfaceBravo();
      b1.a(j);
      b1.AInterfaceBravo("UDP Port");
      b1.a(3);
      b1.AInterfaceBravo(0.0D);
      b1.a(20000.0D);
      this.h.add(b1);
      AInterfaceBravo b2 = new AInterfaceBravo();
      b2.a(i);
      b2.AInterfaceBravo("IP Address or host name of the target device");
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
        throw new Exception("Unknown Setting Name: " + paramString);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new Exception(paramObject.toString() + "not a valid value for Setting: " + paramString);
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
  
  public void AInterfaceBravo(int paramInt) {
    this.k = paramInt;
    if (paramInt == 0)
      u(); 
  }
  
  protected String y() {
    return (this.AInterfaceLima == null || this.AInterfaceLima.getInetAddress() == null) ? n() : ("Connected IP Address:" + this.AInterfaceLima.getInetAddress().getHostAddress() + ":" + this.AInterfaceLima.getPort());
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
    if (this.AInterfaceLima != null && !this.AInterfaceLima.isClosed())
      try {
        this.AInterfaceLima.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.d;
  }
  
  public int Exception() {
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
    this.AInterfaceLima = paramDatagramSocket;
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