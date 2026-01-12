package aG;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;

class FTPFileFilterImpl implements FTPFileFilter {
  FTPFileFilterImpl(e parame) {}

  public boolean accept(FTPFile paramFTPFile) {
    return (paramFTPFile.getName().toLowerCase().endsWith(".mlg")
        || paramFTPFile.getName().toLowerCase().endsWith(".csv")
        || paramFTPFile.getName().toLowerCase().endsWith(".msl")
        || paramFTPFile.getName().toLowerCase().endsWith(".bsf")
        || paramFTPFile.getName().toLowerCase().endsWith(".fof"));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aG/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
