package ao;

import java.io.File;
import java.io.FilenameFilter;

public class fD implements FilenameFilter {
  public boolean accept(File paramFile, String paramString) {
    return (paramString.toLowerCase().endsWith(".jpg") || paramString.toLowerCase().endsWith(".jpeg") || paramString.toLowerCase().endsWith(".png"));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/fD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */