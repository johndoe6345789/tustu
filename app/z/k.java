package z;

import G.n;
import G.o;
import aD.d;
import aD.e;
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

public class k implements n, SerialPortEventListener {
  private hs b;
  
  private JTextArea c;
  
  private JTextArea d;
  
  private n e;
  
  private OutputStream f;
  
  private d g;
  
  private l h;
  
  SerialPort a = null;
  
  private boolean i;
  
  private n j;
  
  public k(hs paramhs, n paramn, JTextArea paramJTextArea1, JTextArea paramJTextArea2) {
    this.b = paramhs;
    this.e = paramn;
    this.c = paramJTextArea1;
    this.d = paramJTextArea2;
    this.j = this;
    this.i = false;
    this.h = new l(this, this.f);
  }
  
  public void a() {
    try {
      this.a = new SerialPort(this.e.a());
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
      this.f = (OutputStream)new e(this.a);
      this.g = new d(this.a);
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
      D.d("Failed to set RTS or DTR");
    } 
    try {
      this.a.setParams(this.e.b(), this.e.f(), this.e.g(), this.e.h());
    } catch (SerialPortException serialPortException) {
      throw new m("Unsupported parameter");
    } 
    try {
      this.a.setFlowControlMode(this.e.d() | this.e.e());
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
  
  public boolean d() {
    return this.i;
  }
  
  public void a(int paramInt) {
    int i = this.b.b();
    if (i == 1) {
      this.d.append(paramInt + " ");
    } else if (i == 3) {
      if (paramInt == 13)
        paramInt = 10; 
      this.d.append((char)paramInt + "");
    } else if (i == 2) {
      this.d.append(c.b((byte)paramInt) + " ");
    } else {
      this.d.append((char)paramInt + "");
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
      int[] arrayOfInt = paramo.e();
      if (arrayOfInt != null) {
        for (byte b = 0; b < arrayOfInt.length; b++)
          a(arrayOfInt[b]); 
        this.d.append("\n");
      } else {
        D.c("result == null");
      } 
    } 
  }
  
  public void e() {}
  
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
        this.d.append(new String(stringBuffer) + "\n");
        this.d.setCaretPosition(this.d.getText().length());
        break;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */