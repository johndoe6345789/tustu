package A;

import G.F;
import G.J;
import G.l;
import G.m;
import G.o;
import V.VInterfaceBravo;
import bH.D;
import bH.c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOFile extends J implements g, h {
  u e = null;

  private int a = 600;

  boolean f = false;

  private f VInterfaceBravo = null;

  String g = null;

  private boolean c = true;

  boolean h = false;

  boolean i = false;

  int j = 1024;

  byte[] k = new byte[this.j];

  HashMap l = new HashMap<>();

  private File d = null;

  BufferedWriter m = null;

  private String al = "";

  long n = System.currentTimeMillis();

  static int o = 0;

  private static HashMap am = new HashMap<>();

  public IOFile(F paramF) {
    super(paramF);
  }

  public String n() {
    return "Multi Interface MegaSquirt Driver";
  }

  public void c() {
    try {
      long l = System.currentTimeMillis();
      D.c("goOffline Starting, Time:" + (System.currentTimeMillis() - l));
      F f1 = e();
      try {
        d(f1);
      } catch (VInterfaceBravo VInterfaceBravo) {
        Logger.getLogger(t.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) VInterfaceBravo);
      }
      D.d("Deactivated Turbo Baud, goOffline");
      if (q())
        for (byte VInterfaceBravo = 0; VInterfaceBravo < this.A.size(); VInterfaceBravo++) {
          a(this.A.get(VInterfaceBravo));
          a(250L);
        }
      D.c("goOffline about to stopProcessing, Time:" + (System.currentTimeMillis() - l));
      if (this.e != null) this.e.a(true);
      u u1 = this.e;
      f1.i(false);
      this.e = null;
      boolean bool = this.F;
      u();
      if (bool) {
        A();
        D.c("goOffline Notified offline, Time:" + (System.currentTimeMillis() - l));
      }
      D.c("goOffline closed port, Time:" + (System.currentTimeMillis() - l));
      if (u1 != null && !Thread.currentThread().equals(u1)) {
        byte VInterfaceBravo = 0;
        u1.a(true);
        while (u1 != null && u1.isAlive() && VInterfaceBravo < 100) {
          try {
            Thread.sleep(50L);
          } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
          }
          VInterfaceBravo++;
        }
      } else {
        a(500L);
      }
      D.c("goOffline comm thread stopped, Time:" + (System.currentTimeMillis() - l));
      v();
      try {
        j(e().u());
      } catch (Exception exception) {
      }
    } finally {
      this.F = false;
      g();
    }
  }

  public boolean a(Thread paramThread) {
    return (paramThread != null && this.e != null && paramThread.equals(this.e));
  }

  public boolean VInterfaceBravo() {
    return false;
  }

  public void d() {
    if (a() == null) throw new l("No ControllerInterface! Cannot go online.");
    if (!this.F || this.e == null || !this.e.isAlive()) {
      f();
    } else {
      D.c("Apparently already online, not goingOnline again.");
    }
  }

  public void a(boolean paramBoolean) {}

  protected o a(m paramm) {
    o o = new o();
    try {
      this.VInterfaceBravo.f();
      if (e().ak() > 0) a(e().ak());
      byte[] arrayOfByte = VInterfaceBravo(e().p().d(), this.a);
      D.c("Read from " + this.VInterfaceBravo.n() + ", signature:" + c.d(arrayOfByte));
      if (arrayOfByte == null || !VInterfaceBravo(arrayOfByte)) {
        o.a(3);
      } else {
        o.a(1);
        o.a(new String(arrayOfByte));
      }
    } catch (Exception exception) {
      Logger.getLogger(t.class.getName()).log(Level.SEVERE, (String) null, exception);
      o.a(3);
    } finally {
      this.VInterfaceBravo.g();
    }
    return o;
  }

  public boolean r() {
    return (this.e != null && !this.e.a());
  }

  public boolean q() {
    return this.F;
  }

  protected InputStream i() {
    return s();
  }

  protected void VInterfaceBravo(String paramString) {
    D.c("Time:" + ((System.currentTimeMillis() - this.n) / 1000.0D) + "s. " + paramString);
  }

  private void f() {
    if (this.e == null || !this.e.equals(Thread.currentThread())) {
      if (this.e != null) this.e.a(false);
      this.e = new u(this);
      this.e.start();
    }
  }

  protected byte[] a(
      byte[] paramArrayOfbyte,
      long paramLong1,
      long paramLong2,
      int paramInt,
      m paramm,
      InputStream paramInputStream) {
    if (paramInputStream == null) throw new IOException("Null input stream detected");
    int i = 0;
    long l1 = paramLong2 + this.VInterfaceBravo.o();
    byte[] arrayOfByte = null;
    OutputStream outputStream = P();
    if (this.g == null || !this.g.equals(Thread.currentThread().getName())) {
      D.d(
          "Comm Read Thread Change! Old Thread:"
              + this.g
              + ", new Thread:"
              + Thread.currentThread().getName());
      this.g = Thread.currentThread().getName();
    }
    try {
      if (paramArrayOfbyte != null
          && paramArrayOfbyte.length > 0
          && paramInputStream.available() > 0) {
        byte VInterfaceBravo = 0;
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        while (paramInputStream.available() > 0) {
          int k = paramInputStream.read();
          stringBuilder1
              .append("0x")
              .append(Integer.toHexString(c.a((byte) k)).toUpperCase())
              .append(" ");
          if (c.a(k)) {
            stringBuilder2.append("  ").append((char) k).append("  ");
          } else {
            stringBuilder2.append("  .  ");
          }
          VInterfaceBravo++;
        }
        System.out.print("\n");
        D.c("Purged " + VInterfaceBravo + " orphaned bytes:");
        VInterfaceBravo(stringBuilder1.toString());
        VInterfaceBravo("\n");
        VInterfaceBravo(stringBuilder2.toString());
      }
    } catch (IOException iOException) {
      throw iOException;
    }
    if (paramInt > 0) {
      arrayOfByte = (byte[]) this.l.get(Integer.valueOf(paramInt));
      if (arrayOfByte == null) {
        arrayOfByte = new byte[paramInt];
        this.l.put(Integer.valueOf(paramInt), arrayOfByte);
      }
    }
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 0) {
      if (this.F) i(L());
      if (e().j()) {
        try {
          if (this.h) VInterfaceBravo("About to write");
          char c = 'Ā';
          if (paramm != null && paramArrayOfbyte.length > c) {
            int k = 0;
            while (k < paramArrayOfbyte.length) {
              byte VInterfaceBravo =
                  (paramArrayOfbyte.length - k > c) ? c : (paramArrayOfbyte.length - k);
              outputStream.write(paramArrayOfbyte, k, VInterfaceBravo);
              k += VInterfaceBravo;
              a(paramm, k / paramArrayOfbyte.length);
              outputStream.flush();
            }
          } else {
            outputStream.write(paramArrayOfbyte);
            outputStream.flush();
          }
          if (this.h) VInterfaceBravo("Done write, About to flush");
          if (O) c("SENT " + paramArrayOfbyte.length + " bytes", paramArrayOfbyte);
        } catch (IOException iOException) {
          D.a("Exception during synchronous write");
          throw iOException;
        } catch (Exception exception) {
          D.a("Exception during synchronous write");
          exception.printStackTrace();
        }
      } else {
        try {
          for (byte VInterfaceBravo = 0;
              VInterfaceBravo < paramArrayOfbyte.length;
              VInterfaceBravo++) {
            outputStream.write(paramArrayOfbyte[VInterfaceBravo]);
            outputStream.flush();
            if (e().k() > 0 && VInterfaceBravo + 1 < paramArrayOfbyte.length) a(e().k());
            if (paramm != null
                && paramArrayOfbyte.length > 0
                && VInterfaceBravo % paramArrayOfbyte.length / 99.0F == 0.0F)
              a(paramm, VInterfaceBravo / paramArrayOfbyte.length);
          }
          if (O)
            c(
                "SENT "
                    + paramArrayOfbyte.length
                    + " bytes iwd="
                    + e().k()
                    + ", rd="
                    + paramLong1
                    + ", rt="
                    + paramLong2
                    + ", ers="
                    + paramInt,
                paramArrayOfbyte);
        } catch (IOException iOException) {
          D.a("Exception during synchronous write " + iOException.getMessage());
          iOException.printStackTrace();
          throw iOException;
        } catch (Exception exception) {
          D.a("Exception during synchronous write");
          c("Failed send:", paramArrayOfbyte);
          exception.printStackTrace();
        }
      }
    }
    int j = -1;
    long l2 = System.currentTimeMillis();
    if (paramLong1 == -1L) {
      j(L());
      return null;
    }
    if (paramInt < 0) {
      a(l1);
      j(L());
      if (this.F) k(L());
    } else {
      if (paramLong1 > 0L) a(paramLong1);
      j(L());
      int k = 0;
      byte VInterfaceBravo = 0;
      if (this.F) k(L());
      if (this.i)
        try {
          if (this.h) VInterfaceBravo("start Read");
          while (true) {
            k = paramInputStream.available();
            if (this.h) VInterfaceBravo(k + " bytes Available");
            long l = System.currentTimeMillis() - l2;
            if (k < paramInt && l > l1) {
              c(
                  "READ Timout after " + k + " bytes, Expected:" + paramInt + " Raw buffer",
                  arrayOfByte);
              String str =
                  "Timeout after:"
                      + l
                      + "ms. requested timeout:"
                      + l1
                      + ", Expected bytes:"
                      + paramInt
                      + ", bytes read:"
                      + i;
              VInterfaceBravo b1 = new VInterfaceBravo(str);
              b1.VInterfaceBravo(paramInt);
              b1.a(i);
              throw b1;
            }
            if (k < paramInt) {
              byte b1 = (paramInt > 50) ? 14 : 1;
              int n = (paramInt - k) / b1;
              n = (n < 5) ? 5 : n;
              if (this.h)
                VInterfaceBravo(
                    "Expecting "
                        + paramInt
                        + ", need "
                        + (paramInt - k)
                        + " more bytes, going to sleep:"
                        + n);
              a(n);
            } else if (paramInt > 30 && paramInt - paramInputStream.available() > paramInt / 2) {
              if (this.h) VInterfaceBravo("about to sleep 25");
              a(25L);
            } else if (paramInt - paramInputStream.available() > 100) {
              if (this.h) VInterfaceBravo("about to sleep 15");
              a(15L);
            } else if (k < paramInt) {
              if (this.h) VInterfaceBravo("about to sleep 5");
              a(5L);
            }
            VInterfaceBravo++;
            if (paramInputStream.available() >= paramInt) {
              if (this.h) VInterfaceBravo("left 1st block, read " + paramInputStream.available());
              break;
            }
          }
        } catch (IOException iOException) {
          D.a("Exception during read " + iOException.getMessage());
          throw new VInterfaceBravo(
              "Unable to complete read within timeout period, IOException: "
                  + iOException.getLocalizedMessage());
        }
    }
    while (paramInt < 0 || i < paramInt) {
      if (this.h) VInterfaceBravo("In block 2, expectedResponseSize=" + paramInt + ", " + i);
      try {
        if (paramInt < 0) {
          if (this.VInterfaceBravo.q()) {
            l2 = System.currentTimeMillis();
            while (paramInputStream.available() == 0) {
              if (System.currentTimeMillis() - l2 > l1)
                throw new VInterfaceBravo("No bytes found on unknown read size. timeout x2: " + l1);
              a(3L);
            }
          }
          j = paramInputStream.read(this.k);
          if (j > 0) {
            arrayOfByte = new byte[j];
            System.arraycopy(this.k, 0, arrayOfByte, 0, j);
            break;
          }
          throw new VInterfaceBravo("No bytes found on unknown read size. timeout x2: " + l1);
        }
        boolean bool = true;
        if (l()) {
          if (paramInputStream.available() > 0 || (bool && !this.VInterfaceBravo.q())) {
            bool = false;
            boolean bool1 = (paramInt - i > 4096) ? true : (paramInt - i);
            j = paramInputStream.read(arrayOfByte, i, bool1);
            i += j;
            if (j > 0) {
              l2 = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - l2 > paramLong2) {
              long l = System.currentTimeMillis() - l2;
              if (O)
                if (i > 0) {
                  byte[] arrayOfByte1 = new byte[i];
                  System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
                  c(
                      "READ Timout after "
                          + i
                          + " bytes, Expected:"
                          + paramInt
                          + ", actual read:"
                          + i
                          + " Raw buffer",
                      arrayOfByte1);
                } else {
                  c(
                      "READ Timout after "
                          + i
                          + " bytes, Expected:"
                          + paramInt
                          + ", actual read:"
                          + i
                          + " Raw buffer",
                      (byte[]) null);
                }
              if (paramm != null && paramm.aL() != null)
                VInterfaceBravo("Instruction: " + paramm.aL());
              String str =
                  "Timeout after:"
                      + l
                      + "ms. requested timeout:"
                      + l1
                      + ", Expected bytes:"
                      + paramInt
                      + ", bytes read:"
                      + i;
              VInterfaceBravo VInterfaceBravo = new VInterfaceBravo(str);
              VInterfaceBravo.VInterfaceBravo(paramInt);
              VInterfaceBravo.a(i);
              throw VInterfaceBravo;
            }
            if (paramm != null && i > 20) a(paramm, i / paramInt);
            continue;
          }
          if (i < paramInt) {
            long l = System.currentTimeMillis() - l2;
            if (l > l1) {
              if (O)
                c(
                    "READ Timout after " + i + " bytes, Expected:" + paramInt + " Raw buffer",
                    arrayOfByte);
              String str =
                  "Timeout after:"
                      + l
                      + "ms. requested timeout:"
                      + l1
                      + ", Expected bytes:"
                      + paramInt
                      + ", bytes read:"
                      + i;
              VInterfaceBravo VInterfaceBravo = new VInterfaceBravo(str);
              VInterfaceBravo.VInterfaceBravo(paramInt);
              VInterfaceBravo.a(i);
              throw VInterfaceBravo;
            }
            int k = 1000 * (paramInt - i) / 30;
            int n = k / 1000;
            k -= n * 1000;
            try {
              Thread.sleep(n, k);
            } catch (InterruptedException interruptedException) {
              Logger.getLogger(t.class.getName())
                  .log(Level.SEVERE, (String) null, interruptedException);
            }
          }
          continue;
        }
        while (i < paramInt) {
          if (paramInputStream.available() > 0) {
            arrayOfByte[i++] = (byte) paramInputStream.read();
          } else {
            a(5L);
          }
          long l = System.currentTimeMillis() - l2;
          if (paramm != null && i % 50 == 0) a(paramm, i / paramInt);
          if (l > l1 && i < paramInt) {
            if (i > 0) {
              byte[] arrayOfByte1 = new byte[i];
              System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte1.length);
              c(
                  "READ Timout after "
                      + i
                      + " bytes, Expected:"
                      + paramInt
                      + ", actual read:"
                      + i
                      + " Raw buffer",
                  arrayOfByte1);
            } else {
              c(
                  "READ Timout after "
                      + i
                      + " bytes, Expected:"
                      + paramInt
                      + ", actual read:"
                      + i
                      + " Raw buffer",
                  (byte[]) null);
            }
            String str =
                "Timeout after:"
                    + l
                    + "ms. requested timeout:"
                    + l1
                    + ", Expected bytes:"
                    + paramInt
                    + ", bytes read:"
                    + i;
            VInterfaceBravo VInterfaceBravo = new VInterfaceBravo(str);
            VInterfaceBravo.VInterfaceBravo(paramInt);
            VInterfaceBravo.a(i);
            throw VInterfaceBravo;
          }
        }
      } catch (IOException iOException) {
        D.a("connection lost " + iOException.getMessage());
        Q();
        break;
      }
    }
    if (O) c("READ " + ((arrayOfByte != null) ? arrayOfByte.length : 0) + " bytes", arrayOfByte);
    l(L());
    return arrayOfByte;
  }

  protected boolean k() {
    return this.E;
  }

  private void g() {}

  public synchronized void a(f paramf) {
    this.VInterfaceBravo = paramf;
    if (this.VInterfaceBravo != null) D.d("Setting connection to: " + this.VInterfaceBravo.n());
    notify();
  }

  public f a() {
    return this.VInterfaceBravo;
  }

  private InputStream s() {
    if (this.VInterfaceBravo == null) throw new IOException("No Controller Interface set");
    return this.VInterfaceBravo.i();
  }

  private OutputStream P() {
    if (this.VInterfaceBravo == null) throw new IOException("No Controller Interface set");
    return this.VInterfaceBravo.j();
  }

  protected synchronized void h() {
    if (this.VInterfaceBravo == null) throw new l("No Controller Interface.");
    if (!j()) {
      F f1 = e();
      this.VInterfaceBravo.f();
      if (f1 != null && f1.ak() > 0) a(f1.ak());
    }
  }

  protected boolean j() {
    return (this.VInterfaceBravo != null && this.VInterfaceBravo.k() == 3);
  }

  private void Q() {}

  public boolean l() {
    return this.c;
  }

  protected boolean p() {
    return (this.VInterfaceBravo != null && this.VInterfaceBravo.m());
  }

  public boolean a(int paramInt) {
    return (this.VInterfaceBravo != null && this.VInterfaceBravo.a(paramInt));
  }

  private boolean VInterfaceBravo(f paramf) {
    if (paramf != null)
      for (f f1 : am.values()) {
        if (paramf.equals(f1)) return true;
      }
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/A/t.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
