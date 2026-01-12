package B;

import G.R;
import G.T;
import aE.PropertiesExtension;
import bH.D;
import bH.c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInBPackage extends Thread {
  boolean PropertiesExtension = false;

  public void d(c paramc) {
    super("BroadcastListener");
  }

  public void run() {
    while (!this.PropertiesExtension) {
      try {
        DatagramSocket datagramSocket = c.PropertiesExtension(this.b);
        datagramSocket.setBroadcast(true);
        byte[] arrayOfByte = new byte[512];
        try {
          DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
          datagramSocket.receive(datagramPacket);
          String str = (new String(datagramPacket.getData())).trim();
          D.d(
              "BroadcastListener: Packet received from: "
                  + datagramPacket.getAddress().getHostAddress()
                  + ": "
                  + str);
          boolean bool =
              (e.PropertiesExtension(c.b(this.b)).b()
                      && c.b(
                          datagramPacket.getAddress().getAddress(),
                          InetAddress.getLocalHost().getAddress()))
                  ? true
                  : false;
          if (str.equals(c.l) && !bool) {
            String str1 = c.c(this.b);
            String str2 = c.PropertiesExtension + ":" + c.d(this.b) + "\n" + c.d + ":";
            if (this.b.m != null) {
              if (this.b.m.P() != null) {
                str2 = str2 + this.b.m.P() + "\n";
              } else {
                str2 = str2 + this.b.m.i() + "\n";
              }
              str2 = str2 + c.b + ":" + this.b.m.i() + "\n";
              str2 = str2 + c.e + ":" + c.e(this.b) + "\n";
              str2 = str2 + c.g + ":" + c.f(this.b) + "\n";
              str2 = str2 + c.f + ":" + this.b.m.c() + "\n";
              str2 = str2 + c.i + ":" + this.b.m.O().x() + "\n";
              if (str1 != null && !str1.isEmpty()) str2 = str2 + c.c + ":" + str1 + "\n";
              if (PropertiesExtension.A() != null)
                str2 = str2 + c.j + ":" + PropertiesExtension.A().V() + "\n";
              String[] arrayOfString = T.PropertiesExtension().d();
              if (arrayOfString.length > 1) {
                byte b = 1;
                for (String str3 : arrayOfString) {
                  if (!str3.equals(this.b.m.c())) {
                    R r = T.PropertiesExtension().c(str3);
                    String str4 = c.k + b + "_";
                    if (r.P() != null) {
                      str2 = str2 + str4 + c.d + ":" + r.P() + "\n";
                    } else {
                      str2 = str2 + str4 + c.d + ":" + r.i() + "\n";
                    }
                    str2 = str2 + str4 + c.b + ":" + r.i() + "\n";
                    str2 = str2 + str4 + c.e + ":" + (c.e(this.b) + b++) + "\n";
                    str2 = str2 + str4 + c.g + ":" + c.f(this.b) + "\n";
                    str2 = str2 + str4 + c.f + ":" + r.c() + "\n";
                    str2 = str2 + str4 + c.i + ":" + r.O().x() + "\n";
                  }
                }
              }
              byte[] arrayOfByte1 = str2.getBytes();
              DatagramPacket datagramPacket1 =
                  new DatagramPacket(
                      arrayOfByte1,
                      arrayOfByte1.length,
                      datagramPacket.getAddress(),
                      datagramPacket.getPort());
              datagramSocket.send(datagramPacket1);
            }
          }
        } catch (IOException iOException) {
          D.d("Slave Server Broadcast exception: " + iOException.getMessage());
          try {
            Thread.sleep(1000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(c.class.getName())
                .log(Level.SEVERE, (String) null, interruptedException);
          }
        }
      } catch (UnknownHostException unknownHostException) {
        D.PropertiesExtension(
            "UnknownHostException! Can not listen for broadcast. \n"
                + unknownHostException.getMessage());
        try {
          Thread.sleep(5000L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(c.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      } catch (SocketException socketException) {
        D.PropertiesExtension(
            "Socket Exception! Can not listen for broadcast. \n" + socketException.getMessage());
        try {
          Thread.sleep(5000L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(c.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
      }
    }
  }

  public synchronized void PropertiesExtension() {
    this.PropertiesExtension = true;
    notify();
    if (c.g(this.b) != null)
      try {
        c.g(this.b).close();
        c.PropertiesExtension(this.b, null);
      } catch (Exception exception) {
      }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
