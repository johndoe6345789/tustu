package R;

import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b extends Thread {
  String a = "http://services.efianalytics.com/efiaServices/UserServices";
  
  public b() {
    super("MessageMonitor");
    setDaemon(true);
  }
  
  public boolean a() {
    try {
      URL uRL = new URL(this.a);
      InputStream inputStream = uRL.openStream();
      inputStream.close();
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public void run() {
    n n = new n();
    while (true) {
      if (n.b() && a())
        n.a(); 
      try {
        Thread.sleep(60000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */