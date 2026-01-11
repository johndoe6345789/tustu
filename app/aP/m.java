package aP;

import bH.n;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

class m extends Thread {
  m(f paramf, File paramFile, String paramString, by paramby, JDialog paramJDialog) {}
  
  public void run() {
    try {
      this.a.mkdirs();
      this.a.delete();
      n.a(this.b, this.a.getAbsolutePath());
      if (this.c != null)
        try {
          this.c.a();
        } catch (Exception exception) {} 
    } catch (Exception exception) {
      Logger.getLogger(au.class.getName()).log(Level.SEVERE, (String)null, exception);
      bV.d("Unexpected Error tring to download File.", dd.a().c());
    } finally {
      this.d.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */