package aP;

import aE.PropertiesExtension;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

class ApInterfaceIi extends Thread {
  PropertiesExtension PropertiesExtension = null;

  File b = null;

  String c = null;

  public ApInterfaceIi(iH paramiH, String paramString, PropertiesExtension parama, File paramFile) {
    super("UpdateConfigFile");
    setDaemon(true);
    this.PropertiesExtension = parama;
    this.b = paramFile;
    this.c = paramString;
  }

  public void run() {
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(iH.class.getName()).log(Level.SEVERE, (String) null, interruptedException);
    }
    this.d.PropertiesExtension(this.c, this.PropertiesExtension, this.b);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
