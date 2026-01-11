package ao;

import V.a;
import bH.D;
import bH.ae;
import bH.t;
import com.efiAnalytics.ui.bV;
import h.h;
import h.i;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class cT extends Thread {
  cT(cd paramcd) {}
  
  public void run() {
    String str1 = i.k();
    String str2 = i.i;
    String str3 = str1 + "LogFile.txt";
    File file = null;
    try {
      file = new File(h.a(), str1 + "SupportPkg" + System.currentTimeMillis());
      t.b(file);
      file.mkdir();
      File file1 = new File(h.a(), str2);
      if (file1.exists() && file1.isFile()) {
        D.d("Making copy of properties file for Support Package.");
        try {
          t.a(file1, new File(file, str2));
        } catch (a a) {
          Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      File file2 = new File(h.a(), str3);
      if (file2.exists() && file2.isFile()) {
        D.d("Making copy of log file for Support Package.");
        try {
          t.a(file2, new File(file, file2.getName()));
        } catch (a a) {
          Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      if (this.a.t != null && this.a.t.exists() && this.a.t.isFile()) {
        D.d("Making copy of last opened log file " + this.a.t.getName() + " log file for Support Package.");
        try {
          t.a(this.a.t, new File(file, this.a.t.getName()));
        } catch (a a) {
          Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      File file3 = new File(System.getProperty("user.home") + File.separator + "Desktop");
      boolean bool = true;
      if (!file3.exists()) {
        file3 = new File(System.getProperty("user.home"));
        bool = false;
      } 
      file3 = new File(file3, str1 + "DebugPackage.zip");
      if (file3.exists())
        file3.delete(); 
      ae.a(file, file3, null);
      String str = "A Debug Package named " + file3.getName() + " has been created.\n\nYou will find it " + (bool ? "on your desktop" : "in your home folder") + ".\n\nPlease email this Debug package and any other information about your problem to:\nsupport@efianalytics.com";
      bV.d(str, bq.a().b());
      if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file3.getParentFile());
      } 
    } catch (IOException iOException) {
      Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      if (file != null)
        t.b(file); 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */