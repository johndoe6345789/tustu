package R;

import java.io.File;
import java.io.FilenameFilter;

class FilenameFilterImpl implements FilenameFilter {
  FilenameFilterImpl(g paramg) {}

  public boolean accept(File paramFile, String paramString) {
    return paramString.toLowerCase().endsWith(".svcmsg");
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
