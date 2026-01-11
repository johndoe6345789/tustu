package bl;

import java.io.File;
import java.io.FileFilter;

class FileFilterImplInBlPackage implements FileFilter {
  o(l paraml) {}
  
  public boolean accept(File paramFile) {
    return paramFile.getName().toLowerCase().endsWith(".jar");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bl/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */