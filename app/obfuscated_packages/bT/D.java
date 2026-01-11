package bT;

import G.R;
import G.aH;
import G.cu;
import V.a;
import bH.c;
import bN.k;
import bN.l;
import bN.o;
import bN.t;
import bN.u;
import bO.c;
import bO.j;
import bO.l;
import bS.a;
import bS.d;
import bS.h;
import bS.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class D implements a {
  public int a() {
    return 225;
  }
  
  public void a(o paramo, t paramt) {
    if (paramt.a() != a())
      throw new h("PID:DAQ_WRITE_DAQ Wrong handler! this handler is for 0x" + Integer.toHexString(a()).toUpperCase()); 
    k k = paramo.d();
    R r = paramo.f();
    byte[] arrayOfByte = paramt.c();
    if (arrayOfByte == null)
      throw new h("PID:DAQ_WRITE_DAQ valid packet data not found."); 
    if (arrayOfByte.length != 7)
      throw new h("PID:DAQ_WRITE_DAQ invalid packet data length, expected 7 bytes, found: " + (arrayOfByte.length + 1)); 
    try {
      l l = u.a().b();
      d d = paramo.k();
      int i = d.c();
      int j = d.d();
      int m = d.e();
      byte b = arrayOfByte[0];
      int n = c.a(arrayOfByte[1]);
      long l1 = c.b(arrayOfByte, 3, 4, k.g(), false);
      c c = d.b(i);
      if (c == null || i > d.b() || j > c.a() || m > c.c()) {
        l.a(254);
        byte[] arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = 34;
        l.b(arrayOfByte2);
        paramo.a(paramt);
        return;
      } 
      l.a(255);
      byte[] arrayOfByte1 = new byte[0];
      l l2 = d.a(i, j, m);
      int i1 = a(r, l1);
      l2.a(i1);
      l2.a(n);
      long l3 = System.currentTimeMillis();
      List list = a(r, i1, n);
      cu.a().d();
      for (aH aH : list) {
        try {
          cu.a().a(r.c(), aH.aL(), c.n());
        } catch (a a1) {
          Logger.getLogger(D.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } 
      cu.a().e();
      if (m < c.c() - 1) {
        d.f(m + 1);
      } else {
        d.d(-1);
        d.e(-1);
        d.f(-1);
      } 
      l.b(arrayOfByte1);
      paramo.a((t)l);
      return;
    } catch (j|o j) {
      Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String)null, (Throwable)j);
      l l = u.a().b();
      l.a(254);
      byte[] arrayOfByte1 = new byte[1];
      arrayOfByte1[0] = 34;
      l.b(arrayOfByte1);
      try {
        paramo.a((t)l);
      } catch (o o1) {
        bH.D.a("Unable to send response packet.");
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, (Throwable)o1);
      } 
      return;
    } 
  }
  
  private List a(R paramR, int paramInt1, int paramInt2) {
    ArrayList<aH> arrayList = new ArrayList();
    Iterator<aH> iterator = paramR.q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (aH.a() >= paramInt1 && aH.a() < paramInt1 + paramInt2)
        arrayList.add(aH); 
    } 
    return arrayList;
  }
  
  private int a(R paramR, long paramLong) {
    if (paramLong < paramR.O().n())
      return (int)paramLong; 
    aH aH = b(paramR, paramLong);
    if (aH == null) {
      bH.D.a("Can not find a channel at address 0x" + Long.toHexString(paramLong).toUpperCase());
      return (int)paramLong;
    } 
    return aH.a();
  }
  
  private aH b(R paramR, long paramLong) {
    Iterator<aH> iterator = paramR.q();
    while (iterator.hasNext()) {
      aH aH = iterator.next();
      if (aH.x() == paramLong)
        return aH; 
    } 
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bT/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */