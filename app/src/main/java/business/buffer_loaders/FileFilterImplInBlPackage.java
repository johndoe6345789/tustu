package business.buffer_loaders;

import java.io.File;
import java.io.FileFilter;

class FileFilterImplInBlPackage implements FileFilter {
  FileFilterImplInBlPackage(l paraml) {}

  public boolean accept(File paramFile) {
    return paramFile.getName().toLowerCase().endsWith(".jar");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
