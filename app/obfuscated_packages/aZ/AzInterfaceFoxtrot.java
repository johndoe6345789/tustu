package aZ;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import W.aq;
import ac.AbstractUsingArrayList;
import ac.AcInterfaceMike;
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
import r.RInterfaceIndia;

public class AzInterfaceFoxtrot extends ExceptionInVPackage {
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
  
  public AzInterfaceFoxtrot() {
    ExceptionInVPackage(true);
  }
  
  public boolean ExceptionInVPackage(R[] paramArrayOfR, File paramFile) {
    int[] arrayOfInt = c(paramFile);
    String[] arrayOfString = b(arrayOfInt);
    if (paramArrayOfR.length < arrayOfString.length)
      throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString)); 
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (!paramArrayOfR[b].RInterfaceIndia().equals(arrayOfString[b]))
        throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString)); 
    } 
    return true;
  }
  
  public void ExceptionInVPackage(R[] paramArrayOfR, File paramFile1, File paramFile2, boolean paramBoolean) {
    this.B = paramArrayOfR;
    this.w = c(paramFile1);
    this.D = 0;
    String[] arrayOfString1 = b(this.w);
    if (paramArrayOfR.length < arrayOfString1.length) {
      if (paramBoolean)
        throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString1)); 
      D.b("Fewer Controllers set up in Project than in log file: " + paramFile1.getName());
    } 
    this.A = c(this.w);
    if (this.A > 3)
      throw new ExceptionInVPackage("newer FRD version: " + this.A + ", Only up to FRD version 2.1 supported."); 
    if (this.A > 1.0D && !RInterfaceIndia.ExceptionInVPackage().ExceptionInVPackage("098532oiutewlkjg098"))
      throw new ExceptionInVPackage("FRD version: " + this.A + " only supprted in registered version."); 
    if (this.A >= 2) {
      this.q = this.t.ExceptionInVPackage(this.w);
      this.w = c(paramFile1);
    } 
    String[] arrayOfString2 = new String[paramArrayOfR.length];
    int RInterfaceIndia;
    for (RInterfaceIndia = 0; RInterfaceIndia < arrayOfString1.length; RInterfaceIndia++) {
      if (!paramArrayOfR[RInterfaceIndia].RInterfaceIndia().equals(arrayOfString1[RInterfaceIndia])) {
        if (paramBoolean)
          throw new ExceptionInVPackage(ExceptionInVPackage(paramArrayOfR, arrayOfString1)); 
        D.b(ExceptionInVPackage(paramArrayOfR, arrayOfString1));
      } 
      arrayOfString2[RInterfaceIndia] = paramArrayOfR[RInterfaceIndia].c();
    } 
    if (this.A >= 2) {
      RInterfaceIndia = this.v.ExceptionInVPackage(this.w);
      for (byte b = 0; b < RInterfaceIndia; b++) {
        int[] arrayOfInt = new int[this.y];
        System.arraycopy(this.w, 83 + b * this.y, arrayOfInt, 0, arrayOfInt.length);
        RInterfaceIndia i1 = new RInterfaceIndia();
        i1.ExceptionInVPackage(arrayOfInt);
        this.z.add(i1);
      } 
    } 
    ExceptionInVPackage(arrayOfString2, paramFile2.getAbsolutePath());
    RInterfaceIndia = this.u.ExceptionInVPackage(this.w);
    int j = this.t.ExceptionInVPackage(this.w);
    ExceptionInVPackage(paramFile1, j, RInterfaceIndia);
    l();
  }
  
  protected void ExceptionInVPackage(File paramFile, int paramInt1, int paramInt2) {
    int RInterfaceIndia = paramInt1;
    long l = paramFile.length();
    double d = 0.0D;
    BufferedInputStream bufferedInputStream = null;
    this.x = 0;
    try {
      byte[] arrayOfByte3;
      bufferedInputStream = new BufferedInputStream(new FileInputStream(paramFile));
      bufferedInputStream.skip(RInterfaceIndia);
      byte[] arrayOfByte1 = new byte[1];
      byte[] arrayOfByte2 = new byte[paramInt2];
      if (!this.z.isEmpty()) {
        int i1 = 0;
        Iterator<RInterfaceIndia> iterator = this.z.iterator();
        while (iterator.hasNext())
          i1 += (((RInterfaceIndia)iterator.next()).d() == RInterfaceIndia.c) ? 8 : 4; 
        this.E = new byte[i1];
      } 
      if (this.A >= 3) {
        arrayOfByte3 = new byte[54];
      } else {
        arrayOfByte3 = new byte[4];
      } 
      int j = -1;
      int k = 0;
      int AcInterfaceMike = -1;
      int n = 0;
      while ((j = bufferedInputStream.read()) != -1 && this.p) {
        RInterfaceIndia++;
        if (j == 1) {
          RInterfaceIndia += bufferedInputStream.read(arrayOfByte1);
          k = c.ExceptionInVPackage(arrayOfByte1[0]);
          if (AcInterfaceMike == -1) {
            AcInterfaceMike = k;
            n = k;
          } else {
            AcInterfaceMike = (this.x + n) % 256;
          } 
          if (k != AcInterfaceMike) {
            D.c("unexpected och index:" + k + ", expected:" + AcInterfaceMike + " recordsProcessed:" + this.x);
            boolean bool = true;
            int i1 = bufferedInputStream.read();
            int i2 = bufferedInputStream.read();
            int i3 = arrayOfByte2.length + this.z.size() * 4;
            for (byte b = 0; b < 3 * i3 && bool; b++) {
              if (c.ExceptionInVPackage((byte)i1) == 1 && c.ExceptionInVPackage((byte)i2) > AcInterfaceMike && c.ExceptionInVPackage((byte)i2) < AcInterfaceMike + 5) {
                bool = false;
                this.x += 2 + b / i3;
                AcInterfaceMike = c.ExceptionInVPackage((byte)i2);
                d("FRD Corruption: missing bytes ");
                break;
              } 
              i1 = i2;
              i2 = bufferedInputStream.read();
              RInterfaceIndia++;
            } 
          } 
          RInterfaceIndia += bufferedInputStream.read(arrayOfByte2);
          if (!this.z.isEmpty())
            RInterfaceIndia += bufferedInputStream.read(this.E); 
          ExceptionInVPackage(this.B[0].c(), arrayOfByte2);
          this.x++;
        } else if (j == 2) {
          RInterfaceIndia += bufferedInputStream.read(arrayOfByte3);
          long l1 = c.ExceptionInVPackage(arrayOfByte3, 0, 4, true, false) * 1000L;
          if (this.A >= 3) {
            byte[] arrayOfByte = new byte[50];
            System.arraycopy(arrayOfByte3, 4, arrayOfByte, 0, arrayOfByte.length);
            String str = new String(arrayOfByte);
            d("Manual: " + (new Date(l1)).toString() + str);
          } else {
            d("Manual: " + (new Date(l1)).toString());
          } 
        } else {
          D.d("Unrecognized record type while transforming log with " + (l - RInterfaceIndia) + " bytes remaining");
          if (l - RInterfaceIndia < paramInt2) {
            D.d("returning from transforming log with " + (l - RInterfaceIndia) + " bytes remaining");
            return;
          } 
          if (this.D < 10) {
            long l1 = System.currentTimeMillis();
            d("FRD Corruption: " + (new Date(l1)).toString());
            this.D++;
          } else {
            throw new ExceptionInVPackage("Too many error processing " + paramFile.getName() + ", Aborting with " + RInterfaceIndia + " bytes processed and " + (l - RInterfaceIndia) + " remaining.");
          } 
        } 
        double d1 = (RInterfaceIndia - paramInt1) / l;
        if (d1 - d > 0.01D) {
          ExceptionInVPackage(d1);
          d = d1;
        } 
      } 
      if (this.p)
        y(); 
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Failed to read header from file:\n" + paramFile.getAbsolutePath());
    } finally {
      try {
        bufferedInputStream.close();
      } catch (IOException iOException) {
        D.b("FrdLoTransformer: Failed to close file???");
      } 
    } 
  }
  
  protected StringBuilder ExceptionInVPackage(StringBuilder paramStringBuilder) {
    if (!this.z.isEmpty() && this.E != null) {
      byte[] arrayOfByte1 = new byte[4];
      byte[] arrayOfByte2 = new byte[4];
      byte[] arrayOfByte3 = new byte[8];
      boolean bool = false;
      for (byte b = 0; b < this.z.size(); b++) {
        RInterfaceIndia RInterfaceIndia = this.z.get(b);
        if (RInterfaceIndia.d() == RInterfaceIndia.c) {
          System.arraycopy(this.E, bool, arrayOfByte3, 0, arrayOfByte3.length);
          arrayOfByte1 = arrayOfByte3;
          bool += true;
        } else {
          System.arraycopy(this.E, bool, arrayOfByte2, 0, arrayOfByte2.length);
          arrayOfByte1 = arrayOfByte2;
          bool += true;
        } 
        try {
          double d = RInterfaceIndia.ExceptionInVPackage(arrayOfByte1);
          paramStringBuilder.append(g()).append(X.b(d, RInterfaceIndia.c()));
        } catch (AbstractUsingArrayList AbstractUsingArrayList) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, AbstractUsingArrayList);
          paramStringBuilder.append(g()).append("NaN");
        } 
      } 
    } 
    return paramStringBuilder;
  }
  
  protected String ExceptionInVPackage(String paramString) {
    if (!this.z.isEmpty())
      for (RInterfaceIndia RInterfaceIndia : this.z)
        paramString = paramString + g() + RInterfaceIndia.ExceptionInVPackage();  
    return paramString;
  }
  
  protected String b(String paramString) {
    if (!this.z.isEmpty())
      for (RInterfaceIndia RInterfaceIndia : this.z)
        paramString = paramString + g() + RInterfaceIndia.b();  
    return paramString;
  }
  
  protected void ExceptionInVPackage(OutputStream paramOutputStream, String paramString) {
    PrintWriter printWriter = new PrintWriter(paramOutputStream);
    b();
    printWriter.print("MARK " + X.ExceptionInVPackage("" + c(), '0', 3) + " - " + paramString + " - " + (new Date()).toString() + this.ExceptionInVPackage);
    printWriter.flush();
  }
  
  public void w() {
    this.p = false;
  }
  
  private String ExceptionInVPackage(R[] paramArrayOfR, String[] paramArrayOfString) {
    String str = "FRD Log file signature does not match that of the project.\nThe converted file may appear corrupt. To avoid this message \nPlease open ExceptionInVPackage project with the ECU Definition(ini) that matches the firmware used\n when you captured the FRD log file.\n";
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (b < paramArrayOfR.length && paramArrayOfR[b] != null && paramArrayOfR[b].RInterfaceIndia() != null) {
        str = str + "\nProject Serial Signature " + (b + 1) + ": " + paramArrayOfR[b].RInterfaceIndia();
      } else {
        str = str + "\nProject Signature " + (b + 1) + ": none ";
      } 
      str = str + "\nFRD File Signature " + (b + 1) + ": " + paramArrayOfString[b] + "\n";
    } 
    return str;
  }
  
  private void b(OutputStream paramOutputStream) {
    PrintWriter printWriter = new PrintWriter(paramOutputStream);
    printWriter.write("\"Capture Time:" + ExceptionInVPackage(this.w).toString());
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
  
  public Date ExceptionInVPackage(int[] paramArrayOfint) {
    long l = this.s.ExceptionInVPackage(paramArrayOfint) * 1000L;
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
      throw new ExceptionInVPackage("File not found:\n" + paramFile.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new ExceptionInVPackage("Failed to read header from file:\n" + paramFile.getAbsolutePath());
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
    this.AbstractUsingArrayList = false;
    try {
      for (byte b = 0; b < this.d.size(); b++) {
        AcInterfaceMike AcInterfaceMike = this.d.get(b);
        String str = AcInterfaceMike.ExceptionInVPackage();
        T t = T.ExceptionInVPackage();
        R r = t.c(str);
        if (r == null)
          throw new ExceptionInVPackage("Configuration '" + str + "' not currently loaded. \nCan't stop data Log."); 
      } 
      ExceptionInVPackage(this.g);
      this.g.close();
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Could Not close log file, error\n" + exception.getMessage());
    } 
    if (this.k != null)
      this.k.ExceptionInVPackage(); 
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString, String paramString) {
    this.AbstractUsingArrayList = true;
    ExceptionInVPackage(0.0D);
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
  
  public void ExceptionInVPackage(aq paramaq) {
    this.C.add(paramaq);
  }
  
  private void ExceptionInVPackage(double paramDouble) {
    Iterator<aq> iterator = this.C.iterator();
    while (iterator.hasNext()) {
      try {
        ((aq)iterator.next()).ExceptionInVPackage(paramDouble);
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
        ((aq)iterator.next()).ExceptionInVPackage();
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