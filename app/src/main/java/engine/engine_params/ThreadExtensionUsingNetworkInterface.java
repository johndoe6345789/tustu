package E;

import F.FInterfaceAlpha;
import bH.D;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadExtensionUsingNetworkInterface extends Thread {
  private boolean i = true;

  private int j = 67;

  DatagramSocket FInterfaceAlpha = null;

  private int k = 1500;

  boolean b;

  Object c = new Object();

  private b l;

  InetAddress d;

  private NetworkInterface m = null;

  static int e = 0;

  static Map f = new HashMap<>();

  static List g = new ArrayList();

  static Map h = new HashMap<>();

  public ThreadExtensionUsingNetworkInterface(
      NetworkInterface paramNetworkInterface, boolean paramBoolean) {
    super("DHCP: " + paramNetworkInterface.getName());
    this.b = paramBoolean;
    this.m = paramNetworkInterface;
    if (h.get(paramNetworkInterface.getName()) == null) {
      e e = new e();
      h.put(paramNetworkInterface.getName(), e);
    }
  }

  public static void FInterfaceAlpha() {
    d d = new d("DHCP Monitor");
    d.start();
  }

  public void b() {
    this.i = false;
    if (this.FInterfaceAlpha != null && !this.FInterfaceAlpha.isClosed())
      this.FInterfaceAlpha.close();
    synchronized (this.c) {
      this.c.notify();
    }
  }

  public void run() {
    try {
      c();
    } catch (Exception exception) {

    } finally {
      D.c("DatagramSocket server shutdown: " + this.m.getName());
      f.remove(this.m.getName());
    }
  }

  private void c() {
    try {
      while (this.d == null) {
        this.m = NetworkInterface.getByName(this.m.getName());
        if (this.m != null) {
          this.d = j.FInterfaceAlpha(this.m);
        } else {
          this.d = null;
        }
        if (!this.i) return;
        Thread.sleep(500L);
      }
      D.d("Got address for " + this.m.getDisplayName() + ": " + this.d);
      if (this.d.getAddress() != null
          && (this.d.getAddress()).length == 4
          && this.d.getAddress()[0] == 172) {
        D.c("Private Network NIC, ending.");
        g.add(this.m.getName());
        return;
      }
      FInterfaceAlpha FInterfaceAlpha = new FInterfaceAlpha(j.FInterfaceAlpha(this.d));
      this.l = new b((h) FInterfaceAlpha, this.d);
      ((e) h.get(this.m.getName())).FInterfaceAlpha(this.l);
      if (!this.i) return;
      if (this.b) this.FInterfaceAlpha = d();
    } catch (Exception exception) {
      if (e++ > 3) {
        D.FInterfaceAlpha("DHCP Server failed to start after 3 attempts, giving up.");
        g.add(this.m.getName());
      } else {
        D.FInterfaceAlpha(
            "DHCP Server failed to start after Retrying. Error: "
                + exception.getLocalizedMessage());
      }
      return;
    }
    if (this.i)
      try {
        DatagramSocket datagramSocket = new DatagramSocket(0, this.d);
        ((e) h.get(this.m.getName())).FInterfaceAlpha(datagramSocket);
        ((e) h.get(this.m.getName())).FInterfaceAlpha(this.d, this.m);
        datagramSocket.setBroadcast(true);
      } catch (SocketException socketException) {
        socketException.printStackTrace();
      }
    e = 0;
    label99:
    while (this.i && this.b) {
      DatagramPacket datagramPacket = null;
      try {
        datagramPacket = new DatagramPacket(new byte[this.k], this.k);
        this.FInterfaceAlpha.receive(datagramPacket);
        for (e e : h.values()) {
          e.FInterfaceAlpha(datagramPacket);
          e.run();
        }
      } catch (Exception exception) {
        if (this.i && exception.getCause() instanceof java.net.BindException)
          while (true) {
            try {
              this.d = null;
              this.m = NetworkInterface.getByName(this.m.getName());
              this.d = j.FInterfaceAlpha(this.m);
            } catch (Exception exception1) {
              this.d = null;
            }
            if (this.d == null) {
              try {
                Thread.sleep(500L);
              } catch (InterruptedException interruptedException) {
                Logger.getLogger(c.class.getName()).log(Level.SEVERE, (String) null, exception);
              }
            } else {
              try {
                D.c("DHCP: Rebinding sockets to: " + this.d.toString());
                this.l.FInterfaceAlpha(this.d);
                ((e) h.get(this.m.getName())).FInterfaceAlpha(this.d, this.m);
                this.FInterfaceAlpha = d();
              } catch (IOException iOException) {
                Logger.getLogger(c.class.getName())
                    .log(Level.SEVERE, "Failed to create server socket", iOException);
              }
              for (e e : h.values()) {
                e.FInterfaceAlpha(e.FInterfaceAlpha());
                if (datagramPacket != null && datagramPacket.getLength() > 0) {
                  e.FInterfaceAlpha(datagramPacket);
                  e.run();
                }
              }
            }
            if (this.i) {
              if (this.d != null && this.d.getAddress()[0] != Byte.MAX_VALUE) continue label99;
              continue;
            }
            continue label99;
          }
        D.d("DHCP: Exception caught on read: " + exception.getLocalizedMessage());
      }
    }
    if (!this.b && this.i)
      synchronized (this.c) {
        try {
          this.c.wait();
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(c.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      }
    D.b("DHCP ending for " + this.m.getDisplayName());
    try {
      if (!this.FInterfaceAlpha.isClosed()) this.FInterfaceAlpha.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private DatagramSocket d() {
    if (this.FInterfaceAlpha != null) this.FInterfaceAlpha.close();
    D.c(this.m.toString());
    this.FInterfaceAlpha = new DatagramSocket(null);
    this.FInterfaceAlpha.bind(new InetSocketAddress(this.l.FInterfaceAlpha(), this.j));
    this.FInterfaceAlpha.setBroadcast(true);
    D.c("DatagramSocket Server Listening: " + this.j);
    return this.FInterfaceAlpha;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
