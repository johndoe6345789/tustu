package aj;

import G.J;
import G.f;
import bH.D;
import bH.c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkDatagramSocketInAjPackage extends d {
  private int t = 28555;
  
  private String u;
  
  private DatagramSocket v;
  
  byte[] p = new byte[5000];
  
  private byte[] w = null;
  
  private byte[] x = null;
  
  private final List y = new ArrayList();
  
  l q = null;
  
  m r = null;
  
  f s = new f();
  
  public NetworkDatagramSocketInAjPackage(String paramString) {
    this.u = paramString;
  }
  
  public void b() {
    if (d)
      return; 
    d = true;
    if (this.q != null)
      this.q.a(); 
    e();
    this.q = new l(this);
    this.q.start();
  }
  
  public void b(String paramString) {
    if (paramString != null) {
      this.w = d(paramString)[0];
    } else {
      this.w = null;
    } 
  }
  
  public void c(String paramString) {
    if (paramString != null) {
      this.x = d(paramString)[0];
    } else {
      this.x = null;
    } 
  }
  
  protected void e() {
    if (this.w != null) {
      try {
        DatagramPacket datagramPacket = new DatagramPacket(this.w, this.w.length, n(), l());
        if (J.I())
          D.c("Sending UDP Logger start command to " + n() + ":" + l() + ":\n" + c.d(this.w)); 
        k().send(datagramPacket);
        if (J.I())
          D.c("UDP Logger start command successfully sent."); 
      } catch (UnknownHostException unknownHostException) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Unable to connect to UDP server", unknownHostException);
      } catch (SocketException socketException) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Unable to connect to UDP server", socketException);
      } catch (IOException iOException) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, "Unable to connect to UDP server", iOException);
      } 
    } else {
      D.b("No Start Commad Set!");
    } 
  }
  
  private InetAddress n() {
    return InetAddress.getByName(m());
  }
  
  public void c() {
    if (this.q != null)
      this.q.a(); 
    if (this.x != null) {
      try {
        DatagramPacket datagramPacket = new DatagramPacket(this.x, this.x.length, n(), l());
        k().send(datagramPacket);
        Thread.sleep(40L);
      } catch (UnknownHostException unknownHostException) {
        Logger.getLogger(k.class.getName()).log(Level.WARNING, "Unable to connect to UDP server", unknownHostException);
      } catch (SocketException socketException) {
        Logger.getLogger(k.class.getName()).log(Level.WARNING, "Unable to connect to UDP server", socketException);
      } catch (IOException iOException) {
        Logger.getLogger(k.class.getName()).log(Level.WARNING, "Unable to connect to UDP server", iOException);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(k.class.getName()).log(Level.INFO, "Sleep failed.", interruptedException);
      } 
    } else {
      D.b("No Stop Command Set!");
    } 
    try {
      k().close();
    } catch (UnknownHostException unknownHostException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, unknownHostException);
    } catch (SocketException socketException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, socketException);
    } 
    this.v = null;
    d = false;
    if (this.r != null)
      this.r.a(); 
  }
  
  public void a() {
    if (this.q != null) {
      this.q.a();
      this.q = null;
    } 
    this.w = null;
    this.x = null;
    this.v = null;
  }
  
  protected DatagramSocket k() {
    if (this.v == null || this.v.isClosed()) {
      this.v = new DatagramSocket(null);
      this.v.setBroadcast(true);
      this.v.connect(new InetSocketAddress(n(), this.t));
      System.out.println("Listen on " + this.v.getLocalAddress() + " from " + this.v.getInetAddress() + " port " + this.v.getPort());
    } 
    return this.v;
  }
  
  private void o() {
    if (k() != null) {
      byte[] arrayOfByte = this.s.b(5000);
      DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, 5000);
      k().receive(datagramPacket);
      this.y.add(datagramPacket);
      synchronized (this.y) {
        this.y.notify();
      } 
    } else {
      throw new IOException("UDP Logger Socket closed");
    } 
  }
  
  private byte[] p() {
    if (this.r == null || !this.r.isAlive()) {
      this.r = new m(this);
      this.r.start();
    } 
    if (this.y.isEmpty())
      synchronized (this.y) {
        try {
          this.y.wait();
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(k.class.getName()).log(Level.INFO, "Hmmm", interruptedException);
        } 
      }  
    if (this.y.isEmpty()) {
      D.b("Waited, but packetStack is still empty.");
      throw new IOException("Waited, but packetStack is still empty.");
    } 
    DatagramPacket datagramPacket = this.y.remove(0);
    byte[] arrayOfByte = this.s.b(datagramPacket.getLength());
    System.arraycopy(datagramPacket.getData(), 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  private void q() {
    byte[] arrayOfByte = p();
    int[] arrayOfInt = c.b(arrayOfByte);
    this.s.a(arrayOfByte);
    if (J.I())
      D.c("Received UDP Logger Packet:\n" + c.b(arrayOfInt)); 
    a(arrayOfInt);
  }
  
  public int l() {
    return this.t;
  }
  
  public void d(int paramInt) {
    this.t = paramInt;
  }
  
  public String m() {
    return this.u;
  }
  
  public void h(String paramString) {
    this.u = paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aj/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */