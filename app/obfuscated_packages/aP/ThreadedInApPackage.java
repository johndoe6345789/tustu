package aP;

import bH.D;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.SComponentGolf;

class ThreadedInApPackage extends Thread {
  File[] a;
  
  F(f paramf, File[] paramArrayOfFile) {
    this.a = paramArrayOfFile;
  }
  
  public void run() {
    cc cc = dd.a().j();
    for (byte b = 0; b < 100 && cc == null; b++) {
      try {
        Thread.sleep(100L);
        D.c("Waiting for GraphPanel (files)");
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      cc = dd.a().j();
    } 
    if (cc == null) {
      bV.d(SComponentGolf.b("Graph Panel not initialized!"), dd.a().c());
    } else {
      cc.a(this.a);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/F.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */