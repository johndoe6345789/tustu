package r;

import java.io.File;
import java.io.FileFilter;

class k implements FileFilter {
  public boolean accept(File paramFile) {
    return paramFile.isDirectory();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */