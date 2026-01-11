package p;

import java.io.File;
import java.io.FileFilter;

class A implements FileFilter {
  A(z paramz) {}
  
  public boolean accept(File paramFile) {
    return paramFile.getName().toLowerCase().endsWith(z.a);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/A.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */