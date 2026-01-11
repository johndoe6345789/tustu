package bU;

import G.R;
import bH.D;
import bH.c;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b implements h {
  public static int a = 0;
  
  public static int b = 1;
  
  public static int c = 2;
  
  public int a() {
    return 166;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL valid packet data not found."); 
    if (arrayOfByte.length < 5)
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL invalid packet data length, must have atleast 5 bytes"); 
    byte b1 = arrayOfByte[0];
    if (b1 == a) {
      try {
        l l = u.a().b();
        l.a(255);
        R r = paramo.f();
        String str = r.P();
        if (str != null && str.getBytes() != null) {
          l.b(str.getBytes());
        } else {
          D.b("No Firmware Infor to give client?");
        } 
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b1 == b) {
      try {
        l l = u.a().b();
        l.a(255);
        R r = paramo.f();
        arrayOfByte = new byte[4];
        c.a(arrayOfByte, r.O().G(0), 0, 2, true);
        c.a(arrayOfByte, r.O().ay(), 2, 2, true);
        l.b(arrayOfByte);
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else if (b1 == c) {
      try {
        l l = u.a().b();
        l.a(255);
        R r = paramo.f();
        arrayOfByte = new byte[1];
        arrayOfByte[0] = (byte)r.O().P();
        l.b(arrayOfByte);
        paramo.a((t)l);
      } catch (o o1) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
    } else {
      throw new h("PID:USER_CMD_RUNTIME_READ_CONTROL Unknown Action: 0x" + Integer.toHexString(b1).toUpperCase());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */