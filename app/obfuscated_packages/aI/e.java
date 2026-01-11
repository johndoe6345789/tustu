package aI;

import G.R;
import G.m;
import G.o;
import bH.D;
import bH.aa;
import bH.c;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class e {
  R a = null;
  
  r b = null;
  
  int c = 0;
  
  int d = 0;
  
  boolean e = false;
  
  private boolean f = true;
  
  public e(R paramR, r paramr) {
    this.a = paramR;
    this.b = paramr;
  }
  
  public File a(File paramFile, RemoteFileDescriptor paramRemoteFileDescriptor) {
    i i;
    boolean bool = false;
    this.e = false;
    long l = paramRemoteFileDescriptor.getSize();
    m m = d.a(this.a.O(), (int)paramRemoteFileDescriptor.getDirectory().getNumericId(), (int)(l / 512L));
    o o = o.d(this.a);
    o o1 = o.a(m, false, 2000);
    if (o1 == null)
      throw new RemoteAccessException("Communication failure. File " + paramRemoteFileDescriptor.getName() + " not read."); 
    if (o1.a() == 3)
      throw new RemoteAccessException(o1.c()); 
    File file = new File(paramFile, paramRemoteFileDescriptor.getName());
    if (this.f) {
      f f = new f(this, file);
    } else {
      i = new i(this, file);
    } 
    if (this.b != null)
      this.b.a(paramRemoteFileDescriptor); 
    this.c = 0;
    this.d = 0;
    aa aa = new aa();
    D.c("Starting SD file read: " + paramRemoteFileDescriptor.getName());
    aa.a();
    try {
      byte b = 0;
      do {
        o.a(false);
        m m1 = d.d(this.a.O(), b++);
        aa.b();
        if (bool)
          D.c("Reading file block. Time: " + aa.c()); 
        o.a(3000);
        o1 = o.a(m1, false, 15000);
        aa.b();
        if (bool)
          D.c("Complete Read file block. Time: " + aa.c()); 
        o.a(3000);
        if (o1 == null || o1.a() == 3) {
          String str = (o1 == null) ? "ECU returned no data" : o1.c();
          throw new RemoteAccessException(str);
        } 
        if (o1.g() == null || (o1.g()).length <= 0)
          continue; 
        if (bool)
          D.c("Begin handing data to writer. Time: " + aa.c()); 
        byte[] arrayOfByte1 = o1.g();
        int j = c.a(arrayOfByte1, 0, 2, true, false);
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 2];
        System.arraycopy(arrayOfByte1, 2, arrayOfByte2, 0, arrayOfByte2.length);
        aa.b();
        if (bool)
          D.c("Complete data prep, passing data to writer. Time: " + aa.c()); 
        i.a(arrayOfByte2);
        aa.b();
        if (bool)
          D.c("Writer has the data. Time: " + aa.c()); 
        g g = new g(this, i, j, arrayOfByte2.length, l);
        g.start();
        aa.b();
        if (!bool)
          continue; 
        D.c("Notified Listeners. Time: " + aa.c());
      } while (o1.g() != null && (o1.g()).length == 2050 && !this.e);
      if (this.e) {
        RemoteAccessException remoteAccessException = new RemoteAccessException("Download File " + paramRemoteFileDescriptor.getName() + " Cancelled.");
        remoteAccessException.setTerminalToBatch(true);
        throw remoteAccessException;
      } 
    } finally {
      i.a();
      o.a();
      o.b();
      D.c("Runtime Reads enabled.");
    } 
    return file;
  }
  
  private OutputStream a(File paramFile) {
    if (paramFile.exists())
      paramFile.delete(); 
    paramFile.getParentFile().mkdirs();
    paramFile.createNewFile();
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    return new BufferedOutputStream(fileOutputStream);
  }
  
  void a() {
    this.e = true;
  }
  
  public void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */