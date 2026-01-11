package bP;

import G.R;
import G.T;
import G.cI;
import bH.D;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.o;
import bU.g;

public class b implements cI {
  o a;
  
  public b(o paramo) {
    this.a = paramo;
  }
  
  public void a(String paramString1, String paramString2) {
    R r = T.a().c(paramString1);
    try {
      a(r, paramString2);
    } catch (o o1) {
      D.c("Failed to send Slave SERV Refresh Pc var packet: " + o1.getLocalizedMessage());
    } 
  }
  
  private void a(R paramR, String paramString) {
    l l = u.a().b();
    l.a(252);
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    arrayOfByte2[0] = -29;
    arrayOfByte2[1] = (byte)g.b;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
    l.b(arrayOfByte2);
    this.a.a((t)l);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bP/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */