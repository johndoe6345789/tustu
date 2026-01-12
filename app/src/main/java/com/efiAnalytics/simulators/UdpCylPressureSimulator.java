package com.efiAnalytics.simulators;

import bH.D;
import bH.c;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UdpCylPressureSimulator {
  int a = 28555;

  int b = 0;

  InetAddress c = null;

  private DatagramSocket h;

  DatagramPacket d;

  boolean e = true;

  byte[] f = new byte[1080];

  a g = null;

  public void a() {
    try {
      this.h = new DatagramSocket(null);
      this.h.setBroadcast(true);
      this.h.bind(new InetSocketAddress(InetAddress.getLocalHost(), this.a));
      byte[] arrayOfByte = new byte[100];
      DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
      this.h.setSoTimeout(15000);
      this.h.setTrafficClass(20);
      int i = 0;
      do {
        try {
          this.h.receive(datagramPacket);
          i = datagramPacket.getLength();
          D.c("bytesRecieved = " + i);
        } catch (Exception exception) {
          if (this.e) D.d("No Connection on UDP, try again.");
          i = 0;
        }
        if (!this.e || i <= 0) continue;
        byte[] arrayOfByte1 = new byte[i];
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, i);
        D.d("Received Message: " + c.d(arrayOfByte1));
        if (c.a(arrayOfByte1[0]) == 255) {
          D.d("ConnectCommand Received, starting broadcast...");
          this.b = datagramPacket.getPort();
          this.c = datagramPacket.getAddress();
          d();
        } else if (c.a(arrayOfByte1[0]) == 254) {
          D.d("Disconnect received, stopping broadcast");
          b();
        } else if (c.a(arrayOfByte1[0]) == 253) {
          D.d("Stop server command received, stopping broadcast, ending server");
          b();
          this.e = false;
        } else {
          D.b("Unknown Command Received: " + c.d(arrayOfByte1));
        }
      } while (this.e);
    } catch (SocketException socketException) {
      Logger.getLogger(UdpCylPressureSimulator.class.getName())
          .log(Level.SEVERE, "Failed to start Server", socketException);
    } catch (UnknownHostException unknownHostException) {
      Logger.getLogger(UdpCylPressureSimulator.class.getName())
          .log(Level.SEVERE, "Failed to start server", unknownHostException);
    }
  }

  public static void main(String[] paramArrayOfString) {
    UdpCylPressureSimulator udpCylPressureSimulator = new UdpCylPressureSimulator();
    udpCylPressureSimulator.a();
  }

  private void c() {
    byte[] arrayOfByte = new byte[2];
    double d = Math.random() / 10.0D;
    for (byte b = 0; b < this.f.length; b++) {
      float f = (float) (b + d * 150.0D) / 8.0F;
      int i = (int) (200.0D * d + Math.pow(((68.0F - Math.abs(f - 65.0F)) / 50.0F), 32.0D));
      c.a(i, arrayOfByte, true);
      System.arraycopy(arrayOfByte, 0, this.f, b, arrayOfByte.length);
      b++;
    }
  }

  private void d() {
    if (this.g != null) this.g.a();
    this.g = new a(this);
    this.g.start();
  }

  public void b() {
    if (this.g != null) this.g.a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/simulators/UdpCylPressureSimulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
