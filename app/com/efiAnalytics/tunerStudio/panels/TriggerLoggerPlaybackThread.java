package com.efiAnalytics.tunerStudio.panels;

import V.ExceptionInVPackage;
import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.RComponentMike;

class TriggerLoggerPlaybackThread extends Thread {
  boolean ExceptionInVPackage = true;
  
  boolean b = false;
  
  TriggerLoggerPlaybackThread(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void run() {
    try {
      n n = null;
      if (TriggerLoggerPanel.e(this.c).c() == TriggerLoggerPanel.e(this.c).size() - 1)
        TriggerLoggerPanel.e(this.c).f(); 
      try {
        n = TriggerLoggerPanel.e(this.c).ExceptionInVPackage(TriggerLoggerPanel.e(this.c).c());
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        D.c("Tried playback with no valid start page.");
        return;
      } 
      j j = n.ExceptionInVPackage("Time");
      if (j == null || j.v() == 0) {
        bV.d("No time Column, Playback unavailable.", this.c.Y);
        return;
      } 
      long l1 = System.currentTimeMillis();
      RComponentMike.ExceptionInVPackage().ExceptionInVPackage(true);
      long l2 = Math.round(j.d(0));
      while (this.ExceptionInVPackage) {
        long l3 = System.currentTimeMillis() - l1;
        int i = j.v() - 1;
        long l4;
        for (l4 = Math.round(j.d(i)) - l2; this.ExceptionInVPackage && l3 < l4; l4 = Math.round(j.d(i)) - l2) {
          try {
            sleep(10L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.INFO, (String)null, interruptedException);
          } 
          l3 = System.currentTimeMillis() - l1;
        } 
        n = this.c.n().ExceptionInVPackage();
        if (n == null) {
          this.ExceptionInVPackage = false;
          continue;
        } 
        TriggerLoggerPanel.ExceptionInVPackage(this.c, n);
        this.c.h();
        j = n.ExceptionInVPackage("Time");
        if (j == null)
          this.ExceptionInVPackage = false; 
      } 
    } finally {
      if (!this.b) {
        ao.ExceptionInVPackage(this.c.x, true);
      } else if (TriggerLoggerPanel.e(this.c).c() >= TriggerLoggerPanel.e(this.c).size() - 3) {
        ao.ExceptionInVPackage(this.c.x, true);
      } 
      this.ExceptionInVPackage = false;
      RComponentMike.ExceptionInVPackage().ExceptionInVPackage(false);
    } 
  }
  
  public void ExceptionInVPackage() {
    this.ExceptionInVPackage = false;
    this.b = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */