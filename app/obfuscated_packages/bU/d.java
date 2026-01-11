package bU;

import G.R;
import G.dc;
import G.m;
import G.o;
import bH.D;
import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class d implements h {
  private int b = 0;
  
  byte[] a = null;
  
  private int c = -1;
  
  private int d = -1;
  
  private boolean e = true;
  
  private boolean f = false;
  
  public int a() {
    return 164;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD_WRITE_RAW_NEXT Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:USER_CMD_WRITE_RAW_NEXT valid packet data not found."); 
    if (arrayOfByte.length < 1)
      throw new h("PID:USER_CMD_WRITE_RAW_NEXT invalid packet data length, must have atleast 1 byte"); 
    k k = paramo.d();
    R r = paramo.f();
    try {
      l l = u.a().b();
      int i = this.a.length - this.b;
      if (arrayOfByte.length > this.b) {
        l.a(254);
        String str = "WriteRaw too many bytes, truncated ";
        l.b(str.getBytes());
        System.arraycopy(arrayOfByte, 0, this.a, i, this.b);
        this.b = 0;
        D.b("PID:USER_CMD_WRITE_RAW_NEXT received extra bytes, truncated??");
      } else if (arrayOfByte.length <= this.b) {
        System.arraycopy(arrayOfByte, 0, this.a, i, arrayOfByte.length);
        this.b -= arrayOfByte.length;
      } 
      if (this.b == 0) {
        o o1 = a(r, this.a);
        if (o1.a() == 3) {
          l.a(254);
          String str = "WriteRaw Failed: " + o1.c();
          l.b(str.getBytes());
          D.c(str);
        } else {
          l.a(255);
          if (o1.e() != null) {
            byte[] arrayOfByte1 = c.a(o1.e());
            l.b(arrayOfByte1);
          } 
        } 
        paramo.a((t)l);
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
    } 
  }
  
  public o a(R paramR, byte[] paramArrayOfbyte) {
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