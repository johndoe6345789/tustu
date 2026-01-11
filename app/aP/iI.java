package aP;

import aE.a;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

class iI extends Thread {
  a a = null;
  
  File b = null;
  
  String c = null;
  
  public iI(iH paramiH, String paramString, a parama, File paramFile) {
    super("UpdateConfigFile");
    setDaemon(true);
    this.a = parama;
    this.b = paramFile;
    this.c = paramString;
  }
  
  public void run() {
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(iH.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    this.d.a(this.c, this.a, this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */