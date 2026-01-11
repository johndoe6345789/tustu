package aB;

import A.a;
import B.l;
import G.l;
import aP.NInterfaceIndiaImpl;
import bH.D;
import com.ftdi.FTD2XXException;
import com.ftdi.FTDevice;
import com.ftdi.Parity;
import com.ftdi.StopBits;
import com.ftdi.WordLength;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import z.ZInterfaceIndia;

public class IOInAbPackage extends a {
  FTDevice b = null;
  
  public static String c = "FTDI - D2XX driver";
  
  private int ZInterfaceIndia = 0;
  
  List d = null;
  
  c e = null;
  
  int f = 115200;
  
  static String g = "Auto";
  
  String h = g;
  
  private int j = 400;
  
  public synchronized void f() {
    List list;
    if (k() == 3)
      throw new l("FTDI Device already connected:" + n()); 
    if (k() == 2)
      throw new l("FTDI Device already connecting:" + n()); 
    b(2);
    this.b = null;
    c();
    try {
      list = FTDevice.getDevices(true);
    } catch (FTD2XXException fTD2XXException) {
      b(0);
      b();
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, "Exception getting devices.", (Throwable)fTD2XXException);
      throw new l("Unable to get list of FTDI Devices.");
    } catch (Error error) {
      b(0);
      b();
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, "System Error atteempting to get FTDI Devices.", error);
      throw new l("Unable to get list of FTDI Devices.");
    } 
    for (FTDevice fTDevice : list) {
      if (this.h.equals(g) || (fTDevice != null && this.h.equals(fTDevice.getDevSerialNumber())))
        this.b = fTDevice; 
    } 
    if (this.b == null) {
      b(0);
      b();
      this.j = 2000;
      if (this.h.equals(g))
        throw new l("Did not find any supported FTDI Device or it is already in use."); 
      throw new l("Did not find D2XX Device or it is already in use. Device ID: " + this.h);
    } 
    this.j = 250;
    try {
      D.c("Opening Connection to FTDI Device: " + n());
      System.out.println("Device: " + this.b);
      System.out.println("Device Type: " + this.b.getDevType());
      System.out.println("Device ID: " + this.b.getDevID());
      System.out.println("Device Location ID: " + this.b.getDevLocationID());
      this.b.open();
      this.b.setBaudRate(this.f);
      this.b.setLatencyTimer((short)1);
      this.b.setDataCharacteristics(WordLength.BITS_8, StopBits.STOP_BITS_1, Parity.PARITY_NONE);
      this.b.setTimeouts(250L, 500L);
      b(3);
      this.e = new c(this.b);
      a();
      D.d("D2XX Opened: " + this.b.getDevDescription());
    } catch (Exception exception) {
      b(0);
      b();
      if (this.b != null)
        try {
          this.b.close();
        } catch (Exception exception1) {
        
        } finally {
          this.b = null;
          this.e = null;
        }  
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, exception);
      throw new l("Unable to open device: " + exception.getLocalizedMessage() + ", " + n());
    } catch (Error error) {
      b(0);
      b();
      if (this.b != null)
        try {
          this.b.close();
        } catch (Exception exception) {
        
        } finally {
          this.b = null;
          this.e = null;
        }  
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, "Error loafing FTDI Library", error);
      throw new l("Unable to open device: " + error.getLocalizedMessage() + ", " + n());
    } 
  }
  
  public boolean r() {
    g();
    try {
      f();
    } catch (l l) {
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
    } 
    return (k() == 3);
  }
  
  public void g() {
    if (this.b != null) {
      b(4);
      e();
      try {
        this.b.close();
        this.e.close();
        d();
      } catch (Exception exception) {
        D.c("Error closing FTDI Connection");
      } 
      D.d("D2XX Closed: " + this.b.getDevDescription());
      this.e = null;
    } 
    b(0);
  }
  
  public String h() {
    return c;
  }
  
  public InputStream ZInterfaceIndia() {
    return this.e;
  }
  
  public OutputStream j() {
    return this.b.getOutputStream();
  }
  
  public int k() {
    return this.ZInterfaceIndia;
  }
  
  public List t() {
    ArrayList<String> arrayList = new ArrayList();
    try {
      List list = FTDevice.getDevices();
      for (FTDevice fTDevice : list)
        arrayList.add(fTDevice.getDevSerialNumber()); 
    } catch (FTD2XXException fTD2XXException) {}
    return arrayList;
  }
  
  public List l() {
    this.d = new ArrayList();
    A.b b1 = new A.b();
    b1.a("Device Serial #");
    b1.b("FTDI USB Device ID. This can be used to distinctly identify a specific USB device or left on Auto to connect to the 1st found.");
    b1.a(4);
    b1.a(g);
    try {
      List list = FTDevice.getDevices(true);
      for (FTDevice fTDevice : list)
        b1.a(fTDevice.getDevSerialNumber()); 
    } catch (Exception exception) {
      D.a("Handled Exception: " + exception.getLocalizedMessage());
    } catch (Error error) {
      D.a("Handled Error: " + error.getLocalizedMessage());
    } 
    this.d.add(b1);
    A.b b2 = new A.b();
    b2.a("Baud Rate");
    b2.b("Baud rate to use for D2XX Serial communications.");
    b2.a(4);
    String[] arrayOfString = (new ZInterfaceIndia()).c();
    for (byte b3 = 0; b3 < arrayOfString.length; b3++)
      b2.a(arrayOfString[b3]); 
    this.d.add(b2);
    return this.d;
  }
  
  public void a(String paramString, Object paramObject) {
    if (paramString.equals("Device Serial #")) {
      if (paramObject.toString().equals(g)) {
        this.h = g;
      } else {
        this.h = paramObject.toString();
        if (b(this.h)) {
          NInterfaceIndiaImpl.a().a("Counterfeit FTDI Chip!! " + this.h);
          D.b("The serial cable being used appears to be using a Counterfeit FTDI chipset!!!");
        } 
      } 
    } else if (paramString.equals("Baud Rate")) {
      this.f = Integer.parseInt(paramObject.toString());
    } else {
      D.c("Unknown Setting Name: " + paramString);
    } 
  }
  
  public Object a(String paramString) {
    if (paramString.equals("Device Serial #"))
      return this.h; 
    if (paramString.equals("Baud Rate"))
      return this.f + ""; 
    D.c("Unknown Setting Name: " + paramString);
    return null;
  }
  
  public void b(int paramInt) {
    this.ZInterfaceIndia = paramInt;
  }
  
  public String n() {
    if (this.b == null)
      return "USB D2XX, Serial #" + g + " @ " + this.f + " Baud"; 
    if (b(this.h)) {
      NInterfaceIndiaImpl.a().a("Counterfeit FTDI Chip!! " + this.h);
      D.b("The serial cable being used appears to be using a Counterfeit FTDI chipset!!!");
      return "Counterfeit FTDI Serial #" + this.b.getDevSerialNumber() + " @ " + this.f + " Baud";
    } 
    return "USB D2XX, Serial #" + this.b.getDevSerialNumber() + " @ " + this.f + " Baud";
  }
  
  public boolean m() {
    return true;
  }
  
  public boolean a(int paramInt) {
    try {
      this.b.setBaudRate(paramInt);
      return true;
    } catch (Exception exception) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, exception);
      return false;
    } 
  }
  
  public int o() {
    return 0;
  }
  
  public int p() {
    return this.j;
  }
  
  public boolean q() {
    return false;
  }
  
  public int s() {
    return 1;
  }
  
  private boolean b(String paramString) {
    return (paramString.equals("A50285BI") || paramString.equals("FTB6SPL3") || paramString.equals("A601CKQK") || paramString.contains("0000000") || paramString.equals("A5XK3RJJ") || paramString.equals("18F54CB7") || paramString.equals("A5XK3RJT") || paramString.equals(""));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aB/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */