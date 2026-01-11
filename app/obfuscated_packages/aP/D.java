package aP;

import bH.M;
import bH.X;
import bH.ae;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;

class D extends Thread {
  File a;
  
  File b;
  
  FileFilter c;
  
  M d;
  
  public D(f paramf, File paramFile1, File paramFile2, FileFilter paramFileFilter, M paramM) {
    super("ArchiveProcessor");
    setDaemon(true);
    this.a = paramFile1;
    this.b = paramFile2;
    this.c = paramFileFilter;
    this.d = paramM;
  }
  
  public void run() {
    try {
      ae.a(this.a, this.b, this.c, this.d);
      a.a().b(a.u, this.b.getParentFile().getAbsolutePath());
      hq.a().d("Archive Complete: " + this.b.getName());
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
      String str = iOException.getMessage();
      if (str != null) {
        str = X.b(str, "ZIP", "Project");
        str = X.b(str, "zip", "Project");
      } 
      hq.a().b("Archive Failed! " + this.b.getName() + "\nMessage: " + str);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/D.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */