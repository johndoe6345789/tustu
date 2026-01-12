package com.efiAnalytics.simulators;

import bH.D;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.logging.Level;
import java.util.logging.Logger;

class CylPressureSenderThread extends Thread {
  boolean a = true;

  int b = 2000;

  CylPressureSenderThread(UdpCylPressureSimulator paramUdpCylPressureSimulator) {}

  public void run() {
    while (this.a) {
      int i = 120000 / this.b;
      try {
        UdpCylPressureSimulator.a(this.c);
        this.c.d = new DatagramPacket(this.c.f, this.c.f.length, this.c.c, this.c.b);
        UdpCylPressureSimulator.b(this.c).send(this.c.d);
        D.c("Send Cyl Pressure Data");
      } catch (IOException iOException) {
        Logger.getLogger(UdpCylPressureSimulator.class.getName())
            .log(Level.SEVERE, (String) null, iOException);
      }
      try {
        sleep(i);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(UdpCylPressureSimulator.class.getName())
            .log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  public synchronized void a() {
    this.a = false;
    notify();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/simulators/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
