package com.efiAnalytics.simulators;

import bH.D;
import java.io.IOException;
import java.net.DatagramPacket;
import java.util.logging.Level;
import java.util.logging.Logger;

class MultiCylPressureSenderThread extends Thread {
  boolean a = true;
  
  int b = 15000;
  
  MultiCylPressureSenderThread(UdpMultiCylPressureSimulator paramUdpMultiCylPressureSimulator) {}
  
  public void run() {
    while (this.a) {
      int i = 240000 / this.b;
      UdpMultiCylPressureSimulator.a(this.c);
      try {
        for (byte b1 = 0; b1 < this.c.f.length; b1++) {
          byte[] arrayOfByte = this.c.f[b1];
          this.c.d = new DatagramPacket(arrayOfByte, arrayOfByte.length, this.c.c, this.c.b);
          UdpMultiCylPressureSimulator.b(this.c).send(this.c.d);
          D.c("Send Cyl Pressure Data");
          Thread.sleep(0L, 1000);
        } 
      } catch (IOException iOException) {
        Logger.getLogger(UdpCylPressureSimulator.class.getName()).log(Level.SEVERE, (String)null, iOException);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(UdpMultiCylPressureSimulator.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      try {
        sleep(i);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(UdpCylPressureSimulator.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  public synchronized void a() {
    this.a = false;
    notify();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/simulators/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */