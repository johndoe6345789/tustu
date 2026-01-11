package aZ;

import G.R;
import G.T;
import V.a;
import W.aq;
import ac.h;
import ac.m;
import bH.D;
import bH.X;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.i;

public class f extends a {
  boolean p = true;
  
  int q = 81;
  
  g r = new g(this, 6, 2);
  
  g s = new g(this, 8, 4);
  
  g t = new g(this, 75, 4);
  
  g u = new g(this, 79, 2);
  
  g v = new g(this, 81, 2);
  
  int[] w = null;
  
  int x = 0;
  
  int y = 31;
  
  private byte[] E = null;
  
  List z = new ArrayList();
  
  int A = 1;
  
  R[] B = null;
  
  ArrayList C = new ArrayList();
  
  int D = 0;
  
  public f() {
    a(true);
  }
  
  public boolean a(R[] paramArrayOfR, File paramFile) {
    int[] arrayOfInt = c(paramFile);
    String[] arrayOfString = b(arrayOfInt);
    if (paramArrayOfR.length < arrayOfString.length)
      throw new a(a(paramArrayOfR, arrayOfString)); 
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!paramArrayOfR[b].i().equals(arrayOfString[b]))
        throw new a(a(paramArrayOfR, arrayOfString)); 
    } 
    return true;
  }
  
  public void a(R[] paramArrayOfR, File paramFile1, File paramFile2, boolean paramBoolean) {
    this.B = paramArrayOfR;
    this.w = c(paramFile1);
    this.D = 0;
    String[] arrayOfString1 = b(this.w);
    if (paramArrayOfR.length < arrayOfString1.length) {
      if (paramBoolean)
        throw new a(a(paramArrayOfR, arrayOfString1)); 
      D.b("Fewer Controllers set up in Project than in log file: " + paramFile1.getName());
    } 
    this.A = c(this.w);
    if (this.A > 3)
      throw new a("newer FRD version: " + this.A + ", Only up to FRD version 2.1 supported."); 
    if (this.A > 1.0D && !i.a().a("098532oiutewlkjg098"))
      throw new a("FRD version: " + this.A + " only supprted in registered version."); 
    if (this.A >= 2) {
      this.q = this.t.a(this.w);
      this.w = c(paramFile1);
    } 
    String[] arrayOfString2 = new String[paramArrayOfR.length];
    int i;
    for (i = 0; i < arrayOfString1.length; i++) {
      if (!paramArrayOfR[i].i().equals(arrayOfString1[i])) {
        if (paramBoolean)
          throw new a(a(paramArrayOfR, arrayOfString1)); 
        D.b(a(paramArrayOfR, arrayOfString1));
      } 
      arrayOfString2[i] = paramArrayOfR[i].c();
    } 
    if (this.A >= 2) {
      i = this.v.a(this.w);
      for (byte b = 0; b < i; b++) {
        int[] arrayOfInt = new int[this.y];
        System.arraycopy(this.w, 83 + b * this.y, arrayOfInt, 0, arrayOfInt.length);
        i i1 = new i();
        i1.a(arrayOfInt);
        this.z.add(i1);
      } 
    } 
    a(arrayOfString2, paramFile2.getAbsolutePath());
    i = this.u.a(this.w);
    int j = this.t.a(this.w);
    a(paramFile1, j, i);
    l();
  }
  
  protected void a(File paramFile, int paramInt1, int paramInt2) {
    int i = paramInt1;
    long l = paramFile.length();
    double d = 0.0D;
    BufferedInputStream bufferedInputStream = null;
    this.x = 0;
    try {
      byte[] arrayOfByte3;
      bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      bufferedInputStream.skip(i);
      byte[] arrayOfByte1 = new byte[1];
      byte[] arrayOfByte2 = new byte[paramInt2];
      if (!this.z.isEmpty()) {
        int i1 = 0;
        Iterator<i> iterator = this.z.iterator();
        while (iterator.hasNext())
          i1 += (((i)iterator.next()).d() == i.c) ? 8 : 4; 
        this.E = new byte[i1];
      } 
      if (this.A >= 3) {
        arrayOfByte3 = new byte[54];
      } else {
        arrayOfByte3 = new byte[4];
      } 
      int j = -1;
      int k = 0;
      int m = -1;
      int n = 0;
      while ((j = bufferedInputStream.read()) != -1 && this.p) {
        i++;
        if (j == 1) {
          i += bufferedInputStream.read(arrayOfByte1);
          k = c.a(arrayOfByte1[0]);
          if (m == -1) {
            m = k;
            n = k;
          } else {
            m = (this.x + n) % 256;
          } 
          if (k != m) {
            D.c("unexpected och index:" + k + ", expected:" + m + " recordsProcessed:" + this.x);
            boolean bool = true;
            int i1 = bufferedInputStream.read();
            int i2 = bufferedInputStream.read();
            int i3 = arrayOfByte2.length + this.z.size() * 4;
            for (byte b = 0; b < 3 * i3 && bool; b++) {
              if (c.a((byte)i1) == 1 && c.a((byte)i2) > m && c.a((byte)i2) < m + 5) {
                bool = false;
                this.x += 2 + b / i3;
                m = c.a((byte)i2);
                d("FRD Corruption: missing bytes ");
                break;
              } 
              i1 = i2;
              i2 = bufferedInputStream.read();
              i++;
            } 
          } 
          i += bufferedInputStream.read(arrayOfByte2);
          if (!this.z.isEmpty())
            i += bufferedInputStream.read(this.E); 
          a(this.B[0].c(), arrayOfByte2);
          this.x++;
        } else if (j == 2) {
          i += bufferedInputStream.read(arrayOfByte3);
          long l1 = c.a(arrayOfByte3, 0, 4, true, false) * 1000L;
          if (this.A >= 3) {
            byte[] arrayOfByte = new byte[50];
            System.arraycopy(arrayOfByte3, 4, arrayOfByte, 0, arrayOfByte.length);
            String str = new String(arrayOfByte);
            d("Manual: " + (new Date(l1)).toString() + str);
          } else {
            d("Manual: " + (new Date(l1)).toString());
          } 
        } else {
          D.d("Unrecognized record type while transforming log with " + (l - i) + " bytes remaining");
          if (l - i < paramInt2) {
            D.d("returning from transforming log with " + (l - i) + " bytes remaining");
            return;
          } 
          if (this.D < 10) {
            long l1 = System.currentTimeMillis();
            d("FRD Corruption: " + (new Date(l1)).toString());
            this.D++;
          } else {
            throw new a("Too many error processing " + paramFile.getName() + ", Aborting with " + i + " bytes processed and " + (l - i) + " remaining.");
          } 
        } 
        double d1 = (i - paramInt1) / l;
        if (d1 - d > 0.01D) {
          a(d1);
          d = d1;
        } 
      } 
      if (this.p)
        y(); 
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Failed to read header from file:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        bufferedInputStream.close();
      } catch (IOException iOException) {
        D.b("FrdLoTransformer: Failed to close file???");
      } 
    } 
  }
  
  protected StringBuilder a(StringBuilder paramStringBuilder) {
    if (!this.z.isEmpty() && this.E != null) {
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[4];
      byte[] arrayOfByte3 = new byte[8];
      boolean bool = false;
      for (byte b = 0; b < this.z.size(); b++) {
        i i = this.z.get(b);
        if (i.d() == i.c) {
          System.arraycopy(this.E, bool, arrayOfByte3, 0, arrayOfByte3.length);
          arrayOfByte1 = arrayOfByte3;
          bool += true;
        } else {
          System.arraycopy(this.E, bool, arrayOfByte2, 0, arrayOfByte2.length);
          arrayOfByte1 = arrayOfByte2;
          bool += true;
        } 
        try {
          double d = i.a(arrayOfByte1);
          paramStringBuilder.append(g()).append(X.b(d, i.c()));
        } catch (h h) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, h);
          paramStringBuilder.append(g()).append("NaN");
        } 
      } 
    } 
    return paramStringBuilder;
  }
  
  protected String a(String paramString) {
    if (!this.z.isEmpty())
      for (i i : this.z)
        paramString = paramString + g() + i.a();  
    return paramString;
  }
  
  protected String b(String paramString) {
    if (!this.z.isEmpty())
      for (i i : this.z)
        paramString = paramString + g() + i.b();  
    return paramString;
  }
  
  protected void a(OutputStream paramOutputStream, String paramString) {
    PrintWriter printWriter = new PrintWriter(paramOutputStream);
    b();
    printWriter.print("MARK " + X.a("" + c(), '0', 3) + " - " + paramString + " - " + (new Date()).toString() + this.a);
    printWriter.flush();
  }
  
  public void w() {
    this.p = false;
  }
  
  private String a(R[] paramArrayOfR, String[] paramArrayOfString) {
    String str = "FRD Log file signature does not match that of the project.\nThe converted file may appear corrupt. To avoid this message \nPlease open a project with the ECU Definition(ini) that matches the firmware used\n when you captured the FRD log file.\n";
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (b < paramArrayOfR.length && paramArrayOfR[b] != null && paramArrayOfR[b].i() != null) {
        str = str + "\nProject Serial Signature " + (b + 1) + ": " + paramArrayOfR[b].i();
      } else {
        str = str + "\nProject Signature " + (b + 1) + ": none ";
      } 
      str = str + "\nFRD File Signature " + (b + 1) + ": " + paramArrayOfString[b] + "\n";
    } 
    return str;
  }
  
  private void b(OutputStream paramOutputStream) {
    PrintWriter printWriter = new PrintWriter(paramOutputStream);
    printWriter.write("\"Capture Time:" + a(this.w).toString());
    String[] arrayOfString = b(this.w);
    printWriter.write("\"Signatures:");
    for (byte b = 0; b < arrayOfString.length; b++) {
      printWriter.print(arrayOfString[b]);
      if (b < arrayOfString.length - 1)
        printWriter.write("; "); 
    } 
    printWriter.print("\n");
    try {
      paramOutputStream.flush();
    } catch (Exception exception) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
  }
  
  public Date a(int[] paramArrayOfint) {
    long l = this.s.a(paramArrayOfint) * 1000L;
    return new Date(l);
  }
  
  private int[] c(File paramFile) {
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      int[] arrayOfInt = new int[this.q];
      for (byte b = 0; b < arrayOfInt.length; b++)
        arrayOfInt[b] = fileInputStream.read(); 
      return arrayOfInt;
    } catch (FileNotFoundException fileNotFoundException) {
      throw new a("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Failed to read header from file:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {
        D.b("FrdLogTransformer: Failed to close file???");
      } 
    } 
  }
  
  private String[] b(int[] paramArrayOfint) {
    String[] arrayOfString = new String[1];
    byte b1 = 12;
    byte b2 = 40;
    byte b = -1;
    byte[] arrayOfByte1 = new byte[b2];
    for (byte b3 = 0; b3 < b2; b3++) {
      arrayOfByte1[b3] = (byte)paramArrayOfint[b3 + b1];
      if (arrayOfByte1[b3] == 0) {
        b = b3;
        break;
      } 
    } 
    byte[] arrayOfByte2 = new byte[b];
    for (byte b4 = 0; b4 < arrayOfByte2.length; b4++)
      arrayOfByte2[b4] = arrayOfByte1[b4]; 
    arrayOfString[0] = new String(arrayOfByte2);
    return arrayOfString;
  }
  
  public void l() {
    this.h = false;
    try {
      for (byte b = 0; b < this.d.size(); b++) {
        m m = this.d.get(b);
        String str = m.a();
        T t = T.a();
        R r = t.c(str);
        if (r == null)
          throw new a("Configuration '" + str + "' not currently loaded. \nCan't stop data Log."); 
      } 
      a(this.g);
      this.g.close();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Could Not close log file, error\n" + exception.getMessage());
    } 
    if (this.k != null)
      this.k.a(); 
  }
  
  public void a(String[] paramArrayOfString, String paramString) {
    this.h = true;
    a(0.0D);
    T t = T.a();
    R[] arrayOfR = new R[paramArrayOfString.length];
    byte b;
    for (b = 0; b < paramArrayOfString.length; b++) {
      R r = t.c(paramArrayOfString[b]);
      arrayOfR[b] = r;
      if (arrayOfR[b] == null)
        throw new a("Configuration '" + paramArrayOfString[b] + "' not currently loaded. \nCan't start data Log."); 
    } 
    try {
      this.g = e(paramString);
      b(this.g);
      a(arrayOfR, this.g);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new a("Could not create file " + paramString);
    } 
    for (b = 0; b < arrayOfR.length; b++)
      this.d.add(new m((h)this, paramArrayOfString[b], b, arrayOfR[b].O().n())); 
  }
  
  public void a(aq paramaq) {
    this.C.add(paramaq);
  }
  
  private void a(double paramDouble) {
    Iterator<aq> iterator = this.C.iterator();
    while (iterator.hasNext()) {
      try {
        ((aq)iterator.next()).a(paramDouble);
      } catch (Exception exception) {
        D.b("Exeption caught during progress notification. Continuing...");
        exception.printStackTrace();
      } 
    } 
  }
  
  private void y() {
    Iterator<aq> iterator = this.C.iterator();
    while (iterator.hasNext()) {
      try {
        ((aq)iterator.next()).a();
      } catch (Exception exception) {
        D.b("Exeption caught during progress notification (Complete). Continuing...");
        exception.printStackTrace();
      } 
    } 
  }
  
  public int x() {
    return this.x;
  }
  
  private int c(int[] paramArrayOfint) {
    return paramArrayOfint[6] * 256 + paramArrayOfint[7];
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aZ/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */