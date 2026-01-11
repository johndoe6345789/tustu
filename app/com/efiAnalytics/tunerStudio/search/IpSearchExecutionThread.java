package com.efiAnalytics.tunerStudio.search;

import B.g;
import java.util.logging.Level;
import java.util.logging.Logger;

class IpSearchExecutionThread extends Thread {
  boolean a = false;
  
  e(ContinuousIpSearchPanel paramContinuousIpSearchPanel) {}
  
  public void run() {
    ContinuousIpSearchPanel.access$400(this.b);
    ContinuousIpSearchPanel.access$300(this.b);
    g.a().a(this.b.d);
    while (!this.a) {
      try {
        Thread.sleep((this.b.f / 4));
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(ContinuousIpSearchPanel.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      ContinuousIpSearchPanel.access$500(this.b);
    } 
  }
  
  private void a() {
    this.a = false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/search/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */