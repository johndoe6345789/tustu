package bD;

import W.aA;
import bH.D;
import bH.X;
import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDownloadProgressListenerFiledownloadstarted implements FileDownloadProgressListener {
  List a = new ArrayList();
  
  List b = new ArrayList();
  
  boolean c = false;
  
  double d = 0.0D;
  
  long e = 0L;
  
  int f = 0;
  
  RemoteFileDescriptor g = null;
  
  long h = 0L;
  
  a i;
  
  public FileDownloadProgressListenerFiledownloadstarted(a parama) {
    this.i = parama;
  }
  
  public void a(RemoteFileDescriptor paramRemoteFileDescriptor) {
    if (!this.a.contains(paramRemoteFileDescriptor)) {
      this.a.add(paramRemoteFileDescriptor);
    } else {
      D.c("Tried to add a file again: " + paramRemoteFileDescriptor.getName());
    } 
  }
  
  public void fileDownloadStarted(RemoteFileDescriptor paramRemoteFileDescriptor) {
    if (!this.c) {
      this.i.a();
      this.f = this.a.size();
      Iterator<RemoteFileDescriptor> iterator = this.a.iterator();
      while (iterator.hasNext())
        this.d += ((RemoteFileDescriptor)iterator.next()).getSize(); 
      this.c = true;
      String str = "Beginning download of " + paramRemoteFileDescriptor.getName();
      if (this.f > 1)
        str = str + ", File 1 of " + this.f; 
      this.i.b().a(str);
      this.i.b().a(-1.0D);
      this.h = System.currentTimeMillis();
    } 
    this.g = paramRemoteFileDescriptor;
  }
  
  public void fileDownloadProgressUpdate(long paramLong1, long paramLong2) {
    long l = paramLong1 + this.e;
    double d = l / this.d;
    this.i.b().a(d);
    if (this.g != null) {
      double d1 = (System.currentTimeMillis() - this.h) / 1000.0D;
      String str = null;
      if (this.a.size() + this.b.size() == 1) {
        str = "Downloading " + this.g.getName() + " \t" + X.a(l) + " of " + X.a((long)this.d) + " \t" + X.a((long)(l / d1)) + "/sec";
      } else {
        str = "Downloading file " + (this.b.size() + 1) + " of " + (this.a.size() + this.b.size()) + " (" + this.g.getName() + ") \t" + X.a(l) + " of " + X.a((long)this.d) + " \t" + X.a((long)(l / d1)) + "/sec";
      } 
      this.i.b().a(str);
    } 
  }
  
  public void fileDownloadCompleted(RemoteFileDescriptor paramRemoteFileDescriptor, File paramFile) {
    this.a.remove(paramRemoteFileDescriptor);
    if (paramRemoteFileDescriptor == null || paramFile == null)
      return; 
    if (paramRemoteFileDescriptor.getSize() > paramFile.length())
      this.d -= (paramRemoteFileDescriptor.getSize() - paramFile.length()); 
    this.e += paramFile.length();
    double d = this.e / this.d;
    this.i.b().a(d);
    if (paramFile != null && paramFile.length() > 0L)
      this.b.add(paramFile); 
    if (this.a.isEmpty())
      try {
        if (this.i.c() != null) {
          g g = this.i.c();
          aA aA = g.a(this.b);
        } 
      } catch (Exception exception) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, exception);
      } finally {
        a();
      }  
  }
  
  public void a() {
    this.i.d();
    this.c = false;
    this.f = 0;
    this.e = 0L;
    this.d = 0.0D;
    this.g = null;
    this.b = new ArrayList();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */