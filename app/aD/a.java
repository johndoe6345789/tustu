package aD;

import A.b;
import A.f;
import G.J;
import G.l;
import aB.a;
import bH.D;
import bH.J;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortException;
import z.i;
import z.m;

public class a extends a implements f {
  public static String c = "115200";
  
  public static String d = "RS232 Serial Interface";
  
  f e = new f();
  
  SerialPort f = null;
  
  static Map g = new HashMap<>();
  
  static Map h = new HashMap<>();
  
  List i = null;
  
  String j = J.a() ? "COM1" : "/dev/ttyUSB0";
  
  String k = "";
  
  String l = this.j;
  
  int m = 0;
  
  String n = c;
  
  int o = 0;
  
  InputStream p = null;
  
  e q = null;
  
  int r = 0;
  
  ArrayList s = new ArrayList();
  
  i t = new i();
  
  boolean u = false;
  
  public static boolean v = true;
  
  long w = 0L;
  
  static c x = null;
  
  public a() {
    if (x == null || !x.isAlive()) {
      x = new c(this);
      x.start();
    } 
    x.a(this);
  }
  
  public void f() {
    if ((this.j == null || this.j.isEmpty()) && (this.k == null || this.k.isEmpty()))
      throw new l("Com Port Not Set!"); 
    if (this.m % 2 != 0 && this.k != null && !this.k.isEmpty()) {
      this.l = this.k;
    } else {
      this.l = this.j;
    } 
    if (this.n == null)
      throw new l("Baud Rate Not Set!"); 
    boolean bool = false;
    this.l = this.l.trim();
    if (J.I())
      D.d("Opening port: " + this.l + " @ " + this.n); 
    try {
      this.r = 2;
      b();
      long l = System.currentTimeMillis();
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - added Port"); 
      this.f = new SerialPort(this.l);
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - 1st got port"); 
      if (h.get(this.l) != null) {
        SerialPort serialPort = (SerialPort)h.get(this.l);
        try {
          D.b(this.l + " port instance already found, trying to close.");
          serialPort.closePort();
        } catch (Exception exception) {
          D.b("Found port instance, could not close.");
        } 
      } 
      this.f.openPort();
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - opened port"); 
      a(this.l, this.f);
      t();
      if (bool)
        D.c((System.currentTimeMillis() - l) + "ms. - setParameters"); 
      this.p = new d(this.f);
      this.q = new e(this.f);
      this.r = 3;
      this.w = System.currentTimeMillis();
      c();
    } catch (Exception exception) {
      if (this.f != null)
        try {
          if (J.I())
            D.d("Error creating streams to port, closing port to cleanup."); 
          this.f.closePort();
          b(this.l);
        } catch (Exception exception1) {
          if (J.I())
            D.d("Error closing port on cleanup. " + exception1.getMessage()); 
        }  
      this.f = null;
      this.p = null;
      this.q = null;
      this.r = 0;
      d();
      this.m++;
      if (bool)
        D.c("Unable to open port: " + this.l + "\nPlease check your Communications Settings. "); 
      throw new l("Unable to open port: " + this.l + "\nPlease check your Communications Settings. ");
    } 
  }
  
  private void a(String paramString, SerialPort paramSerialPort) {
    g.put(paramString, Thread.currentThread());
    h.put(paramString, paramSerialPort);
  }
  
  private void b(String paramString) {
    g.remove(paramString);
    h.remove(paramString);
  }
  
  public boolean r() {
    if (!this.u) {
      D.d("Re-establishing connection to: " + n());
      g();
      try {
        f();
      } catch (l l) {
        D.b("Failed to re-establish connection to: " + n());
      } 
    } 
    return (k() == 3);
  }
  
  public void g() {
    if (this.f != null) {
      if (J.I())
        D.c("JSSC ControllerInterface Close Connection currentPort == null:" + ((this.f == null) ? 1 : 0)); 
      this.r = 4;
      e();
      if (System.currentTimeMillis() - this.w > 5000L) {
        this.m = 0;
      } else if (this.f != null) {
        this.m++;
      } 
      new b(this, this.f, this.p, this.q);
      this.f = null;
      this.p = null;
      this.q = null;
    } 
  }
  
  public String h() {
    return d;
  }
  
  public InputStream i() {
    return (this.p == null) ? null : this.p;
  }
  
  public OutputStream j() {
    return (this.q == null) ? null : this.q;
  }
  
  public int k() {
    return this.r;
  }
  
  public List l() {
    boolean bool = J.d();
    this.i = new ArrayList();
    b b1 = new b();
    b1.a("Com Port");
    b1.b("Communication Port using RS232 or Virtual RS232 Serial communications.");
    b1.a(0);
    String[] arrayOfString1 = this.t.b();
    byte b3;
    for (b3 = 0; b3 < arrayOfString1.length; b3++)
      b1.a(arrayOfString1[b3]); 
    this.i.add(b1);
    if (bool) {
      b1 = new b();
      b1.a("2nd Com Port");
      b1.b("An optional 2nd Communication Port. If the main selected port fails, the next connection attempt will be made using this port. This is used in scenarios such as on Linux where sometimes your USB adapter will be reassigned to ttyUSB1 instead of ttyUSB0");
      b1.a(0);
      b1.a("");
      for (b3 = 0; b3 < arrayOfString1.length; b3++)
        b1.a(arrayOfString1[b3]); 
      this.i.add(b1);
    } 
    b b2 = new b();
    b2.a("Baud Rate");
    b2.b("Baud rate to use for RS232 Serial communications.");
    b2.a(0);
    String[] arrayOfString2 = u();
    for (byte b4 = 0; b4 < arrayOfString2.length; b4++)
      b2.a(arrayOfString2[b4]); 
    this.i.add(b2);
    if (v) {
      b b = new b();
      b.a("Bluetooth Port");
      if (J.a()) {
        b.b("On Windows Bluetooth Direct should normally be used for Bluetooth connections instead of virtual comms! \n\nIf active, communication timings will be optimized for Bluetooth Connections, but are less than optimal for USB to RS232 cables and true Serial Ports.");
      } else {
        b.b("If active, communication timings will be optimized for Bluetooth Connections, but are less than optimal for USB to RS232 cables and true Serial Ports.");
      } 
      b.a(6);
      this.i.add(b);
    } 
    return this.i;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString.equals("Com Port")) {
      this.j = paramObject.toString();
      this.l = this.j;
    } else if (paramString.equals("2nd Com Port")) {
      this.k = paramObject.toString();
    } else if (paramString.equals("Baud Rate")) {
      this.n = paramObject.toString();
      D.c("set baud to " + this.n);
    } else if (paramString.equals("Bluetooth Port")) {
      this.u = (v && Boolean.parseBoolean(paramObject.toString()));
    } else {
      D.c("Unknown Setting Name: " + paramString);
    } 
  }
  
  protected void t() {
    if (this.f == null) {
      D.b("currentPort is null, can not setConnectionParameters");
      return;
    } 
    try {
      this.f.setRTS(false);
      this.f.setDTR(false);
    } catch (SerialPortException serialPortException) {
      D.d("Failed to set RTS or DTR");
    } 
    this.e.a(this.n);
    try {
      this.f.setParams(this.e.a(), this.e.d(), this.e.e(), this.e.f());
    } catch (SerialPortException serialPortException) {
      throw new m("Unsupported parameter");
    } 
    try {
      this.f.setFlowControlMode(this.e.b() | this.e.c());
    } catch (SerialPortException serialPortException) {
      throw new m("Unsupported flow control");
    } 
  }
  
  public boolean a(int paramInt) {
    String str = this.n;
    this.n = paramInt + "";
    try {
      t();
    } catch (m m) {
      Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)m);
      this.n = str;
      try {
        t();
      } catch (m m1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)m1);
      } 
      return false;
    } 
    return true;
  }
  
  protected void a(SerialPort paramSerialPort, InputStream paramInputStream, e parame) {
    try {
      try {
        if (parame != null) {
          parame.flush();
          parame.close();
        } 
        if (paramInputStream != null)
          paramInputStream.close(); 
      } catch (IOException iOException) {
      
      } finally {
        if (J.I())
          D.d("Closing Port"); 
        this.r = 0;
        b(this.l);
        paramSerialPort.closePort();
        if (J.I())
          D.d("Successfully Closed Port"); 
      } 
    } catch (Exception exception) {
      D.c("can not close Port: " + paramSerialPort + ", message: " + exception.getMessage());
    } 
  }
  
  public Object a(String paramString) {
    if (paramString.equals("Com Port"))
      return this.j; 
    if (paramString.equals("Baud Rate"))
      return this.n; 
    if (paramString.equals("Bluetooth Port"))
      return Boolean.valueOf(this.u); 
    if (paramString.equals("2nd Com Port"))
      return this.k; 
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }
  
  private String[] u() {
    return new String[] { 
        "1200", "2400", "4800", "9600", "14400", "19200", "28800", "38400", "57600", "115200", 
        "150000", "230400", "250000", "460800", "500000" };
  }
  
  public boolean m() {
    return !this.u;
  }
  
  public String n() {
    return "RS232: Port:" + this.l + ", Baud:" + this.n;
  }
  
  public int o() {
    return this.u ? 1000 : 0;
  }
  
  public int p() {
    return this.u ? 4000 : (J.d() ? 400 : 400);
  }
  
  public boolean q() {
    return false;
  }
  
  public int s() {
    return 1;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aD/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */