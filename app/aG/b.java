package aG;

import G.R;
import G.aH;
import G.aM;
import G.bb;
import G.cx;
import G.dc;
import G.e;
import G.i;
import G.m;
import G.n;
import G.o;
import V.g;
import bH.D;
import bH.X;
import bH.c;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
  R a;
  
  private boolean c = true;
  
  private boolean d = false;
  
  ArrayList b = new ArrayList();
  
  public b(R paramR) {
    this.a = paramR;
  }
  
  public int a(File paramFile, n paramn) {
    a("Reading Replay Data");
    int[] arrayOfInt = a(paramn);
    byte[] arrayOfByte = c.a(arrayOfInt);
    long l = System.currentTimeMillis();
    D.c("Read " + arrayOfInt.length + " Replay bytes, begin file write.");
    a("Generating Replay Log file");
    paramn.a(0.0D);
    int i = this.a.O().ai();
    int j = arrayOfByte.length / i;
    if (paramFile.exists())
      paramFile.delete(); 
    try {
      paramFile.createNewFile();
    } catch (IOException iOException) {
      throw new RemoteAccessException("Unable to create file: " + paramFile.getAbsolutePath());
    } 
    BufferedWriter bufferedWriter = null;
    try {
      FileWriter fileWriter = new FileWriter(paramFile);
      bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("Replay Data Uploaded on: ");
      bufferedWriter.append((new Date()).toString());
      bufferedWriter.newLine();
      bufferedWriter.append(j + ",Replay Records Used");
      bufferedWriter.newLine();
      bufferedWriter.append("Record #").append(",");
      bufferedWriter.append("Time").append(",");
      ArrayList<bb> arrayList1 = this.a.t();
      if (c()) {
        arrayList1 = this.a.u();
      } else {
        arrayList1 = this.a.t();
      } 
      ArrayList<bb> arrayList2 = new ArrayList();
      int k = arrayList1.size();
      for (byte b1 = 0; b1 < k; b1++) {
        bb bb = arrayList1.get(b1);
        if (bb.s()) {
          arrayList2.add(bb);
          bufferedWriter.append(bb.aL());
          if (b1 < k - 1)
            bufferedWriter.append(","); 
        } 
      } 
      bufferedWriter.newLine();
      bufferedWriter.flush();
      arrayList1 = arrayList2;
      k = arrayList1.size();
      byte[] arrayOfByte1 = new byte[i];
      float f = 0.02F;
      if (c() && this.a.c("AFRM_Hdw_Cfg") != null) {
        aM aM = this.a.c("AFRM_Hdw_Cfg");
        int m = (int)aM.j(this.a.h());
        switch (m) {
          case 0:
            f = 0.02F;
            break;
          case 1:
            f = 0.04F;
            break;
          case 2:
            f = 0.06F;
            break;
          case 3:
            f = 0.08F;
            break;
        } 
      } 
      byte b2;
      for (b2 = 0; b2 < j; b2++) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2).append(",");
        float f1 = Math.round(1000.0F * f * b2) / 1000.0F;
        stringBuilder.append(f1).append(",");
        System.arraycopy(arrayOfByte, i * b2, arrayOfByte1, 0, arrayOfByte1.length);
        for (byte b3 = 0; b3 < k; b3++) {
          bb bb = arrayList1.get(b3);
          try {
            stringBuilder.append(bb.a(arrayOfByte1));
          } catch (g g) {
            stringBuilder.append(" ");
          } 
          if (b3 < k - 1) {
            stringBuilder.append(",");
          } else {
            stringBuilder.append(",");
            bufferedWriter.append(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
          } 
        } 
        paramn.a(0.5D * (b2 / j));
      } 
      bufferedWriter.append("Raw Log Data...").append("\n");
      for (b2 = 0; b2 < j; b2++) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2).append(",");
        float f1 = Math.round(1000.0F * f * b2) / 1000.0F;
        stringBuilder.append(X.b(f1, 2)).append(",");
        System.arraycopy(arrayOfByte, i * b2, arrayOfByte1, 0, arrayOfByte1.length);
        for (byte b3 = 0; b3 < k; b3++) {
          bb bb = arrayList1.get(b3);
          try {
            if (bb.b().equals("formula")) {
              ArrayList<aH> arrayList = i.a(bb.v(), (aH)bb);
              bb bb1 = null;
              for (byte b4 = 0; b4 < arrayList.size(); b4++) {
                if (arrayList.get(b4) instanceof bb && !((aH)arrayList.get(b4)).b().equals("formula")) {
                  bb1 = (bb)arrayList.get(b4);
                  break;
                } 
              } 
              if (bb1 != null) {
                stringBuilder.append(bb1.c(arrayOfByte1));
              } else {
                stringBuilder.append("0");
              } 
            } else {
              stringBuilder.append(bb.c(arrayOfByte1));
            } 
          } catch (g g) {
            stringBuilder.append(" ");
          } 
          if (b3 < k - 1) {
            stringBuilder.append(",");
          } else {
            stringBuilder.append(",");
            bufferedWriter.append(stringBuilder.toString());
            if (b3 < j - 1)
              bufferedWriter.newLine(); 
            bufferedWriter.flush();
          } 
        } 
        paramn.a(0.5D + 0.5D * (b2 / j));
      } 
      paramn.a(1.0D);
      o o = new o();
      o.a(1);
      paramn.a(o);
      D.c("Completed Replay File write. Time: " + (System.currentTimeMillis() - l) + "ms.");
      a("File Generation Complete");
    } catch (IOException iOException) {
      D.a(iOException);
      throw new RemoteAccessException("Unable to write to file: " + paramFile.getAbsolutePath());
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      D.a(indexOutOfBoundsException);
      throw new RemoteAccessException("Error processing Replay Data, check Replay Entry addressing offsets. " + indexOutOfBoundsException.getMessage());
    } catch (Exception exception) {
      D.a(exception);
      throw new RemoteAccessException("Error processing Replay Data, check Replay Entrys. " + exception.getMessage());
    } finally {
      if (bufferedWriter != null)
        try {
          bufferedWriter.close();
        } catch (IOException iOException) {
          Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
        }  
    } 
    return arrayOfInt.length;
  }
  
  public int[] a(n paramn) {
    this.d = true;
    try {
      boolean bool1 = b();
      boolean bool2 = c();
      if (bool2)
        return c(paramn); 
      if (bool1)
        return b(paramn); 
      throw new RemoteAccessException("Replay is not currently available.");
    } finally {
      this.d = false;
    } 
  }
  
  private boolean b() {
    return c.b(this.a);
  }
  
  private boolean c() {
    return c.a(this.a);
  }
  
  public int[] b(n paramn) {
    int i;
    String str = this.a.O().ah();
    if (str == null)
      throw new RemoteAccessException("Configuration Error, replayRecordCountParam not set!"); 
    aM aM1 = this.a.c(str);
    if (aM1 == null)
      throw new RemoteAccessException("Configuration Error, replayRecordCountParam " + aM1 + " not found!"); 
    a(3000);
    cx.b(this.a, aM1.d());
    aM aM2 = this.a.c("Key_On_Baro");
    if (aM2 != null)
      cx.b(this.a, aM2.d()); 
    dc dc = new dc();
    try {
      i = (int)aM1.j(this.a.p());
    } catch (g g) {
      D.a((Exception)g);
      throw new RemoteAccessException("Failed to get Replay Record Count");
    } 
    try {
      if (this.a.O().T())
        e.a(this.a); 
    } catch (g g) {
      D.a((Exception)g);
    } 
    m m = a.a(this.a.O(), i);
    m.b(paramn);
    boolean bool = this.a.O().H();
    int j = this.a.O().k();
    this.a.O().e(false);
    this.a.O().d(45);
    this.a.O().a(false);
    try {
      o o = dc.a(this.a, m, 3000);
      try {
        a(2000);
        e.b(this.a);
      } catch (g g) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
      if (o.a() == 3)
        throw new RemoteAccessException("Replay Read Failed! " + o.c()); 
      return o.e();
    } finally {
      this.a.O().e(bool);
      this.a.O().d(j);
    } 
  }
  
  public int[] c(n paramn) {
    int i;
    String str = this.a.O().ah();
    if (str == null)
      throw new RemoteAccessException("Configuration Error, replayRecordCountParam not set!"); 
    aM aM1 = this.a.c(str);
    if (aM1 == null)
      throw new RemoteAccessException("Configuration Error, replayRecordCountParam " + aM1 + " not found!"); 
    a(1000);
    cx.b(this.a, aM1.d());
    aM aM2 = this.a.c("Key_On_Baro");
    if (aM2 != null)
      cx.b(this.a, aM2.d()); 
    dc dc = new dc();
    try {
      i = (int)aM1.j(this.a.p());
    } catch (g g) {
      D.a((Exception)g);
      throw new RemoteAccessException("Failed to get Replay Record Count");
    } 
    try {
      if (this.a.O().T())
        e.a(this.a); 
    } catch (g g) {
      D.a((Exception)g);
    } 
    this.c = true;
    int j = i * this.a.O().ai();
    int[] arrayOfInt = new int[j];
    int k = 16384;
    int m = 65536;
    char c = 'ࠀ';
    byte[] arrayOfByte = { -14, -8, -10, -12 };
    int i1 = 0;
    boolean bool = this.a.O().H();
    int i2 = this.a.O().k();
    this.a.O().e(false);
    this.a.O().d(45);
    this.a.O().a(false);
    paramn.e();
    try {
      do {
        byte b1 = arrayOfByte[(16384 + i1) / m];
        byte b2 = (j - i1 > c) ? c : (j - i1);
        k = (16384 + i1) % m;
        a(3000);
        m m1 = a.a(this.a.O(), b1, k, b2);
        o o = dc.a(this.a, m1, 4000);
        if (o.a() != 1 || o.e() == null)
          throw new RemoteAccessException("Replay Read interrupted!\n " + o.c()); 
        int[] arrayOfInt1 = o.e();
        boolean bool1 = (arrayOfInt1.length > b2) ? b2 : arrayOfInt1.length;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt, i1, bool1);
        i1 += b2;
        paramn.a(i1 / j);
        try {
          e.c(this.a);
        } catch (g g) {
          D.b("Ping high speed baud failed.");
        } 
      } while (i1 < j - c && this.c);
    } finally {
      try {
        D.c("Replay, totalBytes=" + j + ", readBytes=" + i1);
        a(2000);
        e.b(this.a);
        if (!this.c) {
          o o = new o();
          o.a(3);
          o.a("Replay Read Cancelled");
          paramn.a(o);
        } 
      } catch (g g) {
        D.a((Exception)g);
      } 
      this.a.O().e(bool);
      this.a.O().a(bool);
      this.a.O().d(i2);
    } 
    return arrayOfInt;
  }
  
  public void a() {
    this.c = false;
  }
  
  protected void a(int paramInt) {
    this.a.C().d(System.currentTimeMillis() + paramInt);
  }
  
  private void a(String paramString) {
    for (h h : this.b)
      h.a(paramString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */