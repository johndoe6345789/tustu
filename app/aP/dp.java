package aP;

import com.efiAnalytics.ui.cS;
import java.util.logging.Level;
import java.util.logging.Logger;

class dp extends Thread {
  dp(dl paramdl) {}
  
  public void run() {
    try {
      Thread.sleep(10000L);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } 
    cS.a().e();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */