package z;

import java.io.File;
import java.io.FilenameFilter;

class FilenameFilterImplInZPackage implements FilenameFilter {
  FilenameFilterImplInZPackage(i parami) {}
  
  public boolean accept(File paramFile, String paramString) {
    return ((paramString.startsWith("tty.") || paramString.startsWith("cu.")) && !paramString.contains("Incoming"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */