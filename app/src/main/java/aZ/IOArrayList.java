package aZ;

import G.R;
import G.T;
import G.SerializableImpl;
import G.GInterfaceAi;
import G.SerializableImplExceptionprintstacktrace;
import G.GComponentAl;
import G.i;
import L.X;
import V.ExceptionInVPackage;
import W.WInterfaceAq;
import SerializableImplExceptionprintstacktrace.AcComponentBravo;
import SerializableImplExceptionprintstacktrace.AbstractUsingArrayList;
import SerializableImplExceptionprintstacktrace.AcInterfaceMike;
import SerializableImplExceptionprintstacktrace.AcInterfaceQuebec;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOArrayList extends ExceptionInVPackage {
  boolean p = true;
  
  int AcInterfaceQuebec = 128;
  
  k r = new k(this, 25, 1);
  
  k s = new k(this, 26, 4);
  
  k t = new k(this, 4, 20);
  
  k u = new k(this, 24, 1);
  
  int[] v = null;
  
  int w = 64;
  
  int x = 0;
  
  int y = -1;
  
  double z = 0.0D;
  
  private ArrayList N = new ArrayList();
  
  ArrayList A = null;
  
  ArrayList AcComponentBravo = null;
  
  ArrayList C = null;
  
  R[] D = null;
  
  ArrayList E = new ArrayList();
  
  public static int F = 0;
  
  public static int G = 1;
  
  public static int H = 2;
  
  public static int I = 3;
  
  public static int J = 32;
  
  public static int K = 0;
  
  public static int L = 1;
  
  private int O = 2;
  
  private int P = -1;
  
  long M = System.currentTimeMillis();
  
  public boolean ExceptionInVPackage(R[] paramArrayOfR, File paramFile) {
    int[] arrayOfInt = e(paramFile);
    String[] arrayOfString = d(arrayOfInt);
    if (paramArrayOfR.length < arrayOfString.length)
      throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString)); 
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!paramArrayOfR[b].i().equals(arrayOfString[b]))
        throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString)); 
    } 
    return true;
  }
  
  public void ExceptionInVPackage(R[] paramArrayOfR, File paramFile1, File paramFile2, boolean paramBoolean) {
    this.D = paramArrayOfR;
    this.v = e(paramFile1);
    int i = c(this.v);
    if (i > this.O)
      throw new ExceptionInVPackage("Unsupported file specification. Supported specification " + this.O + "\nFile level:" + i); 
    this.P = b(this.v);
    if ((this.P & (J ^ 0xFFFFFFFF)) == F) {
      this.w = 64;
      this.AcInterfaceQuebec = 128;
    } else if ((this.P & (J ^ 0xFFFFFFFF)) == H) {
      this.w = 128;
      this.AcInterfaceQuebec = 256;
    } else {
      throw new ExceptionInVPackage("Unsupported log type.");
    } 
    if (this.v.length != this.AcInterfaceQuebec)
      this.v = e(paramFile1); 
    String[] arrayOfString1 = d(this.v);
    boolean bool = ((this.P & J) != 0 || d(paramFile1)) ? true : false;
    e(bool);
    this.N = ExceptionInVPackage(paramArrayOfR, this.v);
    if (paramArrayOfR.length < arrayOfString1.length) {
      if (paramBoolean)
        throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString1)); 
      D.b("Fewer Controllers set up in Project than in log file: " + paramFile1.getName());
    } 
    String[] arrayOfString2 = new String[paramArrayOfR.length];
    for (byte b = 0; b < arrayOfString1.length; b++) {
      if (!paramArrayOfR[b].i().equals(arrayOfString1[b])) {
        if (paramBoolean)
          throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString1)); 
        D.b(ExceptionInVPackage(paramArrayOfR, arrayOfString1));
      } 
      arrayOfString2[b] = paramArrayOfR[b].c();
    } 
    b(false);
    ExceptionInVPackage(arrayOfString2, paramFile2.getAbsolutePath());
    d(false);
    long l = X.c();
    try {
      T.ExceptionInVPackage().c().C().d(System.currentTimeMillis() + 20000L);
      c(true);
      for (R r : paramArrayOfR)
        r.X(); 
      X.ExceptionInVPackage(true);
      this.M = System.currentTimeMillis();
      X.b(this.M);
      i.ExceptionInVPackage();
      c(paramFile1);
      AcInterfaceMike();
    } finally {
      X.ExceptionInVPackage(false);
      X.b(l);
      T.ExceptionInVPackage().c().C().d(0L);
      c(false);
      i.ExceptionInVPackage();
      for (R r : paramArrayOfR)
        r.Y(); 
    } 
  }
  
  private ArrayList ExceptionInVPackage(R[] paramArrayOfR, int[] paramArrayOfint) {
    this.AcComponentBravo = new ArrayList();
    int[] arrayOfInt = new int[2];
    boolean bool = false;
    for (char c = '\036'; c < this.AcInterfaceQuebec; c++) {
      if ((this.P & (J ^ 0xFFFFFFFF)) == F && c == '@') {
        c = 'D';
      } else if ((this.P & H) == H && c == '') {
        c = '';
      } 
      arrayOfInt[0] = paramArrayOfint[c++];
      arrayOfInt[1] = paramArrayOfint[c];
      int i = c.b(arrayOfInt, 0, 2, true, false);
      if (i == 65535)
        break; 
      AcInterfaceMike AcInterfaceMike = new AcInterfaceMike(this);
      AcInterfaceMike.e(bool);
      SerializableImpl SerializableImpl = i.ExceptionInVPackage(paramArrayOfR[0], i);
      if (SerializableImpl != null) {
        AcInterfaceMike.c(SerializableImpl.l());
        AcInterfaceMike.ExceptionInVPackage(SerializableImpl.aL());
      } else {
        D.b("No OuputChannel found for offset " + i + ", it seems likely the SD card tables have invalid data.");
      } 
      AcInterfaceMike.b(i);
      this.AcComponentBravo.add(AcInterfaceMike);
    } 
    this.A = new ArrayList();
    ArrayList<AcInterfaceMike> arrayList = new ArrayList();
    arrayList.addAll(this.AcComponentBravo);
    arrayList.addAll(this.C);
    ArrayList<AcInterfaceQuebec> arrayList1 = new ArrayList();
    for (byte b = 0; b < 1; b++) {
      R r = paramArrayOfR[b];
      for (byte b1 = 0; b1 < arrayList.size(); b1++) {
        null = r.AcInterfaceQuebec();
        while (null.hasNext()) {
          SerializableImpl SerializableImpl = null.next();
          if (!SerializableImpl.b().equals("formula") && SerializableImpl.ExceptionInVPackage() >= ((AcInterfaceMike)arrayList.get(b1)).ExceptionInVPackage() && SerializableImpl.ExceptionInVPackage() <= ((AcInterfaceMike)arrayList.get(b1)).ExceptionInVPackage() + ((AcInterfaceMike)arrayList.get(b1)).b())
            this.A.add(SerializableImpl); 
        } 
        for (SerializableImpl SerializableImpl : r.f()) {
          if (SerializableImpl.ExceptionInVPackage() == ((AcInterfaceMike)arrayList.get(b1)).ExceptionInVPackage()) {
            this.A.add(SerializableImpl);
            ((AcInterfaceMike)arrayList.get(b1)).c(SerializableImpl.l());
          } 
        } 
      } 
      null = r.AcInterfaceQuebec();
      while (null.hasNext()) {
        SerializableImpl SerializableImpl = null.next();
        if (SerializableImpl.b().equals("formula") && ExceptionInVPackage(r, this.A, SerializableImpl.aL()))
          this.A.add(SerializableImpl); 
      } 
      for (SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace : r.g()) {
        if (ExceptionInVPackage(r, SerializableImplExceptionprintstacktrace) && ExceptionInVPackage(SerializableImplExceptionprintstacktrace.ExceptionInVPackage(), this.A)) {
          AcInterfaceQuebec AcInterfaceQuebec = new AcInterfaceQuebec();
          if (b == 0) {
            AcInterfaceQuebec.ExceptionInVPackage(SerializableImplExceptionprintstacktrace.b());
          } else {
            AcInterfaceQuebec.ExceptionInVPackage(paramArrayOfR[b].c() + "." + SerializableImplExceptionprintstacktrace.b());
          } 
          AcInterfaceQuebec.ExceptionInVPackage(SerializableImplExceptionprintstacktrace);
          AcInterfaceQuebec.ExceptionInVPackage(b);
          AcInterfaceQuebec.ExceptionInVPackage(paramArrayOfR[b].g(SerializableImplExceptionprintstacktrace.ExceptionInVPackage()));
          arrayList1.add(AcInterfaceQuebec);
        } 
      } 
      for (GComponentAl GComponentAl : r.f()) {
        if (this.A.contains(GComponentAl)) {
          AcInterfaceQuebec AcInterfaceQuebec = new AcInterfaceQuebec();
          SerializableImplExceptionprintstacktrace SerializableImplExceptionprintstacktrace = new SerializableImplExceptionprintstacktrace();
          SerializableImplExceptionprintstacktrace.c(GComponentAl.aL());
          SerializableImplExceptionprintstacktrace.v(GComponentAl.aL());
          SerializableImplExceptionprintstacktrace.b(GComponentAl.aL());
          SerializableImplExceptionprintstacktrace.ExceptionInVPackage(GComponentAl.d());
          if (b == 0) {
            AcInterfaceQuebec.ExceptionInVPackage(SerializableImplExceptionprintstacktrace.b());
          } else {
            AcInterfaceQuebec.ExceptionInVPackage(paramArrayOfR[b].c() + "." + SerializableImplExceptionprintstacktrace.b());
          } 
          AcInterfaceQuebec.ExceptionInVPackage(SerializableImplExceptionprintstacktrace);
          AcInterfaceQuebec.ExceptionInVPackage(b);
          AcInterfaceQuebec.ExceptionInVPackage((SerializableImpl)GComponentAl);
          arrayList1.add(AcInterfaceQuebec);
          int i = GComponentAl.ExceptionInVPackage() + GComponentAl.l();
          this.y = (i > this.y) ? i : this.y;
        } 
      } 
    } 
    for (AcInterfaceQuebec AcInterfaceQuebec : arrayList1) {
      if (AcInterfaceQuebec.ExceptionInVPackage() == null || AcInterfaceQuebec.ExceptionInVPackage().isEmpty()) {
        D.d("No dataLogField found for channel : " + AcInterfaceQuebec.c().aL() + " , at offset: " + AcInterfaceQuebec.d());
        AcInterfaceQuebec.ExceptionInVPackage(AcInterfaceQuebec.c().aL());
      } 
    } 
    return arrayList1;
  }
  
  public double f() {
    return this.z;
  }
  
  private boolean ExceptionInVPackage(String paramString, ArrayList paramArrayList) {
    Iterator<SerializableImpl> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (((SerializableImpl)iterator.next()).aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  protected ArrayList ExceptionInVPackage(R[] paramArrayOfR) {
    return this.N;
  }
  
  private int ExceptionInVPackage(int paramInt) {
    int i = this.D[paramInt].O().n();
    if (i < this.y)
      i = this.y; 
    return i;
  }
  
  private boolean d(File paramFile) {
    int i = this.AcInterfaceQuebec;
    long l = paramFile.length();
    double d = 0.0D;
    BufferedInputStream bufferedInputStream = null;
    int AcInterfaceMike = Integer.MIN_VALUE;
    try {
      bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      bufferedInputStream.skip(i);
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[this.w - arrayOfByte1.length * 2];
      this.x = 0;
      char c = 'Ĭ';
      double d1 = 0.0D;
      byte b;
      for (b = 0; b < c; b++) {
        int n = bufferedInputStream.read(arrayOfByte1);
        if (n != arrayOfByte1.length) {
          D.c("Block is short in length, done processing.");
          break;
        } 
        byte b1 = arrayOfByte1[0];
        int i1 = c.ExceptionInVPackage(arrayOfByte1, 1, 3, true, false);
        n = bufferedInputStream.read(arrayOfByte1);
        if (n != arrayOfByte1.length) {
          D.c("Block is short in length, done processing.");
          return false;
        } 
        double d2 = c.ExceptionInVPackage(arrayOfByte1, 0, 4, true, false) * 1.28E-4D;
        if (this.z == 0.0D) {
          d1 = d2 + 0.001D;
        } else if (d2 - d1 - this.z > 10.0D || d2 - d1 - this.z < 0.0D) {
          D.d("SD Transformer, Time jump, log assumed to end. Last Time:" + this.z + ", current Time:" + d2);
          return false;
        } 
        this.z = d2 - d1;
        n = bufferedInputStream.read(arrayOfByte2);
        if (n != arrayOfByte2.length) {
          D.c("Block is short in length, done processing.");
          return false;
        } 
        if (AcInterfaceMike == Integer.MIN_VALUE) {
          AcInterfaceMike = arrayOfByte2[arrayOfByte2.length - 1];
        } else if (AcInterfaceMike != arrayOfByte2[arrayOfByte2.length - 1]) {
          D.c("block " + this.x + ", blockNumber " + i1 + " magic number change, end of log assumed.");
          return false;
        } 
        if (!ExceptionInVPackage(arrayOfByte2)) {
          D.c("block " + this.x + " unwritten, done processing.");
          return false;
        } 
        this.x++;
        if (b1 == L)
          return true; 
        if (b1 != K)
          D.b("Unknown blockType! " + b1); 
      } 
      D.d("No GPS Data found in 1st " + c + ", assuming not GPS interleaving");
      b = 0;
      return b;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Problem reading from file:\n" + paramFile.getAbsolutePath());
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Invalid MS3 SD file format:\n" + paramFile.getAbsolutePath());
    } finally {
      this.z = 0.0D;
      try {
        bufferedInputStream.close();
      } catch (IOException iOException) {
        D.b("Ms3SdLogTransformer: Failed to close file???");
      } 
    } 
  }
  
  protected void c(File paramFile) {
    AcComponentBravo b = AbstractUsingArrayList.s();
    AbstractUsingArrayList.ExceptionInVPackage(new l(this));
    int i = this.AcInterfaceQuebec;
    long l = paramFile.length();
    double d = 0.0D;
    BufferedInputStream bufferedInputStream = null;
    int AcInterfaceMike = Integer.MIN_VALUE;
    D.c("Transforming MS3 File: " + paramFile.getAbsolutePath());
    try {
      bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      bufferedInputStream.skip(i);
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[this.w - arrayOfByte1.length * 2];
      byte[] arrayOfByte3 = new byte[ExceptionInVPackage(0)];
      this.x = 0;
      double d1 = 0.0D;
      byte b1 = 0;
      byte b2 = 0;
      byte b3 = 0;
      while (this.p) {
        b3++;
        int n = bufferedInputStream.read(arrayOfByte1);
        if (n != arrayOfByte1.length) {
          D.c("Block is short in length, done processing.");
          break;
        } 
        byte b4 = arrayOfByte1[0];
        int i1 = c.ExceptionInVPackage(arrayOfByte1, 1, 3, true, false);
        n = bufferedInputStream.read(arrayOfByte1);
        if (n != arrayOfByte1.length) {
          D.c("Block is short in length, done processing.");
          break;
        } 
        double d2 = c.ExceptionInVPackage(arrayOfByte1, 0, 4, true, false) * 1.28E-4D;
        if (this.z == 0.0D) {
          d1 = d2 + 0.001D;
          b1 = 0;
        } else if (d2 - d1 - this.z > 30.0D || d2 - d1 - this.z < 0.0D) {
          D.d("SD Transformer, Time jump. Last Time:" + this.z + ", current Time:" + d2);
          b1++;
          n = bufferedInputStream.read(arrayOfByte2);
          if (b1 > 2) {
            D.d("SD Transformer, 3 Time jumps, log assumed to end. Last Time:" + this.z + ", current Time:" + d2);
            break;
          } 
          continue;
        } 
        this.z = d2 - d1;
        X.ExceptionInVPackage(X.c() + Math.round(this.z * 1000.0D));
        b1 = 0;
        n = bufferedInputStream.read(arrayOfByte2);
        if (n != arrayOfByte2.length) {
          D.c("Block is short in length, done processing.");
          break;
        } 
        if (AcInterfaceMike == Integer.MIN_VALUE) {
          AcInterfaceMike = arrayOfByte2[arrayOfByte2.length - 1];
        } else if (AcInterfaceMike != arrayOfByte2[arrayOfByte2.length - 1]) {
          D.c("block " + this.x + ", blockNumber " + i1 + " wrong magic number.");
          if (++b2 > 2) {
            D.d("SD Transformer, 3 Bad magic numbers, log assumed to end.");
            break;
          } 
          continue;
        } 
        b2 = 0;
        if (!ExceptionInVPackage(arrayOfByte2)) {
          D.c("block " + this.x + " unwritten, done processing.");
          break;
        } 
        this.x++;
        int i2 = 0;
        if (b4 == L) {
          for (AcInterfaceMike m1 : this.C) {
            System.arraycopy(arrayOfByte2, i2, arrayOfByte3, m1.ExceptionInVPackage(), m1.b());
            i2 += m1.b();
          } 
          continue;
        } 
        if (b4 == K) {
          Iterator<AcInterfaceMike> iterator = this.AcComponentBravo.iterator();
          while (iterator.hasNext()) {
            AcInterfaceMike m1 = iterator.next();
            if (m1.c() == 0) {
              if (m1.b() >= 0 && m1.ExceptionInVPackage() + m1.b() - 1 < arrayOfByte3.length) {
                System.arraycopy(arrayOfByte2, i2 + m1.d(), arrayOfByte3, m1.ExceptionInVPackage(), m1.b());
                if (b3 == 1)
                  D.c("blockOffset = " + i2 + ", adding " + m1.b() + ", channel offset = 0x" + Integer.toHexString(m1.ExceptionInVPackage()).toUpperCase() + "/" + m1.ExceptionInVPackage() + ", channel = " + m1.e()); 
                i2 += m1.b();
                continue;
              } 
              if (m1.ExceptionInVPackage() + m1.b() - 1 >= arrayOfByte3.length) {
                D.b("Offset for SD log transformation: " + m1.ExceptionInVPackage() + ", You may need to activate InternalFields to transform these fields.");
                iterator.remove();
                continue;
              } 
              if (m1.b() < 0) {
                D.b("Offset for SD log transformation: " + m1.ExceptionInVPackage() + " is invalid for the current configuration, removing.");
                iterator.remove();
                continue;
              } 
              D.c("Code error, shouldn't get here...");
            } 
          } 
          ExceptionInVPackage(this.D[0].c(), arrayOfByte3);
          double d3 = (this.x * this.w) / (l - i);
          if (d3 - d > 0.01D) {
            ExceptionInVPackage(d3);
            d = d3;
          } 
          continue;
        } 
        D.b("Unknown blockType! " + b4);
      } 
      if (this.p)
        y(); 
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Problem reading from file:\n" + paramFile.getAbsolutePath());
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Invalid MS3 SD file format:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        AbstractUsingArrayList.ExceptionInVPackage(b);
        bufferedInputStream.close();
      } catch (IOException iOException) {
        D.b("Ms3SdLogTransformer: Failed to close file???");
      } 
    } 
  }
  
  public void w() {
    this.p = false;
  }
  
  private String ExceptionInVPackage(R[] paramArrayOfR, String[] paramArrayOfString) {
    String str = "SD Log file serial signature does not match that of the project.\nConvert ExceptionInVPackage file may produce corrupt data. To avoid this message \nPlease open ExceptionInVPackage project with the ECU Definition(ini) that matches the firmware used\n when you captured the SD log file.\n";
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (b < paramArrayOfR.length && paramArrayOfR[b] != null && paramArrayOfR[b].i() != null) {
        str = str + "\nProject Serial Signature " + (b + 1) + ": " + paramArrayOfR[b].i();
      } else {
        str = str + "\nProject Signature " + (b + 1) + ": none ";
      } 
      str = str + "\nMS3 SD File Signature " + (b + 1) + ": " + paramArrayOfString[b] + "\n";
    } 
    return str;
  }
  
  private boolean ExceptionInVPackage(R paramR, ArrayList paramArrayList, String paramString) {
    SerializableImpl SerializableImpl = paramR.g(paramString);
    if (i.ExceptionInVPackage(paramString))
      return true; 
    if (paramR.c(paramString) != null)
      return true; 
    if (SerializableImpl != null && SerializableImpl.b().equals("formula")) {
      String[] arrayOfString = null;
      try {
        arrayOfString = i.f(SerializableImpl.k(), (GInterfaceAi)paramR);
      } catch (ExceptionInAxPackage u) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)u);
      } 
      if (arrayOfString != null) {
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (!ExceptionInVPackage(paramR, paramArrayList, arrayOfString[b]))
            return false; 
        } 
      } else {
        return false;
      } 
      return true;
    } 
    return paramArrayList.contains(SerializableImpl);
  }
  
  private boolean ExceptionInVPackage(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (paramArrayOfbyte[b] != 255)
        return true; 
    } 
    return false;
  }
  
  private void b(OutputStream paramOutputStream) {
    PrintWriter printWriter = new PrintWriter(paramOutputStream);
    printWriter.write("\"Capture Time:" + ExceptionInVPackage(this.v).toString());
    String[] arrayOfString = null;
    try {
      arrayOfString = d(this.v);
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
    } 
    printWriter.write("\"Signatures:");
    for (byte b = 0; b < arrayOfString.length; b++) {
      printWriter.print(arrayOfString[b]);
      if (b < arrayOfString.length - 1)
        printWriter.write("; "); 
    } 
    printWriter.print("\n");
  }
  
  public int x() {
    return this.x;
  }
  
  public Date ExceptionInVPackage(int[] paramArrayOfint) {
    long l = this.s.ExceptionInVPackage(paramArrayOfint) * 1000L;
    return new Date(l);
  }
  
  private int[] e(File paramFile) {
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      int[] arrayOfInt = new int[this.AcInterfaceQuebec];
      for (byte b = 0; b < arrayOfInt.length; b++)
        arrayOfInt[b] = fileInputStream.read(); 
      return arrayOfInt;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Failed to read header from file:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {
        D.b("MS3 SD Log Transformer: Failed to close file???");
      } 
    } 
  }
  
  private int b(int[] paramArrayOfint) {
    return paramArrayOfint[24];
  }
  
  private int c(int[] paramArrayOfint) {
    return paramArrayOfint[25];
  }
  
  private String[] d(int[] paramArrayOfint) {
    String[] arrayOfString = new String[1];
    byte b1 = 4;
    byte b2 = 20;
    byte b3 = 20;
    byte[] arrayOfByte1 = new byte[b2];
    for (byte b4 = 0; b4 < b2; b4++) {
      arrayOfByte1[b4] = (byte)paramArrayOfint[b4 + b1];
      if (arrayOfByte1[b4] == 0) {
        b3 = b4;
        break;
      } 
      if (b4 == b2 - 1)
        throw new ExceptionInVPackage("Unexpected Signature length.\nExpected null terminator at position 20."); 
    } 
    byte[] arrayOfByte2 = new byte[b3];
    for (byte b5 = 0; b5 < arrayOfByte2.length; b5++)
      arrayOfByte2[b5] = arrayOfByte1[b5]; 
    arrayOfString[0] = new String(arrayOfByte2);
    return arrayOfString;
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString, String paramString) {
    this.AbstractUsingArrayList = true;
    ExceptionInVPackage(0.0D);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramArrayOfString[0];
    paramArrayOfString = arrayOfString;
    T t = T.ExceptionInVPackage();
    R[] arrayOfR = new R[paramArrayOfString.length];
    byte b;
    for (b = 0; b < paramArrayOfString.length; b++) {
      R r = t.c(paramArrayOfString[b]);
      arrayOfR[b] = r;
      if (arrayOfR[b] == null)
        throw new ExceptionInVPackage("Configuration '" + paramArrayOfString[b] + "' not currently loaded. \nCan't start data Log."); 
    } 
    try {
      this.g = e(paramString);
      b(this.g);
      ExceptionInVPackage(arrayOfR, this.g);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Could not create file " + paramString);
    } 
    for (b = 0; b < arrayOfR.length; b++)
      this.d.add(new AcInterfaceMike((AbstractUsingArrayList)this, paramArrayOfString[b], b, arrayOfR[b].O().n())); 
  }
  
  public void ExceptionInVPackage(WInterfaceAq paramaq) {
    this.E.add(paramaq);
  }
  
  private void ExceptionInVPackage(double paramDouble) {
    Iterator<WInterfaceAq> iterator = this.E.iterator();
    while (iterator.hasNext()) {
      try {
        ((WInterfaceAq)iterator.next()).ExceptionInVPackage(paramDouble);
      } catch (Exception exception) {
        D.b("Exeption caught during progress notification. Continuing...");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void y() {
    Iterator<WInterfaceAq> iterator = this.E.iterator();
    while (iterator.hasNext()) {
      try {
        ((WInterfaceAq)iterator.next()).ExceptionInVPackage();
      } catch (Exception exception) {
        D.b("Exeption caught during progress notification (Complete). Continuing...");
        exception.printStackTrace();
      } 
    } 
  }
  
  private ArrayList e(boolean paramBoolean) {
    this.C = new ArrayList();
    if (paramBoolean) {
      String[] arrayOfString = { 
          "gps_latdeg", "gps_latmin", "gps_latmmin", "gps_londeg", "gps_lonmin", "gps_lonmmin", "gps_outstatus", "gps_altk", "gps_altm", "gps_speed", 
          "gps_course" };
      int i = 0;
      for (String str : arrayOfString) {
        SerializableImpl SerializableImpl = this.D[0].g(str);
        if (SerializableImpl != null) {
          AcInterfaceMike AcInterfaceMike = new AcInterfaceMike(this);
          AcInterfaceMike.b(SerializableImpl.ExceptionInVPackage());
          AcInterfaceMike.c(SerializableImpl.l());
          AcInterfaceMike.ExceptionInVPackage(i);
          this.C.add(AcInterfaceMike);
          i += SerializableImpl.l();
        } 
      } 
    } 
    return this.C;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */