package com.efiAnalytics.xcp.master.responseProcessors;

import G.F;
import G.aI;
import bH.D;
import bH.c;
import bN.h;
import bN.k;
import bN.m;
import bN.t;
import bO.c;
import bO.i;
import bO.j;
import bO.k;
import bO.l;
import bQ.e;
import bQ.l;
import bS.h;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OdtDataProcessor {
  e a;
  
  aI b;
  
  l c;
  
  byte[] d = null;
  
  long e = 0L;
  
  int f = 0;
  
  int g = 0;
  
  public b(aI paramaI, l paraml, e parame) {
    this.a = parame;
    this.b = paramaI;
    this.c = paraml;
  }
  
  public void a() {
    this.a.g();
  }
  
  public boolean a(k paramk, t paramt) {
    int i = paramt.a();
    if (!h.a(i))
      return false; 
    for (c c : this.a.e()) {
      if (i >= c.k() && i <= c.k() + c.f())
        try {
          k k1 = this.a.c(i);
          D.c("Unexpected ODT byte count: " + k1.b() + ", expected: " + (paramt.c()).length);
          if (k1.b() != (paramt.c()).length && this.g++ > 3) {
            D.d(this.g + ", DAQ Errors. Restarting...");
            this.g = 0;
            a();
          } 
          return (k1.b() == (paramt.c()).length);
        } catch (j j) {
          return false;
        }  
    } 
    return false;
  }
  
  public void a(F paramF, k paramk, t paramt) {
    if (this.d == null)
      this.d = new byte[paramF.n()]; 
    int i = paramt.a();
    try {
      k k1 = this.a.c(i);
      byte[] arrayOfByte1 = paramt.c();
      if (k1.b() != arrayOfByte1.length) {
        if (this.g++ > 3) {
          if (this.c.a(paramF.u()).d()) {
            this.c.a(paramF.u()).c();
            String str1 = "ODT, Expected " + k1.b() + " received: " + arrayOfByte1.length + ", Sending update to Slave";
            D.d(str1);
            return;
          } 
          String str = "DAQ_HANDLER: ODT Size wrong, Expected " + k1.b() + " received: " + arrayOfByte1.length;
          D.c(str);
          throw new h(str);
        } 
        return;
      } 
      m m = (m)paramt;
      byte[] arrayOfByte2 = m.f();
      if (arrayOfByte2.length > 0) {
        int n = c.a(arrayOfByte2[0]);
        if (this.f < n) {
          this.e += (n - this.f);
        } else if (this.f > n) {
          this.e = this.e + (256 - this.f) + n;
        } 
        this.f = n;
      } 
      this.g = 0;
      byte b1 = 0;
      int j = 0;
      for (l l1 : k1) {
        int n = b1 + j;
        for (i i1 : l1.c())
          System.arraycopy(arrayOfByte1, n + i1.c(), this.d, i1.a(), i1.b()); 
        j += l1.b();
      } 
      k1.a(true);
      c c = this.a.a(k1);
      if (c == null) {
        D.b("Didn't find a DAQ for PID: " + i);
      } else {
        boolean bool = true;
        for (k k2 : c.e()) {
          if (!k2.isEmpty() && !k2.a()) {
            bool = false;
            break;
          } 
        } 
        if (bool) {
          this.c.a(this.d, ((float)this.e / 1000.0F));
          for (k k2 : c.e())
            k2.a(false); 
        } 
      } 
    } catch (j j) {
      Logger.getLogger(b.class.getName()).log(Level.WARNING, "Could not update ODT offsets.", (Throwable)j);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/xcp/master/responseProcessors/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */