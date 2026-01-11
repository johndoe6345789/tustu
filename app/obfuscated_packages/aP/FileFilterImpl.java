package aP;

import java.io.File;
import java.io.FileFilter;
import r.IOPropertiesUsingFile;

class FileFilterImpl implements FileFilter {
  r(q paramq) {}
  
  public boolean accept(File paramFile) {
    return (!paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.ct) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cs) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cr) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.cv) && !paramFile.getName().toLowerCase().endsWith(IOPropertiesUsingFile.t) && !paramFile.getParentFile().getName().equals("restorePoints"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */