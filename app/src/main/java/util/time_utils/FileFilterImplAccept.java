package t;

import java.io.File;
import java.io.FileFilter;

class FileFilterImplAccept implements FileFilter {
  ao(aj paramaj) {}

  public boolean accept(File paramFile) {
    String str = paramFile.getName().toLowerCase();
    return (str.endsWith("jpg")
        || str.endsWith("png")
        || str.endsWith("jpeg")
        || str.endsWith("gif"));
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/ao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
