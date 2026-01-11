package aP;

import java.io.File;
import java.io.FileFilter;
import r.a;

class r implements FileFilter {
  r(q paramq) {}
  
  public boolean accept(File paramFile) {
    return (!paramFile.getName().toLowerCase().endsWith(a.ct) && !paramFile.getName().toLowerCase().endsWith(a.cs) && !paramFile.getName().toLowerCase().endsWith(a.cr) && !paramFile.getName().toLowerCase().endsWith(a.cv) && !paramFile.getName().toLowerCase().endsWith(a.t) && !paramFile.getParentFile().getName().equals("restorePoints"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */