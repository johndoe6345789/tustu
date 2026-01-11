package J;

import G.GInterfaceCr;
import G.ManagerUsingArrayList;
import bH.D;
import bH.c;
import bH.d;
import java.io.Serializable;

public class SerializableImpl implements GInterfaceCr, Serializable {
  d a = new d();
  
  private boolean h = true;
  
  int b = 0;
  
  int c = 0;
  
  int d = 7;
  
  private int i = -1;
  
  G.f e = new G.f();
  
  i f = new i();
  
  private String j = null;
  
  boolean g = true;
  
  public SerializableImpl() {
    String[] arrayOfString = this.f.s();
    for (byte b = 0; b < arrayOfString.length; b++)
      ManagerUsingArrayList.a().d(arrayOfString[b]); 
    this.f.b();
  }
  
  public boolean b(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int j = d(paramArrayOfbyte2);
    if ((j & 0x80) != 128)
      return true; 
    if (j == 128) {
      this.j = "Controller Reported an Under-run";
      this.f.w();
      D.b("Controller Reported an Under-run");
      this.b++;
      g();
      return false;
    } 
    if (j == 129) {
      this.j = "Controller Reported an Over-run";
      this.f.t();
      D.b("Controller Reported an Over-run");
      this.b++;
      g();
      return false;
    } 
    if (j == 130) {
      this.j = "Controller Reported a CRC Mismatch";
      this.f.x();
      D.b("Controller Reported a CRC Mismatch");
      this.b++;
      g();
      return false;
    } 
    if (j == 131) {
      this.j = "Controller Reported a Unrecognized Command";
      this.f.y();
      D.b("Controller Reported a Unrecognized Command!");
      this.b++;
      g();
      return false;
    } 
    if (j == 132) {
      this.j = "Controller Reported a Out of Range";
      this.f.z();
      D.b("Controller Reported a Out of Range");
      this.b++;
      g();
      return false;
    } 
    if (j == 133) {
      this.j = "Controller reporting BUSY";
      this.f.A();
      D.b("Controller reporting BUSY");
      this.b++;
      g();
      return false;
    } 
    if (j == 134) {
      this.j = "Controller Reported Flash Locked";
      this.f.B();
      D.b("Controller Reported Flash Locked");
      this.b++;
      g();
      return false;
    } 
    if (j == 140) {
      this.j = "Controller Reported Parity Error";
      this.f.K();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 141) {
      this.j = "Controller Reported Framing Error";
      this.f.L();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 142) {
      this.j = "Controller Reported Serial Noise";
      this.f.M();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 143) {
      this.j = "Controller Reported txmode range error";
      this.f.N();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 144) {
      this.j = "Controller Reported Unknown Serial Error";
      this.f.O();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 135) {
      this.j = "Controller Reported Sequence Failure 1";
      this.f.P();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 136) {
      this.j = "Controller Reported Sequence Failure 2";
      this.f.Q();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 139) {
      this.j = "Controller Reported CAN Failure";
      this.f.T();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 137) {
      this.j = "Controller Reported CAN Queue full";
      this.f.R();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 138) {
      this.j = "Controller Reported CAN Timeout";
      this.f.S();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 146) {
      this.j = "Controller Reported CAN Device Unavailable";
      this.f.U();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 147) {
      this.j = "High speed runtime table not set.";
      this.f.U();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 145) {
      this.j = "Too Many Bad Requests for unavailble CAN ID.";
      this.f.U();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 148) {
      this.j = "Generic Error";
      this.f.al();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if (j == 149) {
      this.j = "Critical Error";
      this.f.am();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    if ((j & 0x80) == 128) {
      this.j = "Controller Reported Undefined Error: 0x" + Integer.toHexString(j);
      this.f.J();
      D.b(this.j);
      this.b++;
      g();
      return false;
    } 
    return true;
  }
  
  public boolean a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.j = null;
    if (!b(paramArrayOfbyte1, paramArrayOfbyte2))
      return false; 
    int j = d(paramArrayOfbyte2);
    byte[] arrayOfByte1 = this.e.b(4);
    byte[] arrayOfByte2 = this.e.b(4);
    try {
      byte[] arrayOfByte3 = c(paramArrayOfbyte2, arrayOfByte1);
      int k = f(paramArrayOfbyte2);
      if (k != paramArrayOfbyte2.length) {
        this.j = "Unexpeced array length from controller";
        D.b("Unexpeced array length from controller! Envelope declared size:" + (1 + k) + " actual measured size:" + (paramArrayOfbyte2.length - 6) + ", envelope response data:\n" + c.d(paramArrayOfbyte2));
        this.b++;
      } 
      byte[] arrayOfByte4 = d(paramArrayOfbyte2, arrayOfByte2);
      if (!c.b(arrayOfByte3, arrayOfByte4)) {
        this.j = "CRC failure on received payload.";
        this.f.C();
        D.b("CRC failure on received payload.\n\tReported CRC: " + c.d(arrayOfByte3) + "\n\tCalculated CRC:" + c.d(arrayOfByte4) + "\n\tResponse data:\n" + c.d(paramArrayOfbyte2));
        this.b++;
        g();
        if (this.g)
          return false; 
      } 
      this.b = 0;
      if (j == 0)
        this.f.D(); 
      if (j == 4)
        this.f.E(); 
      if (j == 1)
        this.f.F(); 
      if (j == 2)
        this.f.G(); 
      if (j == 3)
        this.f.H(); 
      if (j == 5)
        this.f.I(); 
      if (j == 6)
        this.f.ag(); 
      g();
      return true;
    } finally {
      this.e.a(arrayOfByte1);
      this.e.a(arrayOfByte2);
    } 
  }
  
  private void g() {
    if (this.c < this.f.f()) {
      ManagerUsingArrayList.a().a("protocolError", 1.0D);
      this.c = this.f.f();
    } else {
      ManagerUsingArrayList.a().a("protocolError", 0.0D);
    } 
    this.f.an();
  }
  
  public byte[] a(byte[] paramArrayOfbyte) {
    return e(paramArrayOfbyte);
  }
  
  public boolean b(byte[] paramArrayOfbyte) {
    String str = c(paramArrayOfbyte);
    return (str != null && str.length() > 0);
  }
  
  public String c(byte[] paramArrayOfbyte) {
    int j = d(paramArrayOfbyte);
    if (j == 3) {
      byte[] arrayOfByte = e(paramArrayOfbyte);
      if (arrayOfByte.length > 0)
        return new String(arrayOfByte); 
      D.b("Received Settings Error indicator, but no message.");
      return "The Controller has not provided a reason for the Settings Error.\n\nYou must correct this error, then power cycle your controller.";
    } 
    if (j == 146) {
      byte[] arrayOfByte = e(paramArrayOfbyte);
      if (arrayOfByte.length > 0) {
        D.b("CAN Device Unavailable, Controller reported: " + new String(arrayOfByte));
      } else {
        D.b("Received Settings Error indicator, but no message.");
      } 
      return "A Controller is responding, but not at the project assigned CAN ID.\n\nCheck:\n- The target device is powered on.\n- The CAN ID assigned in Project Settings matches that of your target controller.\n\nPlease correct the problem and power cycle the device you are connected to.Then uncheck Work Offline";
    } 
    if (j == 148) {
      byte[] arrayOfByte = e(paramArrayOfbyte);
      String str = (arrayOfByte.length > 0) ? new String(arrayOfByte) : "No controller Message recieved";
      if (arrayOfByte.length > 0) {
        D.b("GENERIC_ERROR, Controller reported: " + str);
      } else {
        D.b("Received GENERIC_ERROR indicator, but no message.");
      } 
      return "The Controller Reported an error:\n" + str;
    } 
    if (j == 149) {
      byte[] arrayOfByte = e(paramArrayOfbyte);
      String str = (arrayOfByte.length > 0) ? new String(arrayOfByte) : "No controller Message recieved";
      if (arrayOfByte.length > 0) {
        D.b("CRITICAL_ERROR, Controller reported: " + str);
      } else {
        D.b("Received CRITICAL_ERROR indicator, but no message.");
      } 
      return "The Controller Reported a Critical Error:\n" + str;
    } 
    return (this.b == 5) ? "Failed to get a valid read of OutputChannel data in 5 consecutive attempts.\nPlease check your project settings and ensure you have the correct ini for your project.\n\nAlso check your cabling for resistence to electromagnetic noise." : null;
  }
  
  public int d(byte[] paramArrayOfbyte) {
    return c.a(paramArrayOfbyte, 2, 1, true, false);
  }
  
  private byte[] c(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    System.arraycopy(paramArrayOfbyte1, paramArrayOfbyte1.length - 4, paramArrayOfbyte2, 0, 4);
    return paramArrayOfbyte2;
  }
  
  private byte[] e(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = this.e.a(paramArrayOfbyte.length - this.d);
    System.arraycopy(paramArrayOfbyte, 3, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  private int f(byte[] paramArrayOfbyte) {
    return c.a(paramArrayOfbyte, 0, 2, true, false) + a() - 1;
  }
  
  public int a(byte[] paramArrayOfbyte, int paramInt) {
    return c.a(paramArrayOfbyte, 0, 2, true, false) + f() - 1;
  }
  
  private byte[] d(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.a.reset();
    this.a.update(paramArrayOfbyte1, 2, paramArrayOfbyte1.length - this.d + 1);
    return c.a((int)this.a.getValue(), paramArrayOfbyte2, true);
  }
  
  public int a() {
    return this.d;
  }
  
  public String c() {
    return this.j;
  }
  
  public int b() {
    return 3;
  }
  
  public int f() {
    return 4;
  }
  
  public h d() {
    return this.f;
  }
  
  public void e() {
    this.f.d();
  }
  
  public boolean a(int paramInt) {
    return (paramInt != 131 && paramInt != 146 && paramInt != 147 && paramInt != 3 && paramInt != 134 && paramInt != 149 && paramInt != 132);
  }
  
  public void d(int paramInt) {
    this.i = paramInt;
  }
  
  public boolean b(int paramInt) {
    return (146 == paramInt || 149 == paramInt);
  }
  
  public void b(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public boolean c(int paramInt) {
    return (paramInt == 3);
  }
  
  public void a(boolean paramBoolean) {
    this.g = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/J/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */