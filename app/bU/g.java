package bU;

import G.R;
import G.aM;
import G.cE;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.h;
import bS.o;
import java.util.logging.Level;
import java.util.logging.Logger;

public class g implements h {
  public static int a = 0;
  
  public static int b = 1;
  
  public int a() {
    return 160;
  }
  
  public void a(o paramo, t paramt) {
    byte[] arrayOfByte = paramt.c();
    try {
      if (arrayOfByte.length < 1) {
        l l = u.a().b();
        l.a(254);
        String str = "Missing Command code, message too short.";
        l.b(str.getBytes());
        paramo.a((t)l);
      } 
      byte b = arrayOfByte[0];
      byte[] arrayOfByte1 = new byte[arrayOfByte.length - 1];
      System.arraycopy(arrayOfByte, 1, arrayOfByte1, 0, arrayOfByte1.length);
      if (b == a) {
        String str = new String(arrayOfByte1);
        R r = paramo.f();
        aM aM = r.c(str);
        if (aM != null) {
          String str1 = cE.a(r, aM);
          if (str1 != null) {
            str1 = aM.aL() + "=" + str1;
            l l = u.a().b();
            l.a(255);
            l.b(str1.getBytes());
            paramo.a((t)l);
          } else {
            l l = u.a().b();
            l.a(254);
            String str2 = "Parameter does not exist in our configuration " + str;
            l.b(str2.getBytes());
            paramo.a((t)l);
          } 
        } else {
          l l = u.a().b();
          l.a(254);
          String str1 = "Parameter does not exist in our configuration " + str;
          l.b(str1.getBytes());
          paramo.a((t)l);
        } 
      } else if (b == b) {
        R r = paramo.f();
        try {
          String str = cE.a(r);
          l l = u.a().b();
          l.a(255);
          l.b(str.getBytes());
          paramo.a((t)l);
        } catch (Exception exception) {
          l l = u.a().b();
          l.a(254);
          String str = "Failed to get all PcVariable values:  " + exception.getLocalizedMessage();
          l.b(str.getBytes());
          paramo.a((t)l);
        } 
      } else {
        l l = u.a().b();
        l.a(254);
        String str = "unknown sub command code ";
        l.b(str.getBytes());
        paramo.a((t)l);
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bU/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */