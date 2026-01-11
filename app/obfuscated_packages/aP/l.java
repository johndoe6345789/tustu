package aP;

import bH.J;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class l implements Runnable {
  l(f paramf) {}
  
  public void run() {
    String str;
    if (!this.a.g()) {
      this.a.b = false;
      return;
    } 
    f.a().y();
    if (J.a()) {
      str = "shutdown /p";
    } else if (J.b()) {
      str = "sudo shutdown -h now";
    } else {
      str = "sudo shutdown now";
    } 
    try {
      Runtime.getRuntime().exec(str);
      System.exit(0);
    } catch (IOException iOException) {
      Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } finally {
      this.a.b = false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */