package E;

import bH.D;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkLogger implements f {
  private static Logger b = Logger.getLogger(e.class.getName());

  private DatagramPacket c = null;

  private b d = null;

  private DatagramSocket e = null;

  private String f = j.a();

  private InetAddress g = null;

  static List a = new ArrayList();

  public void a(b paramb) {
    this.d = paramb;
  }

  public void run() {
    try {
      bW.e e1 = bW.e.a(this.c);
      bW.e e2 = null;
      long l = Long.parseLong(e1.d(), 16);
      if (!a(l) && (l < 123917681614848L || l > 123917681623039L)) {
        System.out.println("DHCP Request received from unserviced range, Ignoring:\n" + e1.d());
        return;
      }
      boolean bool =
          (this.d.b().e().startsWith("169.") || this.g.getAddress()[3] == 1) ? true : false;
      if (!e1.n()) return;
      Byte byte_ = e1.w();
      if (e1.o() == 1)
        switch (byte_.byteValue()) {
          case 1:
            if (a(l) || !bool) {
              D.c(
                  "DHCP: "
                      + this.g
                      + " Discover received by local or offer Not Allowed, ignoring: "
                      + e1.d());
              return;
            }
            D.c("DHCP: " + this.g + " Discover received from: " + e1.d());
            e2 = this.d.a(e1);
            break;
          case 3:
            if (!bool) {
              D.c("DHCP: " + this.g + " Request received, ignoring not ready for offer: " + e1.d());
              return;
            }
            if (a(l)) {
              D.c("DHCP: " + this.g + " Request received from local MAC, Declining " + e1.d());
              e2 = this.d.c(e1);
              break;
            }
            D.c("DHCP: " + this.g + " Request received from: " + e1.d());
            e2 = this.d.b(e1);
            break;
          case 8:
            D.c("DHCP: " + this.g + " Inform received from: " + e1.d());
            e2 = this.d.d(e1);
            break;
          case 4:
            D.c("DHCP: " + this.g + " Decline received from: " + e1.d());
            e2 = this.d.e(e1);
            break;
          case 7:
            D.c("DHCP: " + this.g + " Release received from: " + e1.d());
            e2 = this.d.f(e1);
            break;
          default:
            b.info("Unsupported message type " + byte_);
            break;
        }
      if (e2 != null) {
        InetAddress inetAddress = e2.y();
        int i = e2.z();
        byte[] arrayOfByte = e2.b();
        DatagramPacket datagramPacket =
            new DatagramPacket(arrayOfByte, arrayOfByte.length, inetAddress, i);
        D.c(
            "DHCP: "
                + this.g
                + " Send Datagram to "
                + datagramPacket.getAddress()
                + " Assign IP "
                + e2.u()
                + " Server IP "
                + e2.p()
                + " Lease time "
                + e2.f((byte) 51));
        this.e.send(datagramPacket);
      }
      if (a(l))
        ;
    } catch (Exception exception) {
      D.a("Failed to send response from: " + this.g);
      throw new RuntimeException(exception);
    } finally {
    }
  }

  public void a(DatagramPacket paramDatagramPacket) {
    this.c = paramDatagramPacket;
  }

  public void a(DatagramSocket paramDatagramSocket) {
    this.e = paramDatagramSocket;
  }

  protected DatagramSocket a() {
    if (this.e != null) this.e.close();
    try {
      Thread.sleep(20L);
      DatagramSocket datagramSocket = new DatagramSocket(0, this.g);
      datagramSocket.setBroadcast(true);
      return datagramSocket;
    } catch (SocketException socketException) {
      socketException.printStackTrace();
      return null;
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      return null;
    }
  }

  public void a(InetAddress paramInetAddress, NetworkInterface paramNetworkInterface) {
    D.d("Setting Local Address to: " + paramInetAddress);
    this.g = paramInetAddress;
    long l = j.b(paramNetworkInterface);
    a.add(Long.valueOf(l));
    this.d.a(paramInetAddress);
    if (paramInetAddress == null) D.c("null localAddress");
  }

  private boolean a(long paramLong) {
    Iterator<Long> iterator = a.iterator();
    while (iterator.hasNext()) {
      long l = ((Long) iterator.next()).longValue();
      if (l == paramLong) return true;
    }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
