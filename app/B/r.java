package B;

import bH.D;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class r extends OutputStream {
  protected DatagramSocket a = null;
  
  DatagramPacket b = null;
  
  private InetAddress g = null;
  
  private int h = 0;
  
  byte[] c = new byte[1024];
  
  byte[] d = null;
  
  int e = 0;
  
  int f = 8192;
  
  public r() {}
  
  public r(DatagramSocket paramDatagramSocket) {
    this.a = paramDatagramSocket;
  }
  
  public void close() {
    try {
      flush();
    } catch (IOException iOException) {}
    this.e = 0;
  }
  
  public void flush() {
    if (this.e == 0)
      return; 
    if (this.e == this.c.length) {
      this.d = this.c;
    } else {
      this.d = new byte[this.e];
      System.arraycopy(this.c, 0, this.d, 0, this.e);
    } 
    this.b = new DatagramPacket(this.d, this.e, a(), b());
    this.a.send(this.b);
    this.e = 0;
  }
  
  public void write(int paramInt) {
    this.c[this.e] = (byte)(paramInt & 0xFF);
    this.e++;
    if (this.e >= this.c.length)
      flush(); 
  }
  
  public void write(byte[] paramArrayOfbyte) {
    write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2;
    try {
      while (this.c.length - this.e <= i) {
        System.arraycopy(paramArrayOfbyte, paramInt1 + paramInt2 - i, this.c, this.e, this.c.length - this.e);
        i -= this.c.length - this.e;
        this.e = this.c.length;
        flush();
      } 
      if (i == 0)
        return; 
      System.arraycopy(paramArrayOfbyte, paramInt1 + paramInt2 - i, this.c, this.e, i);
      this.e += i;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      D.c("len: " + paramInt2);
      D.c("lenRemaining: " + i);
      D.c("idx: " + this.e);
      D.c("buffer.length: " + this.c.length);
      D.c("offset: " + paramInt1);
      D.c("data.length: " + paramArrayOfbyte.length);
      throw arrayIndexOutOfBoundsException;
    } 
  }
  
  public InetAddress a() {
    return this.g;
  }
  
  public void a(InetAddress paramInetAddress) {
    this.g = paramInetAddress;
  }
  
  public int b() {
    return this.h;
  }
  
  public void a(int paramInt) {
    this.h = paramInt;
  }
  
  public void a(DatagramSocket paramDatagramSocket) {
    this.a = paramDatagramSocket;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */