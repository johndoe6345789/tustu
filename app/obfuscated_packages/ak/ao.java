package ak;

import V.a;
import V.f;
import W.T;
import W.V;
import W.X;
import W.m;
import ac.t;
import ac.w;
import ac.x;
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

public class ao extends V {
  private BufferedInputStream w = null;
  
  private static int x = 22;
  
  private static final int y = x;
  
  private int z = 55;
  
  private byte[] A = null;
  
  private byte[] B = null;
  
  int a = 0;
  
  long b = 0L;
  
  int e = 0;
  
  long f = 0L;
  
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
  
  List t = new ArrayList();
  
  HashMap u = new HashMap<>();
  
  String v = "";
  
  private static L J = null;
  
  public static void a(L paramL) {
    J = paramL;
  }
  
  public String i() {
    return X.I;
  }
  
  public boolean a(String paramString) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(paramString);
      this.o = file.length();
      fileInputStream = new FileInputStream(file);
      this.w = new BufferedInputStream(fileInputStream);
      this.A = new byte[8];
      int i = this.w.read(this.A);
      if (i != this.A.length)
        throw new a("Read incomplete header, file not valid?"); 
      if (this.A[0] != 77 || this.A[1] != 76 || this.A[2] != 86 || this.A[3] != 76 || this.A[4] != 71)
        throw new a("Not a valid .mlg file"); 
      this.a = c.a(this.A, 6, 2, true, false);
      if (this.a > 3)
        throw new a("File Format Version: " + this.a + "\nMaximum supported Format Version: " + '\003' + "\nYou likely need a newer version of this application to load this file."); 
      if (this.a > 1) {
        this.z = 89;
        x = 24;
      } else {
        this.z = 55;
        x = 22;
      } 
      byte[] arrayOfByte1 = new byte[x];
      System.arraycopy(this.A, 0, arrayOfByte1, 0, this.A.length);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 8];
      i = this.w.read(arrayOfByte2);
      if (i != arrayOfByte2.length)
        throw new a("Read incomplete header, file not valid?"); 
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, this.A.length, arrayOfByte2.length);
      this.A = arrayOfByte1;
      this.b = c.b(this.A, 8, 4, true, false) * 1000L;
      if (this.a == 1) {
        this.e = c.a(this.A, 12, 2, true, false);
        this.f = c.b(this.A, 14, 4, true, false);
        this.g = c.a(this.A, 18, 2, true, false);
        this.E = new byte[this.g];
        this.h = c.a(this.A, 20, 2, true, false);
        this.j = 22L;
      } else {
        this.e = c.a(this.A, 12, 4, true, false);
        this.f = c.b(this.A, 16, 4, true, false);
        this.g = c.a(this.A, 20, 2, true, false);
        this.E = new byte[this.g];
        this.h = c.a(this.A, 22, 2, true, false);
        this.j = 24L;
      } 
      this.I = this.E.length + 5;
      return true;
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
      throw new a("File not found:\n" + paramString);
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Unable to open file:\n" + paramString);
    } 
  }
  
  public void a() {
    try {
      this.w.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public Iterator b() {
    byte[] arrayOfByte = new byte[this.z];
    this.s.clear();
    this.r.clear();
    this.t.clear();
    this.l = 0;
    try {
      int i;
      for (i = 0; i < this.h; i++) {
        int n = 0;
        int i1 = -1;
        do {
          i1 = this.w.read(arrayOfByte, n, arrayOfByte.length - n);
          n += i1;
        } while (i1 != -1 && n < arrayOfByte.length);
        if (n > arrayOfByte.length)
          throw new a("Over-run reading header, expected: " + arrayOfByte.length + ", but got: " + n); 
        this.j += this.z;
        w w = a(arrayOfByte, this.a);
        this.s.add(w);
      } 
      this.k = (int)this.j;
      i = (int)(this.f - this.k);
      this.B = new byte[i];
      int j = 0;
      int k = -1;
      do {
        k = this.w.read(this.B, j, this.B.length - j);
        j += k;
      } while (k != -1 && j < this.B.length);
      if (j > this.B.length)
        throw new a("Over-run reading extended header, expected: " + arrayOfByte.length + ", but got: " + j); 
      this.n = (int)((this.o - this.f) / (this.g + 5));
      byte b = 0;
      for (w w : this.s) {
        if (w instanceof t) {
          t t = (t)w;
          List<String> list = a(this.B, t.a() - this.k, t.e());
          for (byte b1 = 0; b1 < t.e(); b1++) {
            if (list.size() > b1) {
              t.a(list.get(b1));
            } else {
              t.a("Unknown" + b++);
            } 
          } 
        } 
      } 
      if (this.e > 0) {
        int n = this.B.length - this.e - this.k;
        this.v = X.a(this.B, this.e - this.k, n);
        l();
      } 
      int m = 0;
      for (w w : this.s) {
        if (w instanceof t) {
          t t = (t)w;
          if (t.j().trim().length() > 0) {
            d d = new d();
            d.a(t.j());
            d.b(t.k());
            int n = -1;
            if (J != null)
              n = J.a(d.a()); 
            if (n >= 0) {
              d.b(n);
            } else {
              d.b(t.b());
            } 
            d.a(t.e());
            this.r.add(d);
            aq aq = new aq(this, m, t.m(), false, false, w.h());
            this.t.add(aq);
          } 
          List<String> list = t.d();
          for (byte b1 = 0; b1 < t.e() && b1 < list.size(); b1++) {
            if (!((String)list.get(b1)).equals("INVALID")) {
              d d = new d();
              d.a(list.get(b1));
              int n = -1;
              if (J != null)
                n = J.a(d.a()); 
              if (n >= 0) {
                d.b(n);
              } else if (t.b() == 2) {
                d.b(4);
              } else {
                d.b(t.b());
              } 
              this.r.add(d);
              ap ap = new ap(this, m, t.m(), b1);
              this.t.add(ap);
            } 
          } 
        } else if (w instanceof x) {
          x x = (x)w;
          d d = new d();
          d.a(x.j());
          d.b(x.k());
          d.b(x.l());
          d.a(x.a());
          d.b(x.b());
          d.a(x.c());
          this.r.add(d);
          aq aq = new aq(this, m, x.m(), x.i(), x.n(), w.h());
          this.t.add(aq);
        } 
        m += w.m();
      } 
      if (!a(this.r, "Time")) {
        d d = new d();
        d.a("Time");
        d.b("s");
        d.a(5);
        this.r.add(d);
        ar ar = new ar(this);
        this.t.add(ar);
      } 
      this.i = this.r.size();
      this.j = this.e;
      return this.r.iterator();
    } catch (IOException iOException) {
      throw new a("Error reading file: " + iOException.getLocalizedMessage());
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
      if (bool && str.startsWith("NEW_INFO_PROVIDER"))
        return; 
    } 
  }
  
  private boolean a(List paramList, String paramString) {
    for (T t : paramList) {
      if (t.a().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  private w a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length != this.z)
      throw new a("Invalid LoggerField Buffer size: " + paramArrayOfbyte.length); 
    byte b = paramArrayOfbyte[0];
    if (b == w.c || b == w.d || b == w.e || b == w.f || b == w.g || b == w.h || b == w.j || b == w.i || b == w.l || b == w.m || b == w.n || b == w.o || b == w.q || b == w.p) {
      x x = new x();
      x.b(b);
      String str1 = X.a(paramArrayOfbyte, 1, 34);
      x.b(str1);
      String str2 = X.a(paramArrayOfbyte, 35, 10);
      x.d(str2);
      byte b1 = paramArrayOfbyte[45];
      int i = -1;
      if (J != null)
        i = J.a(str1); 
      if (i >= 0) {
        x.e(i);
      } else {
        x.e(b1);
      } 
      int j = c.a(paramArrayOfbyte, 46, 4, true, true);
      float f1 = Float.intBitsToFloat(j);
      x.b(f1);
      int k = c.a(paramArrayOfbyte, 50, 4, true, true);
      float f2 = Float.intBitsToFloat(k);
      x.c(f2);
      x.a(paramArrayOfbyte[54]);
      if (paramInt > 1) {
        String str = X.a(paramArrayOfbyte, 55, 34);
        x.c(str);
      } 
      return (w)x;
    } 
    if (b == w.s || b == w.t || b == w.u || b == w.v || b == w.w) {
      t t = new t();
      t.b(b);
      String str1 = X.a(paramArrayOfbyte, 1, 34);
      t.b(str1);
      String str2 = X.a(paramArrayOfbyte, 35, 10);
      t.d(str2);
      byte b1 = paramArrayOfbyte[45];
      t.e(b1);
      t.c(paramArrayOfbyte[46]);
      int i = c.a(paramArrayOfbyte, 47, 4, true, true);
      t.b(i);
      t.a(paramArrayOfbyte[51]);
      if (paramInt > 1) {
        String str = X.a(paramArrayOfbyte, 55, 34);
        t.c(str);
      } 
      return (w)t;
    } 
    throw new a("Unknow LoggerField Type: " + b);
  }
  
  private List a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ArrayList<String> arrayList = new ArrayList();
    for (byte b = 0; b < paramInt2; b++) {
      String str = X.a(paramArrayOfbyte, paramInt1, paramArrayOfbyte.length - paramInt1);
      arrayList.add(str);
      paramInt1 += str.length() + 1;
    } 
    return arrayList;
  }
  
  public float[] c() {
    if (this.l >= 500 && k())
      throw new a("This Edition is limited to loading 500 rows of data. \nPlease Register to load large log files."); 
    this.w.mark(this.I);
    a(this.C);
    if (this.m != this.C[1]) {
      D.b("Row: " + this.l + " Unexpected record counter! Expected: " + c.b(this.m) + ", found: " + c.b(this.C[1]));
      this.m = this.C[1];
    } 
    this.m = (byte)(this.m + 1);
    if (this.C[0] == 1) {
      a(this.D);
      int i = c.a(this.D, 0, this.D.length, true, false);
      c(i);
      a(this.F);
      throw new m(X.a(this.F));
    } 
    if (this.C[0] == 0) {
      a(this.D);
      int i = c.a(this.D, 0, this.D.length, true, false);
      long l = c(i);
      a(this.E);
      a(this.G);
      byte b = 0;
      int j;
      for (j = 0; j < this.E.length; j++)
        b = (byte)(b + this.E[j]); 
      if (b != this.G[0]) {
        j = this.I;
        D.b("Record " + this.l + " CRC does not match! Expected: " + c.b((byte)(b & 0xFF)) + ", found: " + c.b(this.G[0]) + ", Record start index: 0x" + Long.toHexString(this.j - j).toUpperCase() + ", Record Size: " + j);
        if (m())
          return c(); 
      } 
      float[] arrayOfFloat = new float[this.i];
      for (byte b1 = 0; b1 < arrayOfFloat.length; b1++)
        arrayOfFloat[b1] = ((as)this.t.get(b1)).a(this.E); 
      this.l++;
      return arrayOfFloat;
    } 
    if (m()) {
      this.l--;
      return c();
    } 
    throw new a("Unsupported block type: " + this.C[0]);
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
            this.w.reset();
          } catch (IOException iOException) {
            D.d("Unable to reset for resync");
          } 
          a(this.H);
          b1++;
          this.w.mark(this.I * b2);
        } 
        a(this.C);
        if (this.C[0] == 0) {
          a(this.D);
          a(this.E);
          a(this.G);
          i = 0;
          for (byte b4 = 0; b4 < this.E.length; b4++)
            i += this.E[b4]; 
          if (b3 > 0) {
            bool = ((byte)(i & 0xFF) == this.G[0] && this.C[1] == b + 1) ? true : false;
          } else {
            bool = ((byte)(i & 0xFF) == this.G[0]) ? true : false;
          } 
          if (!bool) {
            b3 = 0;
            b = -1;
          } else {
            b = this.C[1];
          } 
          if (bool) {
            if (b3 > 0)
              D.c("Resync: Consecutive Records Passed crc and counter: " + b3); 
            break;
          } 
        } 
      } 
      bool = true;
    } 
    try {
      this.w.reset();
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
      this.p = (long)(this.p + (Math.pow(2.0D, 16.0D) + paramInt - this.q) * 10.0D);
    } 
    this.q = paramInt;
    return this.p;
  }
  
  private byte[] a(byte[] paramArrayOfbyte) {
    byte b = 0;
    int i = 0;
    do {
      int j;
      try {
        j = this.w.read(paramArrayOfbyte);
      } catch (IOException iOException) {
        Logger.getLogger(ao.class.getName()).log(Level.WARNING, "Unable to read from file.", iOException);
        throw new a("IO Error reading from file on record " + this.l + ".");
      } 
      if (j == -1) {
        if (b <= 8) {
          D.c("MLVLG EOF Reported, waiting and trying again.");
          try {
            Thread.sleep(200L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(ao.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
        } else {
          throw new f("End of file on record " + this.l + ".");
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
      if (this.w.available() > 0 && this.w.available() < this.E.length)
        D.b("File read ending prematurely. There is remaining data, but not enough for a full record."); 
      return (this.w.available() > this.E.length);
    } catch (IOException iOException) {
      Logger.getLogger(ao.class.getName()).log(Level.WARNING, "File Closed or ended", iOException);
      return false;
    } 
  }
  
  public boolean f() {
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