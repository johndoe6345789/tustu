package aP;

import V.ExceptionInVPackage;
import aE.ExceptionInVPackage;
import bH.D;
import bH.ae;
import bH.t;
import com.efiAnalytics.ui.bV;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ExceptionInVPackage;
import r.ThreadedFile;
import s.SComponentGolf;

class ApComponentQuebec extends Thread {
  q(f paramf) {}
  
  public void run() {
    File file = null;
    try {
      this.ExceptionInVPackage.e(SComponentGolf.b("Preparing Debug Package"));
      file = new File(ThreadedFile.A(), "DebugPackage");
      t.b(file);
      if (!file.exists()) {
        File file2 = new File(file, "tmp");
        file2.mkdirs();
        file2.delete();
      } 
      if (ExceptionInVPackage.A() != null) {
        r r = new r(this);
        File file2 = new File(ExceptionInVPackage.A().t());
        File file3 = new File(file, file2.getName());
        try {
          t.ExceptionInVPackage(file2, file3, r, true);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        } 
        File file4 = ThreadedFile.q();
        if (file4.exists()) {
          File file5 = new File(file, file4.getName());
          try {
            t.ExceptionInVPackage(file4, file5, r, true);
          } catch (ExceptionInVPackage ExceptionInVPackage) {
            Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
          } 
        } 
      } 
      if (ExceptionInVPackage.ExceptionInVPackage().r() != null) {
        D.d("Making copy of AppDebug for packaging.");
        File file2 = new File(file, ExceptionInVPackage.ExceptionInVPackage().r().getName());
        try {
          t.ExceptionInVPackage(ExceptionInVPackage.ExceptionInVPackage().r(), file2);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        } 
      } 
      if (ExceptionInVPackage.ExceptionInVPackage().t() != null && ExceptionInVPackage.ExceptionInVPackage().t().exists()) {
        D.d("Making copy of AppDebug for packaging.");
        File file2 = new File(file, ExceptionInVPackage.ExceptionInVPackage().t().getName());
        try {
          t.ExceptionInVPackage(ExceptionInVPackage.ExceptionInVPackage().t(), file2);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionInVPackage);
        } 
      } 
      File file1 = new File(System.getProperty("user.home") + File.separator + "Desktop");
      boolean bool = true;
      if (!file1.exists()) {
        file1 = new File(System.getProperty("user.home"));
        bool = false;
      } 
      file1 = new File(file1, ExceptionInVPackage.b + "DebugPackage.zip");
      s s = new s(this);
      this.ExceptionInVPackage.f(SComponentGolf.b("Building Debug Package"));
      ae.ExceptionInVPackage(file, file1, null, s);
      String str = SComponentGolf.b("A Debug Package named " + file1.getName() + " has been created.");
      if (bool) {
        str = str + "\n\n" + SComponentGolf.b("You will find it on your desktop.");
      } else {
        str = str + "\n\n" + SComponentGolf.b("You will find it in your home folder.");
      } 
      str = str + "\n\n" + SComponentGolf.b("Please email this Debug package and any other information about your problem to:");
      str = str + "\nsupport@efianalytics.com";
      bV.d(str, dd.ExceptionInVPackage().c());
      if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file1.getParentFile());
      } 
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      if (file != null)
        t.b(file); 
      this.ExceptionInVPackage.l();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */