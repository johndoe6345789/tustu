package s;

import java.io.File;
import java.io.FilenameFilter;

class h implements FilenameFilter {
  public boolean accept(File paramFile, String paramString) {
    return (paramString.length() == 2 && paramString.indexOf(".") == -1);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/s/h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */