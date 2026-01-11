package aI;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a extends InputStream {
  private boolean d = true;
  
  private List e = new ArrayList();
  
  private byte[] f = null;
  
  protected int a;
  
  protected int b = 0;
  
  protected int c;
  
  public a(byte[] paramArrayOfbyte) {
    this.f = paramArrayOfbyte;
    this.a = 0;
    this.c = paramArrayOfbyte.length;
  }
  
  public synchronized int read() {
    if (this.a == this.c && this.d)
      b(a()); 
    return (this.a < this.c) ? (this.f[this.a++] & 0xFF) : -1;
  }
  
  public synchronized int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException(); 
    if (paramInt1 < 0 || paramInt2 < 0 || paramInt2 > paramArrayOfbyte.length - paramInt1)
      throw new IndexOutOfBoundsException(); 
    if (this.a >= this.c) {
      if (this.a == this.c && this.d)
        b(a()); 
      if (this.a >= this.c)
        return -1; 
    } 
    if (this.a + paramInt2 > this.c)
      paramInt2 = this.c - this.a; 
    if (paramInt2 <= 0)
      return 0; 
    System.arraycopy(this.f, this.a, paramArrayOfbyte, paramInt1, paramInt2);
    this.a += paramInt2;
    return paramInt2;
  }
  
  public synchronized long skip(long paramLong) {
    if (this.a + paramLong > this.c)
      paramLong = (this.c - this.a); 
    if (paramLong < 0L)
      return 0L; 
    this.a = (int)(this.a + paramLong);
    return paramLong;
  }
  
  public synchronized int available() {
    return this.c - this.a;
  }
  
  public boolean markSupported() {
    return true;
  }
  
  public void mark(int paramInt) {
    this.b = this.a;
  }
  
  public synchronized void reset() {
    this.a = this.b;
  }
  
  public void close() {}
  
  public synchronized void a(byte[] paramArrayOfbyte) {
    this.e.add(paramArrayOfbyte);
    notify();
  }
  
  private void b(byte[] paramArrayOfbyte) {
    if (!this.d)
      return; 
    if (paramArrayOfbyte == null)
      throw new IOException("TIMEOUT on wait for next buffer. Expected more buffers, Log file likely truncated."); 
    this.f = paramArrayOfbyte;
    this.a = 0;
    this.c = paramArrayOfbyte.length;
    this.b = 0;
  }
  
  public synchronized void a(boolean paramBoolean) {
    this.d = paramBoolean;
    if (!paramBoolean)
      notify(); 
  }
  
  public synchronized byte[] a() {
    if (this.e.isEmpty() && this.d)
      try {
        wait(3000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      }  
    byte[] arrayOfByte = null;
    if (!this.e.isEmpty()) {
      arrayOfByte = this.e.get(0);
      this.e.remove(0);
    } else if (this.d) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "TIMEOUT on wait for next buffer. Expected more buffers, did not get it in 3000 ms. Log file likely truncated.");
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */