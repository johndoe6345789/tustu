package bQ;

import G.F;
import G.R;
import G.T;
import G.Y;
import G.l;
import G.m;
import V.g;
import bH.D;
import bH.c;
import bN.k;
import bN.l;
import bN.u;
import bU.e;
import bU.g;
import java.util.ArrayList;
import java.util.List;

public class t {
  private static t a = null;
  
  private static final byte[] b = "ALL_PC_VARS".getBytes();
  
  public static t a() {
    if (a == null)
      a = new t(); 
    return a;
  }
  
  public l b() {
    l l = u.a().b();
    l.a(255);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = 0;
    l.b(arrayOfByte);
    return l;
  }
  
  public l c() {
    l l = u.a().b();
    l.a(254);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return l;
  }
  
  public bN.t a(byte paramByte) {
    l l = u.a().b();
    l.a(250);
    byte[] arrayOfByte = new byte[1];
    l.b(arrayOfByte);
    l.c()[0] = paramByte;
    return (bN.t)l;
  }
  
  public bN.t a(int paramInt) {
    l l = u.a().b();
    l.a(235);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = 2;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = (byte)paramInt;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public List a(F paramF, k paramk, int paramInt1, int paramInt2) {
    if (paramInt1 > paramF.g() || paramInt1 < 0)
      throw new l("Invalid Page Number: " + paramInt1); 
    ArrayList<k> arrayList = new ArrayList();
    int i = 0;
    while (true) {
      k k1 = new k();
      l l = u.a().b();
      l.a(245);
      int j = (paramInt2 - i) / paramk.u();
      int m = Math.min(255, j);
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = (byte)m;
      l.b(arrayOfByte);
      k1.a((bN.t)l);
      int n = paramk.u() * m / (paramk.i() - 1);
      if (paramk.u() * m % (paramk.i() - 1) > 0)
        n++; 
      k1.a(n);
      i += m * paramk.u();
      arrayList.add(k1);
      if (i >= paramInt2)
        return arrayList; 
    } 
  }
  
  public bN.t a(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(246);
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[2] = 0;
    arrayOfByte = c.a(arrayOfByte, paramInt, 3, 4, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public List a(k paramk, F paramF, m paramm) {
    ArrayList<List> arrayList = new ArrayList();
    R r = T.a().c(paramF.u());
    if (r == null)
      throw new g("No Configuration found for name: " + paramF.u()); 
    int[] arrayOfInt = paramm.p();
    byte[] arrayOfByte = c.a(arrayOfInt);
    int i = 0;
    int j = paramk.l() * (paramk.i() - 2) - 2;
    while (true) {
      int n = Math.min(j * paramk.u(), arrayOfByte.length - i);
      byte[] arrayOfByte1 = new byte[n];
      System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, n);
      List list = a(paramk, arrayOfByte1, paramm);
      arrayList.add(list);
      i += n;
      if (i >= arrayOfByte.length)
        return arrayList; 
    } 
  }
  
  private List a(k paramk, byte[] paramArrayOfbyte, m paramm) {
    ArrayList<l> arrayList = new ArrayList();
    byte b = 16;
    int i = b + 1;
    int j = Math.min(paramArrayOfbyte.length, paramk.i() - i);
    byte[] arrayOfByte = new byte[j + b];
    int n = paramArrayOfbyte.length;
    l l = u.a().b();
    l.a(241);
    arrayOfByte[0] = -93;
    c.a(arrayOfByte, n, 1, 2, paramk.g());
    c.a(arrayOfByte, paramm.f(), 3, 4, paramk.g());
    c.a(arrayOfByte, paramm.b(), 7, 4, paramk.g());
    byte b1 = 0;
    if (paramm.g())
      b1 = (byte)(b1 | 0x1); 
    arrayOfByte[15] = b1;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, b, j);
    l.b(arrayOfByte);
    arrayList.add(l);
    b = 1;
    i = 2;
    int i1 = j;
    if (paramArrayOfbyte.length > i1)
      do {
        l = u.a().b();
        l.a(241);
        j = Math.min(paramArrayOfbyte.length - i1, paramk.i() - i);
        arrayOfByte = new byte[j + b];
        arrayOfByte[0] = -92;
        System.arraycopy(paramArrayOfbyte, i1, arrayOfByte, b, j);
        l.b(arrayOfByte);
        arrayList.add(l);
        i1 += j;
      } while (i1 < paramArrayOfbyte.length); 
    return arrayList;
  }
  
  public List b(k paramk, F paramF, m paramm) {
    ArrayList<List> arrayList = new ArrayList();
    R r = T.a().c(paramF.u());
    if (r == null)
      throw new g("No Configuration found for name: " + paramF.u()); 
    if (paramm.o() > paramF.g() || paramm.o() < 0)
      throw new g("Invalid Page Number: " + paramm.o()); 
    Y y = r.h();
    if (paramF.f(paramm.o()) < paramm.q() + paramm.r())
      throw new g("Invalid Length, longer than page: " + paramm.r()); 
    int[] arrayOfInt = y.a(paramm.o(), paramm.q(), paramm.r());
    byte[] arrayOfByte = c.a(arrayOfInt);
    int i = 0;
    int j = paramk.l();
    while (true) {
      int n = Math.min(j * paramk.u(), arrayOfByte.length - i);
      byte[] arrayOfByte1 = new byte[n];
      System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, n);
      List list = a(paramk, arrayOfByte1);
      arrayList.add(list);
      i += n;
      if (i >= arrayOfByte.length)
        return arrayList; 
    } 
  }
  
  private List a(k paramk, byte[] paramArrayOfbyte) {
    ArrayList<l> arrayList = new ArrayList();
    byte b = (paramk.u() == 1) ? 1 : (paramk.u() - 1);
    int i = b + 1;
    int j = Math.min(paramArrayOfbyte.length, paramk.i() - i);
    byte[] arrayOfByte = new byte[j + b];
    int m = paramArrayOfbyte.length / paramk.u();
    if (paramk.u() * m != paramArrayOfbyte.length)
      throw new g("Payload size incorrect for current addresse granularity"); 
    if (paramArrayOfbyte.length > 255 * paramk.u())
      throw new g("Too much data requested for DOWNLOAD! Requested byte count: " + paramArrayOfbyte.length + ", Max allowed: " + (paramk.i() - b)); 
    l l = u.a().b();
    l.a(240);
    arrayOfByte[0] = (byte)m;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, b, j);
    l.b(arrayOfByte);
    arrayList.add(l);
    int n = j;
    if (paramArrayOfbyte.length > n)
      do {
        l = u.a().b();
        l.a(239);
        j = Math.min(paramArrayOfbyte.length - n, paramk.i() - i);
        arrayOfByte = new byte[j + b];
        int i1 = m - n / paramk.u();
        arrayOfByte[0] = (byte)i1;
        System.arraycopy(paramArrayOfbyte, n, arrayOfByte, b, j);
        l.b(arrayOfByte);
        arrayList.add(l);
        n += j;
      } while (n < paramArrayOfbyte.length); 
    return arrayList;
  }
  
  public bN.t d() {
    l l = u.a().b();
    l.a(252);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t b(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(243);
    byte[] arrayOfByte = new byte[7];
    c.a(arrayOfByte, paramInt, 3, 4, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, boolean paramBoolean) {
    l l = u.a().b();
    l.a(230);
    byte[] arrayOfByte = new byte[2];
    if (paramBoolean) {
      arrayOfByte[0] = 1;
    } else {
      arrayOfByte[0] = 0;
    } 
    arrayOfByte[1] = 0;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk) {
    l l = u.a().b();
    l.a(249);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = 1;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = 0;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t b(k paramk) {
    l l = u.a().b();
    l.a(218);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t c(k paramk) {
    l l = u.a().b();
    l.a(217);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t c(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(216);
    byte[] arrayOfByte = new byte[3];
    c.a(arrayOfByte, paramInt, 1, 2, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t d(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(227);
    byte[] arrayOfByte = new byte[3];
    c.a(arrayOfByte, paramInt, 1, 2, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, int paramInt1, int paramInt2, int paramInt3) {
    l l = u.a().b();
    l.a(226);
    byte[] arrayOfByte = new byte[5];
    c.a(arrayOfByte, paramInt1, 1, 2, paramk.g());
    arrayOfByte[3] = (byte)paramInt2;
    arrayOfByte[4] = (byte)paramInt3;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2) {
    l l = u.a().b();
    l.a(224);
    byte[] arrayOfByte = new byte[7];
    byte b = 0;
    if (paramBoolean1)
      b = (byte)(b | 0x10); 
    if (paramBoolean2)
      b = (byte)(b | 0x20); 
    arrayOfByte[0] = b;
    c.a(arrayOfByte, paramInt1, 1, 2, paramk.g());
    c.a(arrayOfByte, paramInt2, 3, 2, paramk.g());
    arrayOfByte[5] = paramByte1;
    arrayOfByte[4] = paramByte2;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, byte paramByte1, byte paramByte2, byte paramByte3, long paramLong) {
    l l = u.a().b();
    l.a(225);
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[0] = paramByte1;
    arrayOfByte[1] = paramByte2;
    arrayOfByte[2] = paramByte3;
    c.a(arrayOfByte, (int)paramLong, 3, 4, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, int paramInt, byte paramByte) {
    l l = u.a().b();
    l.a(222);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = paramByte;
    c.a(arrayOfByte, paramInt, 1, 2, paramk.g());
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t e() {
    l l = u.a().b();
    l.a(251);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t a(k paramk, byte paramByte) {
    l l = u.a().b();
    l.a(221);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = paramByte;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t d(k paramk) {
    l l = u.a().b();
    l.a(220);
    byte[] arrayOfByte = new byte[0];
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t c(k paramk, F paramF, m paramm) {
    l l = u.a().b();
    l.a(241);
    byte[] arrayOfByte1 = paramm.l().getBytes();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
    arrayOfByte2[0] = -95;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
    l.b(arrayOfByte2);
    return (bN.t)l;
  }
  
  public bN.t e(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(241);
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = -89;
    arrayOfByte[1] = (byte)paramInt;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t d(k paramk, F paramF, m paramm) {
    l l = u.a().b();
    l.a(241);
    byte[] arrayOfByte1 = paramm.l().getBytes();
    if (c.c(b, arrayOfByte1)) {
      byte[] arrayOfByte = new byte[2];
      arrayOfByte[0] = -96;
      arrayOfByte[1] = (byte)g.b;
      l.b(arrayOfByte);
      return (bN.t)l;
    } 
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    arrayOfByte2[0] = -96;
    arrayOfByte2[1] = (byte)g.a;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
    l.b(arrayOfByte2);
    return (bN.t)l;
  }
  
  public bN.t f(k paramk, int paramInt) {
    l l = u.a().b();
    l.a(241);
    byte[] arrayOfByte = new byte[6];
    arrayOfByte[0] = -91;
    arrayOfByte[1] = (byte)e.a;
    if (paramInt < 0) {
      paramInt = 0;
    } else if (paramInt > 1000000) {
      paramInt = 0;
    } 
    c.a(arrayOfByte, paramInt, 2, 4, paramk.g());
    D.c("Pause runtime reads for: " + paramInt + ", packet: " + c.d(arrayOfByte));
    l.b(arrayOfByte);
    return (bN.t)l;
  }
  
  public bN.t b(int paramInt) {
    l l = u.a().b();
    l.a(241);
    byte[] arrayOfByte = new byte[6];
    arrayOfByte[0] = -90;
    arrayOfByte[1] = (byte)paramInt;
    l.b(arrayOfByte);
    return (bN.t)l;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */