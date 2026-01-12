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

public class UdpMultiCylPressureSimulator {
  int a = 28555;

  int b = 0;

  InetAddress c = null;

  private DatagramSocket i;

  DatagramPacket d;

  boolean e = true;

  byte[][] f = new byte[4][1800];

  b g = null;

  int h = 0;

  public void a() {
    try {
      this.i = new DatagramSocket(null);
      this.i.setBroadcast(true);
      this.i.bind(new InetSocketAddress(InetAddress.getLocalHost(), this.a));
      byte[] arrayOfByte = new byte[100];
      DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
      this.i.setSoTimeout(15000);
      this.i.setTrafficClass(20);
      int i = 0;
      do {
        try {
          this.i.receive(datagramPacket);
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
    UdpMultiCylPressureSimulator udpMultiCylPressureSimulator = new UdpMultiCylPressureSimulator();
    udpMultiCylPressureSimulator.a();
  }

  private void c() {
    for (byte b1 = 0; b1 < this.f.length; b1 = (byte) (b1 + 1)) {
      a(this.f[b1]);
      if (b1 == 1) {
        this.f[b1][0] = 64;
      } else if (b1 == 2) {
        this.f[b1][0] = Byte.MIN_VALUE;
      } else if (b1 == 3) {
        this.f[b1][0] = -64;
      } else {
        this.f[b1][0] = 0;
      }
      this.f[b1][1] = 0;
      this.f[b1][2] = (byte) (this.h >> 8);
      this.f[b1][3] = (byte) (this.h & 0xFF);
      this.h++;
    }
  }

  private void a(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[2];
    double d = Math.random() / 10.0D;
    for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++) {
      float f = (float) (b1 + d * 150.0D) / 15.0F;
      int i = (int) (250.0D * (d + Math.pow(((62.0F - Math.abs(f - 65.0F)) / 50.0F), 16.0D)));
      c.a(i, arrayOfByte, true);
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, b1, arrayOfByte.length);
      b1++;
    }
  }

  private void d() {
    if (this.g != null) this.g.a();
    this.g = new b(this);
    this.g.start();
  }

  public void b() {
    if (this.g != null) this.g.a();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/simulators/UdpMultiCylPressureSimulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
