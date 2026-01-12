package W;

import bH.D;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OutputStreamExtension extends OutputStream {
  OutputStream a;

  final List b = Collections.synchronizedList(new LinkedList());

  int c = 500;

  IOException d = null;

  au e = null;

  public OutputStreamExtension(OutputStream paramOutputStream) {
    this.a = paramOutputStream;
  }

  private void b() {
    if (this.e == null) {
      this.e = new au(this);
      this.e.start();
    }
    byte b = 0;
    while (this.b.size() >= this.c) {
      try {
        Thread.sleep(100L);
        D.c("Queue full, blocking to shrink.");
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
      if (b++ > 5) throw new IOException("Slow Write Speed causing queue over flow. ");
    }
  }

  public synchronized void write(int paramInt) {
    try {
      b();
      this.b.add(new at(this, paramInt));
    } catch (IOException iOException) {
      Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, iOException);
      throw new IOException("Slow I/O caused full queue and Iterruption adding write.");
    }
    this.e.a();
  }

  public synchronized void write(byte[] paramArrayOfbyte) {
    try {
      b();
      synchronized (this.b) {
        this.b.add(new at(this, paramArrayOfbyte));
      }
    } catch (IOException iOException) {
      Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, iOException);
      throw new IOException("Slow I/O caused full queue and Iterruption adding write.");
    }
  }

  public synchronized void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      b();
      if (paramArrayOfbyte.length != paramInt2) {
        byte[] arrayOfByte = new byte[paramInt2];
        System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
        paramArrayOfbyte = arrayOfByte;
      }
      this.b.add(new at(this, paramArrayOfbyte));
    } catch (IOException iOException) {
      Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, iOException);
      throw new IOException("Slow I/O caused full queue and Iterruption adding write.");
    }
  }

  public synchronized void flush() {
    b();
    this.e.a();
  }

  public synchronized void a() {
    byte b = 0;
    while (this.b.size() > 0) {
      D.c("QueuingOutputStream: Flushing Queue, size=" + this.b.size());
      this.e.a();
      try {
        Thread.sleep(50L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(as.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
      if (b++ > 100)
        throw new IOException("Unable to flush OutputStream queu in a reasonable amount of time.");
    }
    this.a.flush();
  }

  public void close() {
    try {
      a();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    }
    this.e.a(false);
    this.a.close();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
