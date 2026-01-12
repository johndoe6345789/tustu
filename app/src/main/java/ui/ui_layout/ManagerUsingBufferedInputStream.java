package ak;

import V.ExceptionInVPackage;
import V.VInterfaceFoxtrot;
import W.T;
import W.V;
import W.X;
import W.m;
import ac.AcInterfaceTango;
import ac.AcInterfaceWhiskey;
import ac.AcInterfaceXray;
import bH.D;
import bH.X;
import bH.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerUsingBufferedInputStream extends V {
  private BufferedInputStream AcInterfaceWhiskey = null;

  private static int AcInterfaceXray = 22;

  private static final int y = AcInterfaceXray;

  private int z = 55;

  private byte[] A = null;

  private byte[] B = null;

  int ExceptionInVPackage = 0;

  long b = 0L;

  int e = 0;

  long VInterfaceFoxtrot = 0L;

  int g = 0;

  int h = 0;

  int i = 0;

  private final byte[] C = new byte[2];

  private final byte[] D = new byte[2];

  private byte[] E = null;

  private byte[] F = new byte[50];

  private byte[] G = new byte[1];

  private final byte[] H = new byte[1];

  long j = 0L;

  int k = -1;

  int l = 0;

  byte m = 0;

  int n = 0;

  long o = 0L;

  long p = 0L;

  int q = -1;

  private int I = 1000;

  List r = new ArrayList();

  List s = new ArrayList();

  List AcInterfaceTango = new ArrayList();

  HashMap u = new HashMap<>();

  String v = "";

  private static L J = null;

  public static void ExceptionInVPackage(L paramL) {
    J = paramL;
  }

  public String i() {
    return X.I;
  }

  public boolean ExceptionInVPackage(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(paramString);
      this.o = file.length();
      fileInputStream = new FileInputStream(file);
      this.AcInterfaceWhiskey = new BufferedInputStream(fileInputStream);
      this.A = new byte[8];
      int i = this.AcInterfaceWhiskey.read(this.A);
      if (i != this.A.length)
        throw new ExceptionInVPackage("Read incomplete header, file not valid?");
      if (this.A[0] != 77
          || this.A[1] != 76
          || this.A[2] != 86
          || this.A[3] != 76
          || this.A[4] != 71)
        throw new ExceptionInVPackage("Not ExceptionInVPackage valid .mlg file");
      this.ExceptionInVPackage = c.ExceptionInVPackage(this.A, 6, 2, true, false);
      if (this.ExceptionInVPackage > 3)
        throw new ExceptionInVPackage(
            "File Format Version: "
                + this.ExceptionInVPackage
                + "\nMaximum supported Format Version: "
                + '\003'
                + "\n"
                + "You likely need ExceptionInVPackage newer version of this application to load"
                + " this file.");
      if (this.ExceptionInVPackage > 1) {
        this.z = 89;
        AcInterfaceXray = 24;
      } else {
        this.z = 55;
        AcInterfaceXray = 22;
      }
      byte[] arrayOfByte1 = new byte[AcInterfaceXray];
      System.arraycopy(this.A, 0, arrayOfByte1, 0, this.A.length);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 8];
      i = this.AcInterfaceWhiskey.read(arrayOfByte2);
      if (i != arrayOfByte2.length)
        throw new ExceptionInVPackage("Read incomplete header, file not valid?");
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, this.A.length, arrayOfByte2.length);
      this.A = arrayOfByte1;
      this.b = c.b(this.A, 8, 4, true, false) * 1000L;
      if (this.ExceptionInVPackage == 1) {
        this.e = c.ExceptionInVPackage(this.A, 12, 2, true, false);
        this.VInterfaceFoxtrot = c.b(this.A, 14, 4, true, false);
        this.g = c.ExceptionInVPackage(this.A, 18, 2, true, false);
        this.E = new byte[this.g];
        this.h = c.ExceptionInVPackage(this.A, 20, 2, true, false);
        this.j = 22L;
      } else {
        this.e = c.ExceptionInVPackage(this.A, 12, 4, true, false);
        this.VInterfaceFoxtrot = c.b(this.A, 16, 4, true, false);
        this.g = c.ExceptionInVPackage(this.A, 20, 2, true, false);
        this.E = new byte[this.g];
        this.h = c.ExceptionInVPackage(this.A, 22, 2, true, false);
        this.j = 24L;
      }
      this.I = this.E.length + 5;
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw new ExceptionInVPackage("File not found:\n" + paramString);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Unable to open file:\n" + paramString);
    }
  }

  public void ExceptionInVPackage() {
    try {
      this.AcInterfaceWhiskey.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    }
  }

  public Iterator b() {
    byte[] arrayOfByte = new byte[this.z];
    this.s.clear();
    this.r.clear();
    this.AcInterfaceTango.clear();
    this.l = 0;
    try {
      int i;
      for (i = 0; i < this.h; i++) {
        int n = 0;
        int i1 = -1;
        do {
          i1 = this.AcInterfaceWhiskey.read(arrayOfByte, n, arrayOfByte.length - n);
          n += i1;
        } while (i1 != -1 && n < arrayOfByte.length);
        if (n > arrayOfByte.length)
          throw new ExceptionInVPackage(
              "Over-run reading header, expected: " + arrayOfByte.length + ", but got: " + n);
        this.j += this.z;
        AcInterfaceWhiskey AcInterfaceWhiskey =
            ExceptionInVPackage(arrayOfByte, this.ExceptionInVPackage);
        this.s.add(AcInterfaceWhiskey);
      }
      this.k = (int) this.j;
      i = (int) (this.VInterfaceFoxtrot - this.k);
      this.B = new byte[i];
      int j = 0;
      int k = -1;
      do {
        k = this.AcInterfaceWhiskey.read(this.B, j, this.B.length - j);
        j += k;
      } while (k != -1 && j < this.B.length);
      if (j > this.B.length)
        throw new ExceptionInVPackage(
            "Over-run reading extended header, expected: "
                + arrayOfByte.length
                + ", but got: "
                + j);
      this.n = (int) ((this.o - this.VInterfaceFoxtrot) / (this.g + 5));
      byte b = 0;
      for (AcInterfaceWhiskey AcInterfaceWhiskey : this.s) {
        if (AcInterfaceWhiskey instanceof AcInterfaceTango) {
          AcInterfaceTango AcInterfaceTango = (AcInterfaceTango) AcInterfaceWhiskey;
          List<String> list =
              ExceptionInVPackage(
                  this.B, AcInterfaceTango.ExceptionInVPackage() - this.k, AcInterfaceTango.e());
          for (byte b1 = 0; b1 < AcInterfaceTango.e(); b1++) {
            if (list.size() > b1) {
              AcInterfaceTango.ExceptionInVPackage(list.get(b1));
            } else {
              AcInterfaceTango.ExceptionInVPackage("Unknown" + b++);
            }
          }
        }
      }
      if (this.e > 0) {
        int n = this.B.length - this.e - this.k;
        this.v = X.ExceptionInVPackage(this.B, this.e - this.k, n);
        l();
      }
      int m = 0;
      for (AcInterfaceWhiskey AcInterfaceWhiskey : this.s) {
        if (AcInterfaceWhiskey instanceof AcInterfaceTango) {
          AcInterfaceTango AcInterfaceTango = (AcInterfaceTango) AcInterfaceWhiskey;
          if (AcInterfaceTango.j().trim().length() > 0) {
            d d = new d();
            d.ExceptionInVPackage(AcInterfaceTango.j());
            d.b(AcInterfaceTango.k());
            int n = -1;
            if (J != null) n = J.ExceptionInVPackage(d.ExceptionInVPackage());
            if (n >= 0) {
              d.b(n);
            } else {
              d.b(AcInterfaceTango.b());
            }
            d.ExceptionInVPackage(AcInterfaceTango.e());
            this.r.add(d);
            aq aq = new aq(this, m, AcInterfaceTango.m(), false, false, AcInterfaceWhiskey.h());
            this.AcInterfaceTango.add(aq);
          }
          List<String> list = AcInterfaceTango.d();
          for (byte b1 = 0; b1 < AcInterfaceTango.e() && b1 < list.size(); b1++) {
            if (!((String) list.get(b1)).equals("INVALID")) {
              d d = new d();
              d.ExceptionInVPackage(list.get(b1));
              int n = -1;
              if (J != null) n = J.ExceptionInVPackage(d.ExceptionInVPackage());
              if (n >= 0) {
                d.b(n);
              } else if (AcInterfaceTango.b() == 2) {
                d.b(4);
              } else {
                d.b(AcInterfaceTango.b());
              }
              this.r.add(d);
              ap ap = new ap(this, m, AcInterfaceTango.m(), b1);
              this.AcInterfaceTango.add(ap);
            }
          }
        } else if (AcInterfaceWhiskey instanceof AcInterfaceXray) {
          AcInterfaceXray AcInterfaceXray = (AcInterfaceXray) AcInterfaceWhiskey;
          d d = new d();
          d.ExceptionInVPackage(AcInterfaceXray.j());
          d.b(AcInterfaceXray.k());
          d.b(AcInterfaceXray.l());
          d.ExceptionInVPackage(AcInterfaceXray.ExceptionInVPackage());
          d.b(AcInterfaceXray.b());
          d.ExceptionInVPackage(AcInterfaceXray.c());
          this.r.add(d);
          aq aq =
              new aq(
                  this,
                  m,
                  AcInterfaceXray.m(),
                  AcInterfaceXray.i(),
                  AcInterfaceXray.n(),
                  AcInterfaceWhiskey.h());
          this.AcInterfaceTango.add(aq);
        }
        m += AcInterfaceWhiskey.m();
      }
      if (!ExceptionInVPackage(this.r, "Time")) {
        d d = new d();
        d.ExceptionInVPackage("Time");
        d.b("s");
        d.ExceptionInVPackage(5);
        this.r.add(d);
        ar ar = new ar(this);
        this.AcInterfaceTango.add(ar);
      }
      this.i = this.r.size();
      this.j = this.e;
      return this.r.iterator();
    } catch (IOException iOException) {
      throw new ExceptionInVPackage("Error reading file: " + iOException.getLocalizedMessage());
    }
  }

  private void l() {
    Scanner scanner = new Scanner(this.v);
    boolean bool = false;
    while (scanner.hasNextLine()) {
      String str = scanner.nextLine();
      if (str.contains("NEW_INFO_PROVIDER,[FooterData]")) {
        bool = true;
        continue;
      }
      if (bool && str.contains("=")) {
        String str1 = str.substring(0, str.indexOf("="));
        String str2 = str.substring(str.indexOf("=") + 1);
        this.u.put(str1, str2);
        continue;
      }
      if (bool && str.startsWith("NEW_INFO_PROVIDER")) return;
    }
  }

  private boolean ExceptionInVPackage(List paramList, String paramString) {
    for (T AcInterfaceTango : paramList) {
      if (AcInterfaceTango.ExceptionInVPackage().equals(paramString)) return true;
    }
    return false;
  }

  private AcInterfaceWhiskey ExceptionInVPackage(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length != this.z)
      throw new ExceptionInVPackage("Invalid LoggerField Buffer size: " + paramArrayOfbyte.length);
    byte b = paramArrayOfbyte[0];
    if (b == AcInterfaceWhiskey.c
        || b == AcInterfaceWhiskey.d
        || b == AcInterfaceWhiskey.e
        || b == AcInterfaceWhiskey.VInterfaceFoxtrot
        || b == AcInterfaceWhiskey.g
        || b == AcInterfaceWhiskey.h
        || b == AcInterfaceWhiskey.j
        || b == AcInterfaceWhiskey.i
        || b == AcInterfaceWhiskey.l
        || b == AcInterfaceWhiskey.m
        || b == AcInterfaceWhiskey.n
        || b == AcInterfaceWhiskey.o
        || b == AcInterfaceWhiskey.q
        || b == AcInterfaceWhiskey.p) {
      AcInterfaceXray AcInterfaceXray = new AcInterfaceXray();
      AcInterfaceXray.b(b);
      String str1 = X.ExceptionInVPackage(paramArrayOfbyte, 1, 34);
      AcInterfaceXray.b(str1);
      String str2 = X.ExceptionInVPackage(paramArrayOfbyte, 35, 10);
      AcInterfaceXray.d(str2);
      byte b1 = paramArrayOfbyte[45];
      int i = -1;
      if (J != null) i = J.ExceptionInVPackage(str1);
      if (i >= 0) {
        AcInterfaceXray.e(i);
      } else {
        AcInterfaceXray.e(b1);
      }
      int j = c.ExceptionInVPackage(paramArrayOfbyte, 46, 4, true, true);
      float f1 = Float.intBitsToFloat(j);
      AcInterfaceXray.b(f1);
      int k = c.ExceptionInVPackage(paramArrayOfbyte, 50, 4, true, true);
      float f2 = Float.intBitsToFloat(k);
      AcInterfaceXray.c(f2);
      AcInterfaceXray.ExceptionInVPackage(paramArrayOfbyte[54]);
      if (paramInt > 1) {
        String str = X.ExceptionInVPackage(paramArrayOfbyte, 55, 34);
        AcInterfaceXray.c(str);
      }
      return (AcInterfaceWhiskey) AcInterfaceXray;
    }
    if (b == AcInterfaceWhiskey.s
        || b == AcInterfaceWhiskey.AcInterfaceTango
        || b == AcInterfaceWhiskey.u
        || b == AcInterfaceWhiskey.v
        || b == AcInterfaceWhiskey.AcInterfaceWhiskey) {
      AcInterfaceTango AcInterfaceTango = new AcInterfaceTango();
      AcInterfaceTango.b(b);
      String str1 = X.ExceptionInVPackage(paramArrayOfbyte, 1, 34);
      AcInterfaceTango.b(str1);
      String str2 = X.ExceptionInVPackage(paramArrayOfbyte, 35, 10);
      AcInterfaceTango.d(str2);
      byte b1 = paramArrayOfbyte[45];
      AcInterfaceTango.e(b1);
      AcInterfaceTango.c(paramArrayOfbyte[46]);
      int i = c.ExceptionInVPackage(paramArrayOfbyte, 47, 4, true, true);
      AcInterfaceTango.b(i);
      AcInterfaceTango.ExceptionInVPackage(paramArrayOfbyte[51]);
      if (paramInt > 1) {
        String str = X.ExceptionInVPackage(paramArrayOfbyte, 55, 34);
        AcInterfaceTango.c(str);
      }
      return (AcInterfaceWhiskey) AcInterfaceTango;
    }
    throw new ExceptionInVPackage("Unknow LoggerField Type: " + b);
  }

  private List ExceptionInVPackage(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < paramInt2; b++) {
      String str =
          X.ExceptionInVPackage(paramArrayOfbyte, paramInt1, paramArrayOfbyte.length - paramInt1);
      arrayList.add(str);
      paramInt1 += str.length() + 1;
    }
    return arrayList;
  }

  public float[] c() {
    if (this.l >= 500 && k())
      throw new ExceptionInVPackage(
          "This Edition is limited to loading 500 rows of data. \n"
              + "Please Register to load large log files.");
    this.AcInterfaceWhiskey.mark(this.I);
    ExceptionInVPackage(this.C);
    if (this.m != this.C[1]) {
      D.b(
          "Row: "
              + this.l
              + " Unexpected record counter! Expected: "
              + c.b(this.m)
              + ", found: "
              + c.b(this.C[1]));
      this.m = this.C[1];
    }
    this.m = (byte) (this.m + 1);
    if (this.C[0] == 1) {
      ExceptionInVPackage(this.D);
      int i = c.ExceptionInVPackage(this.D, 0, this.D.length, true, false);
      c(i);
      ExceptionInVPackage(this.F);
      throw new m(X.ExceptionInVPackage(this.F));
    }
    if (this.C[0] == 0) {
      ExceptionInVPackage(this.D);
      int i = c.ExceptionInVPackage(this.D, 0, this.D.length, true, false);
      long l = c(i);
      ExceptionInVPackage(this.E);
      ExceptionInVPackage(this.G);
      byte b = 0;
      int j;
      for (j = 0; j < this.E.length; j++) b = (byte) (b + this.E[j]);
      if (b != this.G[0]) {
        j = this.I;
        D.b(
            "Record "
                + this.l
                + " CRC does not match! Expected: "
                + c.b((byte) (b & 0xFF))
                + ", found: "
                + c.b(this.G[0])
                + ", Record start index: 0x"
                + Long.toHexString(this.j - j).toUpperCase()
                + ", Record Size: "
                + j);
        if (m()) return c();
      }
      float[] arrayOfFloat = new float[this.i];
      for (byte b1 = 0; b1 < arrayOfFloat.length; b1++)
        arrayOfFloat[b1] = ((as) this.AcInterfaceTango.get(b1)).ExceptionInVPackage(this.E);
      this.l++;
      return arrayOfFloat;
    }
    if (m()) {
      this.l--;
      return c();
    }
    throw new ExceptionInVPackage("Unsupported block type: " + this.C[0]);
  }

  private boolean m() {
    int i = 0;
    byte b1 = 0;
    D.c("Corrupt data in log, attempting to resync.NaN");
    byte b2 = 3;
    boolean bool = false;
    byte b = this.m;
    long l = this.j;
    for (byte b3 = 0; b3 < b2; b3++) {
      while (true) {
        if (!bool) {
          try {
            this.AcInterfaceWhiskey.reset();
          } catch (IOException iOException) {
            D.d("Unable to reset for resync");
          }
          ExceptionInVPackage(this.H);
          b1++;
          this.AcInterfaceWhiskey.mark(this.I * b2);
        }
        ExceptionInVPackage(this.C);
        if (this.C[0] == 0) {
          ExceptionInVPackage(this.D);
          ExceptionInVPackage(this.E);
          ExceptionInVPackage(this.G);
          i = 0;
          for (byte b4 = 0; b4 < this.E.length; b4++) i += this.E[b4];
          if (b3 > 0) {
            bool = ((byte) (i & 0xFF) == this.G[0] && this.C[1] == b + 1) ? true : false;
          } else {
            bool = ((byte) (i & 0xFF) == this.G[0]) ? true : false;
          }
          if (!bool) {
            b3 = 0;
            b = -1;
          } else {
            b = this.C[1];
          }
          if (bool) {
            if (b3 > 0) D.c("Resync: Consecutive Records Passed crc and counter: " + b3);
            break;
          }
        }
      }
      bool = true;
    }
    try {
      this.AcInterfaceWhiskey.reset();
      D.d("Found " + b2 + " valid record(s), ReSynced. Bytes Skipped: " + b1);
      this.j = l + b1;
      return true;
    } catch (IOException iOException) {
      D.d("Resync failed, invalid mark");
      return false;
    }
  }

  private long c(int paramInt) {
    if (this.q == -1) {
      this.p = 0L;
    } else if (paramInt > this.q) {
      this.p += ((paramInt - this.q) * 10);
    } else {
      this.p = (long) (this.p + (Math.pow(2.0D, 16.0D) + paramInt - this.q) * 10.0D);
    }
    this.q = paramInt;
    return this.p;
  }

  private byte[] ExceptionInVPackage(byte[] paramArrayOfbyte) {
    byte b = 0;
    int i = 0;
    do {
      int j;
      try {
        j = this.AcInterfaceWhiskey.read(paramArrayOfbyte);
      } catch (IOException iOException) {
        Logger.getLogger(ao.class.getName())
            .log(Level.WARNING, "Unable to read from file.", iOException);
        throw new ExceptionInVPackage("IO Error reading from file on record " + this.l + ".");
      }
      if (j == -1) {
        if (b <= 8) {
          D.c("MLVLG EOF Reported, waiting and trying again.");
          try {
            Thread.sleep(200L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(ao.class.getName())
                .log(Level.SEVERE, (String) null, interruptedException);
          }
        } else {
          throw new VInterfaceFoxtrot("End of file on record " + this.l + ".");
        }
      } else {
        i += j;
      }
    } while (i < paramArrayOfbyte.length && b++ < 10);
    this.j += paramArrayOfbyte.length;
    return paramArrayOfbyte;
  }

  public long d() {
    return this.n;
  }

  public boolean e() {
    try {
      if (this.AcInterfaceWhiskey.available() > 0
          && this.AcInterfaceWhiskey.available() < this.E.length)
        D.b(
            "File read ending prematurely. There is remaining data, but not enough for"
                + " ExceptionInVPackage full record.");
      return (this.AcInterfaceWhiskey.available() > this.E.length);
    } catch (IOException iOException) {
      Logger.getLogger(ao.class.getName()).log(Level.WARNING, "File Closed or ended", iOException);
      return false;
    }
  }

  public boolean VInterfaceFoxtrot() {
    return false;
  }

  public HashMap g() {
    return this.u;
  }

  public String h() {
    return this.v;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
