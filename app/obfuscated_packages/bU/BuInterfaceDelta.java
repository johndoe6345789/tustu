package bU;

import G.R;
import G.dc;
import G.m;
import G.BnInterfaceOscar;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.TostringInBnPackage;
import bN.BnInterfaceOscar;
import bN.BnInterfaceTango;
import bN.BnInterfaceUniform;
import bS.ExceptionInBsPackage;
import bS.BnInterfaceOscar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuInterfaceDelta implements ExceptionInBsPackage {
  private int b = 0;
  
  byte[] a = null;
  
  private int c = -1;
  
  private int d = -1;
  
  private boolean e = true;
  
  private boolean f = false;
  
  public int a() {
    return 164;
  }
  
  public void a(BnInterfaceOscar paramo, BnInterfaceTango paramt) {
    if (paramt.a() != a())
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW_NEXT Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW_NEXT valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new ExceptionInBsPackage("PID:USER_CMD_WRITE_RAW_NEXT invalid packet data length, must have atleast 1 byte"); 
    BnInterfaceKilo BnInterfaceKilo = paramo.d();
    R r = paramo.f();
    try {
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
      int i = this.a.length - this.b;
      if (arrayOfByte.length > this.b) {
        TostringInBnPackage.a(254);
        String str = "WriteRaw too many bytes, truncated ";
        TostringInBnPackage.b(str.getBytes());
        System.arraycopy(arrayOfByte, 0, this.a, i, this.b);
        this.b = 0;
        D.b("PID:USER_CMD_WRITE_RAW_NEXT received extra bytes, truncated??");
      } else if (arrayOfByte.length <= this.b) {
        System.arraycopy(arrayOfByte, 0, this.a, i, arrayOfByte.length);
        this.b -= arrayOfByte.length;
      } 
      if (this.b == 0) {
        BnInterfaceOscar o1 = a(r, this.a);
        if (o1.a() == 3) {
          TostringInBnPackage.a(254);
          String str = "WriteRaw Failed: " + o1.c();
          TostringInBnPackage.b(str.getBytes());
          D.c(str);
        } else {
          TostringInBnPackage.a(255);
          if (o1.e() != null) {
            byte[] arrayOfByte1 = c.a(o1.e());
            TostringInBnPackage.b(arrayOfByte1);
          } 
        } 
        paramo.a((BnInterfaceTango)TostringInBnPackage);
      } 
    } catch (BnInterfaceOscar o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public BnInterfaceOscar a(R paramR, byte[] paramArrayOfbyte) {
    int[] arrayOfInt = c.b(paramArrayOfbyte);
    m m = m.a(paramR.O(), arrayOfInt);
    dc dc = new dc();
    m.c(this.e);
    m.b(this.d);
    m.a(this.c);
    return dc.a(paramR, m, 3000);
  }
  
  void a(int paramInt) {
    this.b = paramInt;
  }
  
  int b() {
    return this.b;
  }
  
  void a(byte[] paramArrayOfbyte) {
    this.a = paramArrayOfbyte;
  }
  
  public void b(int paramInt) {
    this.c = paramInt;
  }
  
  public void c(int paramInt) {
    this.d = paramInt;
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */