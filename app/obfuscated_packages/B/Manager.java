package B;

import G.f;
import bH.D;
import bH.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends InputStream {
  private DatagramSocket i;
  
  private final List j = new ArrayList();
  
  DatagramPacket a;
  
  byte[] b = new byte[5000];
  
  int c = 0;
  
  int d = 0;
  
  r e;
  
  q f = null;
  
  int g;
  
  f h = new f();
  
  public Manager(DatagramSocket paramDatagramSocket, r paramr) {
    this.i = paramDatagramSocket;
    this.a = new DatagramPacket(this.b, this.b.length);
    this.e = paramr;
  }
  
  public void close() {
    try {
      a().close();
    } catch (Exception exception) {}
    a((DatagramSocket)null);
    this.c = 0;
    this.d = 0;
  }
  
  public int available() {
    if (this.c == this.d)
      try {
        b();
      } catch (IOException iOException) {
        return 0;
      }  
    return this.c - this.d;
  }
  
  public int read() {
    if (this.d == this.c)
      b(); 
    this.g = this.b[this.d] & 0xFF;
    this.d++;
    return this.g;
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.d == this.c)
      b(); 
    int i = paramInt2;
    if (this.d > this.c) {
      D.c("No UDP bytes left.");
      this.d = 0;
      this.c = 0;
      return -1;
    } 
    if (this.d == this.c) {
      D.c("No UDP bytes left.");
      return 0;
    } 
    try {
      System.arraycopy(this.b, this.d, paramArrayOfbyte, paramInt1 + paramInt2 - i, i);
    } catch (Exception exception) {
      D.c("UDPInputStream error: packetIndex:" + this.d + ", off:" + paramInt1 + ", lenRemaining:" + i + ", buffLen:" + paramArrayOfbyte.length);
      return 0;
    } 
    this.d += i;
    return paramInt2;
  }
  
  public long skip(long paramLong) {
    if (this.d == this.c)
      b(); 
    long l = paramLong;
    while (available() < l) {
      l -= available();
      b();
    } 
    this.d += (int)l;
    return paramLong;
  }
  
  private void b() {
    if (a() != null) {
      if (this.f == null) {
        this.f = new q(this);
        this.f.start();
      } 
      if (this.j.isEmpty())
        synchronized (this.j) {
          try {
            this.j.wait(700L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(p.class.getName()).log(Level.WARNING, "Error waiting for UDP Packet", interruptedException);
          } 
        }  
      if (this.j.isEmpty())
        throw new IOException("Read Socket Timeout"); 
      if (this.d == this.c) {
        this.a = this.j.remove(0);
        byte[] arrayOfByte = this.b;
        this.b = this.a.getData();
        this.h.a(arrayOfByte);
      } else {
        D.c("Were bytes added back?");
        return;
      } 
      if (this.a.getAddress() != null) {
        this.e.a(this.a.getAddress());
        this.e.a(this.a.getPort());
      } 
      this.d = 0;
      this.c = this.a.getLength();
    } else {
      throw new IOException("Socket closed");
    } 
  }
  
  private void c() {
    if (a() != null) {
      byte[] arrayOfByte = this.h.b(5000);
      DatagramPacket datagramPacket = new DatagramPacket(arrayOfByte, 5000);
      a().receive(datagramPacket);
      this.j.add(datagramPacket);
      synchronized (this.j) {
        this.j.notify();
      } 
    } else {
      throw new IOException("Socket closed");
    } 
  }
  
  public void mark(int paramInt) {}
  
  public void reset() {
    throw new IOException("Marks not supported by UdpInputStream, add a BufferedInputStream.");
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public DatagramSocket a() {
    return this.i;
  }
  
  public void a(DatagramSocket paramDatagramSocket) {
    this.i = paramDatagramSocket;
  }
  
  public void a(byte[] paramArrayOfbyte) {
    D.c("Adding to UDP InputStream: \n" + c.d(paramArrayOfbyte));
    if (paramArrayOfbyte.length + this.c > this.b.length) {
      byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length + this.c];
      System.arraycopy(this.b, 0, arrayOfByte1, 0, this.b.length);
      byte[] arrayOfByte2 = this.b;
      this.b = arrayOfByte1;
      this.h.a(arrayOfByte2);
    } 
    System.arraycopy(paramArrayOfbyte, 0, this.b, this.d, paramArrayOfbyte.length);
    this.c += paramArrayOfbyte.length;
  }
  
  public void a(r paramr) {
    this.e = paramr;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */