package z;

import G.n;
import G.o;
import aD.SerialPortEventListener;
import aD.OutputStreamExtension;
import aP.hs;
import bH.D;
import bH.c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class SerialPortEventListenerUsingJTextArea implements n, SerialPortEventListener {
  private hs b;
  
  private JTextArea c;
  
  private JTextArea SerialPortEventListener;
  
  private n OutputStreamExtension;
  
  private OutputStream f;
  
  private SerialPortEventListener g;
  
  private l h;
  
  SerialPort a = null;
  
  private boolean i;
  
  private n j;
  
  public SerialPortEventListenerUsingJTextArea(hs paramhs, n paramn, JTextArea paramJTextArea1, JTextArea paramJTextArea2) {
    this.b = paramhs;
    this.OutputStreamExtension = paramn;
    this.c = paramJTextArea1;
    this.SerialPortEventListener = paramJTextArea2;
    this.j = this;
    this.i = false;
    this.h = new l(this, this.f);
  }
  
  public void a() {
    try {
      this.a = new SerialPort(this.OutputStreamExtension.a());
      this.a.openPort();
    } catch (Exception exception) {
      throw new m(exception.getMessage());
    } 
    try {
      b();
    } catch (m m) {
      throw m;
    } 
    try {
      this.f = (OutputStream)new OutputStreamExtension(this.a);
      this.g = new SerialPortEventListener(this.a);
    } catch (SerialPortException serialPortException) {
      Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException);
      try {
        this.a.closePort();
        throw new m("Error opening i/o streams");
      } catch (SerialPortException serialPortException1) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException1);
      } 
    } 
    this.h.a(this.f);
    this.c.addKeyListener(this.h);
    this.g.a(this);
    this.i = true;
  }
  
  public void b() {
    if (this.a == null) {
      D.b("currentPort is null, can not setConnectionParameters");
      return;
    } 
    try {
      this.a.setRTS(false);
      this.a.setDTR(false);
    } catch (SerialPortException serialPortException) {
      D.SerialPortEventListener("Failed to set RTS or DTR");
    } 
    try {
      this.a.setParams(this.OutputStreamExtension.b(), this.OutputStreamExtension.f(), this.OutputStreamExtension.g(), this.OutputStreamExtension.h());
    } catch (SerialPortException serialPortException) {
      throw new m("Unsupported parameter");
    } 
    try {
      this.a.setFlowControlMode(this.OutputStreamExtension.SerialPortEventListener() | this.OutputStreamExtension.OutputStreamExtension());
    } catch (SerialPortException serialPortException) {
      throw new m("Unsupported flow control");
    } 
  }
  
  public void c() {
    if (!this.i)
      return; 
    this.c.removeKeyListener(this.h);
    if (this.a != null) {
      try {
        this.f.close();
        this.g.close();
      } catch (IOException iOException) {
        System.err.println(iOException);
      } 
      try {
        this.a.closePort();
      } catch (SerialPortException serialPortException) {
        Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, (Throwable)serialPortException);
      } 
    } 
    this.i = false;
  }
  
  public boolean SerialPortEventListener() {
    return this.i;
  }
  
  public void a(int paramInt) {
    int i = this.b.b();
    if (i == 1) {
      this.SerialPortEventListener.append(paramInt + " ");
    } else if (i == 3) {
      if (paramInt == 13)
        paramInt = 10; 
      this.SerialPortEventListener.append((char)paramInt + "");
    } else if (i == 2) {
      this.SerialPortEventListener.append(c.b((byte)paramInt) + " ");
    } else {
      this.SerialPortEventListener.append((char)paramInt + "");
    } 
  }
  
  public void a(int[] paramArrayOfint) {
    if (this.f == null)
      throw new IOException("Port is not open."); 
    boolean bool = false;
    if (bool) {
      byte[] arrayOfByte = c.a(paramArrayOfint);
      this.f.write(arrayOfByte, 0, arrayOfByte.length);
    } else {
      for (byte b = 0; b < paramArrayOfint.length; b++) {
        this.f.write(paramArrayOfint[b]);
        try {
          Thread.sleep(3L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } 
    } 
  }
  
  public void a(double paramDouble) {}
  
  public void a(o paramo) {
    if (paramo.a() == 1) {
      int[] arrayOfInt = paramo.OutputStreamExtension();
      if (arrayOfInt != null) {
        for (byte b = 0; b < arrayOfInt.length; b++)
          a(arrayOfInt[b]); 
        this.SerialPortEventListener.append("\n");
      } else {
        D.c("result == null");
      } 
    } 
  }
  
  public void OutputStreamExtension() {}
  
  public void serialEvent(SerialPortEvent paramSerialPortEvent) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = 0;
    int j = this.b.b();
    switch (paramSerialPortEvent.getEventType()) {
      case 1:
        try {
          Thread.sleep(150L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(k.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
        while (i != -1) {
          try {
            i = this.g.read();
            if (i == -1)
              break; 
            a(i);
          } catch (IOException iOException) {
            System.err.println(iOException);
          } 
        } 
        this.SerialPortEventListener.append(new String(stringBuffer) + "\n");
        this.SerialPortEventListener.setCaretPosition(this.SerialPortEventListener.getText().length());
        break;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */