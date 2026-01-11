package aI;

import bK.InputStreamExtensionRead;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionStart extends Thread implements h {
  OutputStream a = null;
  
  a b = null;
  
  boolean InputStreamExtensionRead = false;
  
  InputStreamExtensionRead d = null;
  
  IOException e = null;
  
  ThreadExtensionStart(e parame, File paramFile) {
    super("CompessedWriter");
    setDaemon(true);
    this.a = e.a(parame, paramFile);
  }
  
  public void run() {
    try {
      InputStreamExtensionRead.a(this.d, this.a);
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
      this.e = iOException;
    } 
  }
  
  public void a(byte[] paramArrayOfbyte) {
    if (this.e != null)
      throw this.e; 
    if (!this.InputStreamExtensionRead) {
      this.b = new a(paramArrayOfbyte);
      this.b.a(true);
      this.d = new InputStreamExtensionRead(this.b);
      start();
    } else {
      this.b.a(paramArrayOfbyte);
    } 
  }
  
  public void start() {
    this.InputStreamExtensionRead = true;
    super.start();
  }
  
  public void a() {
    try {
      if (this.b != null) {
        this.b.a(false);
        for (byte b = 0; b < 50 && this.b.available() > 0; b++) {
          try {
            Thread.sleep(20L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
        } 
      } 
      this.a.close();
    } catch (IOException iOException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  public int b() {
    while (this.b != null && this.b.available() > 0) {
      try {
        sleep(4L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    return (this.d != null) ? this.d.a() : 0;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */