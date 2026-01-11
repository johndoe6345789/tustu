package com.efiAnalytics.tunerStudio.panels;

import V.a;
import W.j;
import W.n;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.m;

class TriggerLoggerPlaybackThread extends Thread {
  boolean a = true;
  
  boolean b = false;
  
  TriggerLoggerPlaybackThread(TriggerLoggerPanel paramTriggerLoggerPanel) {}
  
  public void run() {
    try {
      n n = null;
      if (TriggerLoggerPanel.e(this.c).c() == TriggerLoggerPanel.e(this.c).size() - 1)
        TriggerLoggerPanel.e(this.c).f(); 
      try {
        n = TriggerLoggerPanel.e(this.c).a(TriggerLoggerPanel.e(this.c).c());
      } catch (a a) {
        D.c("Tried playback with no valid start page.");
        return;
      } 
      j j = n.a("Time");
      if (j == null || j.v() == 0) {
        bV.d("No time Column, Playback unavailable.", this.c.Y);
        return;
      } 
      long l1 = System.currentTimeMillis();
      m.a().a(true);
      long l2 = Math.round(j.d(0));
      while (this.a) {
        long l3 = System.currentTimeMillis() - l1;
        int i = j.v() - 1;
        long l4;
        for (l4 = Math.round(j.d(i)) - l2; this.a && l3 < l4; l4 = Math.round(j.d(i)) - l2) {
          try {
            sleep(10L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.INFO, (String)null, interruptedException);
          } 
          l3 = System.currentTimeMillis() - l1;
        } 
        n = this.c.n().a();
        if (n == null) {
          this.a = false;
          continue;
        } 
        TriggerLoggerPanel.a(this.c, n);
        this.c.h();
        j = n.a("Time");
        if (j == null)
          this.a = false; 
      } 
    } finally {
      if (!this.b) {
        ao.a(this.c.x, true);
      } else if (TriggerLoggerPanel.e(this.c).c() >= TriggerLoggerPanel.e(this.c).size() - 3) {
        ao.a(this.c.x, true);
      } 
      this.a = false;
      m.a().a(false);
    } 
  }
  
  public void a() {
    this.a = false;
    this.b = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/ax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */