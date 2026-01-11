package W;

import java.io.File;
import java.io.FileFilter;

class IniFileFilter implements FileFilter {
  public boolean accept(File paramFile) {
    return (paramFile != null && (paramFile.getName().toLowerCase().contains(".ini") || paramFile.getName().toLowerCase().contains(".ecu")));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/u.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */