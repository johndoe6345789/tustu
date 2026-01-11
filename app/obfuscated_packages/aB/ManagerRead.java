package aB;

import bH.D;
import com.ftdi.FTD2XXException;
import com.ftdi.FTDevice;
import java.io.InputStream;

public ManagerReadlass ManagerRead extends InputStream {
  FTDevice a;
  
  int b = -1;
  
  boolean c = false;
  
  c(FTDevice paramFTDevice) {
    this.a = paramFTDevice;
  }
  
  public int read(byte[] paramArrayOfbyte) {
    if (this.c) {
      byte b = 0;
      while (true) {
        int i = read();
        if (i == -1)
          return b; 
        paramArrayOfbyte[b++] = (byte)i;
        if (b >= paramArrayOfbyte.length)
          return b; 
      } 
    } 
    try {
      return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    } catch (FTD2XXException fTD2XXException) {
      this.a.open();
      throw fTD2XXException;
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.c) {
      if (this.b >= 0) {
        paramArrayOfbyte[paramInt1] = (byte)this.b;
        this.b = -1;
        return (paramInt2 - paramInt1 == 1) ? 1 : (1 + this.a.read(paramArrayOfbyte, paramInt1 + 1, paramInt2 - 1));
      } 
      return this.a.read(paramArrayOfbyte, paramInt1, paramInt2);
    } 
    try {
      return this.a.read(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (FTD2XXException fTD2XXException) {
      this.a.open();
      throw fTD2XXException;
    } 
  }
  
  public int read() {
    if (this.c) {
      if (this.b >= 0) {
        int i = this.b;
        this.b = -1;
        return i;
      } 
      byte[] arrayOfByte = this.a.read(1);
      return (arrayOfByte != null && arrayOfByte.length > 0) ? arrayOfByte[0] : -1;
    } 
    try {
      return this.a.read();
    } catch (FTD2XXException fTD2XXException) {
      this.a.open();
      throw fTD2XXException;
    } 
  }
  
  public int available() {
    if (this.c) {
      if (this.b >= 0)
        return 1 + this.a.getQueueStatus(); 
      this.b = read();
      return (this.b < 0) ? this.a.getQueueStatus() : (1 + this.a.getQueueStatus());
    } 
    try {
      return this.a.getInputStream().available();
    } catch (FTD2XXException fTD2XXException) {
      D.a("Error reading from D2XX, will try reopening");
      this.a.open();
      return this.a.getInputStream().available();
    } 
  }
  
  public void close() {
    try {
      this.a.close();
      this.b = -1;
    } catch (Exception exception) {}
  }
  
  public boolean markSupported() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aB/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */