package aP;

import V.a;
import aE.a;
import bH.D;
import bH.ae;
import bH.t;
import com.efiAnalytics.ui.bV;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.a;
import r.j;
import s.g;

class q extends Thread {
  q(f paramf) {}
  
  public void run() {
    File file = null;
    try {
      this.a.e(g.b("Preparing Debug Package"));
      file = new File(j.A(), "DebugPackage");
      t.b(file);
      if (!file.exists()) {
        File file2 = new File(file, "tmp");
        file2.mkdirs();
        file2.delete();
      } 
      if (a.A() != null) {
        r r = new r(this);
        File file2 = new File(a.A().t());
        File file3 = new File(file, file2.getName());
        try {
          t.a(file2, file3, r, true);
        } catch (a a) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
        File file4 = j.q();
        if (file4.exists()) {
          File file5 = new File(file, file4.getName());
          try {
            t.a(file4, file5, r, true);
          } catch (a a) {
            Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          } 
        } 
      } 
      if (a.a().r() != null) {
        D.d("Making copy of AppDebug for packaging.");
        File file2 = new File(file, a.a().r().getName());
        try {
          t.a(a.a().r(), file2);
        } catch (a a) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      if (a.a().t() != null && a.a().t().exists()) {
        D.d("Making copy of AppDebug for packaging.");
        File file2 = new File(file, a.a().t().getName());
        try {
          t.a(a.a().t(), file2);
        } catch (a a) {
          Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      File file1 = new File(System.getProperty("user.home") + File.separator + "Desktop");
      boolean bool = true;
      if (!file1.exists()) {
        file1 = new File(System.getProperty("user.home"));
        bool = false;
      } 
      file1 = new File(file1, a.b + "DebugPackage.zip");
      s s = new s(this);
      this.a.f(g.b("Building Debug Package"));
      ae.a(file, file1, null, s);
      String str = g.b("A Debug Package named " + file1.getName() + " has been created.");
      if (bool) {
        str = str + "\n\n" + g.b("You will find it on your desktop.");
      } else {
        str = str + "\n\n" + g.b("You will find it in your home folder.");
      } 
      str = str + "\n\n" + g.b("Please email this Debug package and any other information about your problem to:");
      str = str + "\nsupport@efianalytics.com";
      bV.d(str, dd.a().c());
      if (Desktop.isDesktopSupported()) {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file1.getParentFile());
      } 
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      if (file != null)
        t.b(file); 
      this.a.l();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */