package business.query_builders.bQ_components;

import G.F;
import G.R;
import G.T;
import G.TostringInBnPackage;
import G.Y;
import G.m;
import V.ExceptionPrintstacktrace;
import bH.D;
import bH.c;
import bN.BnInterfaceKilo;
import bN.BnInterfaceUniform;
import bN.TostringInBnPackage;
import bU.ExceptionPrintstacktrace;
import bU.ThreadedInBuPackage;
import java.util.ArrayList;
import java.util.List;

public class BqInterfaceTango {
  private static t a = null;

  private static final byte[] b = "ALL_PC_VARS".getBytes();

  public static t a() {
    if (a == null) a = new t();
    return a;
  }

  public TostringInBnPackage b() {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(255);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = 0;
    TostringInBnPackage.b(arrayOfByte);
    return TostringInBnPackage;
  }

  public TostringInBnPackage c() {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(254);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return TostringInBnPackage;
  }

  public bN.t a(byte paramByte) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(250);
    byte[] arrayOfByte = new byte[1];
    TostringInBnPackage.b(arrayOfByte);
    TostringInBnPackage.c()[0] = paramByte;
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(235);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = 2;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = (byte) paramInt;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public List a(F paramF, BnInterfaceKilo paramk, int paramInt1, int paramInt2) {
    if (paramInt1 > paramF.ExceptionPrintstacktrace() || paramInt1 < 0)
      throw new TostringInBnPackage("Invalid Page Number: " + paramInt1);
    ArrayList<BnInterfaceKilo> arrayList = new ArrayList();
    int i = 0;
    while (true) {
      BnInterfaceKilo k1 = new BnInterfaceKilo();
      TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
      TostringInBnPackage.a(245);
      int j = (paramInt2 - i) / paramk.BnInterfaceUniform();
      int m = Math.min(255, j);
      byte[] arrayOfByte = new byte[1];
      arrayOfByte[0] = (byte) m;
      TostringInBnPackage.b(arrayOfByte);
      k1.a((bN.t) TostringInBnPackage);
      int n = paramk.BnInterfaceUniform() * m / (paramk.i() - 1);
      if (paramk.BnInterfaceUniform() * m % (paramk.i() - 1) > 0) n++;
      k1.a(n);
      i += m * paramk.BnInterfaceUniform();
      arrayList.add(k1);
      if (i >= paramInt2) return arrayList;
    }
  }

  public bN.t a(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(246);
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[2] = 0;
    arrayOfByte = c.a(arrayOfByte, paramInt, 3, 4, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public List a(BnInterfaceKilo paramk, F paramF, m paramm) {
    ArrayList<List> arrayList = new ArrayList();
    R r = T.a().c(paramF.BnInterfaceUniform());
    if (r == null)
      throw new ExceptionPrintstacktrace(
          "No Configuration found for name: " + paramF.BnInterfaceUniform());
    int[] arrayOfInt = paramm.p();
    byte[] arrayOfByte = c.a(arrayOfInt);
    int i = 0;
    int j = paramk.TostringInBnPackage() * (paramk.i() - 2) - 2;
    while (true) {
      int n = Math.min(j * paramk.BnInterfaceUniform(), arrayOfByte.length - i);
      byte[] arrayOfByte1 = new byte[n];
      System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, n);
      List list = a(paramk, arrayOfByte1, paramm);
      arrayList.add(list);
      i += n;
      if (i >= arrayOfByte.length) return arrayList;
    }
  }

  private List a(BnInterfaceKilo paramk, byte[] paramArrayOfbyte, m paramm) {
    ArrayList<TostringInBnPackage> arrayList = new ArrayList();
    byte b = 16;
    int i = b + 1;
    int j = Math.min(paramArrayOfbyte.length, paramk.i() - i);
    byte[] arrayOfByte = new byte[j + b];
    int n = paramArrayOfbyte.length;
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    arrayOfByte[0] = -93;
    c.a(arrayOfByte, n, 1, 2, paramk.ExceptionPrintstacktrace());
    c.a(arrayOfByte, paramm.f(), 3, 4, paramk.ExceptionPrintstacktrace());
    c.a(arrayOfByte, paramm.b(), 7, 4, paramk.ExceptionPrintstacktrace());
    byte b1 = 0;
    if (paramm.ExceptionPrintstacktrace()) b1 = (byte) (b1 | 0x1);
    arrayOfByte[15] = b1;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, b, j);
    TostringInBnPackage.b(arrayOfByte);
    arrayList.add(TostringInBnPackage);
    b = 1;
    i = 2;
    int i1 = j;
    if (paramArrayOfbyte.length > i1)
      do {
        TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(241);
        j = Math.min(paramArrayOfbyte.length - i1, paramk.i() - i);
        arrayOfByte = new byte[j + b];
        arrayOfByte[0] = -92;
        System.arraycopy(paramArrayOfbyte, i1, arrayOfByte, b, j);
        TostringInBnPackage.b(arrayOfByte);
        arrayList.add(TostringInBnPackage);
        i1 += j;
      } while (i1 < paramArrayOfbyte.length);
    return arrayList;
  }

  public List b(BnInterfaceKilo paramk, F paramF, m paramm) {
    ArrayList<List> arrayList = new ArrayList();
    R r = T.a().c(paramF.BnInterfaceUniform());
    if (r == null)
      throw new ExceptionPrintstacktrace(
          "No Configuration found for name: " + paramF.BnInterfaceUniform());
    if (paramm.o() > paramF.ExceptionPrintstacktrace() || paramm.o() < 0)
      throw new ExceptionPrintstacktrace("Invalid Page Number: " + paramm.o());
    Y y = r.h();
    if (paramF.f(paramm.o()) < paramm.q() + paramm.r())
      throw new ExceptionPrintstacktrace("Invalid Length, longer than page: " + paramm.r());
    int[] arrayOfInt = y.a(paramm.o(), paramm.q(), paramm.r());
    byte[] arrayOfByte = c.a(arrayOfInt);
    int i = 0;
    int j = paramk.TostringInBnPackage();
    while (true) {
      int n = Math.min(j * paramk.BnInterfaceUniform(), arrayOfByte.length - i);
      byte[] arrayOfByte1 = new byte[n];
      System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, n);
      List list = a(paramk, arrayOfByte1);
      arrayList.add(list);
      i += n;
      if (i >= arrayOfByte.length) return arrayList;
    }
  }

  private List a(BnInterfaceKilo paramk, byte[] paramArrayOfbyte) {
    ArrayList<TostringInBnPackage> arrayList = new ArrayList();
    byte b = (paramk.BnInterfaceUniform() == 1) ? 1 : (paramk.BnInterfaceUniform() - 1);
    int i = b + 1;
    int j = Math.min(paramArrayOfbyte.length, paramk.i() - i);
    byte[] arrayOfByte = new byte[j + b];
    int m = paramArrayOfbyte.length / paramk.BnInterfaceUniform();
    if (paramk.BnInterfaceUniform() * m != paramArrayOfbyte.length)
      throw new ExceptionPrintstacktrace("Payload size incorrect for current addresse granularity");
    if (paramArrayOfbyte.length > 255 * paramk.BnInterfaceUniform())
      throw new ExceptionPrintstacktrace(
          "Too much data requested for DOWNLOAD! Requested byte count: "
              + paramArrayOfbyte.length
              + ", Max allowed: "
              + (paramk.i() - b));
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(240);
    arrayOfByte[0] = (byte) m;
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, b, j);
    TostringInBnPackage.b(arrayOfByte);
    arrayList.add(TostringInBnPackage);
    int n = j;
    if (paramArrayOfbyte.length > n)
      do {
        TostringInBnPackage = BnInterfaceUniform.a().b();
        TostringInBnPackage.a(239);
        j = Math.min(paramArrayOfbyte.length - n, paramk.i() - i);
        arrayOfByte = new byte[j + b];
        int i1 = m - n / paramk.BnInterfaceUniform();
        arrayOfByte[0] = (byte) i1;
        System.arraycopy(paramArrayOfbyte, n, arrayOfByte, b, j);
        TostringInBnPackage.b(arrayOfByte);
        arrayList.add(TostringInBnPackage);
        n += j;
      } while (n < paramArrayOfbyte.length);
    return arrayList;
  }

  public bN.t d() {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(252);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t b(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(243);
    byte[] arrayOfByte = new byte[7];
    c.a(arrayOfByte, paramInt, 3, 4, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(BnInterfaceKilo paramk, boolean paramBoolean) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(230);
    byte[] arrayOfByte = new byte[2];
    if (paramBoolean) {
      arrayOfByte[0] = 1;
    } else {
      arrayOfByte[0] = 0;
    }
    arrayOfByte[1] = 0;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(BnInterfaceKilo paramk) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(249);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = 1;
    arrayOfByte[1] = 0;
    arrayOfByte[2] = 0;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t b(BnInterfaceKilo paramk) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(218);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t c(BnInterfaceKilo paramk) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(217);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t c(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(216);
    byte[] arrayOfByte = new byte[3];
    c.a(arrayOfByte, paramInt, 1, 2, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t d(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(227);
    byte[] arrayOfByte = new byte[3];
    c.a(arrayOfByte, paramInt, 1, 2, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(BnInterfaceKilo paramk, int paramInt1, int paramInt2, int paramInt3) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(226);
    byte[] arrayOfByte = new byte[5];
    c.a(arrayOfByte, paramInt1, 1, 2, paramk.ExceptionPrintstacktrace());
    arrayOfByte[3] = (byte) paramInt2;
    arrayOfByte[4] = (byte) paramInt3;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(
      BnInterfaceKilo paramk,
      boolean paramBoolean1,
      boolean paramBoolean2,
      int paramInt1,
      int paramInt2,
      byte paramByte1,
      byte paramByte2) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(224);
    byte[] arrayOfByte = new byte[7];
    byte b = 0;
    if (paramBoolean1) b = (byte) (b | 0x10);
    if (paramBoolean2) b = (byte) (b | 0x20);
    arrayOfByte[0] = b;
    c.a(arrayOfByte, paramInt1, 1, 2, paramk.ExceptionPrintstacktrace());
    c.a(arrayOfByte, paramInt2, 3, 2, paramk.ExceptionPrintstacktrace());
    arrayOfByte[5] = paramByte1;
    arrayOfByte[4] = paramByte2;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(
      BnInterfaceKilo paramk, byte paramByte1, byte paramByte2, byte paramByte3, long paramLong) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(225);
    byte[] arrayOfByte = new byte[7];
    arrayOfByte[0] = paramByte1;
    arrayOfByte[1] = paramByte2;
    arrayOfByte[2] = paramByte3;
    c.a(arrayOfByte, (int) paramLong, 3, 4, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(BnInterfaceKilo paramk, int paramInt, byte paramByte) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(222);
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = paramByte;
    c.a(arrayOfByte, paramInt, 1, 2, paramk.ExceptionPrintstacktrace());
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t ThreadedInBuPackage() {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(251);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t a(BnInterfaceKilo paramk, byte paramByte) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(221);
    byte[] arrayOfByte = new byte[1];
    arrayOfByte[0] = paramByte;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t d(BnInterfaceKilo paramk) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(220);
    byte[] arrayOfByte = new byte[0];
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t c(BnInterfaceKilo paramk, F paramF, m paramm) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    byte[] arrayOfByte1 = paramm.TostringInBnPackage().getBytes();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1];
    arrayOfByte2[0] = -95;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
    TostringInBnPackage.b(arrayOfByte2);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t ThreadedInBuPackage(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = -89;
    arrayOfByte[1] = (byte) paramInt;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t d(BnInterfaceKilo paramk, F paramF, m paramm) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    byte[] arrayOfByte1 = paramm.TostringInBnPackage().getBytes();
    if (c.c(b, arrayOfByte1)) {
      byte[] arrayOfByte = new byte[2];
      arrayOfByte[0] = -96;
      arrayOfByte[1] = (byte) ExceptionPrintstacktrace.b;
      TostringInBnPackage.b(arrayOfByte);
      return (bN.t) TostringInBnPackage;
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 2];
    arrayOfByte2[0] = -96;
    arrayOfByte2[1] = (byte) ExceptionPrintstacktrace.a;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 2, arrayOfByte1.length);
    TostringInBnPackage.b(arrayOfByte2);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t f(BnInterfaceKilo paramk, int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    byte[] arrayOfByte = new byte[6];
    arrayOfByte[0] = -91;
    arrayOfByte[1] = (byte) ThreadedInBuPackage.a;
    if (paramInt < 0) {
      paramInt = 0;
    } else if (paramInt > 1000000) {
      paramInt = 0;
    }
    c.a(arrayOfByte, paramInt, 2, 4, paramk.ExceptionPrintstacktrace());
    D.c("Pause runtime reads for: " + paramInt + ", packet: " + c.d(arrayOfByte));
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }

  public bN.t b(int paramInt) {
    TostringInBnPackage TostringInBnPackage = BnInterfaceUniform.a().b();
    TostringInBnPackage.a(241);
    byte[] arrayOfByte = new byte[6];
    arrayOfByte[0] = -90;
    arrayOfByte[1] = (byte) paramInt;
    TostringInBnPackage.b(arrayOfByte);
    return (bN.t) TostringInBnPackage;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
