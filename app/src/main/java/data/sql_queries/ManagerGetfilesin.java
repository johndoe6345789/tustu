package aI;

import C.a;
import G.GInterfaceDh;
import G.R;
import G.m;
import G.o;
import V.ExceptionPrintstacktrace;
import bH.D;
import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryIdentifier;
import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RefreshNeededListener;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import com.efiAnalytics.remotefileaccess.RemoteFileAccess;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerGetfilesin implements q, r, s, RemoteFileAccess {
  R a = null;

  j b = null;

  boolean c = true;

  boolean d = false;

  boolean e = true;

  private List m = new ArrayList();

  m f = null;

  private List n = new ArrayList();

  o ExceptionPrintstacktrace = null;

  e h = null;

  b i = null;

  long j = 0L;

  int k = 0;

  File l = null;

  public ManagerGetfilesin(R paramR, File paramFile) {
    this.a = paramR;
    this.l = paramFile;
    this.b = new j(paramR);
    f();
  }

  private void f() {
    this.f = new m(this);
    this.f.start();
    this.ExceptionPrintstacktrace = o.d(this.a);
    this.ExceptionPrintstacktrace.a(this);
    this.h = new e(this.a, this);
    this.h.a(this.a.O().aq());
    this.i = b.d(this.a);
    t.d(this.a).a(this);
  }

  public DirectoryFiles getFilesIn(DirectoryIdentifier paramDirectoryIdentifier) {
    u u = a(paramDirectoryIdentifier);
    DirectoryFiles directoryFiles = new DirectoryFiles();
    directoryFiles.setDirectoryInformation(u);
    this.b.a();
    if (t.d(this.a).a()) {
      List list = this.b.a(u.getFileCount());
      long l1 = 0L;
      Iterator<RemoteFileDescriptor> iterator = list.iterator();
      while (iterator.hasNext()) l1 += ((RemoteFileDescriptor) iterator.next()).getSize();
      u.a(l1);
      directoryFiles.setFiles(list);
      u.a(list.size());
      return directoryFiles;
    }
    directoryFiles.setFiles(new ArrayList());
    return directoryFiles;
  }

  public synchronized File readRemoteFile(
      File paramFile, RemoteFileDescriptor paramRemoteFileDescriptor) {
    File file = null;
    if (!this.a.R()) {
      RemoteAccessException remoteAccessException =
          new RemoteAccessException(
              a("Please power on and connect to your MS3 before downloading file(s)."));
      remoteAccessException.setTerminalToBatch(true);
      throw remoteAccessException;
    }
    if (this.i.a()) {
      RemoteAccessException remoteAccessException =
          new RemoteAccessException(a("Please turn off the engine before downloading file(s)."));
      remoteAccessException.setTerminalToBatch(true);
      throw remoteAccessException;
    }
    ExceptionPrintstacktrace();
    if (this.ExceptionPrintstacktrace.d()) {
      RemoteAccessException remoteAccessException =
          new RemoteAccessException(
              a("SD Card is Actively Logging. Please Stop Logging to Download Files."));
      remoteAccessException.setTerminalToBatch(true);
      throw remoteAccessException;
    }
    if (!this.ExceptionPrintstacktrace.c()) {
      RemoteAccessException remoteAccessException =
          new RemoteAccessException(a("SD Card is Not Ready for File Download."));
      remoteAccessException.setTerminalToBatch(true);
      throw remoteAccessException;
    }
    this.f.b();
    try {
      this.ExceptionPrintstacktrace.a(3000);
      try {
        if (this.a.O().T()) GInterfaceDh.a(this.a);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(l.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      file = this.h.a(paramFile, paramRemoteFileDescriptor);
      this.j = System.currentTimeMillis();
      return file;
    } catch (RemoteAccessException remoteAccessException) {
      throw remoteAccessException;
    } catch (IOException iOException) {
      file = null;
      Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, iOException);
      throw new RemoteAccessException(
          "Error Writing File to Local File System. Error:\n" + iOException.getMessage());
    } finally {
      try {
        GInterfaceDh.b(this.a);
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(l.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionPrintstacktrace);
      }
      this.ExceptionPrintstacktrace.b();
      a(paramRemoteFileDescriptor, file);
    }
  }

  public void cancelReadFile() {
    if (this.h != null) {
      this.ExceptionPrintstacktrace.a();
      this.f.b();
      this.h.a();
    }
  }

  public synchronized boolean deleteFile(RemoteFileDescriptor paramRemoteFileDescriptor) {
    ExceptionPrintstacktrace();
    if (this.ExceptionPrintstacktrace.d())
      throw new RemoteAccessException(
          a("SD Card is Actively Logging. Please Stop Logging to Delete Files."));
    if (!this.ExceptionPrintstacktrace.c())
      throw new RemoteAccessException(a("SD Card is Not Ready for Delete Operations."));
    char[] arrayOfChar = new char[4];
    String str = paramRemoteFileDescriptor.getName();
    if (str.indexOf(".") < 5)
      throw new RemoteAccessException(
          a("File Name not of proper format for delete call.\nFormat: LOG####.MS3"));
    str = str.substring(str.indexOf(".") - 4, str.indexOf("."));
    arrayOfChar[0] = str.charAt(0);
    arrayOfChar[1] = str.charAt(1);
    arrayOfChar[2] = str.charAt(2);
    arrayOfChar[3] = str.charAt(3);
    this.f.b();
    D.c("cancelled Refresh: " + System.currentTimeMillis());
    m m1 = d.a(this.a.O(), arrayOfChar, 0);
    o o1 = this.ExceptionPrintstacktrace.a(m1, true, 1500);
    if (o1.a() == 3)
      throw new RemoteAccessException(
          "Delete of "
              + paramRemoteFileDescriptor.getName()
              + " failed."
              + ((o1.c() != null) ? ("\nMessage:" + o1.c()) : ""));
    D.c("SD Deleted " + paramRemoteFileDescriptor.getName());
    D.c("requested Refresh: " + System.currentTimeMillis());
    this.f.a();
    return true;
  }

  private synchronized void ExceptionPrintstacktrace() {
    long l1 = System.currentTimeMillis();
    while (!this.ExceptionPrintstacktrace.c()) {
      if (!this.a.R()) {
        RemoteAccessException remoteAccessException =
            new RemoteAccessException(
                a("The Controller has gone offline, can not complete SD action."));
        remoteAccessException.setTerminalToBatch(true);
        throw remoteAccessException;
      }
      if (!this.e) {
        RemoteAccessException remoteAccessException =
            new RemoteAccessException(a("No SD Card in the MS3."));
        remoteAccessException.setTerminalToBatch(true);
        throw remoteAccessException;
      }
      if (System.currentTimeMillis() - l1 > 10000L) {
        RemoteAccessException remoteAccessException =
            new RemoteAccessException(
                a(
                    "Timeout waiting for SD Card to become Ready.\n"
                        + "Waited 10 seconds, expected complete."));
        remoteAccessException.setTerminalToBatch(true);
        throw remoteAccessException;
      }
      try {
        wait(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
      }
    }
  }

  public void a() {}

  public u a(DirectoryIdentifier paramDirectoryIdentifier) {
    if (!this.a.R()) throw new RemoteAccessException(a("MS3 not connected or powered off."));
    if (!this.e) throw new RemoteAccessException(a("SD Card Card Not In."));
    if (this.ExceptionPrintstacktrace.d())
      throw new RemoteAccessException(
          a("SD Card is Actively Logging. Click Reset and Wait to Stop Logging."));
    ExceptionPrintstacktrace();
    try {
      ArrayList<m> arrayList = new ArrayList();
      m m1 = d.a(this.a.O());
      arrayList.add(m1);
      m m2 = d.b(this.a.O());
      arrayList.add(m2);
      m m3 = m.a(this.a.O(), arrayList);
      m3.v("SD Status Command ");
      o o1 = this.ExceptionPrintstacktrace.a(m3, false, 1500);
      if (o1.a() == 3 || o1.a() == 2)
        throw new RemoteAccessException(
            a("Failed to get MS3 SD Card Extended Status.") + "\nMessage:" + o1.c());
      u u = new u();
      u.a(o1.e());
      return u;
    } catch (RemoteAccessException remoteAccessException) {
      throw remoteAccessException;
    } catch (x x) {
      throw new RemoteAccessException("Unknown SD Command:\n" + x.getMessage());
    } catch (Exception exception) {
      if (exception.getMessage() == null || exception.getMessage().length() == 0)
        throw new RemoteAccessException(a("Failed to get MS3 SD Card Extended Status."));
      throw new RemoteAccessException(
          a("Failed to get MS3 SD Card Extended Status.")
              + "\nMessage:\n"
              + exception.getMessage());
    }
  }

  private String a(String paramString) {
    a a = a.a();
    try {
      return a.a("", paramString);
    } catch (Exception exception) {
      Logger.getLogger(p.class.getName()).log(Level.SEVERE, (String) null, exception);
      return paramString;
    }
  }

  public void b() {
    this.ExceptionPrintstacktrace.b(this);
    t.d(this.a).b(this);
    if (this.f != null) this.f.b = false;
    this.h.a();
  }

  public void c() {
    h();
  }

  private void h() {
    Iterator<RefreshNeededListener> iterator = this.m.iterator();
    while (iterator.hasNext()) ((RefreshNeededListener) iterator.next()).refreshView();
  }

  public void addRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.m.add(paramRefreshNeededListener);
  }

  public void removeRefreshNeededListener(RefreshNeededListener paramRefreshNeededListener) {
    this.m.remove(paramRefreshNeededListener);
  }

  public void a(boolean paramBoolean) {
    if (paramBoolean && !this.c) {
      a();
      if (!this.d) this.f.a();
    } else if (!paramBoolean) {
      this.f.b();
    }
    this.c = paramBoolean;
  }

  public void d() {
    this.e = true;
  }

  public void e() {
    this.e = false;
    c();
  }

  public File getDownloadDirectory() {
    return this.l;
  }

  public void addFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.n.add(paramFileDownloadProgressListener);
  }

  public void removeFileDownloadProgressListener(
      FileDownloadProgressListener paramFileDownloadProgressListener) {
    this.n.remove(paramFileDownloadProgressListener);
  }

  private void b(RemoteFileDescriptor paramRemoteFileDescriptor) {
    Iterator<FileDownloadProgressListener> iterator = this.n.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener) iterator.next())
          .fileDownloadStarted(paramRemoteFileDescriptor);
  }

  private void a(RemoteFileDescriptor paramRemoteFileDescriptor, File paramFile) {
    Iterator<FileDownloadProgressListener> iterator = this.n.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener) iterator.next())
          .fileDownloadCompleted(paramRemoteFileDescriptor, paramFile);
  }

  private void b(long paramLong1, long paramLong2) {
    Iterator<FileDownloadProgressListener> iterator = this.n.iterator();
    while (iterator.hasNext())
      ((FileDownloadProgressListener) iterator.next())
          .fileDownloadProgressUpdate(paramLong1, paramLong2);
  }

  public void a(RemoteFileDescriptor paramRemoteFileDescriptor) {
    b(paramRemoteFileDescriptor);
  }

  public void a(long paramLong1, long paramLong2) {
    b(paramLong1, paramLong2);
  }

  public void b(boolean paramBoolean) {
    if (!paramBoolean && this.d && this.c) {
      this.f.a();
    } else if (paramBoolean) {
      this.f.b();
    }
    this.d = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aI/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
