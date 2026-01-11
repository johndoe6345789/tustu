package aP;

import java.io.File;
import java.io.FileFilter;
import r.IOPropertiesUsingFile;

class iq implements FileFilter {
  String IOPropertiesUsingFile = "";
  
  iq(String paramString) {
    this.IOPropertiesUsingFile = paramString;
  }
  
  public boolean accept(File paramFile) {
    return (paramFile.isFile() && paramFile.getName().startsWith(this.IOPropertiesUsingFile) && paramFile.getName().toLowerCase().endsWith("." + IOPropertiesUsingFile.cw.toLowerCase()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */