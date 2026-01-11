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

public class AmInterfaceFoxtrot {
  File a = null;
  
  i b = null;
  
  d c = null;
  
  private String g;
  
  ab d;
  
  j e = new j(this);
  
  Window f;
  
  public AmInterfaceFoxtrot(Window paramWindow, ab paramab) {
    this.d = paramab;
    this.f = paramWindow;
    this.g = a("Downloading TeamViewer for Desktop sharing") + "\n" + a("Please Wait");
  }
  
  private String a(String paramString) {
    if (this.d != null)
      paramString = this.d.a(paramString); 
    return paramString;
  }
  
  public void a(File paramFile) {
    if (J.a() || J.b()) {
      this.a = paramFile;
      this.b = new i(this);
      this.b.start();
    } else {
      aN.a("https://connect.teamviewer.com/v12");
    } 
  }
  
  private void a() {
    File file;
    String str1;
    String str2;
    if (J.a()) {
      file = new File(this.a, "TeamViewerQS.exe");
      str1 = "692dff991182dcd4a29f47f987ae1c7e";
      str2 = "https://www.tunerstudio.com/teamviewer/TeamViewerQS.exe";
    } else if (J.b()) {
      file = new File(this.a, "TeamViewerQS.dmg");
      str1 = "4dacc7e0ed5ea9069d22e399c6379b69";
      str2 = "https://www.tunerstudio.com/teamviewer/TeamViewerQS.dmg";
    } else {
      bV.d("TeamViewer download not supported on this OS. Install version 12 manually.", this.f);
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
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Failed to download TeamViewer.\n" + iOException.getLocalizedMessage(), this.f);
      } finally {
        c();
      } 
    } 
    if (file.exists()) {
      this.g = a("Starting TeamViewer, please wait....");
      b();
      try {
        if (J.b()) {
          String[] arrayOfString = { "/usr/bin/open", file.getAbsolutePath() };
          Process process = Runtime.getRuntime().exec(arrayOfString);
          process.waitFor();
        } else {
          Process process = Runtime.getRuntime().exec(file.getAbsolutePath());
          process.waitFor();
        } 
      } catch (IOException iOException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
        bV.d("Failed to launch TeamViewer.\n" + iOException.getLocalizedMessage(), this.f);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } finally {
        c();
      } 
    } else {
      D.a("Downloaded teamViewer File does not exist.");
    } 
  }
  
  private void b() {
    g g = new g(this);
    SwingUtilities.invokeLater(g);
  }
  
  private void c() {
    h h = new h(this);
    try {
      SwingUtilities.invokeAndWait(h);
    } catch (Exception exception) {
      Logger.getLogger(f.class.getName()).log(Level.WARNING, "Error closing wait dialog.", exception);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aM/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */