package com.efiAnalytics.ui;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

class SleepPreventionThread extends Thread {
  private boolean b = true;

  SleepPreventionThread(dI paramdI) {}

  public void run() {
    try {
      Robot robot = new Robot();
      while (this.b) {
        robot.delay(15000);
        if (!dI.a(this.a)) {
          Point point = MouseInfo.getPointerInfo().getLocation();
          robot.mouseMove(point.x + 1, point.y + 1);
          robot.mouseMove(point.x, point.y);
        }
      }
    } catch (AWTException aWTException) {
      Logger.getLogger(dI.class.getName())
          .log(Level.WARNING, "Unable to start Sleep Prevent", aWTException);
    }
  }

  public boolean a() {
    return this.b;
  }

  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/dJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
