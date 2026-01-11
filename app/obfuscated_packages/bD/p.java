package bD;

import com.efiAnalytics.remotefileaccess.DirectoryFiles;
import com.efiAnalytics.remotefileaccess.DirectoryInformation;
import com.efiAnalytics.remotefileaccess.RemoteAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class p extends Thread {
  p(i parami) {
    super("Read Dir");
    setDaemon(true);
  }
  
  public void run() {
    try {
      i.a(this.a.c);
      DirectoryFiles directoryFiles = i.c(this.a).getFilesIn(null);
      List list = directoryFiles.getFiles();
      DirectoryInformation directoryInformation = directoryFiles.getDirectoryInformation();
      this.a.c.a(directoryInformation.getFileCount());
      this.a.c.b(directoryInformation.getUsedBytes());
      this.a.c.a(directoryInformation.getTotalBytes());
    } catch (RemoteAccessException remoteAccessException) {
      Logger.getLogger(r.class.getName()).log(Level.SEVERE, (String)null, (Throwable)remoteAccessException);
    } finally {
      this.a.a = null;
      i.b(this.a.c);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bD/p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */