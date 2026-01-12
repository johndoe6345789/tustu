package p;

import java.io.File;
import java.io.FileFilter;

class Accept implements FileFilter {
  Accept(x paramx) {}

  public boolean accept(File paramFile) {
    return paramFile.getName().toLowerCase().endsWith(x.a);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
