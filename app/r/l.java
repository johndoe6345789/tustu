package r;

import java.io.File;
import java.io.FileFilter;

class l implements FileFilter {
  public boolean accept(File paramFile) {
    return (!paramFile.isDirectory() && paramFile.getName().toLowerCase().endsWith(".dash"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */