package aP;

import aE.a;
import bH.M;
import bH.ae;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import r.j;
import s.g;

class J extends Thread {
  File a;
  
  String b;
  
  M c;
  
  J(f paramf, File paramFile, String paramString, M paramM) {
    super("UnarchiveProcessor");
    setDaemon(true);
    this.a = paramFile;
    this.b = paramString;
    this.c = paramM;
  }
  
  public void run() {
    File file1 = new File(j.u(), this.b);
    File file2 = new File(this.a + File.separator + a.j, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(this.a + File.separator + a.k, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(this.a + File.separator + a.l, "dummy");
    file2.mkdirs();
    file2.delete();
    try {
      ae.a(this.a, file1, null, this.c);
      boolean bool = bV.a(g.b("Project has been imported.\nWould you like to open it now?"), dd.a().c(), true);
      if (bool)
        this.d.a(dd.a().c(), file1.getAbsolutePath()); 
    } catch (ZipException zipException) {
      hq.a().b("Error! Not a valid Project file.");
    } catch (Exception exception) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
      hq.a().b("Archive import Failed! " + this.a.getName() + "\nMessage: " + exception.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */