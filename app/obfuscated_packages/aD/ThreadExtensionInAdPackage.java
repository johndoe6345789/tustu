package aD;

import java.io.InputStream;
import jssc.SerialPort;

class ThreadExtensionInAdPackage extends Thread {
  SerialPort a = null;
  
  InputStream b;
  
  e c;
  
  boolean d = false;
  
  public ThreadExtensionInAdPackage(a parama, SerialPort paramSerialPort, InputStream paramInputStream, e parame) {
    this.a = paramSerialPort;
    this.b = paramInputStream;
    this.c = parame;
    start();
    long l = System.currentTimeMillis();
    while (!this.d && System.currentTimeMillis() - l < 10000L) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      } 
    } 
    parama.r = 0;
    a.a(parama);
  }
  
  public void run() {
    try {
      this.e.a(this.a, this.b, this.c);
    } finally {
      this.d = true;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */