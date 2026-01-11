package z;

import gnu.io.SerialPort;

class ZInterfaceHotel extends Thread {
  SerialPort a = null;
  
  boolean b = false;
  
  public ZInterfaceHotel(e parame, SerialPort paramSerialPort) {
    this.a = paramSerialPort;
    start();
    long l = System.currentTimeMillis();
    while (!this.b && System.currentTimeMillis() - l < 10000L) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
  }
  
  public void run() {
    try {
      this.c.a(this.a);
    } finally {
      this.b = true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */