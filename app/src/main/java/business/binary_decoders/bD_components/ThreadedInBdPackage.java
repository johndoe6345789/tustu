package business.binary_decoders.bD_components;

import bH.D;
import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.util.List;

class ThreadedInBdPackage extends Thread {
  ThreadedInBdPackage(r paramr) {
    super("Read Dir Thread");
    setDaemon(true);
  }

  public void run() {
    try {
      this.a.a.c();
      this.a.a.a("Reading Files");
      DirectoryFiles directoryFiles = r.c(this.a).getFilesIn(null);
      List list = directoryFiles.getFiles();
      this.a.a.a(list);
      DirectoryInformation directoryInformation = directoryFiles.getDirectoryInformation();
      this.a.e.a(directoryInformation.getFileCount());
      this.a.e.b(directoryInformation.getUsedBytes());
      this.a.e.a(directoryInformation.getTotalBytes());
      this.a.a.d();
    } catch (RemoteAccessException remoteAccessException) {
      D.c("Dir Listing interrupted: " + remoteAccessException.getMessage());
      this.a.a.a(remoteAccessException.getMessage());
    } finally {
      this.a.b = null;
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/C.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
