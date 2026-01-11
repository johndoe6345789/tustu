package aP;

import bH.M;
import bH.X;
import bH.ae;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.IOPropertiesUsingFile;

class ThreadExtensionInApPackage extends Thread {
  File IOPropertiesUsingFile;
  
  File b;
  
  FileFilter c;
  
  M d;
  
  public ThreadExtensionInApPackage(f paramf, File paramFile1, File paramFile2, FileFilter paramFileFilter, M paramM) {
    super("ArchiveProcessor");
    setDaemon(true);
    this.IOPropertiesUsingFile = paramFile1;
    this.b = paramFile2;
    this.c = paramFileFilter;
    this.d = paramM;
  }
  
  public void run() {
    try {
      ae.IOPropertiesUsingFile(this.IOPropertiesUsingFile, this.b, this.c, this.d);
      IOPropertiesUsingFile.IOPropertiesUsingFile().b(IOPropertiesUsingFile.u, this.b.getParentFile().getAbsolutePath());
      hq.IOPropertiesUsingFile().d("Archive Complete: " + this.b.getName());
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      String str = iOException.getMessage();
      if (str != null) {
        str = X.b(str, "ZIP", "Project");
        str = X.b(str, "zip", "Project");
      } 
      hq.IOPropertiesUsingFile().b("Archive Failed! " + this.b.getName() + "\nMessage: " + str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */