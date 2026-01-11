package aA;

import D.DInterfaceCharlie;
import az.JDialogExtensionInAzPackage;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInAaPackage extends Thread {
  ThreadExtensionInAaPackage(JDialogExtensionInAzPackage parama, JDialogExtensionInAzPackage parama1) {}
  
  public void run() {
    try {
      Thread.sleep(200L);
      DInterfaceCharlie DInterfaceCharlie = h.JDialogExtensionInAzPackage().JDialogExtensionInAzPackage(this.b.b);
      if (DInterfaceCharlie.b() != null)
        this.b.b = DInterfaceCharlie.b(); 
      if (DInterfaceCharlie.JDialogExtensionInAzPackage() != 0) {
        String str = DInterfaceCharlie.b(DInterfaceCharlie.JDialogExtensionInAzPackage());
        bV.DInterfaceCharlie(str, this.b.JDialogExtensionInAzPackage);
      } else if (this.b.JDialogExtensionInAzPackage != null) {
        this.b.JDialogExtensionInAzPackage.dispose();
      } 
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(JDialogExtensionInAzPackage.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } finally {
      this.JDialogExtensionInAzPackage.dispose();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */