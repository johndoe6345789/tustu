package com.efiAnalytics.apps.ts.tuningViews.tuneComps;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

class BurnButtonDelayThread extends Thread {
  boolean a = true;

  long b = -1L;

  int c = 100;

  BurnButtonDelayThread(BurnButtonTv paramBurnButtonTv) {}

  public void start() {
    this.b = System.currentTimeMillis();
    super.start();
  }

  public void run() {
    while (true) {
      if (this.d.i || System.currentTimeMillis() < this.b + this.c) {
        try {
          Thread.sleep((this.c / 2));
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(BurnButtonTv.class.getName())
              .log(Level.SEVERE, (String) null, interruptedException);
        }
        continue;
      }
      this.a = false;
      SwingUtilities.invokeLater(this.d.j);
      return;
    }
  }

  public void a() {
    this.b = System.currentTimeMillis();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/apps/ts/tuningViews/tuneComps/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
