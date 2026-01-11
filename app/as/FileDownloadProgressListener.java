package as;

import com.efiAnalytics.remotefileaccess.FileDownloadProgressListener;
import com.efiAnalytics.remotefileaccess.RemoteFileDescriptor;
import java.io.File;
import javax.swing.SwingUtilities;

class FileDownloadProgressListener implements FileDownloadProgressListener {
  c(b paramb) {}
  
  public void fileDownloadStarted(RemoteFileDescriptor paramRemoteFileDescriptor) {}
  
  public void fileDownloadProgressUpdate(long paramLong1, long paramLong2) {}
  
  public void fileDownloadCompleted(RemoteFileDescriptor paramRemoteFileDescriptor, File paramFile) {
    String[] arrayOfString = { paramFile.getAbsolutePath() };
    d d = new d(this, paramFile, arrayOfString);
    SwingUtilities.invokeLater(d);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/as/c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */