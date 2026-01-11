package aP;

import java.io.File;
import java.io.FileFilter;
import r.a;

class iq implements FileFilter {
  String a = "";
  
  iq(String paramString) {
    this.a = paramString;
  }
  
  public boolean accept(File paramFile) {
    return (paramFile.isFile() && paramFile.getName().startsWith(this.a) && paramFile.getName().toLowerCase().endsWith("." + a.cw.toLowerCase()));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */