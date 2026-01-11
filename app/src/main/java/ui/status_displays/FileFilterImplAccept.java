package aY;

import java.io.File;
import java.io.FileFilter;

class FileFilterImplAccept implements FileFilter {
  FileFilterImplAccept(s params) {}
  
  public boolean accept(File paramFile) {
    return paramFile.getName().startsWith(this.a.f.a());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aY/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */