package aM;

import bH.D;
import bH.J;
import bH.ab;
import bH.n;
import bH.t;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.d;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class AmInterfaceAlpha {
  File a = null;
  
  d b = null;
  
  d c = null;
  
  private String g;
  
  ab d;
  
  e e = new e(this);
  
  Window f;
  
  public AmInterfaceAlpha(Window paramWindow, ab paramab) {
    this.d = paramab;
    this.f = paramWindow;
    this.g = a("Downloading DistantDesktop for Desktop sharing") + "\n" + a("Please Wait");
  }
  
  private String a(String paramString) {
    if (this.d != null)
      paramString = this.d.a(paramString); 
    return paramString;
  }
  
  public void a(File paramFile) {
    if (J.a() || J.b()) {
      this.a = paramFile;
      this.b = new d(this);
      this.b.start();
    } else {
      aN.a("https://www.distantdesktop.com/downloads/");
    } 
  }
  
  private void a() {
    File file;
    String str1;
    String str2;
    if (J.a()) {
      file = new File(this.a, "distant-desktop.exe");
      str1 = "1875181a9a75845986f45dc1dc0cc781";
      str2 = "https://www.tunerstudio.com/teamviewer/distant-desktop.exe";
    } else if (J.b()) {
      file = new File(this.a, "DistantDesktop.dmg");
      str1 = "95853023bdc255ab278fe53c89ff6162";
      str2 = "https://www.tunerstudio.com/teamviewer/DistantDesktop.dmg";
    } else {
      bV.d("DistantDesktop download not supported on this OS. Install version 12 manually.", this.f);
      return;
    } 
    String str3 = null;
    try {
      if (file.exists()) {
        str3 = t.c(file);
        D.c("checksum: " + str3);
      } else {
        str3 = "";
      } 
    } catch (IOException iOException) {
      str3 = "";
      file.delete();
    } 
    if (!str3.equals(str1)) {
      b();
      try {
        n.a(str2, file.getAbsolutePath(), this.e);
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Failed to download DistantDesktop.\n" + iOException.getLocalizedMessage(), this.f);
      } finally {
        c();
      } 
    } 
    if (file.exists()) {
      this.g = a("Starting DistantDesktop, please wait....");
      b();
      try {
        if (J.b()) {
          String[] arrayOfString = { "/usr/bin/open", file.getAbsolutePath() };
          Process process = Runtime.getRuntime().exec(arrayOfString);
          process.waitFor();
        } else {
          Process process = Runtime.getRuntime().exec("Elevate.exe \"" + file.getAbsolutePath() + "\"");
          process.waitFor();
        } 
      } catch (IOException iOException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Failed to launch DistantDesktop.\n" + iOException.getLocalizedMessage(), this.f);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } finally {
        c();
      } 
    } else {
      D.a("Downloaded distantDesktop File does not exist.");
    } 
  }
  
  private void b() {
    b b = new b(this);
    SwingUtilities.invokeLater(b);
  }
  
  private void c() {
    c c = new c(this);
    try {
      SwingUtilities.invokeAndWait(c);
    } catch (Exception exception) {
      Logger.getLogger(a.class.getName()).log(Level.WARNING, "Error closing wait dialog.", exception);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aM/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */