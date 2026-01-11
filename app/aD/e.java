package aD;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortException;

public class e extends OutputStream {
  SerialPort a = null;
  
  public e(SerialPort paramSerialPort) {
    this.a = paramSerialPort;
  }
  
  public void write(int paramInt) {
    a();
    try {
      this.a.writeInt(paramInt);
    } catch (SerialPortException serialPortException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException);
      throw new IOException("Failed to write to port " + this.a.getPortName());
    } 
  }
  
  public void write(byte[] paramArrayOfbyte) {
    a();
    try {
      this.a.writeBytes(paramArrayOfbyte);
    } catch (SerialPortException serialPortException) {
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException);
      throw new IOException("Failed to write to port " + this.a.getPortName());
    } 
  }
  
  private void a() {
    if (this.a == null)
      throw new IOException("serialPort not set!"); 
    if (!this.a.isOpened())
      throw new IOException("serialPort " + this.a.getPortName() + " not open"); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */