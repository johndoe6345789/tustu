package com.efiAnalytics.tunerStudio.panels;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class aj extends Thread {
  long a = 0L;
  
  boolean b = false;
  
  int c = 67;
  
  Runnable d = new ak(this);
  
  aj(TriggerLoggerPanel paramTriggerLoggerPanel) {
    super("HighSpeedLogger Throttle");
  }
  
  public void run() {
    while (true) {
      if (!this.b || System.currentTimeMillis() - this.a < this.c)
        try {
          Thread.sleep(this.c);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        }  
      if (this.b)
        try {
          this.b = false;
          SwingUtilities.invokeAndWait(this.d);
          this.a = System.currentTimeMillis();
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.SEVERE, "Error setting DataSet 1", interruptedException);
        } catch (InvocationTargetException invocationTargetException) {
          Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.SEVERE, "Error setting DataSet 2", invocationTargetException);
        }  
    } 
  }
  
  public void a() {
    this.b = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */