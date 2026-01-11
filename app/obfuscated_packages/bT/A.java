package bT;

import G.R;
import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bS.a;
import bS.h;
import bS.o;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A implements a {
  public int a() {
    return 245;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:STD_UPLOAD Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:STD_UPLOAD valid packet data not found."); 
    if (arrayOfByte.length != 1 && arrayOfByte.length != 7)
      throw new h("PID:STD_UPLOAD invalid packet data length, expected 2 bytes, found: " + (arrayOfByte.length + 1)); 
    k k = paramo.d();
    int i = c.a(arrayOfByte[0]);
    R r = paramo.f();
    int j = paramo.g();
    int m = k.u() * i;
    int n = paramo.h();
    if (n >= 0)
      n -= r.O().y(j); 
    try {
      byte[] arrayOfByte1;
      if (n == o.c) {
        arrayOfByte1 = paramo.l();
        if (arrayOfByte1 == null) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte2 = { 34 };
          l.b(arrayOfByte2);
          paramo.c(34);
          paramo.a(paramt);
          return;
        } 
      } else {
        if ((r.O().l()).length < j || j < 0) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte2 = { 38 };
          l.b(arrayOfByte2);
          paramo.c(38);
          paramo.a(paramt);
          return;
        } 
        if (n + m > r.O().f(j) || n < 0) {
          l l = u.a().b();
          l.a(254);
          byte[] arrayOfByte2 = { 34 };
          l.b(arrayOfByte2);
          paramo.c(34);
          paramo.a(paramt);
          return;
        } 
        int[] arrayOfInt = r.h().a(j, n, m);
        arrayOfByte1 = c.a(arrayOfInt);
      } 
      if (arrayOfByte1.length > k.i() - 1 && !k.t().a()) {
        l l = u.a().b();
        l.a(254);
        byte[] arrayOfByte2 = { 48 };
        l.b(arrayOfByte2);
        paramo.c(48);
        paramo.a((t)l);
      } else {
        if (arrayOfByte1.length > k.i() - 1) {
          ArrayList<l> arrayList = new ArrayList();
          int i1 = 0;
          while (true) {
            int i2 = (m - i1 > k.i() - 1) ? (k.i() - 1) : (m - i1);
            byte[] arrayOfByte2 = new byte[i2];
            System.arraycopy(arrayOfByte1, i1, arrayOfByte2, 0, arrayOfByte2.length);
            i1 += i2;
            l l1 = u.a().b();
            l1.a(255);
            l1.b(arrayOfByte2);
            arrayList.add(l1);
            if (i1 >= m) {
              paramo.d(paramo.h() + m);
              paramo.a(arrayList);
              return;
            } 
          } 
        } 
        l l = u.a().b();
        l.a(255);
        l.b(arrayOfByte1);
        paramo.d(paramo.h() + m);
        paramo.a((t)l);
      } 
    } catch (o o1) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      throw new h(o1.getLocalizedMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */