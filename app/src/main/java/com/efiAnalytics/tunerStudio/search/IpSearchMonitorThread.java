package com.efiAnalytics.tunerStudio.search;

import java.util.logging.Level;
import java.util.logging.Logger;

class IpSearchMonitorThread extends Thread {
  Object a = new Object();
  
  boolean b = false;
  
  IpSearchMonitorThread(ContinuousIpSearchPanel paramContinuousIpSearchPanel) {}
  
  public void run() {
    while (!this.b) {
      ContinuousIpSearchPanel.access$600(this.c);
      try {
        Thread.sleep(100L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(ContinuousIpSearchPanel.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
  }
  
  private void a() {
    this.b = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */