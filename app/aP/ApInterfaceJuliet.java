package aP;

import aE.PropertiesExtension;
import bH.M;
import bH.ae;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import r.ThreadedFile;
import s.SComponentGolf;

class ApInterfaceJuliet extends Thread {
  File PropertiesExtension;
  
  String b;
  
  M c;
  
  ApInterfaceJuliet(f paramf, File paramFile, String paramString, M paramM) {
    super("UnarchiveProcessor");
    setDaemon(true);
    this.PropertiesExtension = paramFile;
    this.b = paramString;
    this.c = paramM;
  }
  
  public void run() {
    File file1 = new File(ThreadedFile.u(), this.b);
    File file2 = new File(this.PropertiesExtension + File.separator + PropertiesExtension.ThreadedFile, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(this.PropertiesExtension + File.separator + PropertiesExtension.k, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(this.PropertiesExtension + File.separator + PropertiesExtension.l, "dummy");
    file2.mkdirs();
    file2.delete();
    try {
      ae.PropertiesExtension(this.PropertiesExtension, file1, null, this.c);
      boolean bool = bV.PropertiesExtension(SComponentGolf.b("Project has been imported.\nWould you like to open it now?"), dd.PropertiesExtension().c(), true);
      if (bool)
        this.d.PropertiesExtension(dd.PropertiesExtension().c(), file1.getAbsolutePath()); 
    } catch (ZipException zipException) {
      hq.PropertiesExtension().b("Error! Not PropertiesExtension valid Project file.");
    } catch (Exception exception) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, exception);
      hq.PropertiesExtension().b("Archive import Failed! " + this.PropertiesExtension.getName() + "\nMessage: " + exception.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */